package Interface;

import model.Cliente;

import java.util.List;

public interface ArquivoJson<T> {
    List<T> carregarDoArquivo();
    void salvarNoArquivo(List<T> lista);
    void adicionarNaLista(List<T> lista);

}
