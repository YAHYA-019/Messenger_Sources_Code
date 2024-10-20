package X;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.GeS, reason: case insensitive filesystem */
/* loaded from: GeS.class */
public final class C2471GeS extends C1q6 {
    public final WeakReference A00;

    public C2471GeS(1pK r302, 6RU r303) {
        this.A00 = 7zL.A14(r303);
        Iterator it = r302.getChildFragmentManager().A0T.A0A().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
        if (fragment instanceof 1pK) {
            ((1pK) fragment).A1U(this);
        }
    }
}
