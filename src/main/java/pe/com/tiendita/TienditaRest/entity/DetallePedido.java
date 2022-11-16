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
@Entity(name ="DetallePedido")
@Table(name = "t_detallepedido")
public class DetallePedido{
    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name = "nrotic", nullable = false)
    private TicketPedido ticketpedido;
    @ManyToOne
    @JoinColumn(name = "codpro", nullable = false)
    private Producto producto;
      @Column(name="cantic")
    private Integer cantidad;
      @Column(name="pretic")
    private Double precio;
    
    
}
