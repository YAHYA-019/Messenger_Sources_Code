package X;

import android.text.Spannable;

/* renamed from: X.882, reason: invalid class name */
/* loaded from: 882.class */
public final class AnonymousClass882 extends C70p {
    public final AnonymousClass883 A00;

    public AnonymousClass882(AnonymousClass883 anonymousClass883) {
        11T.A0F(anonymousClass883, 1);
        this.A00 = anonymousClass883;
    }

    public static final void A00(Spannable spannable, C82g c82g, Object obj) {
        int i = c82g.A02;
        int i2 = i;
        int length = spannable.length();
        if (i > length) {
            i = length;
        }
        int i3 = i2 + c82g.A01;
        int length2 = spannable.length();
        int i4 = i3;
        if (i3 > length2) {
            i4 = length2;
        }
        if (i < 0 || i4 <= 0) {
            return;
        }
        int length3 = spannable.length();
        if (i2 > length3) {
            i2 = length3;
        }
        int length4 = spannable.length();
        if (i3 > length4) {
            i3 = length4;
        }
        spannable.setSpan(obj, i2, i3, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r308 == null) goto L10;
     */
    @Override // X.C70p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C5ug A03(X.C5fu r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = r303
            boolean r0 = X.1BL.A1W(r0, r1)
            r304 = r0
            r0 = r302
            boolean r0 = X.C76m.A00(r0)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r305
            if (r0 == 0) goto Le1
            X.5gF r0 = X.5gF.A00
            r308 = r0
            r0 = r302
            r1 = r308
            X.5PP r0 = r0.AxW(r1)
            X.82X r0 = (X.82X) r0
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Le1
            android.text.Spannable$Factory r0 = android.text.Spannable.Factory.getInstance()
            r307 = r0
            X.5uf r0 = X.C5uf.A00
            r308 = r0
            r0 = r302
            r1 = r308
            X.5PP r0 = r0.AxW(r1)
            X.5ug r0 = (X.C5ug) r0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L52
            r0 = r308
            android.text.Spannable r0 = r0.A00
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L58
        L52:
            r0 = r303
            java.lang.String r0 = X.4YU.A13(r0)
            r308 = r0
        L58:
            r0 = r308
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r308 = r0
            r0 = r307
            r1 = r308
            android.text.Spannable r0 = r0.newSpannable(r1)
            r310 = r0
            r0 = r310
            X.11T.A0A(r0)
            r0 = r309
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            r308 = r0
            r0 = r308
            java.util.Iterator r0 = r0.iterator()
            r311 = r0
        L80:
            r0 = r311
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Ld2
            r0 = r311
            java.lang.Object r0 = r0.next()
            X.82g r0 = (X.C82g) r0
            r309 = r0
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r308 = r0
            r0 = r308
            r1 = r304
            r0.<init>(r1)
            r0 = r308
            android.text.style.CharacterStyle r0 = android.text.style.CharacterStyle.wrap(r0)
            r308 = r0
            r0 = r310
            r1 = r309
            r2 = r308
            A00(r0, r1, r2)
            r0 = 12
            r306 = r0
            X.8Br r0 = new X.8Br
            r308 = r0
            r0 = r308
            r1 = r301
            r2 = r306
            r0.<init>(r1, r2)
            r0 = r310
            r1 = r309
            r2 = r308
            A00(r0, r1, r2)
            goto L80
        Ld2:
            X.5ug r0 = new X.5ug
            r308 = r0
            r0 = r308
            r1 = r310
            r0.<init>(r1)
            r0 = r308
            return r0
        Le1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass882.A03(X.5fu, java.lang.String):X.5ug");
    }
}
