package com.shyam.dockerreactdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author SVadikari on 12/26/18
 */



@JsonIgnoreProperties
@Data
@Document
@Validated
public class Order {

    @Id
    @JsonProperty(value = "orderNumber", required = true)
    private String orderNumber;

    @JsonProperty(value = "orderType", required = true)
    private String orderType;
}
