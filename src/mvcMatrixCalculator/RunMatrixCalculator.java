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
public class RunMatrixCalculator {
    public static void main(String[] args) {
        MatrixCalculator m = new MatrixCalculator();
        
        MatrixCalculatorGUI ui = new MatrixCalculatorGUI();
        
        MatrixCalculatorController c = new MatrixCalculatorController();
        
        c.addMatrixCalculator(m);
        c.addMatrixCalculatorGUI(ui);
        
        ui.addController(c);
        ui.setVisible(true);
        ui.setResizable(false);
    }
}
