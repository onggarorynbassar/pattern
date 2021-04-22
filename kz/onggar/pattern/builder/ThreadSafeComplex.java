package kz.onggar.pattern.builder;

/**
 * So hot and immutable and thread safe
 */
public class ThreadSafeComplex {

    private final String f1;
    private final String f2;
    private final String f3;

    private final String f4;
    private final String f5;
    private final String f6;

    private ThreadSafeComplex(Builder builder) {
        this.f1 = builder.f1;
        this.f2 = builder.f2;
        this.f3 = builder.f3;
        this.f4 = builder.f4;
        this.f5 = builder.f5;
        this.f6 = builder.f6;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "f1='" + f1 + '\'' +
                ", f2='" + f2 + '\'' +
                ", f3='" + f3 + '\'' +
                ", f4='" + f4 + '\'' +
                ", f5='" + f5 + '\'' +
                ", f6='" + f6 + '\'' +
                '}';
    }

    public static class Builder {
        private final String f1;
        private final String f2;
        private final String f3;

        private String f4;
        private String f5;
        private String f6;

        public Builder(String f1, String f2, String f3) {
            this.f1 = f1;
            this.f2 = f2;
            this.f3 = f3;
            this.f4 = "someDefaultValueDefinedByBuilderF4";
            this.f5 = "someDefaultValueDefinedByBuilderF5";
            this.f6 = "someDefaultValueDefinedByBuilderF6";
        }

        public ThreadSafeComplex build() {
            return new ThreadSafeComplex(this);
        }

        public Builder setF4(String f4) {
            this.f4 = f4;
            return this;
        }

        public Builder setF5(String f5) {
            this.f5 = f5;
            return this;
        }

        public Builder setF6(String f6) {
            this.f6 = f6;
            return this;
        }
    }
}
