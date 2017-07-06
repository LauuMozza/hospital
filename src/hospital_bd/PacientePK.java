/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_bd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author LESLY
 */
@Embeddable
public class PacientePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idPaciente")
    private int idPaciente;
    @Basic(optional = false)
    @Column(name = "Registro_idRegistro")
    private int registroidRegistro;
    @Basic(optional = false)
    @Column(name = "Traslado_idTraslado")
    private int trasladoidTraslado;

    public PacientePK() {
    }

    public PacientePK(int idPaciente, int registroidRegistro, int trasladoidTraslado) {
        this.idPaciente = idPaciente;
        this.registroidRegistro = registroidRegistro;
        this.trasladoidTraslado = trasladoidTraslado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getRegistroidRegistro() {
        return registroidRegistro;
    }

    public void setRegistroidRegistro(int registroidRegistro) {
        this.registroidRegistro = registroidRegistro;
    }

    public int getTrasladoidTraslado() {
        return trasladoidTraslado;
    }

    public void setTrasladoidTraslado(int trasladoidTraslado) {
        this.trasladoidTraslado = trasladoidTraslado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPaciente;
        hash += (int) registroidRegistro;
        hash += (int) trasladoidTraslado;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacientePK)) {
            return false;
        }
        PacientePK other = (PacientePK) object;
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.registroidRegistro != other.registroidRegistro) {
            return false;
        }
        if (this.trasladoidTraslado != other.trasladoidTraslado) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hospital_bd.PacientePK[ idPaciente=" + idPaciente + ", registroidRegistro=" + registroidRegistro + ", trasladoidTraslado=" + trasladoidTraslado + " ]";
    }
    
}
