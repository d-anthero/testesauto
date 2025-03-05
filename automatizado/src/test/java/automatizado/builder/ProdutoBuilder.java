package automatizado.builder;

import automatizado.pageObject.ControledeProdutosPO;

public class ProdutoBuilder {
    private String codigo = "0001";
    private String nome = "Produto padrão";
    private Integer quantidade = 1;
    private Double valor = 1.00;
    private String data = "03/11/2025";

    private ControledeProdutosPO controleDeProdutosPO;

    public ProdutoBuilder(ControledeProdutosPO controleDeProdutosPO){
        this.controleDeProdutosPO = controleDeProdutosPO;
    }

    public ProdutoBuilder adicionarCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public ProdutoBuilder adicionarNome(String nome){
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder adicionarQuantidade(Integer quantidade){
        this.quantidade = quantidade;
        return this;
    }
 
    public ProdutoBuilder adicionarValor(Double valor){
        this.valor = valor;
        return this;
    }

    public ProdutoBuilder adicionarData(String data){
        this.data = data;
        return this;
    }

    public void builder(){
        controleDeProdutosPO.escrever(controleDeProdutosPO.inputCodigo, codigo);
        controleDeProdutosPO.escrever(controleDeProdutosPO.inputNome, nome);
        controleDeProdutosPO.escrever(controleDeProdutosPO.inputQuantidade, (quantidade) != null ? quantidade.toString() : "");
        controleDeProdutosPO.escrever(controleDeProdutosPO.inputValor, valor.toString());
        controleDeProdutosPO.escrever(controleDeProdutosPO.inputData, data);

        controleDeProdutosPO.btnSalvar.click();
    }

}
