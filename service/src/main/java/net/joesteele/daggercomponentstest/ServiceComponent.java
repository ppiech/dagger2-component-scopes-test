package net.joesteele.daggercomponentstest;

import javax.inject.Named;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by joesteele on 2/15/15.
 */
@ServiceScope
@Subcomponent(modules = ServiceModule.class)
public interface ServiceComponent extends AppComponent {
  void inject(ServiceTest service);
}
