package com.example;

public class ValidadorContraseña {

public Boolean esValida(String valor){
    Boolean noMenorDe8 =  valor.length() >= 8;

    Boolean contienMayscula = false;
    for (int i = 0; i < valor.length(); i++) {
       if (Character.isUpperCase(valor.charAt(i))){
            contienMayscula = true;
            break;
       }
    }
    Boolean contienMinuscula = false;
    for (int i = 0; i < valor.length(); i++) {
       if (Character.isLowerCase(valor.charAt(i))){
            contienMinuscula = true;
            break;
       }
    }

    Boolean contienNumero = false;
    for (int i = 0; i < valor.length(); i++) {
       if (valor.matches(".*[0-9].*")){
            contienNumero = true;
            break;
       }

    }

    Boolean contienCaracterEspecial = false;
    for (int i = 0; i < valor.length(); i++) {
       if (valor.matches(".*[!@#$%^&*].*")){
            contienCaracterEspecial = true;
            break;
       }

    }

    if (noMenorDe8 && contienMayscula && contienMinuscula && contienNumero && contienCaracterEspecial) {
        return true;
    }
    else {
        return false;
    }

}





}
