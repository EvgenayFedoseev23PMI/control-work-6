package com.company;

/**
 * Интерфейс для считывания данных в массив обьектов типа Basov.
 */
public interface Intr {
    /**
     * Метод для считывания данных в массив обьектов типа Basov
     * @param basov массив обьектов типа Basov
     * @param count колличество обьектов
     */
    public void Read(Basov[] basov, int count);
}
