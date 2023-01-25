import br.com.dio.poo.dominio.Curso;
import br.com.dio.poo.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Experiência de quem está no mercado");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

    }
}
