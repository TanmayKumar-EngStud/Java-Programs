package com.Matrix;
//Right now i have added only 3 features:
// Addition
// Subtraction
// Multiplication

// Later i will try to add more features to this package...

public class Matrix {
    private int[][] matrix;

    public void showMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }

    public int[][] addMatrix(int[][] matrix1, int[][] matrix2){
        for(int i=0; i < matrix1.length; i++ ){
            for(int j= 0; j <matrix1[i].length; j++){
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    public int[][] subtractMatrix(int[][] matrix1, int[][] matrix2){
        for(int i=0; i < matrix1.length; i++ ){
            for(int j= 0; j <matrix1[i].length; j++){
                matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix;
    }

    private int multiply(int matrix1[], int matrix2[]){
        int net= 0;
        for (int i = 0; i<matrix1.length;i++){
            net = net + matrix1[i]*matrix2[i];
        }
        return net;
    }
    private int[] getColumn(int matrix1[][], int col){
        int length = matrix1[0].length;

        int[] finalMatrix = new int[length];
        for(int i =0; i< matrix1[0].length;i++){
            finalMatrix[i] = matrix1[i][col];
        }
        return finalMatrix;
    }

    public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2){
        for(int i=0; i < matrix1.length; i++){
            for(int j= 0; j < matrix[i].length; j++){
                matrix[i][j]= multiply(matrix1[i], getColumn(matrix2, j));
            }
        }
        return matrix;
    }

}
