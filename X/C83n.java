package X;

import com.facebook.ui.emoji.model.Emoji;
import java.util.NoSuchElementException;

/* renamed from: X.83n, reason: invalid class name */
/* loaded from: 83n.class */
public final class C83n {
    public final 1Br A01 = 1Bq.A00(66067);
    public final 1Br A02 = 1Bq.A00(33050);
    public final 1Br A00 = 1Bq.A00(68450);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        if (r304 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List A00(X.C83n r301, java.lang.String r302) {
        /*
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.22a r0 = (X.C22a) r0
            r1 = r302
            java.util.List r0 = r0.AjV(r1)
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)
            r0 = r304
            boolean r0 = X.1BK.A1Y(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L57
            r0 = r301
            X.1Br r0 = r0.A02
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.2KX r0 = (X.2KX) r0
            r304 = r0
            r0 = r304
            r1 = r302
            java.lang.String r0 = r0.A00(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L53
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.22a r0 = (X.C22a) r0
            r1 = r306
            java.util.List r0 = r0.AjV(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L57
        L53:
            X.0ty r0 = X.C0ty.A00
            r304 = r0
        L57:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83n.A00(X.83n, java.lang.String):java.util.List");
    }

    public final boolean A01(String str) {
        String A07;
        boolean z = false;
        11T.A0F(str, 0);
        Emoji emoji = (Emoji) 0QD.A0E(A00(this, str));
        if (emoji != null && (A07 = emoji.A07()) != null) {
            1Br.A0C(this.A00);
            z = AnonymousClass001.A1T(C9gv.A00(A07));
        }
        return z;
    }

    public final boolean A02(String str) {
        11T.A0F(str, 0);
        if (!((C22a) this.A01.A00.get()).BWc(str, 1)) {
            return false;
        }
        if (str.length() == 0) {
            throw new NoSuchElementException(AnonymousClass000.A00(39));
        }
        return (0AH.A01(str.charAt(0)) || 0AH.A01(0DY.A02(str))) ? false : true;
    }
}
