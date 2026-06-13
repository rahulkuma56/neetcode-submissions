class DynamicArray {
    int [] arr;
    int p=0;
    int c;

    public DynamicArray(int capacity) {
        this.c = capacity;
        System.out.println("c:"+c);
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
            System.out.println("p:"+p);
        }
    }

    public void pushback(int n) {
        if(p < arr.length){
            arr[p] = n;
            p++;
             System.out.println("p:"+p);
            
        }else{
            resize();
            System.out.println("Resize_c:"+c);
            System.out.println("resize_p:"+p);
            arr[p] = n;
            p++;
            System.out.println("Resize_c:"+c);
            System.out.println("resize_p:"+p);
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
            for(int i=0; i< arr.length; i++ ){
            arr1[i] = arr[i];
            }
            this.arr = arr1;
             System.out.println("arr1.length:"+arr1.length);
            System.out.println("arr.length:"+arr.length);

    }

    public int getSize() {
        return p;

    }

    public int getCapacity() {
        return arr.length;

    }
}
