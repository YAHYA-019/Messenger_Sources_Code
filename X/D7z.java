package X;

import java.util.List;

/* loaded from: D7z.class */
public final class D7z implements Runnable {
    public static final String __redex_internal_original_name = "HomeDrawerFragmentBase$logUpdateContent$1";
    public final /* synthetic */ C4Fm A00;
    public final /* synthetic */ List A01;

    public D7z(C4Fm c4Fm, List list) {
        this.A00 = c4Fm;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4MS r0;
        C4Lh c4Lh = this.A00.A04;
        if (c4Lh == null) {
            11T.A0L("drawerSurfaceBadgeLogger");
            throw 0Q8.createAndThrow();
        }
        List<C4Mh> list = this.A01;
        11T.A0F(list, 0);
        for (C4Mh c4Mh : list) {
            2cW A00 = C4Lh.A00(c4Mh);
            if (A00 != null && (r0 = (4MS) c4Mh.A03.A00(4MS.A01)) != null) {
                2cU.A00(2cX.A01, A00, new 2cZ(2cY.A02, r0.A00), (2cU) 1Br.A0B(c4Lh.A00));
            }
        }
    }
}
