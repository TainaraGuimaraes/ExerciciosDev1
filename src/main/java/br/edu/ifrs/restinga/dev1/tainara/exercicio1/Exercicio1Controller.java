/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        
package br.edu.ifrs.restinga.dev1.tainara.exercicio1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Suporte
 */
@Controller
public class Exercicio1Controller {
    
    @RequestMapping("/imc/{peso}/{altura:.+}")
    @ResponseBody
    
    public String Imc (@PathVariable double peso, @PathVariable double altura){
        String mensagem = "";
        double resultado = peso /(altura * altura);
        if(resultado < 18.5){
            mensagem = "Magreza";
        }else
            if(resultado >= 18.5 && resultado <= 24.9){
                mensagem = "Saudavel";
            }else
                if(resultado >= 25.0 && resultado <=29.9){
                    mensagem = "Sobrepeso";
                }else
                    if(resultado >= 30.0 && resultado <= 34.9){
                        mensagem = "Obesidade grau I";
                    }else
                        if(resultado >= 35.0 && resultado <= 39.9){
                             mensagem = "Obesidade grau II (severa)";
                        }else
                            if(resultado >= 40){
                                mensagem = "Obesidade grau III (morbida)";
                            }
        return "IMC: "+resultado +" Classificacao: " + mensagem ;
    }
}
