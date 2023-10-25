package com.study.helloSpringBoot.util;

public class DateUtil {

  public static String deleteHyphenFromDate(String date) {
    return date.replaceAll("-", "");
  }
}
