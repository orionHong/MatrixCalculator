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
public class MatrixCalculatorController {
    private MatrixCalculator m;
    private MatrixCalculatorGUI ui;
    
    
    public MatrixCalculatorController(){
    }
    
    /** To add a MatrixCalculatorGUI instance
     * @param ui ***/
    public void addMatrixCalculatorGUI(MatrixCalculatorGUI ui){
        this.ui = ui;
    }
    
    /** To and a MatrixCalculator instance
     * @param m ***/
    public void addMatrixCalculator(MatrixCalculator m){
        this.m = m;
    }
    
    /** To add a matrix in MatrixCalculator, in the form of Matrix A **/
    public void addMatrixA(int[][] newMatrix){
        m.setMatrixA(newMatrix);
    }
    
     /** To add a matrix in MatrixCalculator, in the form of Matrix B **/
    public void addMatrixB(int[][] newMatrix){
        m.setMatrixB(newMatrix);
    }
    
    /*** To do transposition ***/
    public void transposeA(){
        m.transposeMatrixA();
    }    
    
    public void transposeB(){
        m.transposeMatrixB();
    }
    
    /*** To do addition ***/
    public void addition(){
        m.addMatrix();
    }
    
    /*** To do subtraction ***/
    public void subtraction(){
        m.subtractMatrix();
    }
    
    /*** To do multiplication ***/
    public void multiplication(){
        m.multiplyMatrix();
    }
    
    /*** To verify addition and subtraction operation ***/
    public boolean isLegalToAddAndSubract(){
        return m.isLegalToAddAndSubract();
    }
    
    /*** To verify multiplication and division operation ***/
    public boolean isLegalForMulti(){
        return m.isLegalForMulti();
    }
    
    /*** To turn matrix into String output ***/
    public String toStringResult(){
       return m.toStringResult();
    }
    
    /*** To turn matrixA into String output ***/
    public String toStringA(){
        return m.toStringA();
    }
    
    /*** To turn matrixB into String output ***/
    public String toStringB(){
        return m.toStringB();
    }
    
    /*** To call reset() method in MatrixCalculator ***/
    public void reset(){
        m.reset();
    }
    
    /*** To get Matrix A row numbers ***/
    public String getARowNum(){
        return "" + m.getARowNum();
    }
    
    /*** To get Matrix A columns numbers ***/
    public String getAColNum(){
        return "" + m.getAColNum();
    }
    
    /*** To get Matrix B row numbers ***/
    public String getBRowNum(){
        return "" + m.getBRowNum();
    }
    
    /*** To get Matrix B columns numbers ***/
    public String getBColNum(){
        return "" + m.getBColNum();
    }
}
