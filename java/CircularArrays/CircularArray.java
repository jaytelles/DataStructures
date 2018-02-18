class CircularArray(){
    private int start;
    private int end;
    private int size;
    private Object[] array;
    
    public void CircularArray(int size){
        start = 0;
        end = 0;
        this.size = arraySize;
        array = new Object[this.size];
    }
    
    public String toString(){
        String retStr = "";
        for(int k=0; k<this.size; k++){
            retStr += this.array[k];
            retStr += " ";
        }
        retStr += "\b";
    }
}