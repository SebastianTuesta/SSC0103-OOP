/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastián
 */
public class UsuarioController {

    private static final String FILETEXT = "usuarios.txt";
    private static final String FILEOBJ = "usuarios.dat";

    public UsuarioController() {
    }

    
    public void addUser(Usuario user) {
        this.addUserObject(user);
        //this.addUserText(user);
    }

    private void addUserObject(Usuario user) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FILEOBJ, true);
            oos = new ObjectOutputStream(fos);
            user.setPassword(user.getPassword());
            oos.writeObject(user);
        } catch (IOException ex) {
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

    }

    private void addUserText(Usuario user) {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            if (this.exist(user.getUserName())) {
                System.out.println("This user exist");
            } else {
                fw = new FileWriter(FILETEXT, true);
                bw = new BufferedWriter(fw);
                bw.write(user.getCompleteName() + "," + user.getUserName()
                        + "," + user.getPassword());
                bw.newLine();
            }

        } catch (IOException e) {
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }

                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void printUsers() {
        List<Usuario> users = this.getUsers();
        users.forEach((user) -> {
            System.out.println(user.getCompleteName() + "," + user.getUserName()
                    + "," + user.getPassword());
        });
    }

    public boolean validate(String username, String password) {
        int index = validateUser(username, password);

        return index != -1;
    }

    private int validateUser(String username, String password) {
        List<Usuario> users = this.getUsers();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(username)
                    && users.get(i).getPassword()
                            .equals(password)) {
                return i;
            }
        }

        return -1;
    }

    private boolean exist(String username) {
        List<Usuario> users = this.getUsers();
        return users.stream().anyMatch((user)
                -> (user.getUserName().equals(username)));
    }

    private List<Usuario> getUsers() {
        return this.getUsersObj();
        //return this.getUserText();
    }

    private List<Usuario> getUsersText() {
        List<Usuario> users = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(FILETEXT);
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] usuario = line.split(",");
                users.add(new Usuario(usuario[0], usuario[1], usuario[2]));
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return users;
    }

    private List<Usuario> getUsersObj() {
        List<Usuario> users = new ArrayList<>();

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(FILEOBJ);
            ois = new ObjectInputStream(fis);

            Usuario user;

            while (fis.available() > 0) {
                user = (Usuario) ois.readObject();
                users.add(user);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return users;
    }

    public void changeUsername(String username, String password, String otherusername) {
        if (this.validate(otherusername, password)) {
            System.out.println("Username dont validate");
        } else {
            List<Usuario> users = this.getUsers();

            int index = this.validateUser(username, password);

            Usuario anotherUser = users.get(index);
            anotherUser.setUserName(otherusername);

            users.set(index, anotherUser);

            this.overwriteObj(users);
            //this.overwriteText(users);
        }
    }

    private void overwriteObj(List<Usuario> users) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(FILEOBJ);
            oos = new ObjectOutputStream(fos);

            for (Usuario user : users) {
                oos.writeObject(user);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    private void overwriteText(List<Usuario> users) {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {

            fw = new FileWriter(FILETEXT, true);
            bw = new BufferedWriter(fw);
            for (Usuario user : users) {
                bw.write(user.getCompleteName() + "," + user.getUserName()
                        + "," + user.getPassword());
                bw.newLine();
            }

        } catch (IOException e) {
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }

                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void changeCompleteName(String username, String password,
             String othercompletename) {

        List<Usuario> users = this.getUsers();

        int index = this.validateUser(username, password);

        Usuario anotherUser = users.get(index);
        anotherUser.setCompleteName(othercompletename);

        users.set(index, anotherUser);

        this.overwriteObj(users);
        //this.overwriteText(users);

    }

    public void changePassword(String username, String password, String otherpassword) {
        List<Usuario> users = this.getUsers();

        int index = this.validateUser(username, password);

        Usuario anotherUser = users.get(index);
        anotherUser.setPassword(otherpassword);

        users.set(index, anotherUser);

        this.overwriteObj(users);
        //this.overwriteText(users);
    }
}
