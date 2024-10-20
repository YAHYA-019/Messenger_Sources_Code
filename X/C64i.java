package X;

import com.facebook.messaging.model.messages.Message;

/* renamed from: X.64i, reason: invalid class name */
/* loaded from: 64i.class */
public abstract class C64i {
    public static final int A00(AnonymousClass622 anonymousClass622) {
        int i;
        Message message = anonymousClass622.A03;
        if (message.A04() != C1q8.A0A) {
            i = 0;
        } else {
            5PN r0 = message.A08().A02;
            if (r0 == 5PN.A0C) {
                return 2;
            }
            if (r0 == 5PN.A03) {
                return 1;
            }
            i = 4;
            if (r0.shouldNotBeRetried) {
                return 3;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (A00(r301) == 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(X.AnonymousClass622 r301) {
        /*
            r0 = r301
            int r0 = A00(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L17
            r0 = r301
            int r0 = A00(r0)
            r303 = r0
            r0 = 2
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L19
        L17:
            r0 = 0
            r302 = r0
        L19:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64i.A01(X.622):boolean");
    }
}
