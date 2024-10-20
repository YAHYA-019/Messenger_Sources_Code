package X;

import com.facebook.xapp.messaging.threadview.model.botresponse.AIImagineMediaInfo;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.5v6, reason: invalid class name */
/* loaded from: 5v6.class */
public abstract class C5v6 {
    public static final AnonymousClass988 A00(C5fv c5fv) {
        11T.A0F(c5fv, 0);
        if (c5fv instanceof 5gC) {
            return AnonymousClass988.TEXT;
        }
        if (c5fv instanceof C5n8) {
            return AnonymousClass988.XMA;
        }
        if (c5fv instanceof C5ft) {
            return AnonymousClass988.IMAGE;
        }
        return null;
    }

    public static final String A01(C5fv c5fv) {
        BotResponseMetadata botResponseMetadata;
        if (c5fv == null || (botResponseMetadata = (BotResponseMetadata) c5fv.AxW(5mF.A00)) == null) {
            return null;
        }
        return botResponseMetadata.A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r301.AxW(X.5mF.A00) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(X.C5fv r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L16
            X.5mF r0 = X.5mF.A00
            r302 = r0
            r0 = r301
            r1 = r302
            X.5PP r0 = r0.AxW(r1)
            r301 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            if (r0 != 0) goto L1a
        L16:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L1a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5v6.A02(X.5fv):boolean");
    }

    public static final boolean A03(C5fv c5fv) {
        BotResponseMetadata botResponseMetadata;
        String str;
        return (c5fv == null || (botResponseMetadata = (BotResponseMetadata) c5fv.AxW(5mF.A00)) == null || (str = botResponseMetadata.A0A) == null || 0CU.A0O(str) || botResponseMetadata.A05 != 0S2.A00) ? false : true;
    }

    public static final boolean A04(C5fv c5fv) {
        BotResponseMetadata botResponseMetadata;
        List list;
        AIImagineMediaInfo aIImagineMediaInfo;
        boolean z = false;
        if (A05(c5fv) && c5fv != null && (botResponseMetadata = (BotResponseMetadata) c5fv.AxW(5mF.A00)) != null && (list = botResponseMetadata.A0E) != null && (aIImagineMediaInfo = (AIImagineMediaInfo) 0QD.A0E(list)) != null && aIImagineMediaInfo.A02) {
            z = true;
        }
        return z;
    }

    public static final boolean A05(C5fv c5fv) {
        if (!A03(c5fv) || !(c5fv instanceof C5ft)) {
            return false;
        }
        ImmutableList immutableList = ((C5ft) c5fv).A01;
        return 1BK.A1Y(immutableList) && !((Photo) immutableList.get(0)).A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (((r301 == null || (r0 = (com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata) r301.AxW(X.5mF.A00)) == null) ? null : r0.A00) != X.C97S.IMAGINE) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A06(X.C5fv r301) {
        /*
            r0 = r301
            boolean r0 = A03(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L30
            r0 = r301
            if (r0 == 0) goto L36
            X.5mF r0 = X.5mF.A00
            r303 = r0
            r0 = r301
            r1 = r303
            X.5PP r0 = r0.AxW(r1)
            com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata r0 = (com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L36
            r0 = r303
            X.97S r0 = r0.A00
            r301 = r0
        L25:
            X.97S r0 = X.C97S.IMAGINE
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r301
            r1 = r304
            if (r0 == r1) goto L34
        L30:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L34:
            r0 = r302
            return r0
        L36:
            r0 = 0
            r301 = r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5v6.A06(X.5fv):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (((r301 == null || (r0 = (com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata) r301.AxW(X.5mF.A00)) == null) ? null : r0.A00) != X.C97S.MEMU) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A07(X.C5fv r301) {
        /*
            r0 = r301
            boolean r0 = A03(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L30
            r0 = r301
            if (r0 == 0) goto L36
            X.5mF r0 = X.5mF.A00
            r303 = r0
            r0 = r301
            r1 = r303
            X.5PP r0 = r0.AxW(r1)
            com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata r0 = (com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L36
            r0 = r303
            X.97S r0 = r0.A00
            r301 = r0
        L25:
            X.97S r0 = X.C97S.MEMU
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r301
            r1 = r304
            if (r0 == r1) goto L34
        L30:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L34:
            r0 = r302
            return r0
        L36:
            r0 = 0
            r301 = r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5v6.A07(X.5fv):boolean");
    }
}
