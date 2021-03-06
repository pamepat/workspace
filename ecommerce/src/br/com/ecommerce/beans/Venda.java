package br.com.ecommerce.beans;

public class Venda {
	private int notaFiscal;
	private String data;
	private float total;
	private Produto produto;
	private Cliente cliente;
	
	
	public Venda() {
		super();
	}

	public Venda(int notaFiscal, String data, float total, Produto produto, Cliente cliente) {
		super();
		this.notaFiscal = notaFiscal;
		this.data = data;
		this.total = total;
		this.produto = produto;
		this.cliente = cliente;
	}

	public String getAll () {
		return
				"Nota Fiscal: " + notaFiscal + "\n" +
		        "Data: " + data + "\n" +
		        "Total: " + total + "\n" +
		        "Produto: " + produto.getAll() + "\n" +
		        "Cliente: " + cliente.getAll();
	}
	
	public void setAll (int p1, String p2, float p3,Produto p4, Cliente p5) {
		notaFiscal=p1;
		data=p2;
		total=p3;
		produto=p4;
		cliente=p5;
		}
	
	public int getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
