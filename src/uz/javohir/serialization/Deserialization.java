package uz.javohir.serialization;/* 
 @author: Javohir
  Date: 9/12/2021
  Time: 9:55 PM*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("savegame.obj");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            try {
                GameSave gameSave = (GameSave) objectInputStream.readObject();
                System.out.println(gameSave);
            } catch (ClassNotFoundException e) {
                System.out.println("Kast qilishda xatolik");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Deserializatsida hatolik");
            e.printStackTrace();
        }
    }
}
