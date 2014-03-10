/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class HelloWorld {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Hello,"+nome);
    }
}
