import "CircularArray.java"
public class Tester {
    public static void main(String[] args){
        Object[] array = new Object[10]; //static array initialized for you :)
        
        
        int x = 1;
        array[0] = x;
        
        for (int k=0; k<10; k++){
            System.out.println(array[k]);
        }
    }
}