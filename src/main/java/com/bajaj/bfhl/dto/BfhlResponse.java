package com.bajaj.bfhl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BfhlResponse {

    @JsonProperty("is_success")
    public boolean isSuccess;

    @JsonProperty("user_id")
    public String userId;

    public String email;

    @JsonProperty("roll_number")
    public String rollNumber;

    @JsonProperty("odd_numbers")
    public List<String> oddNumbers;

    @JsonProperty("even_numbers")
    public List<String> evenNumbers;

    public List<String> alphabets;

    @JsonProperty("special_characters")
    public List<String> specialCharacters;

    public String sum;

    @JsonProperty("concat_string")
    public String concatString;

    public BfhlResponse(boolean isSuccess, String userId, String email, String rollNumber,
                        List<String> oddNumbers, List<String> evenNumbers,
                        List<String> alphabets, List<String> specialCharacters,
                        String sum, String concatString) {
        this.isSuccess = isSuccess;
        this.userId = userId;
        this.email = email;
        this.rollNumber = rollNumber;
        this.oddNumbers = oddNumbers;
        this.evenNumbers = evenNumbers;
        this.alphabets = alphabets;
        this.specialCharacters = specialCharacters;
        this.sum = sum;
        this.concatString = concatString;
    }
}