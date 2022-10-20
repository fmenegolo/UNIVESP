//Texto-base 1.1 - Java Como Programar (Leia p. 55-70) | Paul Deitel e Harvey Deitel
// Classe Account que contêm uma variável de instância name
// e metôdos para configurar e obter seu valor.

public class Account
{
    private String name; // Variavel de instância

    //método para definir o nome do objeto
    public void setName(String name)
    {
        this.name = name; //armazena o nome
    }

    //método para recuperar o nome do objeto
    public String getName()
    {
        return name; // retorna valor do nome para o chamador
    }
} // fim da classe Account
