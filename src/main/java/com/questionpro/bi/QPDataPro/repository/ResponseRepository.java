package com.questionpro.bi.QPDataPro.repository;

import com.questionpro.bi.QPDataPro.models.Response;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ResponseRepository extends MongoRepository<Response,String> {

    Response findBy_id(ObjectId _id);

    List<Response> getBySurveyID(long id);

}
