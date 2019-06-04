package model.pojo;
// Generated 03-06-2019 23:52:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Estado generated by hbm2java
 */
@Entity
@Table(name="estado"
    ,catalog="disketo_ejercicio"
    , uniqueConstraints = @UniqueConstraint(columnNames="nombreEstado") 
)
public class Estado  implements java.io.Serializable {


     private Integer idEstado;
     private String nombreEstado;
     private Set artistas = new HashSet(0);

    public Estado() {
    }

	
    public Estado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    public Estado(String nombreEstado, Set artistas) {
       this.nombreEstado = nombreEstado;
       this.artistas = artistas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idEstado", unique=true, nullable=false)
    public Integer getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    
    @Column(name="nombreEstado", unique=true, nullable=false, length=25)
    public String getNombreEstado() {
        return this.nombreEstado;
    }
    
    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estado")
    public Set getArtistas() {
        return this.artistas;
    }
    
    public void setArtistas(Set artistas) {
        this.artistas = artistas;
    }




}


