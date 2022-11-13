import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("cursos java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("cursos js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Deseloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Deseloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devLarissa = new Dev();
        devLarissa.setNome("Larissa");
        devLarissa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Larissa: " + devLarissa.getConteudosInscritos());
        devLarissa.progredir();
        devLarissa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Larissa: " + devLarissa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Larissa: " + devLarissa.getConteudosConcluidos());
        System.out.println("XP: " + devLarissa.calcularTotalXp());


        System.out.println("-----------------------");


        Dev devFernandes = new Dev();
        devFernandes.setNome("Fernandes");
        devFernandes.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fernandes: " + devFernandes.getConteudosInscritos());
        devFernandes.progredir();
        devFernandes.progredir();
        devFernandes.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fernandes: " + devFernandes.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Fernandes: " + devFernandes.getConteudosConcluidos());
        System.out.println("XP: " + devFernandes.calcularTotalXp());


    }
}
