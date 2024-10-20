package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D21.class */
public final class D21 implements InterfaceC07434jv {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;

    public D21(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(threadKey, 3);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A06 = threadKey;
        this.A01 = r303;
        this.A04 = 1Lm.A00(context, fbUserSession, 49772);
        this.A05 = 1Lm.A00(context, fbUserSession, 17067);
        this.A03 = 1Lm.A00(context, fbUserSession, 66631);
    }

    public static void A00(Context context, 06Z r302, FbUserSession fbUserSession, ThreadKey threadKey, BjO bjO) {
        bjO.A00.add(new D1s(new D21(context, r302, fbUserSession, threadKey)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:284:0x083f, code lost:
    
        if (r343.length() > 0) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0d3d, code lost:
    
        if (r0.A2B != true) goto L488;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0b49 A[Catch: Exception -> 0x0c6b, all -> 0x0c70, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0c6b, blocks: (B:24:0x020b, B:25:0x0210, B:28:0x021c, B:31:0x0232, B:33:0x0243, B:35:0x024c, B:51:0x02aa, B:52:0x02af, B:53:0x02b6, B:54:0x02bd, B:55:0x02c4, B:57:0x02d7, B:59:0x02e0, B:70:0x0332, B:71:0x0337, B:72:0x033e, B:76:0x035b, B:77:0x0362, B:80:0x036e, B:82:0x0377, B:93:0x03c9, B:94:0x03ce, B:95:0x03d5, B:96:0x03dc, B:97:0x03e3, B:98:0x03ea, B:99:0x03f1, B:100:0x03f8, B:102:0x0407, B:103:0x040e, B:106:0x041a, B:107:0x0421, B:109:0x042c, B:112:0x043f, B:117:0x05cd, B:124:0x046a, B:125:0x0471, B:128:0x047d, B:130:0x0488, B:132:0x0497, B:134:0x049f, B:135:0x04a4, B:137:0x04b5, B:140:0x04c1, B:142:0x04c9, B:147:0x04de, B:148:0x04e5, B:149:0x04ee, B:151:0x04f9, B:154:0x0504, B:155:0x050b, B:156:0x0514, B:158:0x051d, B:161:0x0529, B:165:0x053c, B:166:0x0544, B:168:0x054c, B:171:0x055f, B:172:0x0566, B:174:0x0578, B:177:0x0584, B:178:0x058b, B:179:0x0592, B:187:0x05ac, B:191:0x05db, B:193:0x05ea, B:195:0x05c4, B:205:0x0640, B:206:0x0645, B:208:0x0654, B:210:0x065f, B:211:0x0665, B:214:0x0671, B:215:0x0678, B:217:0x0681, B:219:0x068a, B:233:0x06f6, B:234:0x06fb, B:235:0x0700, B:237:0x070e, B:238:0x0717, B:243:0x0739, B:245:0x0742, B:258:0x079f, B:259:0x07a4, B:261:0x07b7, B:263:0x07c0, B:274:0x0812, B:275:0x0817, B:276:0x081e, B:279:0x082a, B:282:0x0836, B:286:0x0844, B:298:0x08a1, B:299:0x08a6, B:301:0x08b5, B:304:0x08c1, B:305:0x08c8, B:306:0x08cf, B:308:0x08d8, B:311:0x08e4, B:314:0x08f7, B:316:0x0900, B:319:0x0909, B:322:0x0915, B:329:0x0940, B:331:0x0954, B:333:0x0968, B:336:0x0984, B:338:0x0a1b, B:347:0x09d8, B:349:0x09e1, B:350:0x09e8, B:353:0x09f4, B:357:0x0a02, B:359:0x0a0b, B:363:0x0a14, B:372:0x0a68, B:374:0x0a77, B:375:0x0a7e, B:376:0x0a85, B:377:0x0a8c, B:378:0x0a93, B:380:0x0aa1, B:385:0x0ab4, B:389:0x0adf, B:391:0x0ae5, B:392:0x0aea, B:393:0x0af1, B:394:0x0af8, B:396:0x0b09, B:398:0x0b1c, B:399:0x0b23, B:405:0x0bd5, B:407:0x0bde, B:410:0x0b49, B:415:0x0b69, B:417:0x0b72, B:419:0x0b7f, B:420:0x0b87, B:422:0x0b98, B:424:0x0ba0, B:429:0x0bc0, B:431:0x0bc9, B:432:0x0ac0, B:445:0x0c30, B:446:0x0c35, B:449:0x0c41, B:452:0x0c4d, B:454:0x0c56), top: B:23:0x020b, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v210 */
    /* JADX WARN: Type inference failed for: r0v433, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v835, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r308v14, types: [X.Bb9] */
    /* JADX WARN: Type inference failed for: r308v15 */
    /* JADX WARN: Type inference failed for: r308v20, types: [X.Bb7] */
    /* JADX WARN: Type inference failed for: r308v21 */
    /* JADX WARN: Type inference failed for: r308v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r308v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r308v45, types: [java.lang.String] */
    @Override // X.InterfaceC07434jv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object A4o(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 5013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D21.A4o(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
