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
        if (currentSize + 1 > maxSize || element == null) {
            return false;
        }
        
        array[end] = element;
        end = incrementIndex(end); //this may cause issues when it comes time to remove elements
        currentSize++;
        
        return true;
    }
    
    public boolean prepend(Object element){
        if (currentSize + 1 > maxSize || element == null) {
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
    
    public Object pop(){
        if(currentSize == 0){
            return null;
        }
        
        end = decrementIndex(end);
        
        Object retval = array[end];
        currentSize--;
        
        return retval;
    }
    
    public Object pop(int index){
        //add a return null if index isnt in the active segment?\
        //build available indices by taking the different between maxSize-end and maxSize-start?
        if (currentSize == 0 || index < 0 || index > maxSize){
            return null;
        }
        
        Object ret = array[index];
        
        if (index == start){
            start = incrementIndex(start);
        }
        
        if (index == end){
            end = decrementIndex(end);
        }

        //if the index is closer to the start than the end
        if(Math.abs(start - index) < Math.abs(end - index)){
            int k = index;
            //while()
        }
        //if the index is closer to the end than the start
        else {
            int k = index;
            while (k != end){
                int next = incrementIndex(k);
                array[k] = array[next];
                incrementIndex(k);
                end = decrementIndex(end);
            }
        }
        
        currentSize--;
        return ret;
    }
    
    private int decrementIndex(int index){
        if (index > 0){
            index--;
        } else {
            index = maxSize - 1;
        }
        return index;
    }
    
    private int incrementIndex(int index){
        index = (index + 1) % maxSize;
        return index;
    }
    
    //deep copy
    //pop at index
    //search?
    //sort?
    
    
    public void printInfo() {
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