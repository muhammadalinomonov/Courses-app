// Generated by Dagger (https://dagger.dev).
package uz.gita.starterprojectmvi.presentation.screen.home.page1;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Page1ViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static Page1ViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(Page1ViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final Page1ViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new Page1ViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
