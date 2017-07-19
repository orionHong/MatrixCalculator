/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcMatrixCalculator;

/**
 *
 * @author Hongru Xiang
 */
public class MatrixCalculator {
    // Date field
    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] result;
    
    /*** To input matrices data AFTER CHECK MATRIX ***/
    MatrixCalculator(int[][] matrixA, int[][] matrixB) {     
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }
    
    MatrixCalculator(int[][] matrixA) {
        this.matrixA = matrixA;
    }//To load a single matrix (for transpose).
    
    MatrixCalculator(){
        matrixA = new int[1][1];
        matrixB = new int[1][1];
        result = new int[1][1];
    }//Default constructor
    
    /*** To add two matrices after isLegalToAddAndSubract() ***/
    public void addMatrix() {
        result = new int[matrixA.length][matrixA[0].length];
        
        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }
    
     /*** To subtract two matrices after isLegalToAddAndSubract() ***/
    public void subtractMatrix() {
        result = new int[matrixA.length][matrixA[0].length];
        
        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
    }
    
    /*** To multiply two matrices AFTER isLegalForMulti() ***/
    public void multiplyMatrix(){
        result = new int[getARowNum()][getBColNum()];
        
        for(int i = 0; i < result.length; i++) {
            for(int j = 0 ; j < result[i].length; j++) {
                result[i][j] = getMultValue(i, j);
            }
        }
    }
    
    /*** To get multiplication value for each elements ***/
    public int getMultValue(int ARow, int BCol) {
        int sum = 0;
        int columnNum = getAColNum();
        
        for(int i = 0; i < columnNum; i++) {
            sum += matrixA[ARow][i] * matrixB[i][BCol];
        }
        return sum;
    }
    
    /*** To transpose a single matrix ***/
    public void transposeMatrixA(){
        int[][] temp = new int[getAColNum()][getARowNum()];
        
        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[i].length; j++) {
                temp[j][i] = matrixA[i][j];
            }
        }
        matrixA = temp;
    }
    
    /*** To transpose a single matrix ***/
    public void transposeMatrixB(){
        int[][] temp = new int[getBColNum()][getBRowNum()];
        
        for(int i = 0; i < matrixB.length; i++) {
            for(int j = 0; j < matrixB[i].length; j++) {
                temp[j][i] = matrixB[i][j];
            }
        }
        matrixB = temp;
    }
    
    /*** To turn matrix into String output ***/
    public String toStringResult(){
        String output = "";
        
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                output += result[i][j] + " ";
            }
            output += "\n";
        }
        return output;      
    }
    
    /*** To turn matrixA into String output ***/
    public String toStringA(){
        String output = "";
        
        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[i].length; j++) {
                output += matrixA[i][j] + " ";
            }
            output += "\n";
        }
        return output;      
    }
    
    /*** To turn matrixB into String output ***/
    public String toStringB(){
        String output = "";
        
        for(int i = 0; i < matrixB.length; i++) {
            for(int j = 0; j < matrixB[i].length; j++) {
                output += matrixB[i][j] + " ";
            }
            output += "\n";
        }
        return output;      
    }
    
    /*** To verify addition and subtraction operation ***/
    public boolean isLegalToAddAndSubract(){
        return matrixA.length == matrixB.length && 
                matrixA[0].length == matrixB[0].length;
    }
    
        /*** To verify multiplication and division operation ***/
    public boolean isLegalForMulti(){
        return matrixA.length == matrixB[0].length;
    }
    
    /*** To reset properties ***/
    void reset(){
        matrixA = new int[1][1];
        matrixB = new int[1][1];
        result = new int[1][1];
    }
    
    void resetResult(){
        result = null;
    }
    
    // Accessors and mutators
    public int getARowNum(){
        return matrixA.length;
    }
    
    public int getAColNum(){
        return matrixA[0].length;
    }
    
    public int getBRowNum(){
        return matrixB.length;
    }
    
    public int getBColNum(){
        return matrixB[0].length;
    }

    public int[][] getMatrixA(){
        return matrixA;
    }
    
    public int[][] getMatrixB(){
        return matrixB;
    }
    
    public int[][] getResultMatrix(){
        return result;
    }
    
    public void setMatrixA(int[][] newMatrix){
        matrixA = newMatrix;
    }
    
    public void setMatrixB(int[][] newMatrix) {
        matrixB = newMatrix;
    }
}
