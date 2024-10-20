package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D1m.class */
public final class D1m implements 7H9 {
    public final Context A00;
    public final FbUserSession A01;
    public final 1pK A02;
    public final ThreadKey A03;
    public final 6tF A04;

    public D1m(Context context, FbUserSession fbUserSession, 1pK r304, ThreadKey threadKey, 6tF r306) {
        this.A00 = context;
        this.A04 = r306;
        this.A03 = threadKey;
        this.A02 = r304;
        this.A01 = fbUserSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0432, code lost:
    
        if (r0.A05 != r0) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x080c, code lost:
    
        r330 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0812, code lost:
    
        r331 = r0;
        r321 = r308;
        r323 = "messaging.msys.thread.actionhandler.CallToActionHandlerInterfaceSpec";
        r332 = r329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0806, code lost:
    
        r330 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0660, code lost:
    
        if (r0.A07 != r0) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0803, code lost:
    
        if (r0.A08 != r0) goto L358;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d9 A[Catch: Exception -> 0x0410, all -> 0x0425, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0410, blocks: (B:136:0x033b, B:140:0x0349, B:143:0x0355, B:148:0x03ff, B:153:0x03d9, B:154:0x03e0, B:155:0x03e5, B:156:0x03ec, B:157:0x03f3, B:158:0x03f8, B:158:0x03f8, B:160:0x035f, B:161:0x0364, B:164:0x0370, B:167:0x037a, B:168:0x0384, B:171:0x0390, B:173:0x03a4, B:174:0x03ab, B:176:0x03b4, B:179:0x03c3), top: B:135:0x033b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05fa A[Catch: Exception -> 0x063e, all -> 0x0653, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x063e, blocks: (B:257:0x05ba, B:261:0x05c8, B:264:0x05d4, B:269:0x062d, B:274:0x05fa, B:275:0x0601, B:276:0x0608, B:277:0x060f, B:279:0x061a, B:280:0x0621, B:281:0x0626, B:281:0x0626, B:284:0x05e4), top: B:256:0x05ba, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017e A[Catch: Exception -> 0x01bd, all -> 0x01d4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x01bd, blocks: (B:17:0x00e7, B:21:0x00f5, B:24:0x0101, B:27:0x017e, B:29:0x01a7, B:30:0x01ac, B:36:0x0186, B:37:0x018d, B:39:0x0194, B:40:0x019b, B:41:0x01a0, B:41:0x01a0, B:43:0x010b, B:44:0x0110, B:47:0x011c, B:50:0x0126, B:51:0x0130, B:54:0x013c, B:56:0x0150, B:57:0x0157, B:59:0x0160, B:62:0x016f), top: B:16:0x00e7, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x07c9 A[Catch: Exception -> 0x07e1, all -> 0x07f6, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x07e1, blocks: (B:337:0x0762, B:341:0x0770, B:344:0x077c, B:349:0x07d0, B:354:0x07c9, B:355:0x0786, B:356:0x078b, B:359:0x0797, B:362:0x07a1, B:364:0x07b3), top: B:336:0x0762, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0186 A[Catch: Exception -> 0x01bd, all -> 0x01d4, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x01bd, blocks: (B:17:0x00e7, B:21:0x00f5, B:24:0x0101, B:27:0x017e, B:29:0x01a7, B:30:0x01ac, B:36:0x0186, B:37:0x018d, B:39:0x0194, B:40:0x019b, B:41:0x01a0, B:41:0x01a0, B:43:0x010b, B:44:0x0110, B:47:0x011c, B:50:0x0126, B:51:0x0130, B:54:0x013c, B:56:0x0150, B:57:0x0157, B:59:0x0160, B:62:0x016f), top: B:16:0x00e7, outer: #10 }] */
    /* JADX WARN: Type inference failed for: r0v369, types: [java.lang.Object, com.facebook.messaging.cutover.plugins.rollbackmessage.calltoactionhandler.RollbackMessageCallToActionHandler] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BLW(android.content.Context r302, X.C5vw r303) {
        /*
            Method dump skipped, instructions count: 2723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D1m.BLW(android.content.Context, X.5vw):void");
    }
}
