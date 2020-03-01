/*
 * Conceitos de POO visto em sala de aula .
 */
package classes;  //IDEIA

/*
    Para construir uma classe é preciso utilizar o pilar da abstração.
    Uma Classe é uma descrição de um conjunto de objetos que compartilham os
    mesmos atributos, operações, métodos .
*/


public class Conceito { 
    
    /*
        ATRIBUTOS =====> são as características de um objeto. Um atributo é uma variável que pertence
                        a um objeto. Os dados de um objeto são armazenados nos seus atributos.
                                                ( SUBSTANTIVO )
    */
    private float raio = 0 ; 
    /*  
        VISIBILIDADE ==> São distribuídas em três tipos:
                        - private Todo Atributo deve ser privado uma função local e um único bloco de código
                        - public Todo Método deve ser publico visível para tudo uma função a ser chamada a qualquer momento
                        - protect (protegido) esse caso restringe o parâmetro fora da classe, mas ainda acessível as suas subclasses (herança)
     
        OBJETO ========> são características definidas pelas classes. 
                        Neles é permitido instanciar objetos da classe para inicializar
                        os atributos e invocar os métodos. Objeto só e executado quando chamdo pela uma mensagem.
                                                    ( INDIVIDUALIZOU OBJETO )
                                                    ( TODO OBJETO É AUTÔNOMO )    
    
        METODOS =======> são as ações que os objetos podem exercer quando solicitados, 
                        onde podem interagir e se comunicarem com outros objetos
                                        (VERBO E AÇÃO)
    */

    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    /*
        ENCAPSULAMENTO ===> Restringir o acesso do comportameto interno de um Objeto.
        Sempre com os métodos privados ligadas a métodos especiais chamados getters e setters,
        que irão retornar e setar o valor da propriedade, respectivamente. O encapsulamento evita 
        o acesso direto a propriedade do objeto, adicionando uma outra camada de segurança à aplicação.
     */
    }
                                            
    /**                             
     * @param raio the raio to set             
     */                   
   
    /*
        throw: grita   
        Throws é o método lançador de execões , pode  ter vários throws dentro do método     
        set é onde faz a atribuição do valor do raio, por isso entra no set o tratamento de exeções  
    */
    public void setRaio(float raio) throws Exception{  //Todo throw esta ligado ao objeto Exception
        if (raio < 0 )throw new Exception("Raio não pode ser negativo");
        //parametro raio 
        this.raio = raio;
    /*
        this só pode colocar ao lado de atributo (Escopo maior da classe) ou seja, enxerga outro escopo.
        Tudo entre { Abre e fecha chave } é um escopo 
    */
    }
    
    public float calcularArea(){
        
       return  (float) (4*3.1415*(raio*raio));  // conjunto inteiro + conjunto double sempre vai ser double. Usa (float) para converter. 
                                                
        
    }
    
    public float calcularVolume(){
        
       return (float) ((4.0/3.0)*3.1415*(raio*raio*raio)); //ou Math.pow(raio, 3)
        
    }
}
