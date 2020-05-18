package jbehave;

public class Armstrong {
    String num;
    public boolean calc() {
        String input = this.num;
    	try {
            Double.parseDouble(input);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int pow = 1;
            for (int j = 0; j < input.length(); j++) {
                pow *= Integer.parseInt(Character.toString(input.charAt(i)));
            }
            sum += pow;
        }
        return sum == Integer.parseInt(input);
    }

    public void set(String num) {
        this.num = num;
    }
}