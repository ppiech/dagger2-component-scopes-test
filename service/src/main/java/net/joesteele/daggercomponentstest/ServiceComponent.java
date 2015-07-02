package net.joesteele.daggercomponentstest;

// modules = { ServiceModule.class }
public interface ServiceComponent extends AppComponent {
  void inject(ServiceTest service);
}
