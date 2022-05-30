package Palindromo;


import java.util.Locale;

public class Frase {
   ;
    private String inverted;
    private String caracteres;

    private String low_inv;



    public boolean palindrome(){


        this.caracteres = "OMISSISSIMO";

        String inverted = caracteres.toString().replaceAll("\s+","");
        StringBuilder stbuild = new StringBuilder(inverted);

        inverted = stbuild.reverse().toString();
        String low_inv = inverted.toLowerCase(Locale.forLanguageTag(inverted));

        //Checar se a frase ou palavra é um palindromo
        System.out.println();
        System.out.println("Frase ou palavra original: "+caracteres);
        System.out.println();
        System.out.println("Frase ou palavra invertida: "+ low_inv);
        System.out.println();
        if (inverted.equals(caracteres)){
        System.out.println("A frase ou palavra e um palindromo");
    }
        else{
            System.out.println("A frase ou palavra nao e um palindromo");
        }


        if (low_inv.matches("[A - Z]*")){
            return true;
        }
        else{
         return false;
    }
}}

