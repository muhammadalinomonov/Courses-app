// Generated by Dagger (https://dagger.dev).
package uz.gita.starterprojectmvi.presentation.screen.auth.register;

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
public final class RegisterDirectionImpl_Factory implements Factory<RegisterDirectionImpl> {
  private final Provider<AppNavigator> navigatorProvider;

  public RegisterDirectionImpl_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public RegisterDirectionImpl get() {
    return newInstance(navigatorProvider.get());
  }

  public static RegisterDirectionImpl_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new RegisterDirectionImpl_Factory(navigatorProvider);
  }

  public static RegisterDirectionImpl newInstance(AppNavigator navigator) {
    return new RegisterDirectionImpl(navigator);
  }
}
