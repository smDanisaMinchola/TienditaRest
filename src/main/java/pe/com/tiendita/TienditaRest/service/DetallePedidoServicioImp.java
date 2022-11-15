/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.tiendita.TienditaRest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pe.com.tiendita.TienditaRest.entity.DetallePedido;
import pe.com.tiendita.TienditaRest.repositorio.DetallePedidoRepositorio;

@Service
public class DetallePedidoServicioImp implements DetallePedidoServicio{
    @Autowired
    private DetallePedidoRepositorio repositorio;


    @Override
    public List<DetallePedido>findAll(){
        return repositorio.findAll();
    }
    
    
}
