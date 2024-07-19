public class text {
    public static void main(String[] args) {
        String str="hello world";
        int size=15;
        
        int stack[]=new int[size];
        int i;
        for(i=0;i<str.length();i++)
        {

            if(str.charAt(i)=='l')
            {
        
             stack[i]=str.charAt(i);
             
            }
           
        }
        for(i=str.length();i>0;i--){
            System.out.print((char)stack[i-1]);
        }
        

    }
    
}
