package com.rplbo.utsnota;

import java.lang.Math;

public class Operator {
    private String operatorString;
    private String operatorSimbol;

    public Operator(String operatorString) {
        if (operatorString.equalsIgnoreCase("kali")){
            this.operatorSimbol = "*";
        }else if (operatorString.equalsIgnoreCase("bagi")) {
            this.operatorSimbol = "/";
        }else if (operatorString.equalsIgnoreCase("tambah")) {
            this.operatorSimbol = "+";
        }else if (operatorString.equalsIgnoreCase("kurang")) {
            this.operatorSimbol = "-";
        }else if (operatorString.equalsIgnoreCase("pangkat")){
            this.operatorSimbol = "**";
        }
    }

    public String getOperatorSimbol() {
        return operatorSimbol;
    }
}
