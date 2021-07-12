/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.tainara.exercicio3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Suporte
 */
@Controller
public class Exercicio3Controller {
    
    @RequestMapping("/calculadora/adicao")
    @ResponseBody
    public String Adicao(@RequestParam("n1") int n1, @RequestParam("n2") int n2){
       
        int resultado = 0;
        
        resultado = n1 + n2;
        
        return "Calculadora: " + n1 + "+" + n2 + " = " + resultado;
    }
    
    @RequestMapping("/calculadora/subtracao")
    @ResponseBody
    public String Subtracao(@RequestParam("n1") int n1, @RequestParam("n2") int n2){
       
        int resultado = 0;
        
        resultado = n1 - n2;
        
        return "Calculadora: " + n1 + "-" + n2 + " = " + resultado;
    }
    
    @RequestMapping("/calculadora/multiplicacao")
    @ResponseBody
    public String Multiplicacao(@RequestParam("n1") int n1, @RequestParam("n2") int n2){
       
        int resultado = 0;
        
        resultado = n1 * n2;
        
        return "Calculadora: " + n1 + "x" + n2 + " = " + resultado;
    }
    
    @RequestMapping("/calculadora/divisao")
    @ResponseBody
    public String Divisao(@RequestParam("n1") int n1, @RequestParam("n2") int n2){
       
        int resultado = 0;
        
        resultado = n1 / n2;
        
        return "Calculadora: " + n1 + "/" + n2 + " = " + resultado;
    }
}
