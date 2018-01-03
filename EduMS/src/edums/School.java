/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edums;
import java.io.Serializable;
import java.text.ParseException;
import java.util.*;


public class School implements Serializable{
    
    
    private List<Student> students;
    private List<Class> classes;
    private List<String> cUnits;
    private final String name;
    
    public School(String name){
        this.name = name;
        students = new ArrayList<Student>();
        classes = new ArrayList<Class>();
        cUnits = new ArrayList<String>();
        
        cUnits.add("Introdução à Programação");
        cUnits.add("Análise Matemática I");
        cUnits.add("Tecnologias Web");
        cUnits.add("Álgebra");
        cUnits.add("Sistemas Digitais");
        cUnits.add("Gestão");
                
        cUnits.add("Tecnologia e Arquitectura de Computadores");
        cUnits.add("Métodos Estatísticos");
        cUnits.add("Eletrónica");
        cUnits.add("Análise Matemática II");
        cUnits.add("Programação");
        cUnits.add("Fundamentos de Computação Gráfica");
        
        cUnits.add("Sistemas Operativos");
        cUnits.add("Programação Orientada a Objetos");
        cUnits.add("Introdução às Redes de Comunicação");
        cUnits.add("Base de Dados");
        cUnits.add("Investigação Operacional");
        cUnits.add("Introdução à Inteligência Artificial");
          
        cUnits.add("Sistemas Operativos II");
        cUnits.add("Modelação e Design");
        cUnits.add("Conhecimento e Radiocínio");
        cUnits.add("Programação Avançada");
        cUnits.add("Empreendedorismo e Inovação");
        cUnits.add("Interação Pessoa-Máquina");
        
        cUnits.add("Programação Web");
        cUnits.add("Programação Distribuída");
        cUnits.add("Arquiteturas Móveis");
        cUnits.add("Gestão de Projecto de Software");
        cUnits.add("Estruturas de Dados");

        cUnits.add("Ética e Deontologia");
    }
    public static void main(String[] args) throws ParseException {
        DB db1 = new DB("teste.bin");
        School s  = new School("ESCOLA TESTE");
        
        s.addClass(new Class("T1", "T", "Introdução à Programação", 2, 1));
        s.addClass(new Class("T2", "T", "Introdução à Programação", 2, 1));
        s.addClass(new Class("P1", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P2", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P3", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P4", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P5", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P6", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P7", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P8", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P9", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P10", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P11", "P", "Introdução à Programação", 3, 1));
        s.addClass(new Class("P12", "P", "Introdução à Programação", 3, 1));
             
        s.addClass(new Class("T1", "T", "Análise Matemática I", 2, 1));
        s.addClass(new Class("T2", "T", "Análise Matemática I", 2, 1));
        s.addClass(new Class("P1", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P2", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P3", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P4", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P5", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P6", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P7", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P8", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P9", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("P10", "P", "Análise Matemática I", 1, 1));
        s.addClass(new Class("TP1", "TP", "Análise Matemática I", 2, 1));
        s.addClass(new Class("TP2", "TP", "Análise Matemática I", 2, 1));
        s.addClass(new Class("TP3", "TP", "Análise Matemática I", 2, 1));
        s.addClass(new Class("TP4", "TP", "Análise Matemática I", 2, 1));
        s.addClass(new Class("TP5", "TP", "Análise Matemática I", 2, 1));
            
        s.addClass(new Class("T1", "T", "Tecnologias Web", 1, 1));
        s.addClass(new Class("T2", "T", "Tecnologias Web", 1, 1));
        s.addClass(new Class("P1", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P2", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P3", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P4", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P5", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P6", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P7", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P8", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P9", "P", "Tecnologias Web", 2, 1));
        s.addClass(new Class("P10", "P", "Tecnologias Web", 2, 1));
              
        s.addClass(new Class("T1", "T", "Álgebra", 2, 1));
        s.addClass(new Class("T2", "T", "Álgebra", 2, 1));
        s.addClass(new Class("TP1", "TP", "Álgebra", 2, 1));
        s.addClass(new Class("TP2", "TP", "Álgebra", 2, 1));
        s.addClass(new Class("TP3", "TP", "Álgebra", 2, 1));
        s.addClass(new Class("TP4", "TP", "Álgebra", 2, 1));
        s.addClass(new Class("TP5", "TP", "Álgebra", 2, 1));
        
        s.addClass(new Class("T1", "T", "Sistemas Digitais", 1, 1));
        s.addClass(new Class("T2", "T", "Sistemas Digitais", 1, 1));
        s.addClass(new Class("P1", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P2", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P3", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P4", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P5", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P6", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P7", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P8", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P9", "P", "Sistemas Digitais", 2, 1));
        s.addClass(new Class("P10", "P", "Sistemas Digitais", 2, 1));
        
        s.addClass(new Class("T1", "T", "Gestão", 2, 1));
        s.addClass(new Class("T2", "T", "Gestão", 2, 1));
        s.addClass(new Class("P1", "P", "Gestão", 2, 1));
        s.addClass(new Class("P2", "P", "Gestão", 2, 1));
        s.addClass(new Class("P3", "P", "Gestão", 2, 1));
        s.addClass(new Class("P4", "P", "Gestão", 2, 1));
        
        s.addClass(new Class("T1", "T", "Tecnologia e Arquitectura de Computadores", 2, 1));
        s.addClass(new Class("T2", "T", "Tecnologia e Arquitectura de Computadores", 2, 1));
        s.addClass(new Class("P1", "P", "Tecnologia e Arquitectura de Computadores", 2, 1));
        s.addClass(new Class("P2", "P", "Tecnologia e Arquitectura de Computadores", 2, 1));
        s.addClass(new Class("P3", "P", "Tecnologia e Arquitectura de Computadores", 2, 1));
        s.addClass(new Class("P4", "P", "Tecnologia e Arquitectura de Computadores", 2, 1));
        s.addClass(new Class("P5", "P", "Tecnologia e Arquitectura de Computadores", 2, 1));
        s.addClass(new Class("P6", "P", "Tecnologia e Arquitectura de Computadores", 2, 1));
        
        s.addClass(new Class("T1", "T", "Métodos Estatísticos", 2, 1));
        s.addClass(new Class("T2", "T", "Métodos Estatísticos", 2, 1));
        s.addClass(new Class("P1", "P", "Métodos Estatísticos", 2, 1));
        s.addClass(new Class("P2", "P", "Métodos Estatísticos", 2, 1));
        s.addClass(new Class("P3", "P", "Métodos Estatísticos", 2, 1));
        s.addClass(new Class("P4", "P", "Métodos Estatísticos", 2, 1));
             
        s.addClass(new Class("T1", "T", "Eletrónica", 2, 1));
        s.addClass(new Class("T2", "T", "Eletrónica", 2, 1));
        s.addClass(new Class("T3", "T", "Eletrónica", 2, 1));
        s.addClass(new Class("P1", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P2", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P3", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P4", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P5", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P6", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P7", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P8", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P9", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P10", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P11", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P12", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P13", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P14", "P", "Eletrónica", 2, 1));
        s.addClass(new Class("P15", "P", "Eletrónica", 2, 1));
            
        s.addClass(new Class("T1", "T", "Análise Matemática II", 2, 1));
        s.addClass(new Class("T2", "T", "Análise Matemática II", 2, 1));
        s.addClass(new Class("P1", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P2", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P3", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P4", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P5", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P6", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P7", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P8", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P9", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("P10", "P", "Análise Matemática II", 1, 1));
        s.addClass(new Class("TP1", "TP", "Análise Matemática II", 2, 1));
        s.addClass(new Class("TP2", "TP", "Análise Matemática II", 2, 1));
        s.addClass(new Class("TP3", "TP", "Análise Matemática II", 2, 1));
        s.addClass(new Class("TP4", "TP", "Análise Matemática II", 2, 1));
        s.addClass(new Class("TP5", "TP", "Análise Matemática II", 2, 1));
          
        s.addClass(new Class("T1", "T", "Programação", 2, 1));
        s.addClass(new Class("T2", "T", "Programação", 2, 1));
        s.addClass(new Class("P1", "P", "Programação", 2, 1));
        s.addClass(new Class("P2", "P", "Programação", 2, 1));
        s.addClass(new Class("P3", "P", "Programação", 2, 1));
        s.addClass(new Class("P4", "P", "Programação", 2, 1));
        s.addClass(new Class("P5", "P", "Programação", 2, 1));
        s.addClass(new Class("P6", "P", "Programação", 2, 1));
        s.addClass(new Class("P7", "P", "Programação", 2, 1));
        s.addClass(new Class("P8", "P", "Programação", 2, 1));
        s.addClass(new Class("P9", "P", "Programação", 2, 1));
        s.addClass(new Class("P10", "P", "Programação", 2, 1));
        s.addClass(new Class("P11", "P", "Programação", 2, 1));
        s.addClass(new Class("P12", "P", "Programação", 2, 1));
        s.addClass(new Class("P13", "P", "Programação", 2, 1));
        
        s.addClass(new Class("T1", "T", "Fundamentos de Computação Gráfica", 1, 1));
        s.addClass(new Class("T2", "T", "Fundamentos de Computação Gráfica", 1, 1));
        s.addClass(new Class("P1", "P", "Fundamentos de Computação Gráfica", 2, 1));
        s.addClass(new Class("P2", "P", "Fundamentos de Computação Gráfica", 2, 1));
        s.addClass(new Class("P3", "P", "Fundamentos de Computação Gráfica", 2, 1));
        s.addClass(new Class("P4", "P", "Fundamentos de Computação Gráfica", 2, 1));
        s.addClass(new Class("P5", "P", "Fundamentos de Computação Gráfica", 2, 1));
        s.addClass(new Class("P6", "P", "Fundamentos de Computação Gráfica", 2, 1));
        s.addClass(new Class("P7", "P", "Fundamentos de Computação Gráfica", 2, 1));
        s.addClass(new Class("P8", "P", "Fundamentos de Computação Gráfica", 2, 1));
        
        s.addClass(new Class("T1", "T", "Sistemas Operativos", 2, 1));
        s.addClass(new Class("T2", "T", "Sistemas Operativos", 2, 1));
        s.addClass(new Class("P1", "P", "Sistemas Operativos", 2, 1));
        s.addClass(new Class("P2", "P", "Sistemas Operativos", 2, 1));
        s.addClass(new Class("P3", "P", "Sistemas Operativos", 2, 1));
        s.addClass(new Class("P4", "P", "Sistemas Operativos", 2, 1));
        s.addClass(new Class("P5", "P", "Sistemas Operativos", 2, 1));
        s.addClass(new Class("P6", "P", "Sistemas Operativos", 2, 1));
        s.addClass(new Class("P7", "P", "Sistemas Operativos", 2, 1));
          
        s.addClass(new Class("T1", "T", "Programação Orientada a Objetos", 1, 1));
        s.addClass(new Class("T2", "T", "Programação Orientada a Objetos", 1, 1));
        s.addClass(new Class("P1", "P", "Programação Orientada a Objetos", 2, 2));
        s.addClass(new Class("P2", "P", "Programação Orientada a Objetos", 2, 2));
        s.addClass(new Class("P3", "P", "Programação Orientada a Objetos", 2, 2));
        s.addClass(new Class("P4", "P", "Programação Orientada a Objetos", 2, 2));
        s.addClass(new Class("P5", "P", "Programação Orientada a Objetos", 2, 2));
        s.addClass(new Class("P6", "P", "Programação Orientada a Objetos", 2, 2));
        s.addClass(new Class("P7", "P", "Programação Orientada a Objetos", 2, 2));
        
        s.addClass(new Class("T1", "T", "Introdução às Redes de Comunicação", 1, 1));
        s.addClass(new Class("T2", "T", "Introdução às Redes de Comunicação", 1, 1));
        s.addClass(new Class("P1", "P", "Introdução às Redes de Comunicação", 2, 1));
        s.addClass(new Class("P2", "P", "Introdução às Redes de Comunicação", 2, 1));
        s.addClass(new Class("P3", "P", "Introdução às Redes de Comunicação", 2, 1));
        s.addClass(new Class("P4", "P", "Introdução às Redes de Comunicação", 2, 1));
        s.addClass(new Class("P5", "P", "Introdução às Redes de Comunicação", 2, 1));
        s.addClass(new Class("P6", "P", "Introdução às Redes de Comunicação", 2, 1));
        s.addClass(new Class("P7", "P", "Introdução às Redes de Comunicação", 2, 1));
        
        s.addClass(new Class("T1", "T", "Base de Dados", 2, 1));
        s.addClass(new Class("T2", "T", "Base de Dados", 2, 1));
        s.addClass(new Class("P1", "P", "Base de Dados", 2, 1));
        s.addClass(new Class("P2", "P", "Base de Dados", 2, 1));
        s.addClass(new Class("P3", "P", "Base de Dados", 2, 1));
        s.addClass(new Class("P4", "P", "Base de Dados", 2, 1));
        s.addClass(new Class("P5", "P", "Base de Dados", 2, 1));
        s.addClass(new Class("P6", "P", "Base de Dados", 2, 1));
        s.addClass(new Class("P7", "P", "Base de Dados", 2, 1));
        s.addClass(new Class("TP1", "TP", "Base de Dados", 1, 1));
        s.addClass(new Class("TP2", "TP", "Base de Dados", 1, 1));
        
        s.addClass(new Class("T1", "T", "Investigação Operacional", 2, 1));
        s.addClass(new Class("T2", "T", "Investigação Operacional", 2, 1));
        s.addClass(new Class("P1", "P", "Investigação Operacional", 2, 1));
        s.addClass(new Class("P2", "P", "Investigação Operacional", 2, 1));
        s.addClass(new Class("P3", "P", "Investigação Operacional", 2, 1));
        s.addClass(new Class("P4", "P", "Investigação Operacional", 2, 1));
        s.addClass(new Class("P5", "P", "Investigação Operacional", 2, 1));
        s.addClass(new Class("TP1", "TP", "Investigação Operacional", 1, 1));
        s.addClass(new Class("TP2", "TP", "Investigação Operacional", 1, 1));
         
        s.addClass(new Class("T1", "T", "Introdução à Inteligência Artificial", 2, 1));
        s.addClass(new Class("T2", "T", "Introdução à Inteligência Artificial", 2, 1));
        s.addClass(new Class("P1", "P", "Introdução à Inteligência Artificial", 2, 1));
        s.addClass(new Class("P2", "P", "Introdução à Inteligência Artificial", 2, 1));
        s.addClass(new Class("P3", "P", "Introdução à Inteligência Artificial", 2, 1));
        s.addClass(new Class("P4", "P", "Introdução à Inteligência Artificial", 2, 1));
        s.addClass(new Class("P5", "P", "Introdução à Inteligência Artificial", 2, 1));
        s.addClass(new Class("P6", "P", "Introdução à Inteligência Artificial", 2, 1));
        
        s.addClass(new Class("T1", "T", "Sistemas Operativos II", 2, 1));
        s.addClass(new Class("T2", "T", "Sistemas Operativos II", 2, 1));
        s.addClass(new Class("P1", "P", "Sistemas Operativos II", 2, 1));
        s.addClass(new Class("P2", "P", "Sistemas Operativos II", 2, 1));
        s.addClass(new Class("P3", "P", "Sistemas Operativos II", 2, 1));
        s.addClass(new Class("P4", "P", "Sistemas Operativos II", 2, 1));
        s.addClass(new Class("P5", "P", "Sistemas Operativos II", 2, 1));
        s.addClass(new Class("P6", "P", "Sistemas Operativos II", 2, 1));
        s.addClass(new Class("P7", "P", "Sistemas Operativos II", 2, 1));
        
        s.addClass(new Class("T1", "T", "Modelação e Design", 2, 1));
        s.addClass(new Class("T2", "T", "Modelação e Design", 2, 1));
        s.addClass(new Class("P1", "P", "Modelação e Design", 2, 1));
        s.addClass(new Class("P2", "P", "Modelação e Design", 2, 1));
        s.addClass(new Class("P3", "P", "Modelação e Design", 2, 1));
        s.addClass(new Class("P4", "P", "Modelação e Design", 2, 1));
        
        s.addClass(new Class("T1", "T", "Conhecimento e Radiocínio", 2, 1));
        s.addClass(new Class("T2", "T", "Conhecimento e Radiocínio", 2, 1));
        s.addClass(new Class("P1", "P", "Conhecimento e Radiocínio", 2, 1));
        s.addClass(new Class("P2", "P", "Conhecimento e Radiocínio", 2, 1));
        s.addClass(new Class("P3", "P", "Conhecimento e Radiocínio", 2, 1));
        
        s.addClass(new Class("T1", "T", "Programação Avançada", 2, 1));
        s.addClass(new Class("T2", "T", "Programação Avançada", 2, 1));
        s.addClass(new Class("P1", "P", "Programação Avançada", 2, 1));
        s.addClass(new Class("P2", "P", "Programação Avançada", 2, 1));
        s.addClass(new Class("P3", "P", "Programação Avançada", 2, 1));
        s.addClass(new Class("P4", "P", "Programação Avançada", 2, 1));
        s.addClass(new Class("P5", "P", "Programação Avançada", 2, 1));
        s.addClass(new Class("P6", "P", "Programação Avançada", 2, 1));
        s.addClass(new Class("P7", "P", "Programação Avançada", 2, 1));
        
        s.addClass(new Class("T1", "T", "Empreendedorismo e Inovação", 2, 1));
        s.addClass(new Class("T2", "T", "Empreendedorismo e Inovação", 2, 1));
        s.addClass(new Class("P1", "P", "Empreendedorismo e Inovação", 2, 1));
        s.addClass(new Class("P2", "P", "Empreendedorismo e Inovação", 2, 1));
        s.addClass(new Class("P3", "P", "Empreendedorismo e Inovação", 2, 1));
        
        s.addClass(new Class("T1", "T", "Interação Pessoa-Máquina", 2, 1));
        s.addClass(new Class("T2", "T", "Interação Pessoa-Máquina", 2, 1));
        s.addClass(new Class("P1", "P", "Interação Pessoa-Máquina", 2, 1));
        s.addClass(new Class("P2", "P", "Interação Pessoa-Máquina", 2, 1));
        s.addClass(new Class("P3", "P", "Interação Pessoa-Máquina", 2, 1));
        s.addClass(new Class("P4", "P", "Interação Pessoa-Máquina", 2, 1));
        
        s.addClass(new Class("T1", "T", "Programação Web", 2, 1));
        s.addClass(new Class("T2", "T", "Programação Web", 2, 1));
        s.addClass(new Class("P1", "P", "Programação Web", 3, 1));
        s.addClass(new Class("P2", "P", "Programação Web", 3, 1));
        s.addClass(new Class("P3", "P", "Programação Web", 3, 1));
        s.addClass(new Class("P4", "P", "Programação Web", 3, 1));
        
        s.addClass(new Class("T1", "T", "Programação Distribuída", 2, 1));
        s.addClass(new Class("T2", "T", "Programação Distribuída", 2, 1));
        s.addClass(new Class("P1", "P", "Programação Distribuída", 3, 1));
        s.addClass(new Class("P2", "P", "Programação Distribuída", 3, 1));
        s.addClass(new Class("P3", "P", "Programação Distribuída", 3, 1));
        s.addClass(new Class("P4", "P", "Programação Distribuída", 3, 1));
        
        s.addClass(new Class("T1", "T", "Arquiteturas Móveis", 2, 1));
        s.addClass(new Class("P1", "P", "Arquiteturas Móveis", 3, 1));
        s.addClass(new Class("P2", "P", "Arquiteturas Móveis", 3, 1));
        s.addClass(new Class("P3", "P", "Arquiteturas Móveis", 3, 1));
        s.addClass(new Class("P4", "P", "Arquiteturas Móveis", 3, 1));
        
        s.addClass(new Class("T1", "T", "Gestão de Projecto de Software", 2, 1));
        s.addClass(new Class("P1", "P", "Gestão de Projecto de Software", 3, 1));
        s.addClass(new Class("P2", "P", "Gestão de Projecto de Software", 3, 1));
        s.addClass(new Class("P3", "P", "Gestão de Projecto de Software", 3, 1));
        s.addClass(new Class("P4", "P", "Gestão de Projecto de Software", 3, 1));
        
        s.addClass(new Class("T1", "T", "Estruturas de Dados", 2, 1));
        s.addClass(new Class("P1", "P", "Estruturas de Dados", 3, 1));
        s.addClass(new Class("P2", "P", "Estruturas de Dados", 3, 1));
        s.addClass(new Class("P3", "P", "Estruturas de Dados", 3, 1));
        s.addClass(new Class("P4", "P", "Estruturas de Dados", 3, 1));
        
        s.addClass(new Class("T1", "T", "Ética e Deontologia", 3, 1));
        
        Date d1 = Student.getDateFormat().parse("09/02/1997");
        Date d2 = Student.getDateFormat().parse("14/10/1996");
        Date d3 = Student.getDateFormat().parse("19/03/1996");
        Date d4 = Student.getDateFormat().parse("30/01/1997");
        Date d5 = Student.getDateFormat().parse("29/01/1996");
        Date d6 = Student.getDateFormat().parse("01/11/1996");
        Date d7 = Student.getDateFormat().parse("03/04/1996");
        Date d8 = Student.getDateFormat().parse("22/12/1997");
        Date d9 = Student.getDateFormat().parse("13/05/1997");
        Date d10 = Student.getDateFormat().parse("25/12/1997");
        Date d11 = Student.getDateFormat().parse("30/09/1996");
        Date d12 = Student.getDateFormat().parse("02/12/1996");
        Date d13 = Student.getDateFormat().parse("05/02/1997");
        Date d14 = Student.getDateFormat().parse("09/03/1996");
        Date d15 = Student.getDateFormat().parse("03/10/1996");
        Date d16 = Student.getDateFormat().parse("29/06/1997");
        Date d17 = Student.getDateFormat().parse("08/07/1996");
        Date d18 = Student.getDateFormat().parse("02/01/1997");
        Date d19 = Student.getDateFormat().parse("10/09/1996");
        Date d20 = Student.getDateFormat().parse("02/04/1997");

        s.addStudent(new Student ("A",Student.getDateFormat().format(d1), 1));
        s.addStudent(new Student ("B",Student.getDateFormat().format(d1), 911909187));
        
        db1.exportData(s);
        
    }
    
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    public void addClass(Class c){
        classes.add(c);
    }
    
    public void removeStudent(Student student){
        if(students.contains(student))
            students.remove(students.indexOf(student));
        else
            System.err.println("Student wasn't found.");
    }
    
    public void removeClass(Class c){
        if(classes.contains(c))
            classes.remove(classes.indexOf(c));
        else
            System.err.println("Class wasn't found.");
    }
    
    public void editStudent(Student student){
        if(students.contains(student))
            students.set(students.indexOf(student), student);
        else
            System.err.println("Student wasn't found.");
    }
    
    public void editClass(Class c){
        if(classes.contains(c))
            classes.set(classes.indexOf(c), c);
        else
            System.err.println("Class wasn't found.");
    }
    
    
    @Override
    public String toString(){
        String str;
        str = "\nESCOLA\nTurmas: " + classes.size()
                + "\nEstudantes: " + students.size();
        
        return str;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final School other = (School) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    // SETTERS
    public void setClasses(List<Class> classes) {this.classes = classes;}
    public void setStudents(List<Student> students) {this.students = students;}
    // GETTERS
    public List<String> getcUnits() {return cUnits;}
    public List<Class> getClasses() {return classes;}
    public List<Student> getStudents() {return students;}
}
