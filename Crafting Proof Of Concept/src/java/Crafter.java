/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SpudManTwo
 */
public class Crafter {
    public String craft(String input) {
        String[] data = input.split(" ");
        int successRoll = 1+(int)(Math.random()*20);
        if (successRoll==0)
            return "Crit Fail";
        String result=""+data[2];
        int wis = Integer.parseInt(data[3]);
        int level = Integer.parseInt(data[1]);
        if (successRoll==20) {
            result+="{Crit}";
        }
        else if (successRoll+wis-level>10) {
            result+="{Success}";
        }
        else {
            result+="{Fail}";
            level = (int)((double)level/2+0.5);
        }
        if (data[0].equalsIgnoreCase("Crystal")) {
            level+=1;
        }
        if (data[0].equalsIgnoreCase("Iron")) {
            level+=3;
        }
        if (data[0].equalsIgnoreCase("Steel")) {
            level+=7;
        }
        if (data[0].equalsIgnoreCase("Diamond")) {
            level+=9;
        }
        if (data[0].equalsIgnoreCase("Divine")) {
            level+=10;
        }
        result+="\nAtk: ";
        if (data[2].equalsIgnoreCase("OHS")||data[2].equalsIgnoreCase("OHD")||data[2].equalsIgnoreCase("OHR")||data[2].equalsIgnoreCase("OHT")||data[2].equalsIgnoreCase("THAS")||data[2].equalsIgnoreCase("TW")) {
            int atkRoll1 = (1+(int)(Math.random()*6))*level;
            int atkRoll2 = (1+(int)(Math.random()*6))*level;
            if (successRoll==20&&atkRoll1<atkRoll2) {
                atkRoll1 = atkRoll2;
            }
            result+=atkRoll1;
        }
        else if(data[2].equalsIgnoreCase("THS")||data[2].equalsIgnoreCase("OHCS")||data[2].equalsIgnoreCase("OHA")) {
            int atkRoll1 = (1+(int)(Math.random()*12))*level;
            int atkRoll2 = (1+(int)(Math.random()*12))*level;
            if (successRoll==20&&atkRoll1<atkRoll2) {
                atkRoll1 = atkRoll2;
            }
            result+=atkRoll1;
        }
        else {
            int atkRoll1 = (1+(int)(Math.random()*12)+1+(int)(Math.random()*12))*level;
            int atkRoll2 = (1+(int)(Math.random()*12)+1+(int)(Math.random()*12))*level;
            if (successRoll==20&&atkRoll1<atkRoll2) {
                atkRoll1 = atkRoll2;
            }
            result+=atkRoll1;
        }
        if (data[2].equalsIgnoreCase("TW")) {
            result+=" Cnt: ";
        }
        else {
            result+=" Dur: ";
        }
        if (data[2].equalsIgnoreCase("OHS")||data[2].equalsIgnoreCase("THCS")||data[2].equalsIgnoreCase("OHD")||data[2].equalsIgnoreCase("OHA")||data[2].equalsIgnoreCase("THAS")||data[2].equalsIgnoreCase("TW")) {
            int durRoll1 = (1+(int)(Math.random()*20))*level;
            int durRoll2 = (1+(int)(Math.random()*20))*level;
            if (successRoll==20&&durRoll1<durRoll2) {
                durRoll1 = durRoll2;
            }
            result+=durRoll1;
        }
        else if(data[2].equalsIgnoreCase("OHCS")||data[2].equalsIgnoreCase("OHR")) {
            int durRoll1 = (1+(int)(Math.random()*10))*level;
            int durRoll2 = (1+(int)(Math.random()*10))*level;
            if (successRoll==20&&durRoll1<durRoll2) {
                durRoll1 = durRoll2;
            }
            result+=durRoll1;
        }
        else {
            int durRoll1 = (1+(int)(Math.random()*20)+1+(int)(Math.random()*20))*level;
            int durRoll2 = (1+(int)(Math.random()*20)+1+(int)(Math.random()*20))*level;
            if (successRoll==20&&durRoll1<durRoll2) {
                durRoll1 = durRoll2;
            }
            result+=durRoll1;
        }
        result +=" Wht: ";
        if (data[2].equalsIgnoreCase("THBA")) {
            int whtRoll1 = (1+(int)(Math.random()*12)+1+(int)(Math.random()*12))*level;
            int whtRoll2 = (1+(int)(Math.random()*12)+1+(int)(Math.random()*12))*level;
            if (successRoll==20&&whtRoll1>whtRoll2) {
                whtRoll1 = whtRoll2;
            }
            result+=whtRoll1;
        }
        else if(data[2].equalsIgnoreCase("OHD")||data[2].equalsIgnoreCase("TW")) {
            int whtRoll1 = (1+(int)(Math.random()*3))*level;
            int whtRoll2 = (1+(int)(Math.random()*3))*level;
            if (successRoll==20&&whtRoll1>whtRoll2) {
                whtRoll1 = whtRoll2;
            }
            result+=whtRoll1;
        }
        else if(data[2].equalsIgnoreCase("THS")||data[2].equalsIgnoreCase("OHCS")||data[2].equalsIgnoreCase("OHA")||data[2].equalsIgnoreCase("OHT")) {
            int whtRoll1 = (1+(int)(Math.random()*12))*level;
            int whtRoll2 = (1+(int)(Math.random()*12))*level;
            if (successRoll==20&&whtRoll1>whtRoll2) {
                whtRoll1 = whtRoll2;
            }
            result+=whtRoll1;
        }
        else {
            int whtRoll1 = (1+(int)(Math.random()*6))*level;
            int whtRoll2 = (1+(int)(Math.random()*6))*level;
            if (successRoll==20&&whtRoll1>whtRoll2) {
                whtRoll1 = whtRoll2;
            }
            result+=whtRoll1;
        }
        return result;
    }
}
