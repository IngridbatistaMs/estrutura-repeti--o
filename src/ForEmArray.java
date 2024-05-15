public class ForEmArray {
    public static void main(String[] args) {
        //em arrays o incice inicia em zero
       /*  String aluno[] = {"INGRID", "DEMI", "JONAS", "SELENA", "MILEY"};

        for (int x = 0; x < aluno.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + aluno[x]);
        }*/    
        
        //usando o foreach
        String alunos[] = {"INGRID", "DEMI", "JONAS", "SELENA", "MILEY"};

        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
