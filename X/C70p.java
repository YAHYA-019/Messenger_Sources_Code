package X;

import java.util.Iterator;

/* renamed from: X.70p, reason: invalid class name */
/* loaded from: 70p.class */
public abstract class C70p {
    private C5fu A02(C5fu c5fu, String str) {
        if (this instanceof C72k) {
            11T.A0F(c5fu, 0);
            Iterator it = ((C72k) this).A00.iterator();
            while (it.hasNext()) {
                c5fu = ((C70p) it.next()).A02(c5fu, str);
            }
        } else {
            11T.A0F(c5fu, 0);
            C5ug A03 = A03(c5fu, str);
            if (A03 != null) {
                C5fq A00 = c5fu.A00();
                A00.A02(C5uf.A00, A03);
                C5fv A002 = A00.A00();
                11T.A0I(A002, "null cannot be cast to non-null type T of com.facebook.xapp.messaging.threadview.renderer.text.TextSpannableManager.addMessageSpannable");
                c5fu = (C5fu) A002;
            }
        }
        return c5fu;
    }

    public final C5fu A01(C5fu c5fu) {
        String str;
        11T.A0F(c5fu, 0);
        if (c5fu instanceof 5gC) {
            str = ((5gC) c5fu).A03;
        } else {
            if (!(c5fu instanceof C5n8)) {
                if (c5fu instanceof C5uY) {
                    str = ((C5uY) c5fu).A02;
                }
                return c5fu;
            }
            str = ((C5n8) c5fu).A09;
        }
        if (str != null) {
            c5fu = A02(c5fu, str);
        }
        return c5fu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01e5, code lost:
    
        if (r306 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C5ug A03(X.C5fu r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70p.A03(X.5fu, java.lang.String):X.5ug");
    }
}
