package com.company;

/**
 * Класс представляющий обьект типа Film
 */

public class Film extends Basov implements Intr {
    private double Cena;

//геттер для поля Cena
    public double getCena() {
        return Cena;
    }
    //сеттер для поля Cena
    public void setCena(double cena) {
        Cena=cena;
    }

    @Override
    public void Read(Basov[] array, int count) {
        try {
            for (int i = 0; i < count; i++) {
                String name = reader.readLine();
                double cena = Double.parseDouble(reader.readLine());


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
