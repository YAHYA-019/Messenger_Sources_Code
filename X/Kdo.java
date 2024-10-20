package X;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: Kdo.class */
public final class Kdo {
    public final ClipboardManager A00;

    public Kdo(Context context) {
        Object systemService = context.getSystemService("clipboard");
        11T.A0I(systemService, 7zK.A00(3));
        this.A00 = (ClipboardManager) systemService;
    }
}
