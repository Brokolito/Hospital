public class Medico {
	private String nombre;
	private String apellido;
	private int edad;
	public Medico(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getEdad() {
		return this.edad;
	}
	@Override
	public String toString() {
		return "Nombre: " +nombre+ " , Apellido: " +apellido+ ", Edad:" +edad;
	}
}