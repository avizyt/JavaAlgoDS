package com.avijit.stack;

public class DynamicCustomStack extends CustomStack {

    public DynamicCustomStack()  {
        super();
    }

    public DynamicCustomStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // double the size of the array
            int[] temp = new int[data.length * 2];

            // copy the data from the old array to the new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
