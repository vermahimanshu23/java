public class removevowel {
    String str="hEllo";
    String str1="";
    public void removevowel(){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                continue;
            }
            else{
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
    public static void main(String[] args) {
        removevowel obj=new removevowel();
        obj.removevowel();
    }
    
}
