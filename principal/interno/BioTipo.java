package principal.interno;

import java.util.ArrayList;
import java.util.List;

public class BioTipo {

    public static List<String> recomendarSuplementos(int biotipo) {
        List<String> suplementos = new ArrayList<>();
        switch (biotipo) {
            case 1:
                suplementos.add("Whey protein isolado");
                suplementos.add("Termogênicos");
                suplementos.add("Creatina");
                break;
            case 2:
                suplementos.add("Whey Protein");
                suplementos.add("Creatina");
                suplementos.add("Glutamina");
                break;
            case 3:
                suplementos.add("Composto de vários tipos de proteína, incluindo a de soja, a caseína e o whey");
                suplementos.add(
                        "Aminoácido que ajuda na síntese proteica, essencial ao aumento e à manutenção da massa muscular");
                suplementos.add("Creatina");
                break;
            default:
                break;
        }
        return suplementos;
    }

    public static String getBiotipo(double imc) {
        if (imc < 18.5) {
            return "Ectomorfo\nA dieta ideal para um ectomorfo se baseia em consumir carboidratos antes e depois dos treinos em grande quantidade, assim como as proteínas. Esse tipo de alimentação é essencial para a construção de músculos e para sua recuperação.\nAlém disso, a suplementação é um dos principais coadjuvantes. \nSuplementos indicados para Ectomorfos: Whey Protein, Creatina e Glutamina, trazendo mais conforto para você treinar pesado e não se preocupar tanto com possíveis doenças.";
        } else if (imc >= 18.5 && imc < 25) {
            return "Endomorfo  \n A dieta perfeita para um endomorfo consiste, basicamente, no controle de gorduras e carboidratos consumidos, porém sem cortar totalmente eles da sua alimentação.\nSuplementos indicados para Endormorfos são: Whey protein isolado, termogênicos e creatina, que auxiliam na perda de gorduras.";
        } else if (imc >= 25 && imc < 30) {
            return "Mesomorfo\nA dieta ideal para um mesomorfo é bem parecida com a de um ectomorfo. Ou seja, para ganhar massa muscular com mais facilidade, os suplementos recomendados são: \nComposto de vários tipos de proteína, incluindo a de soja, a caseína e o whey, Aminoácido que ajuda na síntese proteica, essencial ao aumento e à manutenção da massa muscular, e a Creatina.";
        } else if (imc >= 30 && imc < 35) {
            return "Mesomorfo\nA dieta ideal para um mesomorfo é bem parecida com a de um ectomorfo. Ou seja, para ganhar massa muscular com mais facilidade, os suplementos recomendados são: \nComposto de vários tipos de proteína, incluindo a de soja, a caseína e o whey, Aminoácido que ajuda na síntese proteica, essencial ao aumento e à manutenção da massa muscular, e a Creatina.";
        } else if (imc >= 35 && imc < 40) {
            return "Mesomorfo\nA dieta ideal para um mesomorfo é bem parecida com a de um ectomorfo. Ou seja, para ganhar massa muscular com mais facilidade, os suplementos recomendados são: \nComposto de vários tipos de proteína, incluindo a de soja, a caseína e o whey, Aminoácido que ajuda na síntese proteica, essencial ao aumento e à manutenção da massa muscular, e a Creatina.";
        } else {
            return "Mesomorfo\nA dieta ideal para um mesomorfo é bem parecida com a de um ectomorfo. Ou seja, para ganhar massa muscular com mais facilidade, os suplementos recomendados são: \nComposto de vários tipos de proteína, incluindo a de soja, a caseína e o whey, Aminoácido que ajuda na síntese proteica, essencial ao aumento e à manutenção da massa muscular, e a Creatina.";
        }

    }
}
