package uz.javohir.serialization;

import java.io.*;

public class Serialization {

    public static void main(String[] args) {
	// write your code here
       GameSave gameSave=new GameSave();
       gameSave.setConfig("Bu mening configuratsiyam");
       gameSave.setId(1);
       gameSave.setMission(12);
        System.out.println(gameSave);
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("savegame.obj");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(gameSave);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Hatolik serializatsiyada");
        }

    }
}
