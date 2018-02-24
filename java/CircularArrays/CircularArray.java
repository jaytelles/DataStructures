class CircularArray{
    private int start;
    private int end;
    private int maxSize;
    private int currentSize;
    private Object[] array;
    
    public CircularArray(int size){
        start = 0;
        end = 0;
        maxSize = size;
        currentSize = 0;
        array = new Object[maxSize];
    }
    
    public boolean append(Object element){
        if (currentSize + 1 > maxSize) {
            return false;
        }
        
        array[end] = element;
        end = (end + 1) % maxSize; //this may cause issues when it comes time to remove elements
        currentSize++;
        
        return true;
    }
    
    public boolean prepend(Object element){
        if (currentSize + 1 > maxSize) {
            return false;
        }
        
        array[start] = element;
        start = (start - 1) % maxSize; //this may cause issues when it comes time to remove elements
        if (start < 0){
            start += maxSize;
        }
        currentSize++;
        
        return true;
    }
    
    private void printInfo() {
        System.out.print("start: " + start);
        System.out.print("    end: " + end);
        System.out.println("    " + this);
    }
    
    public String toString(){
        String retStr = "";
        for(int k=0; k<maxSize; k++){
            retStr += array[k];
            retStr += " ";
        }
        retStr += "\b";
        return retStr;
    }
}