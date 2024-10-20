package X;

import android.content.Context;

/* renamed from: X.1oh, reason: invalid class name */
/* loaded from: 1oh.class */
public final class C1oh {
    public HtB A00;
    public C09q A01;
    public 3J1 A02;
    public boolean A03;
    public final Context A04;

    public C1oh(Context context) {
        11T.A0F(context, 1);
        this.A04 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (r304 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(X.C1oh r301) {
        /*
            r0 = r301
            X.HtB r0 = r0.A00
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L6e
            r0 = r301
            android.content.Context r0 = r0.A04
            android.content.res.Resources r0 = r0.getResources()
            r304 = r0
            r0 = 2131034118(0x7f050006, float:1.7678745E38)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.getBoolean(r1)
            r306 = r0
            r0 = r301
            X.HtB r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L67
            r0 = r302
            java.util.List r0 = r0.A00
            r302 = r0
            r0 = r302
            java.util.Iterator r0 = r0.iterator()
            r307 = r0
        L35:
            r0 = r307
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L58
            r0 = r307
            java.lang.Object r0 = r0.next()
            r304 = r0
            r0 = r304
            boolean r0 = r0 instanceof X.JOc
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L35
        L58:
            r0 = r304
            boolean r0 = r0 instanceof X.JOc
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L67
            r0 = r304
            if (r0 != 0) goto L6e
        L67:
            r0 = r306
            if (r0 != 0) goto L6e
            r0 = 1
            r303 = r0
        L6e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1oh.A00(X.1oh):boolean");
    }

    public final void A01(boolean z) {
        this.A03 = z;
    }

    public final boolean A02(int i) {
        boolean A0L;
        if (i > 0) {
            return true;
        }
        C09q c09q = this.A01;
        if (c09q != null) {
            A0L = c09q.A00.A0L();
            if (A0L) {
                return false;
            }
        }
        C09q c09q2 = this.A01;
        return (c09q2 != null && c09q2.A00() && A00(this)) ? false : true;
    }
}
