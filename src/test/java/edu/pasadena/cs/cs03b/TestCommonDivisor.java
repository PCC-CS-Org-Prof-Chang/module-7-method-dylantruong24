package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestCommonDivisor {

   @Test
   public void testGCD()
   {
     // action
     int iResult = CommonDivisor.gcd(80, 160);
     // assertion
     assertEquals(80, iResult);

     iResult = CommonDivisor.gcd(60, 185);
     // assertion
     assertEquals(5, iResult);

     // TODO: add more test cases

   }
}
