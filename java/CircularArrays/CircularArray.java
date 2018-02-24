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
        //if ((end + 1) % maxSize == start) {
        if (currentSize + 1 > maxSize) {
            return false;
        }
        
        array[end] = element;
        end = (end + 1) % maxSize;
        currentSize++;
        
        System.out.print("start: " + start);
        System.out.print("    end: " + end);
        System.out.println("    " + this);
        
        return true;
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