package com.javatodev.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Clientes
{
    @Id
    @Column
    private int clienteid;
    @Column
    private String cpfcnpj;
    @Column
    private Date data;


    public int getClienteid() 
    {
        return clienteid;
    }
    public void setClienteid(int clienteid) 
    {
        this.clienteid = clienteid;
    }
    public String getCpfcnpj()
    {
        return cpfcnpj;
    }
    public void setCpfcnpj(String cpfcnpj) 
    {
        this.cpfcnpj = cpfcnpj;
    }
    public Date getData() 
    {
        return data;
    }
    public void setData(Date data) 
    {
        this.data = data;
    }
    
}
