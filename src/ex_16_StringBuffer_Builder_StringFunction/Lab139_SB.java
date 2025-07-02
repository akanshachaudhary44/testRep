package ex_16_StringBuffer_Builder_StringFunction;

public class Lab139_SB {
    public static void main(String[] args) {
        // java program to count vowels and consonants
        //pramod -> a,e,i,o,u -> V-2, C-4
        String input = "java program to count vowels and consonants";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for(int i = 0; i< input.length(); i++)
        {
            char ch = input.charAt(i);
            if(ch=='a' || ch=='e' || ch =='i' || ch =='o' || ch=='u' )
            {
                vowels++;
            }
            else {
                consonants++;
            }
        }

    }
}
