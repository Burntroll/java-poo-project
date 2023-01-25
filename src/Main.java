import br.com.dio.poo.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Estudo de POO em Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Estudo de POO em JavaScript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Experiência de quem está no mercado");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desenvolva suas habilidades em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFrancisco = new Dev();
        devFrancisco.setNome("Francisco");
        devFrancisco.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devFrancisco.getConteudoInscritos());
        devFrancisco.progredir();
        System.out.println("-----------------------");
        System.out.println("Conteúdos inscritos" + devFrancisco.getConteudoInscritos());
        System.out.println("Conteúdos concluidos" + devFrancisco.getConteudosConcluidos());
        System.out.println("XP: " + devFrancisco.calcularxp());

        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo");
        devRicardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devRicardo.getConteudoInscritos());
        devRicardo.progredir();
        System.out.println("-----------------------");
        System.out.println("Conteúdos inscritos" + devRicardo.getConteudoInscritos());
        System.out.println("Conteúdos concluidos" + devRicardo.getConteudosConcluidos());
        System.out.println("XP: " + devFrancisco.calcularxp());

    }
}
