
package com.aprendoz_test.data.output;



/**
 * Generated for query "searchStudentsByComplexNameNoStudents" on 08/01/2014 15:24:11
 * 
 */
public class SearchStudentsByComplexNameNoStudentsRtnType {

    private String codigo;
    private String nombreCompleto;
    private Integer idgf;
    private String grupoFamiliar;
    private Integer idpersona;

    public SearchStudentsByComplexNameNoStudentsRtnType() {
    }

    public SearchStudentsByComplexNameNoStudentsRtnType(String codigo, String nombreCompleto, Integer idgf, String grupoFamiliar, Integer idpersona) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.idgf = idgf;
        this.grupoFamiliar = grupoFamiliar;
        this.idpersona = idpersona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getIdgf() {
        return idgf;
    }

    public void setIdgf(Integer idgf) {
        this.idgf = idgf;
    }

    public String getGrupoFamiliar() {
        return grupoFamiliar;
    }

    public void setGrupoFamiliar(String grupoFamiliar) {
        this.grupoFamiliar = grupoFamiliar;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

}
