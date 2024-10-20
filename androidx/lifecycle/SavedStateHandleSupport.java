package androidx.lifecycle;

import X.06L;
import X.0BY;
import X.2yV;
import X.AnonymousClass001;
import X.C05s;
import X.C1ew;
import X.C1j9;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: SavedStateHandleSupport.class */
public abstract class SavedStateHandleSupport {
    public static final C1ew SAVED_STATE_REGISTRY_OWNER_KEY = new 2yV(1);
    public static final C1ew VIEW_MODEL_STORE_OWNER_KEY = new 2yV(2);
    public static final C1ew DEFAULT_ARGS_KEY = new 2yV(0);

    public static final SavedStateHandle createSavedStateHandle(C1j9 c1j9) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        C05s c05s = (C05s) c1j9.A00(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (c05s == null) {
            throw AnonymousClass001.A0L("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) c1j9.A00(VIEW_MODEL_STORE_OWNER_KEY);
        if (viewModelStoreOwner == null) {
            throw AnonymousClass001.A0L("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) c1j9.A00(DEFAULT_ARGS_KEY);
        String str = (String) c1j9.A00(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw AnonymousClass001.A0L("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        06L A01 = c05s.getSavedStateRegistry().A01();
        if (!(A01 instanceof SavedStateHandlesProvider) || (savedStateHandlesProvider = (SavedStateHandlesProvider) A01) == null) {
            throw AnonymousClass001.A0N("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        SavedStateHandlesVM savedStateHandlesVM = (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, new SavedStateHandleSupport$savedStateHandlesVM$1()).impl.A00("androidx.lifecycle.internal.SavedStateHandlesVM", new 0BY(SavedStateHandlesVM.class));
        SavedStateHandle savedStateHandle = (SavedStateHandle) savedStateHandlesVM.handles.get(str);
        if (savedStateHandle == null) {
            SavedStateHandle.Companion companion = SavedStateHandle.Companion;
            savedStateHandlesProvider.performRestore();
            Bundle bundle2 = savedStateHandlesProvider.restoredState;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
            Bundle bundle4 = savedStateHandlesProvider.restoredState;
            if (bundle4 != null) {
                bundle4.remove(str);
            }
            Bundle bundle5 = savedStateHandlesProvider.restoredState;
            if (bundle5 != null && bundle5.isEmpty()) {
                savedStateHandlesProvider.restoredState = null;
            }
            savedStateHandle = companion.createHandle(bundle3, bundle);
            savedStateHandlesVM.handles.put(str, savedStateHandle);
        }
        return savedStateHandle;
    }

    public static final void enableSavedStateHandles(C05s c05s) {
        Lifecycle.State currentState = c05s.getLifecycle().getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED && currentState != Lifecycle.State.CREATED) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        if (c05s.getSavedStateRegistry().A01() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(c05s.getSavedStateRegistry(), (ViewModelStoreOwner) c05s);
            c05s.getSavedStateRegistry().A02(savedStateHandlesProvider, "androidx.lifecycle.internal.SavedStateHandlesProvider");
            c05s.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }
}
