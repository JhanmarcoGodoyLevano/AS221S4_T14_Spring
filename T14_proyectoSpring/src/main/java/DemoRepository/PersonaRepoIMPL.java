package DemoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository 
public class PersonaRepoIMPL implements IPersona {

    private static Logger LOG = LoggerFactory.getLogger(PersonaRepoIMPL.class);
    
    @Override
    public void registrar(String nombre) {
        LOG.info("SE REGISTRO A " + nombre);
    }
}
