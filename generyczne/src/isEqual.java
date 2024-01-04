public class isEqual <T, U>{
    T t;
    U u;
    public isEqual(T value, U value2){
        this.t=value;
        this.u = value2;
    }
    public boolean equals(T value, T value2) {
        return value.equals(value2);
    }
}
