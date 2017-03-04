package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 01.03.2017.
 */
class TaskUniqueDigits {
    public static void main(String[] args) {
        //уникальные цифры в массиве через стринги
        Integer someNumber = 125232;
        System.out.println(countUniqueDigits(someNumber));
        System.out.println(countUniqueDigits(someNumber));
    }
    public static int countUniqueDigits (Integer someNumber){
       char [] c = someNumber.toString().toCharArray();
        int [] digits = new int [10];
        for (int i = 0; i < c.length ; i++) {
            int index = Integer.parseInt(Character.toString(c[i]));
            digits[index] = 1;
        }
        int res = 0;
        for (int digit: digits){
            res+=digit;
        }
        return res;
    }

    static public int countUniqueDigits2 (int n){
        String input = Integer.toString(n);
        String acam = "";
        for (int i = 0; i < input.length(); i++) {
            if(!acam.contains(input.charAt(i)+ "")){
                acam +=input.charAt(i) +"";
            }
        }
        return acam.length();
    }

}
