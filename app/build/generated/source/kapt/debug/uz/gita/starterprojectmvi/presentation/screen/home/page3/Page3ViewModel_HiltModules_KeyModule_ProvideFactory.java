// Generated by Dagger (https://dagger.dev).
package uz.gita.starterprojectmvi.presentation.screen.home.page3;

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
public final class Page3ViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static Page3ViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(Page3ViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final Page3ViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new Page3ViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
