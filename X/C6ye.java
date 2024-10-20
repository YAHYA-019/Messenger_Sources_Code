package X;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: X.6ye, reason: invalid class name */
/* loaded from: 6ye.class */
public final class C6ye extends C6yf {
    public final WeakReference A00;

    public C6ye(6yW r302) {
        super(r302);
        Fragment fragment = r302.A03;
        if (fragment == null) {
            throw 1BK.A0h();
        }
        this.A00 = new WeakReference(fragment);
    }
}
