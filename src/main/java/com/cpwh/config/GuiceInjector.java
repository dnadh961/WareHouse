package com.cpwh.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;

public class GuiceInjector implements InjectorSource {
	
	String COPYRIGHT = "Copyright (c) 2014  Pegasystems Inc.";
	String VERSION = "$Id: GuiceInjector.java 174698 2016-02-08 08:24:26Z SachinVellanki $";
	
    @Override
    public Injector getInjector() {
        return Guice.createInjector(Stage.PRODUCTION, CucumberModules.SCENARIO, new TestEnvInjector());
    }
}
