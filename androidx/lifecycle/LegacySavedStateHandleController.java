package androidx.lifecycle;

import X.0Uu;
import X.11T;
import X.1BL;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass068;
import X.LQu;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* loaded from: LegacySavedStateHandleController.class */
public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController INSTANCE = new Object();

    /* loaded from: LegacySavedStateHandleController$OnRecreation.class */
    public final class OnRecreation implements 0Uu {
    }

    public static final void attachHandleIfNeeded(ViewModel viewModel, AnonymousClass068 anonymousClass068, Lifecycle lifecycle) {
        7zT.A1S(viewModel, anonymousClass068, lifecycle);
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.isAttached) {
            return;
        }
        savedStateHandleController.isAttached = true;
        lifecycle.addObserver(savedStateHandleController);
        anonymousClass068.A02(savedStateHandleController.handle.savedStateProvider, savedStateHandleController.key);
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.isAtLeast(Lifecycle.State.STARTED)) {
            anonymousClass068.A03(OnRecreation.class);
        } else {
            lifecycle.addObserver(new LQu(lifecycle, anonymousClass068, 0));
        }
    }

    public static final SavedStateHandleController create(AnonymousClass068 anonymousClass068, Lifecycle lifecycle, String str, Bundle bundle) {
        boolean A1X = 1BL.A1X(anonymousClass068, lifecycle);
        11T.A0D(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, SavedStateHandle.Companion.createHandle(anonymousClass068.A00(str), bundle));
        if (!(!savedStateHandleController.isAttached)) {
            throw AnonymousClass001.A0N("Already attached to lifecycleOwner");
        }
        savedStateHandleController.isAttached = A1X;
        lifecycle.addObserver(savedStateHandleController);
        anonymousClass068.A02(savedStateHandleController.handle.savedStateProvider, savedStateHandleController.key);
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.isAtLeast(Lifecycle.State.STARTED)) {
            anonymousClass068.A03(OnRecreation.class);
            return savedStateHandleController;
        }
        lifecycle.addObserver(new LQu(lifecycle, anonymousClass068, 0));
        return savedStateHandleController;
    }
}
