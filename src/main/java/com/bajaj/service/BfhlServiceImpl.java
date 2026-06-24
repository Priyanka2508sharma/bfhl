package com.bajaj.bfhl.service;

import com.bajaj.bfhl.dto.BfhlRequest;
import com.bajaj.bfhl.dto.BfhlResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public BfhlResponse processData(BfhlRequest request) {

        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        int sum = 0;
        StringBuilder allAlphabets = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {
                int number = Integer.parseInt(item);
                sum += number;

                if (number % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            } else if (item.matches("[a-zA-Z]+")) {
                alphabets.add(item.toUpperCase());
                allAlphabets.append(item);

            } else {
                specialCharacters.add(item);
            }
        }

        String reversed = allAlphabets.reverse().toString();
        StringBuilder concatString = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            if (i % 2 == 0) {
                concatString.append(Character.toUpperCase(reversed.charAt(i)));
            } else {
                concatString.append(Character.toLowerCase(reversed.charAt(i)));
            }
        }

        return new BfhlResponse(
                true,
                "priyanka_sharma_17092004",
                "priyanka1398.be23@chitkarauniversity.edu.in",
                "2311981398",
                oddNumbers,
                evenNumbers,
                alphabets,
                specialCharacters,
                String.valueOf(sum),
                concatString.toString()
        );
    }
}