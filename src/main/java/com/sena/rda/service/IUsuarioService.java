<<<<<<< HEAD
    package com.sena.rda.service;
=======
package com.sena.rda.service;
>>>>>>> 6e60289f54b1cfb1684c780f3e1b8982649571cc

import java.util.List;

import com.sena.rda.model.Usuario;
    
    public interface IUsuarioService {
        public List<Usuario> findAll();
        public void save(Usuario a);
        public Usuario findOne(Integer id);
        public void delete(Integer id);
    }