package androidx.lifecycle;

import X.0BZ;
import X.11T;
import X.1BJ;
import X.AnonymousClass001;
import X.AnonymousClass068;
import X.C05s;
import X.C1j9;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import java.lang.reflect.Constructor;

/* loaded from: SavedStateViewModelFactory.class */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    public Application application;
    public Bundle defaultArgs;
    public final ViewModelProvider.Factory factory;
    public Lifecycle lifecycle;
    public AnonymousClass068 savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    public SavedStateViewModelFactory(Application application, C05s c05s, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        11T.A0F(c05s, 2);
        this.savedStateRegistry = c05s.getSavedStateRegistry();
        this.lifecycle = c05s.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory._instance;
            if (androidViewModelFactory == null) {
                androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory(application);
                ViewModelProvider.AndroidViewModelFactory._instance = androidViewModelFactory;
            }
            11T.A0D(androidViewModelFactory);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(0BZ r302, C1j9 c1j9) {
        return ViewModelProvider.Factory.CC.$default$create(this, r302, c1j9);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        11T.A0F(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return create(canonicalName, cls);
        }
        throw AnonymousClass001.A0L(1BJ.A00(289));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls, C1j9 c1j9) {
        11T.A0H(cls, c1j9);
        String str = (String) c1j9.A00(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw AnonymousClass001.A0N("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (c1j9.A00(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) == null || c1j9.A00(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) == null) {
            if (this.lifecycle != null) {
                return create(str, cls);
            }
            throw AnonymousClass001.A0N("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Object A00 = c1j9.A00(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(cls, (!isAssignableFrom || A00 == null) ? SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE : SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
        if (findMatchingConstructor == null) {
            return this.factory.create(cls, c1j9);
        }
        return SavedStateViewModelFactoryKt.newInstance(cls, findMatchingConstructor, (!isAssignableFrom || A00 == null) ? new Object[]{SavedStateHandleSupport.createSavedStateHandle(c1j9)} : new Object[]{A00, SavedStateHandleSupport.createSavedStateHandle(c1j9)});
    }

    /* JADX WARN: Type inference failed for: r305v12, types: [java.lang.Object, androidx.lifecycle.ViewModelProvider$NewInstanceFactory] */
    public final ViewModel create(String str, Class cls) {
        Application application;
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            throw AnonymousClass001.A0q("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor findMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(cls, (!isAssignableFrom || this.application == null) ? SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE : SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
        if (findMatchingConstructor != null) {
            AnonymousClass068 anonymousClass068 = this.savedStateRegistry;
            11T.A0D(anonymousClass068);
            SavedStateHandleController create = LegacySavedStateHandleController.create(anonymousClass068, lifecycle, str, this.defaultArgs);
            ViewModel newInstance = SavedStateViewModelFactoryKt.newInstance(cls, findMatchingConstructor, (!isAssignableFrom || (application = this.application) == null) ? new Object[]{create.handle} : new Object[]{application, create.handle});
            newInstance.addCloseable("androidx.lifecycle.savedstate.vm.tag", create);
            return newInstance;
        }
        if (this.application != null) {
            return this.factory.create(cls);
        }
        ViewModelProvider.NewInstanceFactory newInstanceFactory = ViewModelProvider.NewInstanceFactory._instance;
        ViewModelProvider.NewInstanceFactory newInstanceFactory2 = newInstanceFactory;
        if (newInstanceFactory == null) {
            ?? obj = new Object();
            ViewModelProvider.NewInstanceFactory._instance = obj;
            newInstanceFactory2 = obj;
        }
        11T.A0D(newInstanceFactory2);
        return newInstanceFactory2.create(cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        11T.A0F(viewModel, 0);
        if (this.lifecycle != null) {
            AnonymousClass068 anonymousClass068 = this.savedStateRegistry;
            11T.A0D(anonymousClass068);
            Lifecycle lifecycle = this.lifecycle;
            11T.A0D(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, anonymousClass068, lifecycle);
        }
    }
}
