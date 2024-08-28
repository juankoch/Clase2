import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class TarjetaCredito extends Tarjeta {

	private double limiteCredito;
	private int limiteCuotas;
	private double deudaActual;
	private double deudaMensual;
	private LinkedList<Detalle> detalles = new LinkedList<Detalle>();
	
	
	public TarjetaCredito(Titular titular, String numeroTarjeta, LocalDate fechaExpiracion, String cvv, double limiteCredito,
			int limiteCuotas, double deudaActual, double deudaMensual) {
		super(titular, numeroTarjeta, fechaExpiracion, cvv);
		this.limiteCredito = limiteCredito;
		this.limiteCuotas = limiteCuotas;
		this.deudaActual = deudaActual;
		this.deudaMensual = deudaMensual;
	}


	public double getLimiteCredito() {
		return limiteCredito;
	}


	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}


	public int getLimiteCuotas() {
		return limiteCuotas;
	}


	public void setLimiteCuotas(int limiteCuotas) {
		this.limiteCuotas = limiteCuotas;
	}


	public double getDeudaActual() {
		return deudaActual;
	}


	public void setDeudaActual(double deudaActual) {
		this.deudaActual = deudaActual;
	}


	public double getDeudaMensual() {
		return deudaMensual;
	}


	public void setDeudaMensual(double deudaMensual) {
		this.deudaMensual = deudaMensual;
	}


	public LinkedList<Detalle> getDetalles() {
		return detalles;
	}


	public void setDetalles(LinkedList<Detalle> detalles) {
		this.detalles = detalles;
	}


	@Override
	public String toString() {
		return "TarjetaCredito [limiteCredito=" + limiteCredito + ", limiteCuotas=" + limiteCuotas + ", deudaActual="
				+ deudaActual + ", deudaMensual=" + deudaMensual + ", detalles=" + detalles + "]";
	}
	
	@Override
	public boolean pagar(double monto) {
		
		
		if (this.getFechaExpiracion().isAfter(LocalDate.now())) {
			if (this.limiteCredito < monto + this.deudaActual) {
				JOptionPane.showMessageDialog(null, "Se paga");
			} else {
				JOptionPane.showMessageDialog(null, "No se puede" );
			}
		} else {
			JOptionPane.showMessageDialog(null, "La tarjeta expiro");
			return false;
		}
		
		
		return true;
	}
	
	
	
}
