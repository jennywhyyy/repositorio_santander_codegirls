import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Introdução ao Python");
        curso1.setDescricao("Entenda os fundamentos e os conceitos mais básicos da linguagem Python.");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Introdução ao Java");
        curso2.setDescricao("Entenda os fundamentos da linguagem Java.");
        curso2.setCargaHoraria(35);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Planeje Sua Carreira Internacional");
        mentoria.setDescricao("Aprenda como dar os primeiros passos em sua carreira internacional");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Developer Now");
        bootcamp.setDescricao("Faça o seu futuro agora!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);



        Dev dev1 = new Dev();
        dev1.setNome("Emma");
        dev1.inscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos = " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos = " + dev1.getConteudosConcluidos());
        System.out.println("XP recebido:" + dev1.calculoXP());

        dev1.progresso();

        System.out.printf("Depois do progresso:");
        System.out.println("Conteúdos Inscritos = " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos = " + dev1.getConteudosConcluidos());
        System.out.println("XP recebido:" + dev1.calculoXP());


        System.out.println("---------------------------");


        Dev dev2 = new Dev();
        dev2.setNome("Hikari");
        dev2.inscricaoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos = " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluído = " + dev2.getConteudosConcluidos());
        System.out.println("XP recebido:" + dev2.calculoXP());

        dev2.progresso();

        System.out.println("Depois do progresso:");
        System.out.println("Conteúdos Inscritos = " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluído = " + dev2.getConteudosConcluidos());
        System.out.println("XP recebido:" + dev2.calculoXP());
    }


}
