package com.springmvc.thymeleaf.model;


import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

   @NotNull(message="is required")
   @Size(min = 1, message = "is required")
   private String lastName ="";

      @Min(value = 0 , message="must not be greater than or equal to Zero")
      @Max(value = 10 , message="must not be less than or equal to 10")
      private int freePasses;

      @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "ONly 5 chars/ digits")
      private String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
