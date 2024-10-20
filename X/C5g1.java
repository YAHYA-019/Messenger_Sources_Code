package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.xapp.messaging.threadview.model.aigenerated.AIGeneratedMetadata;
import java.util.List;

/* renamed from: X.5g1, reason: invalid class name */
/* loaded from: 5g1.class */
public final class C5g1 {
    public static final C5g1 A00 = new Object();

    public static final List A00(C5fv c5fv) {
        AIGeneratedMetadata aIGeneratedMetadata;
        if (c5fv == null || (aIGeneratedMetadata = (AIGeneratedMetadata) c5fv.AxW(C5g2.A00)) == null) {
            return null;
        }
        return aIGeneratedMetadata.A00;
    }

    public static final boolean A01(Message message) {
        if (message != null) {
            return (message.A0k == null && message.A0j == null) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (X.11T.A0O(r301, X.C6ne.MEMU.toString()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L45
            r0 = r301
            com.facebook.xapp.messaging.threadview.model.aigenerated.AIGeneratedMetadata r0 = r0.A0j
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L45
            r0 = r302
            java.util.List r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L45
            r0 = r302
            java.lang.Object r0 = X.0QD.A0E(r0)
            r301 = r0
        L1b:
            X.6ne r0 = X.C6ne.IMAGINE
            java.lang.String r0 = r0.toString()
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = X.11T.A0O(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L41
            X.6ne r0 = X.C6ne.MEMU
            java.lang.String r0 = r0.toString()
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L43
        L41:
            r0 = 1
            r303 = r0
        L43:
            r0 = r303
            return r0
        L45:
            r0 = 0
            r304 = r0
            r0 = 0
            r301 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5g1.A02(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static final boolean A03(C5fv c5fv) {
        String obj = C6ne.MEMU.toString();
        List A002 = A00(c5fv);
        return 11T.A0O(obj, A002 != null ? 0QD.A0E(A002) : null);
    }

    public final boolean A04(Message message) {
        List list;
        String obj = C6ne.MEMU.toString();
        AIGeneratedMetadata aIGeneratedMetadata = message.A0j;
        return 11T.A0O(obj, (aIGeneratedMetadata == null || (list = aIGeneratedMetadata.A00) == null) ? null : 0QD.A0E(list));
    }
}
