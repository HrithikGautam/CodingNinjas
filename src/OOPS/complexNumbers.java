package OOPS;

class complexNumbers {

    int real;
    int imaginary;

    complexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void plus(complexNumbers c) {
        int real = this.real + c.real;
        int imaginary = this.imaginary + c.imaginary;
        this.real = real;
        this.imaginary = imaginary;
    }

    void multiply(complexNumbers c) {
        int real = (this.real * c.real) - (this.imaginary * c.imaginary);
        int imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        this.real = real;
        this.imaginary = imaginary;
    }

    void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }
}


