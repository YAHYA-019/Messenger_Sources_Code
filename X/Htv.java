package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;

/* loaded from: Htv.class */
public final class Htv {
    public int A00;
    public boolean A01;
    public final C00p A02;
    public final C0dr A03;
    public final HQZ A04;
    public final GXh A05;
    public final 2O4 A06;

    public Htv(HQZ hqz, GXh gXh) {
        C0dr c0dr = (C0dr) 1Bi.A03(84488);
        11T.A0F(c0dr, 1);
        this.A03 = c0dr;
        this.A04 = hqz;
        this.A02 = new C00p(10);
        this.A05 = gXh;
        RecyclerView recyclerView = gXh.A01;
        GXC gxc = new GXC(this, 1);
        this.A06 = gxc;
        recyclerView.A1F(gxc);
    }

    public void A00() {
        C00p c00p = this.A02;
        int A00 = c00p.A00();
        while (true) {
            A00--;
            if (-1 >= A00) {
                return;
            }
            Object A04 = c00p.A04(A00);
            11T.A0I(A04, "null cannot be cast to non-null type com.facebook.messaging.analytics.tracker.ItemInfo<*>");
            C2k8 c2k8 = (C2k8) A04;
            if (c2k8.A08) {
                c2k8.A02 = 0L;
            } else {
                c00p.A08(A00);
                C2rc.A00.A02(c2k8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011b, code lost:
    
        if (r319 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Htv.A01():void");
    }

    public void A02(Collection collection) {
        long now = this.A03.now();
        C00p c00p = this.A02;
        int A00 = c00p.A00();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                break;
            }
            C2k8 c2k8 = (C2k8) c00p.A04(i2);
            if (c2k8 != null && c2k8.A08) {
                c2k8.A02 += now - c2k8.A04;
                c2k8.A04 = now;
            }
            i = i2 + 1;
        }
        int A002 = c00p.A00();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= A002) {
                return;
            }
            Object A04 = c00p.A04(i4);
            if (A04 != null) {
                collection.add(A04);
            }
            i3 = i4 + 1;
        }
    }
}
