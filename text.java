public class text {
    public static void main(String[] args) {

        String str = "nitin";
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n/2; i++) {

            if (str.charAt(i) != str.charAt(n - i - 1)) {
                count++;
                
            }
         }
          if(count==0){ 
              System.out.println("String is palindrome");
          }
          else{
              System.out.println("String is not palindrome");
          }

        }

    }


