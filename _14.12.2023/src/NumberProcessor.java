public class NumberProcessor implements DataProcessor{
    @Override
    public StringBuilder processData(String data) {
        return new StringBuilder("Processed: " + data);
    }

    @Override
    public boolean isValid(String data) {
        return data.matches("-?\\d+(\\.\\d+)?");
    }
}
