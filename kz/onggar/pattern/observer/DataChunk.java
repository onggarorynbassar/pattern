package kz.onggar.pattern.observer;

public class DataChunk {
    private final int importantInt;
    private final String optionalString;

    public DataChunk(int importantInt, String optionalString) {
        this.importantInt = importantInt;
        this.optionalString = optionalString;
    }

    @Override
    public String toString() {
        return "DataChunk{" +
                "importantInt=" + importantInt +
                ", optionalString='" + optionalString + '\'' +
                '}';
    }
}
