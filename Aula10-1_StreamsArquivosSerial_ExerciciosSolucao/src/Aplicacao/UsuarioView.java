/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author Sebastián
 */
public class UsuarioView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioController uc = new UsuarioController();

        while (true) {
            try {
                Console console = System.console();
                Scanner sc = new Scanner(System.in);

                int opc;

                System.out.println("1. Login");
                System.out.println("2. Add User");
                System.out.println("3. Exit");
                System.out.print("Answer: ");
                opc = sc.nextInt();
                sc.nextLine();

                String username, password;

                switch (opc) {
                    case 1:
                        System.out.print("-Username: ");
                        username = sc.nextLine();
                        System.out.print("-Password: ");
                        password = sc.nextLine();

                        boolean bol = uc.validate(username, password);
                        if (bol) {
                            System.out.println("--Validate");

                            String othername, othercompletename, otherpassword;
                            opc = -1;

                            while (opc != 4) {
                                try {
                                    System.out.println("---1. Change Username");
                                    System.out.println("---2. Change Complete name");
                                    System.out.println("---3. Change Password");
                                    System.out.println("---4. Exit");
                                    System.out.print("---Answer:");
                                    opc = sc.nextInt();

                                    switch (opc) {
                                        case 1:
                                            System.out.print("----Other username: ");
                                            sc.nextLine();
                                            othername = sc.nextLine();
                                            uc.changeUsername(username, password, othername);
                                            username = othername;
                                            break;
                                        case 2:
                                            System.out.print("----Other Complete name: ");
                                            sc.nextLine();
                                            othercompletename = sc.nextLine();
                                            uc.changeCompleteName(username, password, othercompletename);
                                            break;
                                        case 3:
                                            System.out.print("----Other password: ");
                                            sc.nextLine();
                                            otherpassword = sc.nextLine();
                                            uc.changePassword(username, password, otherpassword);
                                            password = otherpassword;
                                            break;
                                        default:
                                            opc = 4;
                                    }
                                } catch (Exception ex) {
                                    System.out.println("Put validate datatype");
                                }
                            }
                        } else {
                            System.out.println("--Not validate");
                        }
                        break;
                    case 2:
                        System.out.println("--Add user");
                        System.out.print("-Add complete name: ");
                        String completename = sc.nextLine();
                        System.out.print("-Add username: ");
                        username = sc.nextLine();
                        System.out.print("-Add password: ");
                        password = sc.nextLine();
                        Usuario user = new Usuario(completename, username, password);
                        uc.addUser(user);
                        break;
                    case 3:
                    default:
                        return;
                }
            } catch (Exception ex) {
                System.out.println("Put validate datatype");
            }
        }
    }

}
