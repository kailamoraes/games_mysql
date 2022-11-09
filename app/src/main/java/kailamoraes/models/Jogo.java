package kailamoraes.models;

import javax.persistente.Entity;
import javax.persistente.Table;
import javax.persistente.Id;
import javax.persistente.GeneratedValue;
import javax.persistente.GeneratitionType;
import javax.persistente.Table;
import javax.persistente.ManytoOne;
import javax.persistente.JoinColumn;


@Entity
@Table(name="jogos")
public class Jogo {
    @Id
    @GeneratedValue(stratrgy=GeneratitionType.IDENTITY)
    private int id;
    private String titulo;

    @ManytoOne
    @JoinColumn(name="id_genero")
    private Genero genero;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setTitulo(Srting titulo) {
        return this = titulo;
    }

    public void setGenero(Genero Genero) {
        this.genero = genero;
    }
    public int Genero getGenero() {
        return this.genero;
    }
}