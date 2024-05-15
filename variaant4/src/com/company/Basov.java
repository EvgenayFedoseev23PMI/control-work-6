package com.company;

/**
 * Класс, представляющий обьект типа Basov
 */
public class Basov extends Abs{
    private String Name;
    //геттер для поля Name
    public String getName() {
        return Name;
    }
    //сеттер для поля Name
    public void setName(String name) {
        Name = name;
    }
    @Override
    public void Iskatel(Basov[] basov, int count){
        for(int i=0;i<count;i++){
            if(basov[i].getName().equals("")){
                System.out.println(basov[i].getName()+i);
            }
        }
    }
}
