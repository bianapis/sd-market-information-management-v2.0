package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQImprovementRetrieveInputModelImprovementInstanceAnalysis
 */
public class BQImprovementRetrieveInputModelImprovementInstanceAnalysis   {
  private String improvementInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return improvementInstanceAnalysisReference
  **/

  public String getImprovementInstanceAnalysisReference() {
    return improvementInstanceAnalysisReference;
  }

  public void setImprovementInstanceAnalysisReference(String improvementInstanceAnalysisReference) {
    this.improvementInstanceAnalysisReference = improvementInstanceAnalysisReference;
  }


}
