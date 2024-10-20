package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.fragment.app.Fragment;

/* renamed from: X.08f, reason: invalid class name */
/* loaded from: 08f.class */
public abstract class C08f {
    public static boolean A03(Context context) {
        if (context instanceof Activity) {
            return true;
        }
        if (context instanceof ContextWrapper) {
            return A03(((ContextWrapper) context).getBaseContext());
        }
        return false;
    }

    public static boolean A04(Context context, Intent intent) {
        if ((intent.getFlags() & 268435456) != 0 || A03(context)) {
            return false;
        }
        intent.addFlags(268435456);
        return true;
    }

    public AnonymousClass088 A07(C07r c07r, C05w c05w, C07q c07q) {
        throw AnonymousClass001.A0p();
    }

    public boolean A08(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        throw AnonymousClass001.A0p();
    }

    public abstract boolean A09(Activity activity, Intent intent, int i);

    public abstract boolean A0A(Context context, Intent intent);

    public abstract boolean A0B(Intent intent, Fragment fragment, int i);
}
