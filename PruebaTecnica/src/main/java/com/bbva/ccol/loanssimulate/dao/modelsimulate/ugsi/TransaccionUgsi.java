package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import com.bbva.jee.arq.spring.core.host.InvocadorTransaccion;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Invocador de la transacci&oacute;n <code>UGSI</code>
 * 
 * @see PeticionTransaccionUgsi
 * @see RespuestaTransaccionUgsi
 */
@Component
public class TransaccionUgsi implements InvocadorTransaccion<PeticionTransaccionUgsi,RespuestaTransaccionUgsi> {
	
	@Autowired
	private ServicioTransacciones servicioTransacciones;
	
	@Override
	public RespuestaTransaccionUgsi invocar(PeticionTransaccionUgsi transaccion)  {
		return servicioTransacciones.invocar(PeticionTransaccionUgsi.class, RespuestaTransaccionUgsi.class, transaccion);
	}
	
	@Override
	public RespuestaTransaccionUgsi invocarCache(PeticionTransaccionUgsi transaccion)  {
		return servicioTransacciones.invocar(PeticionTransaccionUgsi.class, RespuestaTransaccionUgsi.class, transaccion);
	}
	
	@Override
	public void vaciarCache() {
		//vaciarCache
	}
}