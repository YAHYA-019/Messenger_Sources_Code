package X;

import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* renamed from: X.1th, reason: invalid class name */
/* loaded from: 1th.class */
public final class C1th {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Fragment A04;
    public final C1tg A05;

    public C1th(Fragment fragment, C1tg c1tg) {
        C1tf AnS;
        11T.A0F(c1tg, 2);
        this.A04 = fragment;
        1pM r0 = fragment.mParentFragment;
        boolean z = true;
        if ((r0 instanceof 1pM) && ((AnS = r0.AnS()) == null || !AnS.A00.A03)) {
            z = false;
        }
        this.A01 = z;
        this.A05 = c1tg;
        A00(this);
    }

    public static final void A00(C1th c1th) {
        Iterator it = c1th.A05.A01.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onVisibilityFlagChange");
        }
    }

    public static final void A01(C1th c1th) {
        C1tg c1tg = c1th.A05;
        Fragment fragment = c1th.A04;
        boolean z = c1th.A03;
        Iterator it = c1tg.A00.iterator();
        while (it.hasNext()) {
            ((2jI) it.next()).Bzc(fragment, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r301.A00 > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.C1th r301) {
        /*
            r0 = r301
            boolean r0 = r0.A03
            r302 = r0
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r301
            boolean r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 <= 0) goto L27
        L22:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L27:
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r303
            r1 = r302
            if (r0 == r1) goto Lb2
            r0 = r301
            androidx.fragment.app.Fragment r0 = r0.A04
            r305 = r0
            r0 = r305
            java.util.List r0 = X.2jG.A00(r0)
            r306 = r0
            r0 = r306
            int r0 = r0.size()
            r307 = r0
            r0 = 0
            r308 = r0
        L4a:
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto Lae
            r0 = r306
            r1 = r308
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r309 = r0
            r0 = r309
            boolean r0 = r0 instanceof X.1pM
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La5
            r0 = r309
            X.1pM r0 = (X.1pM) r0
            r309 = r0
            r0 = r309
            X.1tf r0 = r0.AnS()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La5
            r0 = r301
            boolean r0 = r0.A03
            r302 = r0
            r0 = r305
            X.1th r0 = r0.A00
            r309 = r0
            r0 = r309
            boolean r0 = r0.A01
            r303 = r0
            r0 = r303
            r1 = r302
            if (r0 == r1) goto La0
            r0 = r309
            r1 = r302
            r0.A01 = r1
            r0 = r309
            A02(r0)
        La0:
            r0 = r309
            A00(r0)
        La5:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L4a
        Lae:
            r0 = r301
            A01(r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1th.A02(X.1th):void");
    }
}
