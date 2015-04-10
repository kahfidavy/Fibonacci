/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Data {
    int masukan;
    int awal=1;
    int nilaiawal=1;
    int nilai=0;
    int n=0;
    Scanner input = new Scanner( System.in );
    public Data(){
    }
    
    public void input(){
        System.out.print("Input = ");
        masukan = input.nextInt();
    }
    
    public void output(){
        System.out.print("1 ");
        while(masukan>awal){
            nilai=nilaiawal+n;
            n=nilaiawal;
            nilaiawal=nilai;
            awal++;
            System.out.print(nilai+" ");
        }
    }
    
}
