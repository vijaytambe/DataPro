package com.questionpro.bi.QPDataPro.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.questionpro.bi.QPDataPro.models.Response;
import com.questionpro.bi.QPDataPro.repository.ResponseRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportsController {


    @Autowired
    private ResponseRepository repository;

    @RequestMapping(value = "/survey/{id}", method = RequestMethod.GET)
    public List<Response> getAllResponse(@PathVariable("id") long id) {
        return repository.getBySurveyID(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Response createResponse(Response response) {

        for (int page = 10; page < 80 ; page ++) {

            System.out.println("Pagination FOR --> " + page );

            final String uri = "https://api.questionpro.com/a/api/v2/surveys/3082565/responses?page=" + page + "&perPage=100&apiKey=38cd8d9e-11f2-4990-8af3-a23809646b45";
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(uri, String.class);

            JSONObject object = new JSONObject(result);
            JSONArray array = object.getJSONArray("response");

            ObjectMapper mapper = new ObjectMapper();
            List<Response> responses = new ArrayList<>();
            for (Object obj : array) {
                try {
                    Response resp = mapper.readValue(obj.toString(), Response.class);
                    responses.add(resp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            repository.saveAll(responses);
        }

        //System.out.println(result);
        return new Response();
    }
}
