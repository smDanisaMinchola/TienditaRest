package pe.com.tiendita.TienditaRest.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

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
@Entity(name = "TicketPedido")
@Table(name = "t_ticketpedido")
public class TicketPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "nrotic")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "fectic")
    private Date fecha;
    @Column(name = "esttic")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "codcli", nullable = false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "codemp", nullable = false)
    private Empleado empleado;

}
