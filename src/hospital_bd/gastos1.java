
package hospital_bd;


public class gastos1 {
    String IDCUENTAPACIENTE, IDREGISTRO, COSTOTOTAL, REGISTRO_IDREGISTRO;

    public gastos1(String IDCUENTAPACIENTE, String IDREGISTRO, String COSTOTOTAL, String REGISTRO_IDREGISTRO) {
        this.IDCUENTAPACIENTE = IDCUENTAPACIENTE;
        this.IDREGISTRO = IDREGISTRO;
        this.COSTOTOTAL = COSTOTOTAL;
        this.REGISTRO_IDREGISTRO = REGISTRO_IDREGISTRO;
    }

    

    public String getIDCUENTAPACIENTE() {
        return IDCUENTAPACIENTE;
    }

    public void setIDCUENTAPACIENTE(String IDCUENTAPACIENTE) {
        this.IDCUENTAPACIENTE = IDCUENTAPACIENTE;
    }

    public String getIDREGISTRO() {
        return IDREGISTRO;
    }

    public void setIDREGISTRO(String IDREGISTRO) {
        this.IDREGISTRO = IDREGISTRO;
    }

    public String getCOSTOTOTAL() {
        return COSTOTOTAL;
    }

    public void setCOSTOTOTAL(String COSTOTOTAL) {
        this.COSTOTOTAL = COSTOTOTAL;
    }

    public String getREGISTRO_IDREGISTRO() {
        return REGISTRO_IDREGISTRO;
    }

    public void setREGISTRO_IDREGISTRO(String REGISTRO_IDREGISTRO) {
        this.REGISTRO_IDREGISTRO = REGISTRO_IDREGISTRO;
    }
    
}
