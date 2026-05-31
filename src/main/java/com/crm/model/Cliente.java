package com.crm.model;
import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import java.math.BigDecimal;

@Entity
@Table(name = "cliente") // enlazamos directamete en la tabla cliente de nuestra bd
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //AI (auto increment en nuestra bd)
    private long id;


    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 100)
    private String apellido;

    @Column(length = 200)
    private String email;

    @Column(name = "contactoPrincipal", length = 45)
    private String contactoPrincipal;

    @Column(length = 45, unique = true)
    private String dni;

    @Column(length = 45, unique = true)
    private String cuil;

    @Column(length = 45)
    private String categoria = "Regular";

    // Se inicializa en cero usando BigDecimal.ZERO
    @Column(name = "saldoActual", precision = 10, scale = 2)
    private BigDecimal saldoActual = BigDecimal.ZERO;

    @Column
    private int facturasVencidas; //AGREGAR A LA BD

    @Column (length = 45)
    private String estadoServicio;  // AGREGAR A LA BD


    //Constructor vacio

    public Cliente (){


    }

    public Cliente (String nombre, String apellido, String dni, String cuil){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;

    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactoPrincipal() {
        return this.contactoPrincipal;
    }

    public void setContactoPrincipal(String contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getSaldoActual() {
        return this.saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }
}
