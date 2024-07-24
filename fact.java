public class fact {
    public int f(){
        int n=5;
        if(n==0){
            return 1;
        }
        else{
            return n*f();
        }
    }
    public static void main(String[] args) {
        fact obj=new fact();
        System.out.println(obj.f());
    }
    
}
