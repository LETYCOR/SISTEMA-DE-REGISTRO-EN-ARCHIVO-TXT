/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lety;

//importamos las clases a utilizar
import java.io.BufferedReader;//clase para leer el texto del archivo txt
import java.io.BufferedWriter;//clase para escribir en el archivo txt
import java.io.FileReader;//Leer en un fichero
import java.io.FileWriter;//Escribir en un fichero
import java.io.PrintWriter;//Librería para imprimir los datos del archivo txt
import java.util.StringTokenizer;//Ayuda a dividir un string en substrings o tokens
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CORTES
 */
public class Lety {//inicio de la clase principal
    
    Vector datos=new Vector();
    
    public void escribirArchivo(GatosDatos info){
        datos.addElement(info);
    }    
    
    //metodo para guardar el archivo y validar que los datos estén ingresados correctamente
    public void guardarArchivo(GatosDatos data){
        try{
            FileWriter fw=new FileWriter("Gatos.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.print("-"+data.getNombre());
            pw.print("-"+data.getColor());
            pw.print("-"+data.getRaza());
            pw.print("-"+data.getSexo());
            pw.println("-"+data.getEdad());
            pw.close();
        }catch(Exception a){
         JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    //método para generar la lista como un arreglo
    public DefaultTableModel ListaGenerada(){
        Vector array=new Vector();
        array.addElement("Nombre");
        array.addElement("Color");
        array.addElement("Raza");
        array.addElement("Sexo");
        array.addElement("Edad");
        
        DefaultTableModel lista=new DefaultTableModel(array,0);
        
        try{
            FileReader fw=new FileReader("Gatos.txt");
            BufferedReader br=new BufferedReader(fw);
            String c;
            while((c=br.readLine())!= null){
                StringTokenizer dato= new StringTokenizer(c,"-");
                Vector t=new Vector();
                while(dato.hasMoreTokens()){
                    t.addElement(dato.nextToken());
                }
                lista.addRow(t);
            }
        }catch(Exception z){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
        return lista;
    }

    public static void main(String[] args) {
       
        aplicacion objA=new aplicacion();
        objA.setVisible(true);
    }
}
