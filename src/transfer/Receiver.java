/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author Lenovo
 */
public class Receiver {
    private final Socket socket;

    public Receiver(Socket socket) {
        this.socket = socket;
    }

    public Object receive() throws Exception {
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        return in.readObject();
    }
}
