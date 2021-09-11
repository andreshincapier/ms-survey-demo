package com.robinfood.demo.jpa.survey;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;


public interface SurveyDataRepository extends CrudRepository<SurveyData, String>, QueryByExampleExecutor<SurveyData> {
}