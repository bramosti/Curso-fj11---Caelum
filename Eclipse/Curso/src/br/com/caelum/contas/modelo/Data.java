/**/
package br.com.caelum.contas.modelo;

public class Data {
	private int dia;
	private int mes;
	private int ano;
/**
 * metodo para formatar a data
 * @return a data formatada
 */
	public String formatada() {
		String resultado = dia + "/" + mes + "/" + ano;
		return resultado;
	}

	/******************************************************************************************************************************/

	public int getDia() {
		return this.dia;
	};

	public void setDia(int dia) {
		this.dia = dia;
	};

	public int getMes() {
		return this.mes;
	};

	public void setMes(int mes) {
		this.mes = mes;
	};

	public int getAno() {
		return this.ano;
	};

	public void setAno(int ano) {
		this.ano = ano;
	};

}