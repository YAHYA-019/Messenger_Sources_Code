package X;

import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.5xd, reason: invalid class name */
/* loaded from: 5xd.class */
public final class C5xd implements 1pI {
    public 2M3 A00;
    public 1pI A01;

    public C5xd(View view) {
        this.A00 = new C9rn(view, 0);
    }

    public C5xd(final Fragment fragment) {
        this.A00 = new 2M3() { // from class: X.5xe
            public final View AUH() {
                View view = Fragment.this.mView;
                if (view != null) {
                    return view;
                }
                throw 1BK.A0h();
            }
        };
    }

    private final 1pI A00() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw AnonymousClass001.A0N("ContentViewManager can only be used on the UI thread!");
        }
        2M3 r0 = this.A00;
        if (r0 != null) {
            this.A01 = 1vD.A00(r0.AUH());
            this.A00 = null;
        }
        1pI r02 = this.A01;
        if (r02 != null) {
            return r02;
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }

    public boolean BVa() {
        return A00().BVa();
    }

    public void CeH(String str) {
        11T.A0F(str, 0);
        A00().CeH(str);
    }

    public void CeI(String str, boolean z) {
        A00().CeI(str, z);
    }

    public void Cfr(Fragment fragment, String str) {
        A00().Cfr(fragment, str);
    }

    public void Cfs(Fragment fragment, Integer num, String str) {
        11T.A0F(num, 2);
        A00().Cfs(fragment, num, str);
    }

    public void Czy(Fragment fragment, String str) {
        11T.A0F(str, 1);
        A00().Czy(fragment, str);
    }

    public void Czz(Fragment fragment, Integer num, String str) {
        1BL.A1F(str, num);
        A00().Czz(fragment, num, str);
    }
}
