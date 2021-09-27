public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics() {
        // initialize the variable numberCount here
        
        
    }

    public void addNumber(int number) {
        this.count = this.count +1;
        this.sum = this.sum + number;
    }

    public int getCount() {
        
        return this.count;
    }
    public int sum() {
        // write code here
        return this.sum ;        
    }

    public double average() {
        if (this.count == 0){
            return (double)this.count;
        }else{
        return (double)this.sum /  (double)this.count;
    }
}
}