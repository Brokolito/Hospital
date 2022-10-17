import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Hospital {

	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	public Hospital() {
		this.pacientes = pacientes;
		this.medicos = medicos;
	}

	public void addPacientes(Paciente paciente) {
		pacientes.add(paciente);
	}

	public void addMedico(Medico medico) {
		medicos.add(medico);
	}

	public void buscarPaciente(String nombre) {
		for(int i=0;i<pacientes.size();i++){
			if(pacientes.get(i).getNombre().equalsIgnoreCase(nombre)){
				System.out.println(pacientes.get(i));
			}
		}
	}

	public void buscarMedico(String nombre) {
		for(int i=0;i<medicos.size();i++){
			if(medicos.get(i).getNombre().equalsIgnoreCase(nombre)){
				System.out.println(medicos.get(i));
			}
		}
	}

	public void removeMedico(String nombre) {
		int opcion;
		System.out.println("Profesionales");
		for(int i=0;i<medicos.size();i++){
			System.out.println(pacientes.get(i));
		}
		for(int i=0;i<medicos.size();i++){
			if(medicos.get(i).getNombre().equalsIgnoreCase(nombre)){
				medicos.remove(i);
			}
		}
		System.out.println("Profesionales");
		for(int i=0;i<medicos.size();i++){
			System.out.println(pacientes.get(i));
		}

	}
}