package OOPS;

public class Polynomial {

        int degCoeff[];

        /* This funtion sets coefficient for a particular degree value , if degree is not there in the polynomial
         * then corresponding term(with specified degree and value is added in the polynomial. if the degree is already
         * present in the polynomial then previous coefficient is replaced by new coefficient value passed as function arguement
         */

        Polynomial() {
            degCoeff = new int[10];
        }

        public void setCoefficient(int degree, int coeff) {
            if (degree > degCoeff.length - 1) {
                //create a new array with size = degree+1
                int temp[] = degCoeff;
                degCoeff = new int[degree + 1];
                // copy values from temp to degCoeff
                for (int i = 0; i < temp.length; i++) {
                    degCoeff[i] = temp[i];
                }
            }
            degCoeff[degree] = coeff;
        }

        /* prints all the terms (only terms with non zero  coefficients are to be printed) in increasing order of degree.
         */

        public void print() {
            for (int i = 0; i < degCoeff.length; i++) {
                if (degCoeff[i] != 0) {
                    System.out.print(degCoeff[i] + "x" + i + " ");
                }
            }
        }

        /*
        adds two polynomials and returns a new polynomial which has result
         */
        public Polynomial add(Polynomial p) {
            Polynomial ans = new Polynomial();
            int plen1 = this.degCoeff.length;
            int plen2 = p.degCoeff.length;
            int len = Math.min(plen1, plen2);

            int i;
            for (i = 0; i < len; i++) {
                ans.setCoefficient(i, this.degCoeff[i] + p.degCoeff[i]);
            }
            while (i < plen1) {
                ans.setCoefficient(i, this.degCoeff[i]);
                i++;
            }
            while (i < plen2) {
                ans.setCoefficient(i, p.degCoeff[i]);
                i++;
            }
            return ans;
        }

        /*
        Subtract two polynomials and a returns a new polynomial as a result
         */
        public Polynomial subtract(Polynomial p) {
            Polynomial ans = new Polynomial();
            int plen1 = this.degCoeff.length;
            int plen2 = p.degCoeff.length;
            int len = Math.min(plen1, plen2);

            int i;
            for (i = 0; i < len; i++) {
                ans.setCoefficient(i, this.degCoeff[i] - p.degCoeff[i]);
            }
            while (i < plen1) {
                ans.setCoefficient(i, this.degCoeff[i]);
                i++;
            }
            while (i < plen2) {
                ans.setCoefficient(i, -p.degCoeff[i]);
                i++;
            }
            return ans;
        }

        public int getCoeff(int degree) {
            if (degree < this.degCoeff.length) {
                return degCoeff[degree];
            } else
                return 0;
        }

    /*
    Multiply the polynomials and return the resulting polynomial
     */

        public Polynomial multiply(Polynomial p){
            Polynomial ans = new Polynomial();
            for(int i =0; i< this.degCoeff.length; i++){
                for(int j = 0; j<p.degCoeff.length; j++){
                    int termdeg= i+j;
                    int termCoeff =this.degCoeff[i]*p.degCoeff[i];
                    int oldCoeff = ans.getCoeff(termdeg);
                    ans.setCoefficient(termdeg,termCoeff+oldCoeff);
                }
            }
            return ans;
        }
}




