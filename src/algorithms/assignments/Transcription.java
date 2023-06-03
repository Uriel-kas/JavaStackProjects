package algorithms.assignments;

import java.util.Scanner;

public class Transcription {

    private static String dnaToRNA(String dnaStrand){
        String rnaStrand = "";

        for (int i = 0; i < dnaStrand.length(); i++){
            char base = dnaStrand.charAt(i);

            if (base == 'A'){
                rnaStrand += 'U';
            } else if(base == 'T'){
                rnaStrand += 'A';
            } else if(base == 'G'){
                rnaStrand += 'C';
            } else if(base == 'C'){
                rnaStrand += 'G';
            }
        }
        return rnaStrand;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.print("Please enter your DNA Strands to be transcribed (press enter when done): ");
    String dNAStrands = input.nextLine();
    String transcribedDNA = dnaToRNA(dNAStrands);
    System.out.print("Walaa!!! Here's your transcription: " + transcribedDNA);
    }
}
