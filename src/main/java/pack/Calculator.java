package pack;

/**
 * Created by mikalai on 13.11.2015.
 */
public class Calculator {
    private String operation;
    private int first;
    private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int calculate(){
        int res = 0;

        if (operation.equals("+")){
            res =  first + second;
        }
        return res;
    }
}
