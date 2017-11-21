package cl.ws.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import cl.ws.source.Test;


public class Root extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	
	public Root(){
		singletons.add(new Test());
	}
	@Override
	public Set<Class<?>> getClasses(){
		return empty;
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}