package cl.rest.ws;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Application extends javax.ws.rs.core.Application
{
  private Set<Class<?>> classes = new HashSet();

  public Application() {
    this.classes.add(TestServicio.class);
  }

  public Set<Class<?>> getClasses()
  {
    return this.classes;
  }

  public Set<Object> getSingletons()
  {
    return Collections.EMPTY_SET;
  }
}