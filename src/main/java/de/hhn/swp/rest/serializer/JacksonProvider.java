package de.hhn.swp.rest.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;
import java.time.LocalDate;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Provider
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class JacksonProvider extends JacksonJsonProvider {

    public JacksonProvider() {
        super();
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new DateModule());
        setMapper(objectMapper);
    }

    private final class DateModule extends SimpleModule {
        private DateModule() {
            super("Date module");
            addSerializer(LocalDate.class, new LocalDateSerializer());
            addDeserializer(LocalDate.class, new LocalDateDeserializer());
        }
    }

}

