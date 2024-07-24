public class towerofhonoi {
    static void  toh(int n,char A,char B,char C){
        if(n==0){
           return;
        }
        else{
            toh( n-1,A,C,B);
            System.out.println("Move disk " + n + " from rod "
                           + A + " to rod "
                           + B);
            toh(n-1,B,A,C);
        }
    }
    
    public static void main(String[] args) {
        int n=3;
        toh(n,'A','B','C');

    }
}
