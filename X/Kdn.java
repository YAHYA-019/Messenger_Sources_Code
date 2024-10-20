package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* loaded from: Kdn.class */
public final class Kdn {
    public final AccessibilityManager A00;

    public Kdn(Context context) {
        Object systemService = context.getSystemService("accessibility");
        11T.A0I(systemService, 1BJ.A00(19));
        this.A00 = (AccessibilityManager) systemService;
    }
}
