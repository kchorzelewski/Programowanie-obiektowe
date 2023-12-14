public interface DataProcessor {
    abstract StringBuilder processData(String data);
    abstract boolean isValid(String data);
}
