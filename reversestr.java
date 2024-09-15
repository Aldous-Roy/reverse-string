public class reversestr {
    public static void reverse(char [] str){
        int left=0;
        int right=str.length-1;
        while(left<right){
            char temp =str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        char[] s1={'H','E','L','L','O'};
        reverse(s1);
        System.out.println(s1);
    }
}
