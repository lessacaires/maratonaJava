import br.com.abc.javacore.introducaometodos.classes.Professor;

/**
 * Created by User on 14/08/2021.
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Francisco";
        professor.matricula = "111124";
        professor.rg = "0847706788";
        professor.cpf = "00198223595";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

    }
}
