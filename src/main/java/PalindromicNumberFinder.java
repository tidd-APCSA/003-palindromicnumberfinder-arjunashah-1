public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
        for(int i = (num+1); i>=num; i++){
          if(testPalindromicNum(i)==true){
            return i-num;
          }
        }
      return 0;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
        String compare = Integer.toString(num);
        boolean check = false;
        if (compare.equals(reverseNum(num))){
          check = true;
        }
        return check;
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
        String reversed1 = "";
        String reversed = Integer.toString(num);
        for(int i = reversed.length()-1; i >= 0; i--)
        {
         reversed1 +=reversed.charAt(i);
        }
      return reversed1;

    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}