package kz.onggar.pattern.builder;

/**
 * So hot and immutable
 */
public class Complex {

    private final String f1;
    private final String f2;
    private final String f3;

    private String f4;
    private String f5;
    private String f6;

    private Complex(String f1, String f2, String f3) {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
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
        private final Complex complex;

        public Builder(String f1, String f2, String f3) {
            complex = new Complex(f1, f2, f3);
        }

        public Complex build() {
            return complex;
        }

        public Builder setF4(String f4) {
            complex.f4 = f4;
            return this;
        }

        public Builder setF5(String f5) {
            complex.f5 = f5;
            return this;
        }

        public Builder setF6(String f6) {
            complex.f6 = f6;
            return this;
        }
    }
}
