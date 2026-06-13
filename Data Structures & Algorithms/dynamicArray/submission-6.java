class DynamicArray {
    int [] arr;
    int p=0;
    int c;

    public DynamicArray(int capacity) {
        this.c = capacity;
        this.arr = new int[capacity];

    }

    public int get(int i) {
        return arr [i];

    }

    public void set(int i, int n) {
        if(i<arr.length){
            arr[i] = n;
        }
        if(i>=p){
            p = i+1;
        }
    }

    public void pushback(int n) {
        if(p < arr.length){
            arr[p] = n;
            p++;
            
            
        }else{
            resize();
            
            arr[p] = n;
            p++;
           
        }

    }

    public int popback() {
        if(p<0){
            return 0;
        }

        int r = arr[p-1];
        arr[p-1] = 0;
        p--;
        return r;

    }

    private void resize() {
        c=2 * c;
         int [] arr1 = new int [ c];
         //arr = Arrays.copyOf(arr1, arr1.length);
            for(int i=0; i< arr.length; i++ ){
            arr1[i] = arr[i];
            }
            this.arr = arr1;
            
    }

    public int getSize() {
        return p;

    }

    public int getCapacity() {
        return arr.length;

    }
}
