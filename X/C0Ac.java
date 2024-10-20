package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* renamed from: X.0Ac, reason: invalid class name */
/* loaded from: 0Ac.class */
public final class C0Ac implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, C05s {
    public ViewModelProvider.Factory A01;
    public final Fragment A03;
    public final ViewModelStore A04;
    public final Runnable A05;
    public LifecycleRegistry A00 = null;
    public AnonymousClass067 A02 = null;

    public C0Ac(Fragment fragment, ViewModelStore viewModelStore, Runnable runnable) {
        this.A03 = fragment;
        this.A04 = viewModelStore;
        this.A05 = runnable;
    }

    public void A00() {
        if (this.A00 == null) {
            this.A00 = new LifecycleRegistry(this);
            AnonymousClass067 anonymousClass067 = new AnonymousClass067(this);
            this.A02 = anonymousClass067;
            anonymousClass067.A00();
            this.A05.run();
        }
    }

    public void A01(Bundle bundle) {
        this.A02.A01(bundle);
    }

    public void A02(Bundle bundle) {
        this.A02.A02(bundle);
    }

    public void A03(Lifecycle.Event event) {
        this.A00.handleLifecycleEvent(event);
    }

    public void A04(Lifecycle.State state) {
        this.A00.setCurrentState(state);
    }

    public boolean A05() {
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        return z;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1j9 getDefaultViewModelCreationExtras() {
        Context context;
        Fragment fragment = this.A03;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            context = applicationContext;
            if (!(context instanceof ContextWrapper)) {
                context = null;
                break;
            }
            if (context instanceof Application) {
                break;
            }
            applicationContext = ((ContextWrapper) context).getBaseContext();
        }
        C1j9 c1j9 = new 1jB();
        if (context != null) {
            c1j9.A01(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, context);
        }
        c1j9.A01(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, fragment);
        c1j9.A01(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            c1j9.A01(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments);
        }
        return c1j9;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Fragment fragment = this.A03;
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            defaultViewModelProviderFactory = this.A01;
            if (defaultViewModelProviderFactory == null) {
                Application application = null;
                Context applicationContext = fragment.requireContext().getApplicationContext();
                while (true) {
                    Context context = applicationContext;
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    }
                    applicationContext = ((ContextWrapper) context).getBaseContext();
                }
                defaultViewModelProviderFactory = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
            }
            return defaultViewModelProviderFactory;
        }
        this.A01 = defaultViewModelProviderFactory;
        return defaultViewModelProviderFactory;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        A00();
        return this.A00;
    }

    @Override // X.C05s
    public AnonymousClass068 getSavedStateRegistry() {
        A00();
        return this.A02.A01;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        A00();
        return this.A04;
    }
}
