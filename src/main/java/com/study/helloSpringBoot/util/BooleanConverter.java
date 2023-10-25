package com.study.helloSpringBoot.util;

import jakarta.persistence.AttributeConverter;

public class BooleanConverter implements AttributeConverter<Boolean, String> {

  @Override
  public String convertToDatabaseColumn(Boolean attribute) {
    return (attribute != null && attribute) ? "1" : "0";
  }

  @Override
  public Boolean convertToEntityAttribute(String dbData) {
    return "1".equalsIgnoreCase(dbData);
  }
}
