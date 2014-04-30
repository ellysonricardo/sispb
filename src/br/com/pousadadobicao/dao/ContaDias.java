package br.com.pousadadobicao.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaDias {

  
    public String contaDias(String dataInicial, String dataFinal) throws ParseException {  
  
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
        df.setLenient(false);  
  
        Date dataInicio = df.parse(dataInicial);  
        Date dataFim = df.parse(dataFinal);  
        long dt = (dataFim.getTime() - dataInicio.getTime()) + 3600000;  
        Long diasCorridosAnoLong = (dt / 86400000L);  
  
        Integer diasDecorridosInt = Integer.valueOf(diasCorridosAnoLong.toString());  
  
        /*Para Numeros Formatados com 3 digitos (0 a Esquerda) 
        NumberFormat nf = NumberFormat.getInstance(); 
        nf.setMinimumIntegerDigits(3); 
        nf.setMaximumIntegerDigits(3); 
 
        String diasDecorridos = (nf.format(diasDecorridosInt)); 
        */  
  
        String diasDecorridos = String.valueOf(diasDecorridosInt); //Sem numeros formatados;  
  
        return diasDecorridos;  
  
    }  
  
}  