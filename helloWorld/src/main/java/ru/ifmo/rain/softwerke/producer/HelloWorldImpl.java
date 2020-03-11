package ru.ifmo.rain.softwerke.producer;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.BundleContext;

@Component(immediate = true)
@Service
public class HelloWorldImpl implements HelloWorld {
    public void hello() {
        System.out.println("Hello World Osgi!");
    }
    @Activate
    protected void activate(BundleContext context) throws Exception{
        System.out.println("Hi, I'm producer");
    }
    @Deactivate
    protected void deactivate(BundleContext context) throws Exception{
    }
}
