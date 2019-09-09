package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQImprovementRetrieveInputModelImprovementInstanceReport
 */
public class BQImprovementRetrieveInputModelImprovementInstanceReport   {
  private String improvementInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return improvementInstanceReportReference
  **/

  public String getImprovementInstanceReportReference() {
    return improvementInstanceReportReference;
  }

  public void setImprovementInstanceReportReference(String improvementInstanceReportReference) {
    this.improvementInstanceReportReference = improvementInstanceReportReference;
  }


}

