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
@Entity(name = "MenuDetalle")
@Table(name = "t_menudetalle")

public class MenuDetalle {

    @Id
    @Column(name = "codmdt")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @ManyToOne
    @JoinColumn(name = "codmen", nullable = false)
    private Menu menu;
    @ManyToOne
    @JoinColumn(name = "codper", nullable = false)
    private Perfil perfil;
    @ManyToOne
    @JoinColumn(name = "codsme", nullable = false)
    private SubMenu submenu;
    
}
