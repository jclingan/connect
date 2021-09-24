package org.acme.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {
  private String name;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  private String address;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
