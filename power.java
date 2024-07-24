public class power {
    static int anypower(int a ,int n){
        if(n==0){
            return 1;
        }
        return a * anypower(a, n -1);
    }
    
    public static void main(String[] args) {
        
        int result=anypower(4, 3);
        System.out.println(result);
        
    }
   
}
