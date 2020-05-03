package com.unla.Grupo15OO22020.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo15OO22020.entities.Empleado;
import com.unla.Grupo15OO22020.entities.Local;
import com.unla.Grupo15OO22020.models.EmpleadoModel;
import com.unla.Grupo15OO22020.models.LocalModel;


@Component("empleadoConverter")
public class EmpleadoConverter {

	public EmpleadoModel entityToModel(Empleado empleado) {
		return new EmpleadoModel(empleado.getIdPersona(), empleado.getNombre(), empleado.getApellido(), empleado.getFechaNacimiento(),
				empleado.getDni(), empleado.getFranjaHoraria(), empleado.isTipoEmpleado(), new LocalModel());
	}

	public Empleado modelToEntity(EmpleadoModel empleadoModel) {
		return new Empleado(empleadoModel.getIdPersona(),empleadoModel.getNombre(), empleadoModel.getApellido(), empleadoModel.getFechaNacimiento(),
				empleadoModel.getDni(), empleadoModel.getFranjaHoraria(), empleadoModel.isTipoEmpleado(), new Local());
	}

}
