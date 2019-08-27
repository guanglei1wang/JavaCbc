package com.tmall.coinor;

import org.bytedeco.cbc.presets.Cbc;
import org.bytedeco.cbc.presets.Cbc_Model;

public class CbcSolver {
    public static final String VERSION_2_10_2 = "2.10.2";

    public CbcSolver(){}

    public void test(){
        Cbc.Cbc_getVersion();
        //Cbc_Model model = Cbc.Cbc_newModel();
    }

    public static void main(String[]args){
       CbcSolver solver = new CbcSolver();
       solver.test();
    }
}
