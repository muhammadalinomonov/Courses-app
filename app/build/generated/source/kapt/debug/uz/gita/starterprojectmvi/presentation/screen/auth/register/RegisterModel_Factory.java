// Generated by Dagger (https://dagger.dev).
package uz.gita.starterprojectmvi.presentation.screen.auth.register;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.starterprojectmvi.domain.repository.auth.AuthRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegisterModel_Factory implements Factory<RegisterModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<RegisterDirection> directionProvider;

  public RegisterModel_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<RegisterDirection> directionProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.directionProvider = directionProvider;
  }

  @Override
  public RegisterModel get() {
    return newInstance(authRepositoryProvider.get(), directionProvider.get());
  }

  public static RegisterModel_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<RegisterDirection> directionProvider) {
    return new RegisterModel_Factory(authRepositoryProvider, directionProvider);
  }

  public static RegisterModel newInstance(AuthRepository authRepository,
      RegisterDirection direction) {
    return new RegisterModel(authRepository, direction);
  }
}
