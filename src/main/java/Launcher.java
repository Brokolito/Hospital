public class Launcher {

	public static void main(String[] args) {
		inicializar();
	}
	public static void inicializar(){
		Hospital hospital=new Hospital();
		hospital.addPacientes(new Paciente("Marcelo","Castro",20));
		System.out.println("a");
		hospital.addMedico(new Medico("Marcelo","Castro",20));
		System.out.println("a");
		hospital.buscarMedico("Marcelo");
		System.out.println("a");
		hospital.buscarPaciente("Marcelo");
		System.out.println("a");
		hospital.removeMedico("Marcelo");


	}
}