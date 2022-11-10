
package pe.com.tiendita.TienditaRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Perfil")
@Table(name="t_perfil")
public class Perfil {
    @Id
    @Column(name="codper")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nomper")
    private String nombre;
     @Column(name="estper")
    private boolean estado;
}
