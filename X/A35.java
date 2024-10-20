package X;

import android.content.ClipData;

/* loaded from: A35.class */
public final class A35 implements JKS {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public A35(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void onPermissionsCheckCanceled() {
        if (2 - this.A00 == 0) {
            0fH.A0k("PermissionsPluginSpec", "Permission check canceled");
        }
    }

    public void onPermissionsGranted() {
        switch (this.A00) {
            case 0:
                ((Runnable) this.A02).run();
                return;
            case 1:
                6LK.A00((ClipData) this.A01, (6LK) this.A02);
                return;
            default:
                0fH.A0j("PermissionsPluginSpec", "Permissions granted");
                7FI.A02((6RU) this.A01, new 7Be((Class) this.A02));
                return;
        }
    }

    public void onPermissionsNotGranted(String[] strArr, String[] strArr2) {
        if (2 - this.A00 == 0) {
            0fH.A0j("PermissionsPluginSpec", "Permissions not granted");
            7FI.A02((6RU) this.A01, new 7Be((Class) this.A02));
        }
    }
}
