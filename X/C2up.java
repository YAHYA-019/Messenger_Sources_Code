package X;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2up, reason: invalid class name */
/* loaded from: 2up.class */
public final class C2up {
    public final Context A00;

    public C2up(Context context) {
        this.A00 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Set A00() {
        Set A0v;
        synchronized (C2up.class) {
            try {
                A0v = this.A00.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (A0v == null) {
                    A0v = AnonymousClass001.A0v();
                }
            } catch (Exception unused) {
                A0v = AnonymousClass001.A0v();
            }
        }
        return A0v;
    }
}
