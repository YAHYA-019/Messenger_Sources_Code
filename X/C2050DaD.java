package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.DaD, reason: case insensitive filesystem */
/* loaded from: DaD.class */
public final class C2050DaD extends Fwk {
    public 1pI A00;
    public final Fragment A01;
    public final 06Z A02;
    public final Exk A03;

    public C2050DaD(Fragment fragment, FbUserSession fbUserSession, MigColorScheme migColorScheme, Exk exk, FFj fFj) {
        super(fragment.requireContext(), fbUserSession, migColorScheme, fFj);
        this.A01 = fragment;
        this.A03 = exk;
        this.A02 = fragment.getParentFragmentManager();
    }

    public final FragmentActivity A01() {
        return this.A01.requireActivity();
    }

    public final 1pI A02() {
        1pI r302 = this.A00;
        if (r302 == null) {
            r302 = null;
            try {
                View view = this.A01.mView;
                if (view != null) {
                    r302 = 1vD.A00(view);
                }
            } catch (IllegalStateException unused) {
            }
            this.A00 = r302;
        }
        return r302;
    }
}
