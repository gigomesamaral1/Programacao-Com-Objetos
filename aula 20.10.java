import java.util.ArrayList;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        vetores();
    }

    public static void vetores (){
        int tamanho = 5;
        int [] arrayInteiros = new int[tamanho];
        System.out.println(arrayInteiros);

        String [] letras = {"a", "e", "f", "k"};
        System.out.println(letras);
        System.out.println(letras.length);

        System.out.println("------------------");
        System.out.println(letras[2]);
        letras[2] = "r";
        System.out.println(letras[2]);

        arrayInteiros[3]=4;
        //percorrendo todos os elementos do array
        for (int i = 0; i < tamanho; i++){
            System.out.println(arrayInteiros[i]);
        }

        //esse dois pontos significa for cada letra em letras
        for(String letra : letras){
            System.out.println(letra);
        }

        System.out.println("------------------");
        letras = aumentaVetor(letras);
        System.out.println(letras.length);
        

        String[] aumentaVetor(String[] vetor){
            String[] novoVetor = new String[vetor.length+1];

            for (int i = 0; i < vetor.length; i++){
                novoVetor[i] = vetor[i];
            }

            return novoVetor;
        }
        
    }

    public static void arraylist(){
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros);

        numeros.add(8);
        numeros.add(3);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.get[1]);

        numeros.remove(0);
        System.out.println(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        //verufuca se o elemento esta contido no ArrayList
        System.out.println(numeros.contains(8));
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);

        //adiciona um elemento novo no indice 0
        numeros.add(0,16);
        System.out.println(numeros);

        //modifica o elemento no indice 0
        numeros.set(0, 999);
        System.out.println(numeros);

        //limpa o ArrayList
        numeros.clear();
        System.out.println(numeros.size());

        public static void linkedlist(){
            Linkedlist<String> carros = new LinkedList<>(null);
            System.out.println(carros);

            carros.add("gol");
            carros.add(0, "corsa");

            System.out.println(carros);

            System.out.println(carros.indexOf("gol"));


            carros.pop();
            System.out.println(carros);


            carros.push("palio");
            System.out.println(carros);

            carros.remove(1);
            System.out.println(carros);

            public static void pilhas() {
                Stack<Double> notas = new Stack<>();

                notas.push(4.5);
                notas.push(8.8);
                System.out.println(notas.peek());



                notas.push(0.7);
                System.out.println(notas.peek());


                notas.pop();
                System.out.println(notas.peek());
                System.out.println(notas);
            }

            public static void conjuntos(){
                HashSet<String> frutas = new HashSet<>();

                frutas.add("maça");
                frutas.add("uva");
                frutas.add("melancia");
                System.out.println(frutas);

                frutas.add("maça");
                System.out.println(frutas);

                for (String fruta : fruta){
                    System.out.println(fruta);
                }

                fruta.remove("laranja");
                System.out.println(frutas);

            }

            public static void mapas(){
                Hashmap<String, String> alunos = new HashMap<>();

                alunos.put("1234", "Jão");
                alunos.put("5678", "Aline");

                System.out.println(alunos);
                System.out.println(alunos.get("1234"));
                System.out.println("12356");

                alunos.remove("1234");
                alunos.remove("1246");

                System.out.println(alunos.size());

                





        }

    }
}