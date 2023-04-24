import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao da mentoria Java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarco = new Dev();
        devMarco.setNome("Marco");
        devMarco.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Marco: " + devMarco.getConteudosInscritos());

        devMarco.progredir();
        devMarco.progredir();
        System.out.println("-");

        System.out.println("Conteudos inscritos Marco: " + devMarco.getConteudosInscritos());
        System.out.println("Conteudos concluidos Marco: " + devMarco.getConteudosConcluidos());
        System.out.println("XP: " + devMarco.calcularTotalXp());


        System.out.println("--------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");

        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}