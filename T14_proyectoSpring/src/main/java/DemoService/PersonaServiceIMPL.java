package DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoRepository.IPersona;

@Service
public class PersonaServiceIMPL implements IPersonaService {
    
    @Autowired 
    private IPersona repo;

    @Override
    public void registrar(String nombre) {
        repo.registrar(nombre);
    }
}
