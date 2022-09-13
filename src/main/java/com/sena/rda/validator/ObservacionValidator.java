
package com.sena.rda.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.sena.rda.model.Observacion;

    public class ObservacionValidator implements Validator {
    
        @Override
        public boolean supports(Class clazz) {
            return Observacion.class.equals(clazz);
        }
    
        @Override
        public void validate(Object obj, Errors errors) {
    
            Observacion observacion = (Observacion) obj;
    
            Integer TipoObservacion = observacion.getTipoObservacion();
            if (TipoObservacion == null || TipoObservacion < 0) {
                errors.rejectValue("TipoObservacion", "observacion.TipoObservacion", "Debes indicar el tipo de observacion y no puede ser negativa");
            }
    
            String Descripcion = observacion.getDescripcion();
            if (Descripcion == null || Descripcion.equals("...")) {
                errors.rejectValue("Descripcion", "observacion.Descripcion", "Indica tu observacion.");
            }
        }
    
}
