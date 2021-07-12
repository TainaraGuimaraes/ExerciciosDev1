/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.tainara.exercicio2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Suporte
 */
@Controller
public class Exercicio2Controller {
    
    @RequestMapping("/diaSemana/{ano}/{mes}/{dia}")
    @ResponseBody
    
    public String diaSemana(@PathVariable int dia, @PathVariable int mes, @PathVariable int ano){
     
        Calendar c = new GregorianCalendar (ano, mes -1, dia);
        int diaSem = c.get(Calendar.DAY_OF_WEEK);
        
        String diaSemana = "";
        
        switch (diaSem){
           case 1:
               diaSemana = "Domingo";
               break;
           case 2: 
               diaSemana = "Segunda-feira";
               break;
           case 3:
               diaSemana = "Terça-feira";
               break;
           case 4:
               diaSemana = "Quarta-feira";
               break;
           case 5:
               diaSemana = "Quinta-feira";
               break;
           case 6: 
               diaSemana = "Sexta-feira";
               break;
           case 7:
               diaSemana = "Sábado";
               break;
           default:
               break;        
    }
        return "Dia da semana: " + diaSemana;
        
    }
    
}
