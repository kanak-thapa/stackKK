

public class CustomStack {
    protected int[] data;
    private static final int Default_SIZE = 10;
    //this is going to be same for all obj of costSatck and so static, dont want people to change and me eithewr so final 
    int ptr = -1;

    public CustomStack(){
        this(Default_SIZE);//call this as a constructor
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!");
            return false; 
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop an empty stack!!");
        }
        int remove = data[ptr];
        ptr--;
        return remove;
    }
    private boolean isFull(){
        return ptr == data.length-1;//ptr at the last index
    }

    private boolean isEmpty(){
        return ptr == -1;
    }
}
