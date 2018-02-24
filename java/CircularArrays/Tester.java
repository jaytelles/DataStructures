public class Tester {
    public static void main(String[] args){
        CircularArray xxx = new CircularArray(5);
        xxx.prepend(1);
        xxx.printInfo();
        xxx.prepend(2);
        xxx.printInfo();
        xxx.prepend(3);
        xxx.printInfo();
        xxx.prepend(4);
        xxx.printInfo();
        xxx.prepend(5);
        xxx.printInfo();
        
        //xxx.pop();
        //xxx.printInfo();
        /*
        xxx.prepend(6);
        xxx.printInfo();
        
        xxx.pop();
        xxx.printInfo();
        
        xxx.prepend(7);
        xxx.printInfo();
        
        xxx.pop();
        xxx.printInfo();
        
        xxx.prepend(8);
        xxx.printInfo();
        
        xxx.pop();
        xxx.printInfo();
        
        xxx.prepend(9);
        xxx.printInfo();
        */
    }
}