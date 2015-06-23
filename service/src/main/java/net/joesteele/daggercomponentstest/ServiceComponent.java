package net.joesteele.daggercomponentstest;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by joesteele on 2/15/15.
 */
@ServiceScope
@Component(dependencies = AppComponent.class, modules = ServiceModule.class)
public interface ServiceComponent extends AppComponent {
  void inject(ServiceTest service);

}
