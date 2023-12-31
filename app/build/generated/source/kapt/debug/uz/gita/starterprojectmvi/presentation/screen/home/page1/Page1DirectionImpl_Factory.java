// Generated by Dagger (https://dagger.dev).
package uz.gita.starterprojectmvi.presentation.screen.home.page1;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.starterprojectmvi.utils.navigation.AppNavigator;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Page1DirectionImpl_Factory implements Factory<Page1DirectionImpl> {
  private final Provider<AppNavigator> appNavigatorProvider;

  public Page1DirectionImpl_Factory(Provider<AppNavigator> appNavigatorProvider) {
    this.appNavigatorProvider = appNavigatorProvider;
  }

  @Override
  public Page1DirectionImpl get() {
    return newInstance(appNavigatorProvider.get());
  }

  public static Page1DirectionImpl_Factory create(Provider<AppNavigator> appNavigatorProvider) {
    return new Page1DirectionImpl_Factory(appNavigatorProvider);
  }

  public static Page1DirectionImpl newInstance(AppNavigator appNavigator) {
    return new Page1DirectionImpl(appNavigator);
  }
}
