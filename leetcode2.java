public class leetcode2 {
    public static void main(String[] args) {
        String str="a,a,b,b,c,c";
        String str1="";
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    System.out.print(str.charAt(i));
                }
                else{
                    str1=str1+str.charAt(i);
                }
            }
            
        }
    }
    
}
