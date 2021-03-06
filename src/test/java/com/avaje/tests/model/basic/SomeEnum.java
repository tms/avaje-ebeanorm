package com.avaje.tests.model.basic;

public enum SomeEnum {

  ALPHA("Some nice Alpha"),
  BETA("Some nice Beta");
  
  String description;
  
  SomeEnum(String description) {
    this.description = description;
  }
  
  public String toString() {
    return description;
  }
}
