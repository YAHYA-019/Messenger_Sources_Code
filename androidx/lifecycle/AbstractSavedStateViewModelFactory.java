package androidx.lifecycle;

import X.0BZ;
import X.11T;
import X.1BJ;
import X.AnonymousClass001;
import X.AnonymousClass068;
import X.C05s;
import X.C1j9;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: AbstractSavedStateViewModelFactory.class */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    public Lifecycle lifecycle;
    public AnonymousClass068 savedStateRegistry;

    public AbstractSavedStateViewModelFactory(C05s c05s, Bundle bundle) {
        11T.A0F(c05s, 1);
        this.savedStateRegistry = c05s.getSavedStateRegistry();
        this.lifecycle = c05s.getLifecycle();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        11T.A0F(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw AnonymousClass001.A0L(1BJ.A00(289));
        }
        if (this.lifecycle == null) {
            throw AnonymousClass001.A0q("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        AnonymousClass068 anonymousClass068 = this.savedStateRegistry;
        11T.A0D(anonymousClass068);
        Lifecycle lifecycle = this.lifecycle;
        11T.A0D(lifecycle);
        SavedStateHandleController create = LegacySavedStateHandleController.create(anonymousClass068, lifecycle, canonicalName, null);
        ViewModel create2 = create(canonicalName, cls, create.handle);
        create2.addCloseable("androidx.lifecycle.savedstate.vm.tag", create);
        return create2;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, C1j9 c1j9) {
        11T.A0H(cls, c1j9);
        String str = (String) c1j9.A00(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw AnonymousClass001.A0N("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        AnonymousClass068 anonymousClass068 = this.savedStateRegistry;
        if (anonymousClass068 == null) {
            return create(str, cls, SavedStateHandleSupport.createSavedStateHandle(c1j9));
        }
        11T.A0D(anonymousClass068);
        Lifecycle lifecycle = this.lifecycle;
        11T.A0D(lifecycle);
        SavedStateHandleController create = LegacySavedStateHandleController.create(anonymousClass068, lifecycle, str, null);
        ViewModel create2 = create(str, cls, create.handle);
        create2.addCloseable("androidx.lifecycle.savedstate.vm.tag", create);
        return create2;
    }

    public abstract ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        11T.A0F(viewModel, 0);
        AnonymousClass068 anonymousClass068 = this.savedStateRegistry;
        if (anonymousClass068 != null) {
            Lifecycle lifecycle = this.lifecycle;
            11T.A0D(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, anonymousClass068, lifecycle);
        }
    }
}
