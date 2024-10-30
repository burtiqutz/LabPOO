import java.util.Random;

public class ComplexMatrix {
    private Complex[][] matrix;

    public ComplexMatrix(int rows, int cols) {
        matrix = new Complex[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                this.matrix[i][j] = new Complex(new Random().nextInt(10), new Random().nextInt(10));
            }
        }
    }

    public void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addMatrix(ComplexMatrix matrixToAdd) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j].addComplex(matrixToAdd.getElement(i, j));
            }
        }
    }

    public void subMatrix(ComplexMatrix matrixToSub) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j].subComplex(matrixToSub.getElement(i, j));
            }
        }
    }

    public void scaleMatrix(int k) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j].mulScalar(k);
            }
        }
    }

    public void multiplyMatrix(ComplexMatrix matrixToMultiply) {
        ComplexMatrix aux = new ComplexMatrix(this.matrix.length, this.matrix[0].length);
        for(int i = 0; i < aux.matrix.length; i++) {
            for(int j = 0; j < aux.matrix[i].length; j++) {
                aux.matrix[i][j] = new Complex (0, 0);
            }
        }

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                for(int k = 0; k < aux.matrix[i].length; k++) {
                    //c[i][j] += a[i][k] * b[k][j]
                    //unde c[i][j] este aux.matrix[i][j]
                    Complex aux2 = this.getElement(i, k);
                    aux2.mulComplex(matrixToMultiply.getElement(k, j));
                    aux.matrix[i][j].addComplex(aux2);
                }
            }
        }

        for(int i = 0; i < aux.matrix.length; i++) {
            for (int j = 0; j < aux.matrix[i].length; j++) {
                this.matrix[i][j] = aux.matrix[i][j];
            }
        }
    }

    public Complex getElement(int i, int j) {
        return this.matrix[i][j];
    }


}
