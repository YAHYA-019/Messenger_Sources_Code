package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9kg, reason: invalid class name */
/* loaded from: 9kg.class */
public final class C9kg {
    public 8Lq A00;
    public String A01;
    public String A02;
    public ThreadKey A03;
    public final 1Br A04 = 7zM.A0d();
    public final 1Br A05 = 1BK.A0D();
    public final 72W A06;
    public final Context A07;
    public final String A08;
    public final java.util.Map A09;

    public C9kg(Context context, 72W r303, java.util.Map map) {
        this.A07 = context;
        this.A06 = r303;
        this.A09 = map;
        String A0b = AnonymousClass001.A0b("modelId", map);
        this.A08 = A0b == null ? "" : A0b;
        this.A02 = 7zR.A0s();
        this.A03 = r303 != null ? r303.BF7() : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        if (r306 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00eb, code lost:
    
        if (r307 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01dc, code lost:
    
        if (r306 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0204, code lost:
    
        if (r306 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.8Lq r301, X.C9kg r302, java.lang.Integer r303, java.lang.Integer r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9kg.A00(X.8Lq, X.9kg, java.lang.Integer, java.lang.Integer, java.lang.String):void");
    }

    public static final void A01(C9kg c9kg) {
        ThreadKey threadKey = c9kg.A03;
        ThreadKey threadKey2 = null;
        if (threadKey != null) {
            72W r0 = c9kg.A06;
            if (threadKey.equals(r0 != null ? r0.BF7() : null)) {
                return;
            }
        }
        72W r02 = c9kg.A06;
        if (r02 != null) {
            threadKey2 = r02.BF7();
        }
        c9kg.A03 = threadKey2;
    }
}
