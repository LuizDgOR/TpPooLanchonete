public class Pedido {
    private String cpfCliente;
    private String nomeCliente;
    private String numeroPedido;
    private String dataPedido;
    private String horarioPedido;
    private String horarioEntrega;
    private String idDescricaoPedido;
    private String idAdicionais;  
    private String status;

    public Pedido(String cpfCliente, String nomeCliente, String numeroPedido, String dataPedido, String horarioPedido, String horarioEntrega, String idDescricaoPedido, String idAdicionais, String status) {
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
        this.numeroPedido = numeroPedido;
        this.dataPedido = dataPedido;
        this.horarioPedido = horarioPedido;
        this.horarioEntrega = horarioEntrega;
        this.idDescricaoPedido = idDescricaoPedido;
        this.idAdicionais = idAdicionais;
        this.status = status;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getHorarioPedido() {
        return horarioPedido;
    }

    public void setHorarioPedido(String horarioPedido) {
        this.horarioPedido = horarioPedido;
    }

    public String getHorarioEntrega() {
        return horarioEntrega;
    }

    public void setHorarioEntrega(String horarioEntrega) {
        this.horarioEntrega = horarioEntrega;
    }

    public String getIdDescricaoPedido() {
        return idDescricaoPedido;
    }

    public void setIdDescricaoPedido(String idDescricaoPedido) {
        this.idDescricaoPedido = idDescricaoPedido;
    }

    public String getIdAdicionais() {
        return idAdicionais;
    }

    public void setIdAdicionais(String idAdicionais) {
        this.idAdicionais = idAdicionais;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cpfCliente=" + cpfCliente + ", nomeCliente=" + nomeCliente + ", numeroPedido=" + numeroPedido + ", dataPedido=" + dataPedido + ", horarioPedido=" + horarioPedido + ", horarioEntrega=" + horarioEntrega + ", idDescricaoPedido=" + idDescricaoPedido + ", idAdicionais=" + idAdicionais + ", status=" + status + '}';
    }

    
    


    
    
    
   
    
  
    
    
    

   
        
}