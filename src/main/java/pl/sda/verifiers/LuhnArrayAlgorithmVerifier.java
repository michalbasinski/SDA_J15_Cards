package pl.sda.verifiers;

class LuhnArrayAlgorithmVerifier {

    boolean verify(String cardNo) {
        int[] convertedCardNumber = convertStringToArray(cardNo);

        for (int i = convertedCardNumber.length - 2; i >= 0; i = i - 2) {
            int temp = convertedCardNumber[i] * 2;
            if (temp >= 10) {
                temp = temp - 9;
            }
            convertedCardNumber[i] = temp;
        }

        int sum = 0;
        for (int digit : convertedCardNumber) {
            sum += digit;
        }

        return sum % 10 == 0;
    }

    private int[] convertStringToArray(String cardNo) {
        int[] convertedCardNo = new int[cardNo.length()];
        int counter = 0;
        for (Character digit : cardNo.toCharArray()) {
            convertedCardNo[counter] = Integer.parseInt(digit.toString());
            counter++;
        }
        return convertedCardNo;
    }
}
