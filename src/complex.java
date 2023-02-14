public class complex {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c1 + c2: " + c1.add(c2));
        System.out.println("c1 - c2: " + c1.sub(c2));
        System.out.println("c1 * c2: " + c1.mul(c2));
        System.out.println("c1 / c2: " + c1.div(c2));
    }

    public static class Complex {
        private double real;
        private double imag;

        public Complex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        public Complex add(Complex c) {
            return new Complex(this.real + c.real, this.imag + c.imag);
        }

        public Complex sub(Complex c) {
            return new Complex(this.real - c.real, this.imag - c.imag);
        }

        public Complex mul(Complex c) {
            return new Complex(this.real * c.real - this.imag * c.imag, this.real * c.imag + this.imag * c.real);
        }

        public Complex div(Complex c) {
            double denominator = c.real * c.real + c.imag * c.imag;
            return new Complex((this.real * c.real + this.imag * c.imag) / denominator, (this.imag * c.real - this.real * c.imag) / denominator);
        }

        public String toString() {
            return this.real + " + " + this.imag + "i";
        }
    }
}
