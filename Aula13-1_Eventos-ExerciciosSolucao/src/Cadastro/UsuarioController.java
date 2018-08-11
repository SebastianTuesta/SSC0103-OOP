/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

    private static final String FILEOBJ = "usuarios.dat";

    public UsuarioController() {
    }
    
    public void addUser(Usuario user) {
        this.addUserObject(user);
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
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                }
            }
        }

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

    public boolean exist(String username) {
        Usuario user = getUser(username);
        
        return user != null;
    }

    public Usuario getUser(String username) {
        List<Usuario> users = this.getUsers();
        
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(username)) {
                return users.get(i);
            }
        }

        return null;
    }
    
    public boolean isSuperUser(String username) {
        List<Usuario> users = this.getUsers();
        return users.stream().anyMatch((user)
                -> (user.getUserName().equals(username) 
                        && user.isIsSuperUser()));
    }
    
    private List<Usuario> getUsers() {
        return this.getUsersObj();
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
            
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    
                }
            }
        }
        return users;
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
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                }
            }
        }
    }

    public void changeUsername(String username, String password
            , String otherusername) {
        if (this.validate(otherusername, password)) {
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

    public void changeSuperUser(String username, String password
            , boolean otherSuperUser) {
        List<Usuario> users = this.getUsers();

        int index = this.validateUser(username, password);

        Usuario anotherUser = users.get(index);
        anotherUser.setIsSuperUser(otherSuperUser);

        users.set(index, anotherUser);

        this.overwriteObj(users);
    }
    
    public void changeCompleteName(String username, String password,
             String othercompletename) {

        List<Usuario> users = this.getUsers();

        int index = this.validateUser(username, password);

        Usuario anotherUser = users.get(index);
        anotherUser.setCompleteName(othercompletename);

        users.set(index, anotherUser);

        this.overwriteObj(users);
    }

    public void changePassword(String username, String password, String otherpassword) {
        List<Usuario> users = this.getUsers();

        int index = this.validateUser(username, password);

        Usuario anotherUser = users.get(index);
        anotherUser.setPassword(otherpassword);

        users.set(index, anotherUser);

        this.overwriteObj(users);
    }
}
