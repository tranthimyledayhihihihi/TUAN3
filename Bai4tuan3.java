/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4tuan3;
import java.util.Scanner;
public class Bai4tuan3 {

    public static void main(String[] args) {
        double a=0;
        double b=0;
        double c=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap lan luot vao 3 so a b c: ");
        a= scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
        if( a<=b && a<=c)
            System.out.println("a la so be nhat");
        else if (b<=a && b<=c)
            System.out.println("b la so be nhat");
        else
            System.out.println(" C la so be nhat");     
    }
}
