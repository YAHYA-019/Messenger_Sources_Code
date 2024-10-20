package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: B5S.class */
public final class B5S extends IV9 {
    public /* bridge */ /* synthetic */ View A01(ViewGroup viewGroup) {
        return new B4y(viewGroup.getContext());
    }

    public boolean Bkd() {
        return ((H4B) ((IV9) this).A00).A0l();
    }

    public void C37() {
        ((H4B) ((IV9) this).A00).A0X();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, X.B4y] */
    public void C38() {
        C6R c6r;
        ?? r0 = (B4y) ((IV9) this).A00;
        ((CIk) r0.A00.get()).A03(4YV.A0C(r0.getContext()), r0.A04);
        BIb bIb = r0.A05;
        if (bIb == null || (c6r = bIb.A03) == null) {
            return;
        }
        ((CIk) 1Br.A0B(c6r.A06)).A03(1Br.A03(c6r.A0A), c6r.A0C);
    }

    public void C3B() {
        ((H4B) ((IV9) this).A00).A0Y();
    }

    public void C3C(ParcelableSecondaryData parcelableSecondaryData) {
        FbUserSession A0C = 4YV.A0C(((IV9) this).A00.getContext());
        B4y b4y = (B4y) ((IV9) this).A00;
        C5fi.A01(((H4B) b4y).A03);
        B4y.A01(A0C, b4y);
        BIb bIb = b4y.A05;
        boolean A0j = b4y.A0j();
        C6R c6r = bIb.A03;
        if (c6r == null || c6r.A04 == A0j) {
            return;
        }
        c6r.A04 = A0j;
        c6r.A00();
    }

    public void C3D(ParcelableSecondaryData parcelableSecondaryData) {
        FbUserSession A0C = 4YV.A0C(((IV9) this).A00.getContext());
        B4y b4y = (B4y) ((IV9) this).A00;
        C5fi.A01(((H4B) b4y).A03);
        B4y.A01(A0C, b4y);
    }

    public void C3G() {
        H4B h4b = (H4B) ((IV9) this).A00;
        C5fi.A01(h4b.A03);
        h4b.A0Z();
    }

    public void Cn1(MigColorScheme migColorScheme) {
        ((H4B) ((IV9) this).A00).A0f(migColorScheme);
    }

    public void D8C(6fA r302) {
        C6R c6r;
        if (r302 != null) {
            ThreadKey threadKey = r302.A02;
            BIb bIb = ((B4y) ((IV9) this).A00).A05;
            if (bIb != null) {
                if (!threadKey.equals(bIb.A02)) {
                    LithoView lithoView = bIb.A01;
                    if (lithoView != null) {
                        lithoView.A0z(null);
                    }
                    if (bIb.A01 != null && (c6r = bIb.A03) != null) {
                        c6r.A00();
                    }
                }
                bIb.A02 = threadKey;
                C6R c6r2 = bIb.A03;
                if (c6r2 != null) {
                    c6r2.A00 = threadKey;
                }
            }
        }
    }
}
