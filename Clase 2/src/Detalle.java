
public class Detalle {

	private String descripcion;
	private int cantCuotas;
	private double ValorTotal;
	private double valorXcuotas;
	
	public Detalle(String descripcion, int cantCuotas, double valorTotal, double valorXcuotas) {
		super();
		this.descripcion = descripcion;
		this.cantCuotas = cantCuotas;
		ValorTotal = valorTotal;
		this.valorXcuotas = valorXcuotas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}

	public double getValorXcuotas() {
		return valorXcuotas;
	}

	public void setValorXcuotas(double valorXcuotas) {
		this.valorXcuotas = valorXcuotas;
	}

	@Override
	public String toString() {
		return "Detalle [descripcion=" + descripcion + ", cantCuotas=" + cantCuotas + ", ValorTotal=" + ValorTotal
				+ ", valorXcuotas=" + valorXcuotas + ", getDescripcion()=" + getDescripcion() + ", getCantCuotas()="
				+ getCantCuotas() + ", getValorTotal()=" + getValorTotal() + ", getValorXcuotas()=" + getValorXcuotas()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
}
