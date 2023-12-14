public class TextProcessor implements DataProcessor{
    @Override
    public StringBuilder processData(String data) {
        if (data != null){
            StringBuilder sb = new StringBuilder(data);
            return sb.reverse();
        }
        return null;
    }

    @Override
    public boolean isValid(String data) {
        return data.isEmpty();
    }
}
