package br.edu.unicesumar.utils;

public class Utils {
    public static boolean validateCpf(String cpf) {
        if(cpf.length() < 11) {
            return false;
        }
        return true;
    }
    
}