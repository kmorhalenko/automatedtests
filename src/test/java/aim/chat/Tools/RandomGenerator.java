package aim.chat.Tools;

import net.thucydides.core.pages.PageObject;

import java.util.Random;

    public class RandomGenerator extends PageObject {

        public String randomGeneratorNumeric(int length) {
            String charac = "0123456789";
            String NumericRandom;
            return NumericRandom = generateString(charac, length);
        }

        public String randomGeneratorAlpha(int length) {
            String charac = "abcdefghijklmnopqrstuvwxyz";
            String AlphaRandom;
            return AlphaRandom = generateString(charac, length);
        }

        public String randomGeneratorAlphaNumeric(int length) {
            String charac = "0123456789abcdefghijklmnopqrstuvwxyz";
            String AlphaNumericRandom;
            return AlphaNumericRandom = generateString(charac, length);
        }

        public String generateString(String characters, int length) //creating random string
        {
            Random rng = new Random();
            char[] text = new char[length]; // Create list of chars
            for (int i = 0; i < length; i++) //Creating number of random symbols, size equals  variable length
            {
                text[i] = characters.charAt(rng.nextInt(characters.length())); //For current step create random character and saves in list
            }
            return new String(text);//return list
        }

        public int getRandomProductFromTheList(int ListSize) {
            Random random = new Random();
            return random.nextInt(ListSize) + 1;
        }

    }



