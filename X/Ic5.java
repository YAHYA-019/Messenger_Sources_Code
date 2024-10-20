package X;

import android.net.Uri;
import com.google.common.collect.ArrayListMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Ic5.class */
public final class Ic5 implements JFw {
    public IHF A00;
    public final C15h A02 = new C3j8(5);
    public final 1Mu A01 = new ArrayListMultimap();

    public final void A00(Hmk hmk, Hbp hbp) {
        if (hmk == null || hbp == null) {
            return;
        }
        1Mu r0 = this.A01;
        Uri uri = hbp.A00;
        if (r0.AHm(uri, hmk)) {
            return;
        }
        r0.CZw(uri, hmk);
        IHF ihf = this.A00;
        if (ihf != null) {
            Set set = ihf.A09;
            if (set.contains(this)) {
                return;
            }
            set.add(this);
        }
    }

    public final void A01(Hbp hbp) {
        11T.A0F(hbp, 0);
        Uri uri = hbp.A00;
        IHF ihf = this.A00;
        if (ihf != null) {
            ihf.A06();
            1Mu r0 = this.A01;
            if (r0.containsKey(uri)) {
                for (Hmk hmk : r0.AUe(uri)) {
                    RLd rLd = new RLd();
                    Integer num = 0S2.A01;
                    11T.A0F(num, 0);
                    rLd.A02 = num;
                    IHF ihf2 = this.A00;
                    11T.A0D(ihf2);
                    rLd.A01 = !ihf2.A03 ? 0 : IHF.A00(ihf2).getDuration();
                    IHF ihf3 = this.A00;
                    11T.A0D(ihf3);
                    rLd.A00 = ihf3.A05();
                    hmk.A00(rLd);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r0.equals(r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02(X.Hbp r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            android.net.Uri r0 = r0.A00
            r305 = r0
            r0 = r301
            X.IHF r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L4d
            r0 = r306
            boolean r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4d
            r0 = r306
            java.lang.Integer r0 = r0.A01
            r307 = r0
            java.lang.Integer r0 = X.0S2.A01
            r304 = r0
            r0 = r307
            r1 = r304
            if (r0 != r1) goto L4d
            r0 = r306
            android.net.Uri r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L4d
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r308 = r0
            r0 = r303
            if (r0 != 0) goto L53
        L4d:
            r0 = 0
            r308 = r0
            r0 = 0
            r307 = r0
        L53:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ic5.A02(X.Hbp):boolean");
    }

    public final boolean A03(Hbp hbp) {
        Uri uri;
        Uri uri2;
        11T.A0F(hbp, 0);
        Uri uri3 = hbp.A00;
        IHF ihf = this.A00;
        if (ihf == null) {
            return false;
        }
        if (ihf.A03 && IHF.A00(ihf).isPlaying() && (uri2 = ihf.A00) != null && uri2.equals(uri3)) {
            return true;
        }
        IHF ihf2 = this.A00;
        11T.A0D(ihf2);
        return ihf2.A03 && ihf2.A01 == 0S2.A0N && (uri = ihf2.A00) != null && uri.equals(uri3);
    }

    @Override // X.JFw
    public void CMA(Uri uri, RLd rLd) {
        IHF ihf;
        Collection AUe = this.A01.AUe(uri);
        if (AUe.isEmpty()) {
            Integer num = rLd.A02;
            if ((num == 0S2.A00 || num == 0S2.A0N) && (ihf = this.A00) != null) {
                ihf.A07();
                return;
            }
            return;
        }
        IHF ihf2 = this.A00;
        int i = 0;
        int A05 = ihf2 != null ? ihf2.A05() : 0;
        IHF ihf3 = this.A00;
        if (ihf3 != null) {
            i = !ihf3.A03 ? 0 : IHF.A00(ihf3).getDuration();
        }
        rLd.A00 = A05;
        rLd.A01 = i;
        Iterator it = AUe.iterator();
        while (it.hasNext()) {
            ((Hmk) it.next()).A00(rLd);
        }
    }
}
