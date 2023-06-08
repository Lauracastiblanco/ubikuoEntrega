/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

import ModeloDAO.*;
import ModeloVO.consultcotizacionVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexionBd;

/**
 *
 * @author diego
 */
public class ConsultcotizacionDAO extends ConexionBd{
    
       ConexionBd conec = new ConexionBd();
    private Connection conexion;
    private PreparedStatement puente ,smt1,smt2;
    private ResultSet mensajero;
    private boolean operacion = false; //resultado de la ejecuion
    private String sql; //peticiones
    
    consultcotizacionVO ccotVO = new consultcotizacionVO();
    
     public ConsultcotizacionDAO(consultcotizacionVO ccotVO) {
        super();
        try {
            //conectarse a la base de datos
            conexion = this.obtenerConexion();
        } catch (Exception e) {

            Logger.getLogger(productosDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ConsultcotizacionDAO() {
    }
    
   public ArrayList<consultcotizacionVO> listarCot() {
    ArrayList<consultcotizacionVO> listaCotizaciones = new ArrayList<>();

    try {
        conexion = this.obtenerConexion();
        sql = "SELECT `tblcotizaciones`.`id_cot` AS `cotizacion`,`tblclientes`.`id_cliente` AS `documento`, `tblclientes`.`clinombre` AS `cliente`, `tblusuarios`.`usunombre`, `tblcotizaciones`.`cotfecha`, `tblcotizaciones`.`Totalcot`, `tblcotizaciones`.`cotestado`\n" +
"FROM `tblcotizaciones` \n" +
"	LEFT JOIN `tblclientes` ON `tblcotizaciones`.`cot_id_cliente` = `tblclientes`.`id_cliente` \n" +
"	LEFT JOIN `tblusuarios` ON `tblcotizaciones`.`cot_id_usuario` = `tblusuarios`.`id_usuario` order by id_cot DESC;";
        puente = conexion.prepareStatement(sql);
        mensajero = puente.executeQuery();

        while (mensajero.next()) {
            int Ncotizacion = mensajero.getInt("cotizacion");
            int Ndocumento = mensajero.getInt("documento");
            double Ctotal = mensajero.getDouble("Totalcot");
            String cliente = mensajero.getString("cliente");
            String usuario = mensajero.getString("usunombre");
            String estado = mensajero.getString("cotestado");
            String fecha = mensajero.getString("cotfecha");

            consultcotizacionVO ccotVO = new consultcotizacionVO(Ncotizacion,Ndocumento, Ctotal, cliente, usuario, estado, fecha);
            listaCotizaciones.add(ccotVO);
        }
    } catch (Exception e) {
        Logger.getLogger(ConsultcotizacionDAO.class.getName()).log(Level.SEVERE, null, e);
    } finally {
        try {
            this.cerrarConexion();
        } catch (Exception e) {
            Logger.getLogger(ConsultcotizacionDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    return listaCotizaciones;
}

    
    
}
