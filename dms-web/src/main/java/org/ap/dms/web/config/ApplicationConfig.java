package org.ap.dms.web.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.ap.dms.web.DmsRestImpl;

@ApplicationPath("/rest")
public class ApplicationConfig extends Application {
	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>(Arrays.asList(DmsRestImpl.class));
	}
}