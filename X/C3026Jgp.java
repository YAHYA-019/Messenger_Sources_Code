package X;

import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;

/* renamed from: X.Jgp, reason: case insensitive filesystem */
/* loaded from: Jgp.class */
public final class C3026Jgp extends ViewModel {
    public WeakReference A00;

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        WeakReference weakReference = this.A00;
        if (weakReference == null) {
            11T.A0L("completeTransition");
            throw 0Q8.createAndThrow();
        }
        C00m c00m = (C00m) weakReference.get();
        if (c00m != null) {
            c00m.invoke();
        }
    }
}
