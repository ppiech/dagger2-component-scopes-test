package net.joesteele.daggercomponentstest;

import dagger.Component;

/**
 * Created by joesteele on 2/15/15.
 */
@ActivityScope
@Component(dependencies = ComponentTestComponent.class, modules = ActivityModule.class)
public interface ActivityComponent extends ComponentTestComponent {
  void inject(MainActivity activity);
}
