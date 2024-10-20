package X;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.067, reason: invalid class name */
/* loaded from: 067.class */
public final class AnonymousClass067 {
    public boolean A00;
    public final AnonymousClass068 A01 = new AnonymousClass068();
    public final C05s A02;

    public AnonymousClass067(C05s c05s) {
        this.A02 = c05s;
    }

    public final void A00() {
        final C05s c05s = this.A02;
        Lifecycle lifecycle = c05s.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.INITIALIZED) {
            throw AnonymousClass001.A0N("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.addObserver(new LifecycleEventObserver(c05s) { // from class: X.1eu
            public final C05s A00;

            {
                this.A00 = c05s;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                11T.A0F(lifecycleOwner, 0);
                11T.A0F(event, 1);
                if (event != Lifecycle.Event.ON_CREATE) {
                    throw AnonymousClass001.A0J("Next event must be ON_CREATE");
                }
                lifecycleOwner.getLifecycle().removeObserver(this);
                C05s c05s2 = this.A00;
                Bundle A00 = c05s2.getSavedStateRegistry().A00("androidx.savedstate.Restarter");
                if (A00 != null) {
                    ArrayList<String> stringArrayList = A00.getStringArrayList("classes_to_restore");
                    if (stringArrayList == null) {
                        throw AnonymousClass001.A0N("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String A0i = AnonymousClass001.A0i(it);
                        try {
                            Class<? extends U> asSubclass = Class.forName(A0i, false, C1eu.class.getClassLoader()).asSubclass(0Uu.class);
                            11T.A0A(asSubclass);
                            try {
                                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    11T.A0A(declaredConstructor.newInstance(new Object[0]));
                                    if (!(c05s2 instanceof ViewModelStoreOwner)) {
                                        throw AnonymousClass001.A0N("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                    ViewModelStore viewModelStore = ((ViewModelStoreOwner) c05s2).getViewModelStore();
                                    AnonymousClass068 savedStateRegistry = c05s2.getSavedStateRegistry();
                                    Iterator it2 = new HashSet(viewModelStore.map.keySet()).iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        11T.A0F(next, 0);
                                        ViewModel viewModel = (ViewModel) viewModelStore.map.get(next);
                                        11T.A0D(viewModel);
                                        LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, c05s2.getLifecycle());
                                    }
                                    if (!new HashSet(viewModelStore.map.keySet()).isEmpty()) {
                                        savedStateRegistry.A03(LegacySavedStateHandleController.OnRecreation.class);
                                    }
                                } catch (Exception e) {
                                    throw 1BK.A0s(0Pz.A0W("Failed to instantiate ", A0i), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException(0Pz.A0j("Class ", asSubclass.getSimpleName(), " must have default constructor in order to be automatically recreated"), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw 1BK.A0s(0Pz.A0j("Class ", A0i, " wasn't found"), e3);
                        }
                    }
                }
            }
        });
        AnonymousClass068 anonymousClass068 = this.A01;
        if (!(!anonymousClass068.A01)) {
            throw AnonymousClass001.A0N("SavedStateRegistry was already attached.");
        }
        lifecycle.addObserver(new C0np(anonymousClass068, 4));
        anonymousClass068.A01 = true;
        this.A00 = true;
    }

    public final void A01(Bundle bundle) {
        if (!this.A00) {
            A00();
        }
        Lifecycle lifecycle = this.A02.getLifecycle();
        if (!(!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED))) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("performRestore cannot be called when owner is ");
            throw AnonymousClass002.A0E(lifecycle.getCurrentState(), A0k);
        }
        AnonymousClass068 anonymousClass068 = this.A01;
        if (!anonymousClass068.A01) {
            throw AnonymousClass001.A0N("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (!(!anonymousClass068.A03)) {
            throw AnonymousClass001.A0N("SavedStateRegistry was already restored.");
        }
        anonymousClass068.A00 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        anonymousClass068.A03 = true;
    }

    public final void A02(Bundle bundle) {
        AnonymousClass068 anonymousClass068 = this.A01;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = anonymousClass068.A00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        0QJ r0 = anonymousClass068.A05;
        C01k c01k = new C01k(r0);
        r0.A03.put(c01k, false);
        while (c01k.hasNext()) {
            Map.Entry entry = (Map.Entry) c01k.next();
            bundle2.putBundle((String) entry.getKey(), ((06L) entry.getValue()).saveState());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
