package X;

import android.net.Uri;
import android.view.View;
import com.google.common.collect.ImmutableList;

/* loaded from: Ia9.class */
public final class Ia9 implements DFn {
    public final int A00;
    public final Object A01;

    public Ia9(RFl rFl, int i) {
        this.A00 = i;
        this.A01 = rFl;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.DFn
    public void CAF(View view, Object obj) {
        Gre gre;
        RYi rYi;
        RYi rYi2;
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                gre = ((RFl) this.A01).A00;
                Uri uri = null;
                try {
                    uri = C0A2.A03(str);
                } catch (SecurityException unused) {
                }
                uri.getClass();
                gre.A00 = uri;
                ICX icx = gre.A01;
                if (icx.A00.A01.get(str) == null && str != null && (rYi = icx.A00) != null) {
                    rYi.A01.get(str);
                }
                ICX.A01(icx, str);
                Gre.A06(uri, gre);
                gre.A1c();
                return;
            case 1:
                Gre gre2 = ((RFl) this.A01).A00;
                ICX icx2 = gre2.A01;
                if (icx2.A06()) {
                    String A03 = icx2.A03();
                    icx2.A0A.AFq(AbF.A1E(ImmutableList.of((Object) icx2.A0B)));
                    icx2.A08.A00(icx2.A07, A03, icx2.A03(), icx2.A02().A00, icx2.A04);
                }
                5rQ r0 = gre2.A02;
                if (r0 != null) {
                    r0.A08();
                    gre2.A02 = null;
                }
                Uri uri2 = null;
                try {
                    uri2 = C0A2.A03(gre2.A01.A05());
                } catch (SecurityException unused2) {
                }
                uri2.getClass();
                Gre.A06(uri2, gre2);
                gre2.A00 = uri2;
                gre2.A1c();
                return;
            default:
                gre = ((RFl) this.A01).A00;
                gre.A00 = Uri.EMPTY;
                ICX icx3 = gre.A01;
                if (icx3.A00.A01.get("") == null && (rYi2 = icx3.A00) != null) {
                    rYi2.A01.get("");
                }
                ICX.A01(icx3, "");
                gre.A1c();
                return;
        }
    }
}
