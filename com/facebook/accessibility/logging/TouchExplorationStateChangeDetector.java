package com.facebook.accessibility.logging;

import X.1BO;
import X.1BV;
import X.1BY;
import X.1HH;
import X.C00i;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.facebook.accessibility.logging.TouchExplorationStateChangeDetector;

/* loaded from: TouchExplorationStateChangeDetector.class */
public final class TouchExplorationStateChangeDetector {
    public AccessibilityManager.TouchExplorationStateChangeListener A00;
    public 1BY A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04 = new 1BV((1BY) null, 32821);

    public TouchExplorationStateChangeDetector(1BO r302) {
        1BV r0 = new 1BV((1BY) null, 83719);
        this.A03 = r0;
        this.A02 = new 1HH((Context) r0.get(), 100194);
        this.A01 = new 1BY(r302);
        this.A00 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: X.523
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public void onTouchExplorationStateChanged(boolean z) {
                TouchExplorationStateChangeDetector.this.A04.get();
            }
        };
    }
}
