package X;

import android.view.accessibility.AccessibilityManager;

/* loaded from: IL2.class */
public final class IL2 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ IMK A00;

    public IL2(IMK imk) {
        this.A00 = imk;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        IMK.A01(this.A00);
    }
}
