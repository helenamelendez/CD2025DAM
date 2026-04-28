package com.example;

public class ValidadorContraseña {

   public Boolean esValida(String valor) {

      Boolean noMenorDe8 = valor.length() >= 8;
      Boolean contieneMayuscula = false;
      Boolean contieneMinuscula = false;
      Boolean contieneNumero = false;
      Boolean contieneCaracterEspecial = valor.matches(".*[!@#$%^&*].*");

      for (int i = 0; i < valor.length(); i++) {
         if (Character.isUpperCase(valor.charAt(i))) {
            contieneMayuscula = true;
         }
         if (Character.isLowerCase(valor.charAt(i))) {
            contieneMinuscula = true;
         }
         if (valor.matches(".*[0-9].*")) {
            contieneNumero = true;
         }
      }

      return noMenorDe8 && contieneMayuscula && contieneMinuscula && contieneNumero && contieneCaracterEspecial;

   }

}
