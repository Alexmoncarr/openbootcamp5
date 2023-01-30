package coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    int numeroPuertas;
    String modelo;
    String marca;
    double hp;

    public CocheCRUDImpl() {
    }

    public CocheCRUDImpl(int numeroPuertas, String modelo, String marca, double hp) {
        this.numeroPuertas = numeroPuertas;
        this.modelo = modelo;
        this.marca = marca;
        this.hp = hp;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getModelo() {
        return modelo;
    }


    public String getMarca() {
        return marca;
    }


    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }


    @Override
    public void save() {
        System.out.println("Save");
    }

    @Override
    public void findAll() {
        System.out.println("Find All");
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }


}
