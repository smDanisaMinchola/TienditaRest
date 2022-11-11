package pe.com.tiendita.TienditaRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Menu")
@Table(name = "t_menu")
public class Menu {

    @Id
    @Column(name = "codmen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nommen")
    private String nombre;
    @Column(name = "urlmen")
    private String urlmen;
    @Column(name = "icomen")
    private String icomen;
    @ManyToOne
    @JoinColumn(name = "estcat", nullable = false)
    private boolean categoria;

}
