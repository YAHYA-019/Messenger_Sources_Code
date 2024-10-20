package X;

import com.facebook.messaging.model.messages.Message;

/* renamed from: X.611, reason: invalid class name */
/* loaded from: 611.class */
public final class AnonymousClass611 {
    public final 1Br A00 = 1Bu.A00(67781);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r303 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A00(X.AnonymousClass622 r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.Message r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            r0 = r302
            java.lang.String r0 = r0.A1W
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L25
            r0 = r302
            java.lang.String r0 = r0.A1g
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L25
        L1b:
            r0 = r301
            long r0 = r0.AsR()
            r304 = r0
            r0 = r304
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r303 = r0
        L25:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass611.A00(X.622):java.lang.String");
    }

    public final boolean A01(Message message) {
        5aU A00 = message.A0B().A00();
        if (A00 == 5aU.A09 || A00 == 5aU.A07 || A00 == 5aU.A08 || A00 == 5aU.A0A) {
            return ((AnonymousClass610) this.A00.A00.get()).A02();
        }
        return false;
    }
}
