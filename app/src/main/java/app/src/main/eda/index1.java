package app.src.main.eda;
import java.util.ArrayList;

public class index1 {
        public int idade;
        public String nome;
        public String cidade;

        public index1(int idade, String nome, String cidade) {
            this.idade = idade;
            this.nome = nome;
            this.cidade = cidade;
        }

        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        @Override
        public String toString() {
           return "nome: " + nome  
           + "\nidade: " + idade 
           + "\nMora em: " + cidade;
        }
        
    }
