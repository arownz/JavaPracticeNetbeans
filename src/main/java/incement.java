/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class incement {
    public static void main(String[] args) {
        int outputNum = 0;
        for(int i = 0; i < 5; i++){

            if (i % 2 == 0){
                outputNum += 2;
            }
            else {
                outputNum += 3;
            }
            System.out.print(outputNum + (i == 4 ? "" : " "));
        }
    }
}

