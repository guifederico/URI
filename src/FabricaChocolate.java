import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class FabricaChocolate {
	private boolean empty; //vazio
	private boolean boiled; //fervido
    private static FabricaChocolate uniqueInstance; // CRIADO PARA CONTROLAR O SINGLETON (ÚNICA INSTÂNCIA)
  
	//Código iniciado quando a Caldeira está vazia
	private FabricaChocolate() {     // ALTERADO PARA PRIVATE, PARA ENCAPSULAR
		empty = true;
		boiled = false;
	}

    // MÉTODO QUE VAI CONTROLAR A ÚNICA INSTÂNCIA QUE PODE SER UTILIZADA
    public static FabricaChocolate getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new FabricaChocolate();
            System.out.println("Criada a única instância da fábrica de chocolate.");
        }
        return uniqueInstance;
    }

	//Para encher a caldeira, ela deve estar vazia e, quando estiver cheia,
	//configuramos os indicadores de empty e boiled 
	public void preencher() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// encher a caldeira com uma mistura de leite/chocolate
		}
	}
 
	//Para drenar a caldeira, ela deve estar cheia (não vazia) e também em ebulição. 
	//Depois, configuramos empty como true novamente.
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drena na caldeira leite e chocolate
			empty = true;
		}
	}
 
	
	//Método para ferver 
	//Para ferver a mistura, a caldeira deve estar cheia e ainda não deve ter fervido. 
	//Depois de ferver, configuramos o indicador boiled como true.
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}