package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListDataFetchEnd;
import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MessageListDataFetchFail;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;

/* loaded from: Cc8.class */
public final class Cc8 implements 2SQ, CallerContextable {
    public static final String __redex_internal_original_name = "ThreadViewLoader";
    public 2eS A00;
    public 2eS A01;
    public 2TV A02;
    public 1BY A03;
    public CHi A04;
    public CHi A05;
    public CHN A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final FbUserSession A0A;
    public final C5C A0J;
    public final C00i A0O;
    public final C00i A0P;
    public final 4iI A0R;
    public final C00i A0H = AbH.A0P();
    public final 20A A0B = (20A) 1Bi.A03(100043);
    public final BWn A0S = (BWn) 1Bn.A0E((Context) null, (1BY) null, 84580);
    public final C12014yf A0I = (C12014yf) 1Bi.A03(49410);
    public final CDp A0Q = (CDp) 1Bi.A03(84540);
    public final C00i A0G = 1BQ.A02(16470);
    public final C00i A0E = AbH.A0O();
    public final C00i A0M = AbH.A0Z();
    public final C00i A0C = 1BQ.A02(17063);
    public final C00i A0N = 1BQ.A00();
    public final C00i A0F = 1BV.A01((1BY) null, 66956);
    public final C00i A0K = AbH.A0K();
    public final C00i A0D = 1BQ.A01();
    public final C00i A0L = AbH.A0W();

    public Cc8(Context context, FbUserSession fbUserSession, 1BO r304) {
        this.A03 = 7zL.A0Q(r304);
        this.A0O = 7zL.A0R(context, 84849);
        this.A0J = (C5C) 1Bn.A0E(context, (1BY) null, 84534);
        this.A0P = AbF.A0B(fbUserSession, (1BY) null, 84573);
        this.A0R = AbI.A0Z(context);
        this.A0A = fbUserSession;
        this.A09 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x044c, code lost:
    
        if (X.0QD.A0k(r0, r0) != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x047b, code lost:
    
        if (X.0QD.A0k(r0, r0) != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0118, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A0k, r0) == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ff A[Catch: all -> 0x04e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x04e0, blocks: (B:40:0x02f3, B:43:0x02ff, B:55:0x030c, B:56:0x0311, B:57:0x031a, B:60:0x0328, B:61:0x032f, B:64:0x033b, B:68:0x0349, B:70:0x0351, B:74:0x035b, B:79:0x0369, B:85:0x0372, B:86:0x0379, B:87:0x0380, B:90:0x038e, B:91:0x0395, B:92:0x039c, B:94:0x03a5, B:98:0x03bd, B:100:0x03c8, B:102:0x03cf, B:103:0x03d4, B:105:0x03dd, B:110:0x03f0, B:112:0x03fb, B:117:0x0403, B:118:0x0408, B:119:0x0411, B:122:0x041f, B:123:0x0426, B:126:0x0432, B:130:0x0440, B:133:0x0455, B:136:0x0461, B:140:0x046f, B:150:0x0490, B:158:0x0499, B:159:0x04a0), top: B:39:0x02f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x030c A[Catch: all -> 0x04e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x04e0, blocks: (B:40:0x02f3, B:43:0x02ff, B:55:0x030c, B:56:0x0311, B:57:0x031a, B:60:0x0328, B:61:0x032f, B:64:0x033b, B:68:0x0349, B:70:0x0351, B:74:0x035b, B:79:0x0369, B:85:0x0372, B:86:0x0379, B:87:0x0380, B:90:0x038e, B:91:0x0395, B:92:0x039c, B:94:0x03a5, B:98:0x03bd, B:100:0x03c8, B:102:0x03cf, B:103:0x03d4, B:105:0x03dd, B:110:0x03f0, B:112:0x03fb, B:117:0x0403, B:118:0x0408, B:119:0x0411, B:122:0x041f, B:123:0x0426, B:126:0x0432, B:130:0x0440, B:133:0x0455, B:136:0x0461, B:140:0x046f, B:150:0x0490, B:158:0x0499, B:159:0x04a0), top: B:39:0x02f3 }] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.CHN A00(com.facebook.auth.usersession.FbUserSession r302, com.facebook.fbservice.results.DataFetchDisposition r303, com.facebook.messaging.model.messages.MessagesCollection r304, com.facebook.messaging.model.threads.ThreadSummary r305, com.facebook.user.model.User r306, com.google.common.collect.ImmutableMap r307, boolean r308) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cc8.A00(com.facebook.auth.usersession.FbUserSession, com.facebook.fbservice.results.DataFetchDisposition, com.facebook.messaging.model.messages.MessagesCollection, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.user.model.User, com.google.common.collect.ImmutableMap, boolean):X.CHN");
    }

    private CHN A01(FbUserSession fbUserSession, DataFetchDisposition dataFetchDisposition, 5Xx r304, User user, boolean z) {
        ImmutableList of;
        1Kq r0;
        UserKey userKey = user.A0k;
        if (userKey.type != 1Js.A03 || (!((r0 = user.A0U) == 1Kq.A02 || r0 == 1Kq.A08) || r304 == 5Xx.A02 || r304 == 5Xx.A01)) {
            of = ImmutableList.of();
        } else {
            A0B(this, fbUserSession);
            this.A0M.get();
            of = ImmutableList.copyOf((Collection) ((C5Pr) 1Lo.A04((Context) null, fbUserSession, this.A03, 49712)).A0J(4iI.A00(this.A0R, userKey)));
        }
        return new CHN(dataFetchDisposition, (MessagesCollection) null, (ThreadSummary) null, r304, user, of, (ImmutableMap) null, z);
    }

    public static CHN A02(FbUserSession fbUserSession, FetchThreadResult fetchThreadResult, Cc8 cc8) {
        ImmutableMap immutableMap;
        ImmutableList immutableList = fetchThreadResult.A07;
        User A03 = A03(cc8, immutableList);
        ThreadSummary threadSummary = fetchThreadResult.A05;
        if (threadSummary == null) {
            0fH.A0j(__redex_internal_original_name, "Got canonical user but no thread");
            A03.getClass();
            return cc8.A01(fbUserSession, fetchThreadResult.A02, fetchThreadResult.A06, A03, fetchThreadResult.A0B);
        }
        if (immutableList == null || 1BK.A0N(cc8.A0N).AZk(36323775372872916L)) {
            immutableMap = null;
        } else {
            ImmutableList immutableList2 = threadSummary.A1L;
            ImmutableMap.Builder A0c = 1BK.A0c();
            1Du it = immutableList2.iterator();
            while (it.hasNext()) {
                UserKey A01 = C28p.A01(4YU.A0W(it));
                1Du it2 = immutableList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        User A0t = AbG.A0t(it2);
                        UserKey userKey = A0t.A0k;
                        if (userKey.equals(A01)) {
                            A0c.put(userKey, A0t);
                            break;
                        }
                    }
                }
            }
            immutableMap = A0c.build();
        }
        return cc8.A00(fbUserSession, fetchThreadResult.A02, fetchThreadResult.A03, threadSummary, A03, immutableMap, fetchThreadResult.A0B);
    }

    public static User A03(Cc8 cc8, ImmutableList immutableList) {
        if (immutableList == null || immutableList.size() != 2) {
            return null;
        }
        int i = 0;
        if (Objects.equal(AbG.A0u(immutableList, 0).A0k, 1BK.A0X(cc8.A0A.A02))) {
            i = 1;
        }
        return AbG.A0u(immutableList, i);
    }

    private void A04() {
        AbI.A1N(this.A0K);
        this.A04 = null;
        this.A06 = null;
        this.A05 = null;
        this.A08 = false;
        2eS r0 = this.A01;
        if (r0 != null) {
            r0.A00(false);
            this.A01 = null;
        }
        2eS r02 = this.A00;
        if (r02 != null) {
            r02.A00(false);
            this.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c1, code lost:
    
        if (r324 == (-1)) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04de A[Catch: all -> 0x0c01, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c01, blocks: (B:3:0x0045, B:6:0x0056, B:7:0x005c, B:10:0x0068, B:15:0x0079, B:16:0x007f, B:17:0x0085, B:20:0x0099, B:22:0x00ac, B:27:0x00b3, B:30:0x00bf, B:32:0x00cb, B:35:0x00d9, B:36:0x00e0, B:37:0x00e7, B:39:0x00ef, B:40:0x00f5, B:42:0x00fc, B:46:0x010c, B:48:0x0113, B:50:0x0124, B:51:0x012b, B:52:0x0132, B:54:0x013b, B:57:0x0147, B:60:0x0153, B:61:0x015a, B:64:0x0164, B:70:0x0199, B:72:0x01a4, B:73:0x01ab, B:78:0x026e, B:80:0x0279, B:85:0x0293, B:86:0x029a, B:89:0x02a6, B:91:0x02b3, B:99:0x01e4, B:102:0x01f0, B:105:0x01fc, B:106:0x0203, B:107:0x020a, B:110:0x02db, B:111:0x02e0, B:112:0x02e7, B:113:0x02ee, B:114:0x02f5, B:115:0x02fc, B:116:0x0303, B:117:0x030a, B:118:0x030f, B:120:0x0334, B:121:0x033a, B:123:0x0345, B:124:0x034c, B:125:0x0353, B:127:0x035c, B:129:0x0365, B:131:0x0383, B:133:0x038b, B:135:0x0397, B:137:0x039e, B:140:0x03a8, B:142:0x03b3, B:146:0x03c2, B:148:0x03cc, B:150:0x03db, B:151:0x03e2, B:153:0x03eb, B:157:0x0403, B:159:0x0412, B:160:0x0419, B:162:0x0423, B:163:0x042a, B:167:0x043b, B:169:0x0443, B:170:0x0448, B:173:0x044f, B:177:0x045d, B:178:0x0464, B:180:0x046b, B:183:0x0475, B:185:0x0480, B:187:0x0488, B:188:0x048d, B:189:0x0494, B:191:0x04a3, B:193:0x04a9, B:194:0x04ae, B:195:0x04b6, B:197:0x04c1, B:198:0x04c8, B:200:0x04d7, B:201:0x04de, B:204:0x04ea, B:207:0x04f6, B:210:0x0502, B:211:0x0509, B:214:0x0515, B:218:0x0527, B:219:0x052e, B:220:0x0535, B:222:0x053c, B:223:0x0541, B:224:0x0548, B:226:0x0551, B:227:0x0558, B:234:0x056e, B:235:0x0575, B:238:0x0583, B:240:0x0590, B:241:0x0597, B:243:0x05a0, B:246:0x05ae, B:247:0x05b5, B:248:0x05bc, B:249:0x05c3, B:250:0x05ca, B:251:0x05d1, B:252:0x05d8, B:253:0x05df, B:254:0x05e6, B:256:0x0607, B:257:0x060e, B:259:0x0615, B:261:0x061e, B:263:0x0626, B:265:0x0630, B:266:0x0637, B:268:0x0646, B:270:0x064c, B:272:0x0656, B:274:0x065d, B:275:0x0662, B:276:0x066a, B:280:0x067c, B:281:0x0683, B:283:0x068a, B:284:0x068f, B:286:0x0696, B:287:0x069b, B:289:0x06a2, B:291:0x06b3, B:292:0x06b9, B:293:0x06be, B:295:0x06c3, B:296:0x06ca, B:299:0x06d8, B:300:0x06e1, B:301:0x06e8, B:303:0x06f1, B:305:0x06fa, B:306:0x0701, B:308:0x0708, B:310:0x070f, B:312:0x0716, B:314:0x0720, B:316:0x0727, B:317:0x072c, B:318:0x0731, B:319:0x0738, B:320:0x073d, B:323:0x0744, B:325:0x0751, B:326:0x0757, B:328:0x075e, B:329:0x0763, B:331:0x078e, B:333:0x0796, B:335:0x079d, B:338:0x07a7, B:340:0x07b2, B:342:0x07ba, B:343:0x07bf, B:344:0x07c6, B:346:0x07da, B:348:0x07e0, B:349:0x07e5, B:350:0x07eb, B:352:0x07f5, B:354:0x07fe, B:355:0x0803, B:356:0x080b, B:360:0x081c, B:362:0x0825, B:365:0x0831, B:366:0x0838, B:367:0x0841, B:368:0x0848, B:370:0x0851, B:382:0x0873, B:384:0x087a, B:388:0x0889, B:389:0x0890, B:391:0x089a, B:393:0x08a1, B:395:0x08a8, B:399:0x08ba, B:400:0x08bf, B:403:0x08c6, B:405:0x08d4, B:406:0x08db, B:407:0x08e0, B:409:0x08e5, B:410:0x08ea, B:412:0x090b, B:413:0x0911, B:414:0x0918, B:415:0x091f, B:416:0x0926, B:417:0x092d, B:418:0x0934, B:419:0x093b, B:420:0x0942, B:422:0x0967, B:423:0x096e, B:425:0x0975, B:426:0x097a, B:428:0x0985, B:430:0x098e, B:431:0x0993, B:432:0x099a, B:434:0x09a5, B:436:0x09ad, B:438:0x09b7, B:439:0x09be, B:441:0x09cd, B:443:0x09d3, B:444:0x09d8, B:445:0x09e0, B:446:0x09e7, B:453:0x0a50, B:456:0x0a57, B:458:0x0a61, B:460:0x0a69, B:461:0x0a6d, B:464:0x0a74, B:465:0x0218, B:468:0x0224, B:469:0x0229, B:470:0x022e, B:471:0x0235, B:472:0x023c, B:474:0x0256, B:476:0x025f, B:477:0x02bf, B:486:0x017b, B:488:0x0184, B:490:0x0192, B:492:0x09f8, B:494:0x0a04, B:495:0x0a0c, B:497:0x0a18, B:499:0x0a1f, B:501:0x0a26, B:502:0x0a2e, B:504:0x0a35, B:506:0x0a3c, B:507:0x0a43, B:509:0x0a4a, B:512:0x0a86, B:514:0x0a8e, B:516:0x0a95, B:517:0x0a9a, B:518:0x0aa1, B:520:0x0ab4, B:522:0x0abb, B:523:0x0ac0, B:525:0x0ac9, B:530:0x0bad, B:532:0x0bb4, B:536:0x0bc3, B:538:0x0bcb, B:539:0x0bd2, B:541:0x0bd8, B:543:0x0bea, B:545:0x0adc, B:548:0x0ae8, B:552:0x0afa, B:553:0x0b01, B:556:0x0b0d, B:559:0x0b1b, B:561:0x0b24, B:564:0x0b30, B:565:0x0b35, B:567:0x0b3c, B:568:0x0b42, B:569:0x0b49, B:570:0x0b50, B:572:0x0b5b, B:574:0x0b62, B:576:0x0b69, B:578:0x0b70, B:580:0x0b77, B:582:0x0b7e, B:584:0x0b85, B:585:0x0b8c, B:587:0x0b93, B:589:0x0b9a, B:590:0x0b9f, B:593:0x0ba6), top: B:2:0x0045, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(com.facebook.auth.usersession.FbUserSession r301, X.Cc8 r302, X.CHi r303) {
        /*
            Method dump skipped, instructions count: 3082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cc8.A05(com.facebook.auth.usersession.FbUserSession, X.Cc8, X.CHi):void");
    }

    public static void A06(FbUserSession fbUserSession, Cc8 cc8, CHi cHi, CHi cHi2, Throwable th) {
        C3F c3f = new C3F(ServiceException.A00(th), cHi.A0C);
        2TV r0 = cc8.A02;
        if (r0 != null) {
            r0.C47(cHi, c3f);
            AbF.A0b(cc8.A0C).A00(cHi, c3f, "notifyLoadFailed", __redex_internal_original_name);
        } else {
            0fH.A0k(__redex_internal_original_name, "onFetchThreadError, mCallback is null");
        }
        A0A(cc8, c3f, cHi);
        if (cHi2 != null) {
            0fH.A0j(__redex_internal_original_name, "start load for delayedForceUpdate after error");
            A05(fbUserSession, cc8, cHi2);
        }
    }

    public static void A07(2TV r301, C00i c00i, Cc8 cc8) {
        r301.C4X(cc8.A04, cc8.A06);
        ((2fD) c00i.get()).A00(cc8.A04, cc8.A06, "notifyLoadSucceeded", __redex_internal_original_name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d8, code lost:
    
        if (X.AbF.A0q(r302.A0L.get()).AZk(36318428138582608L) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A08(X.1He r301, X.Cc8 r302, X.CHi r303) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cc8.A08(X.1He, X.Cc8, X.CHi):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A09(com.facebook.fbservice.service.OperationResult r301, X.Cc8 r302, java.lang.String r303, boolean r304) {
        /*
            r0 = r301
            boolean r0 = r0.success
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L91
            android.os.Bundle r0 = X.1BK.A05()
            r306 = r0
            r0 = r306
            java.lang.String r1 = "thread_id"
            r2 = r303
            r0.putString(r1, r2)
            r0 = 0
            r307 = r0
            r0 = r301
            java.lang.Object r0 = r0.A08()
            r308 = r0
            r0 = r304
            if (r0 == 0) goto L7b
            r0 = r308
            com.facebook.messaging.service.model.FetchMoreMessagesResult r0 = (com.facebook.messaging.service.model.FetchMoreMessagesResult) r0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L4c
            r0 = r308
            com.facebook.messaging.model.messages.MessagesCollection r0 = r0.A02
            r308 = r0
        L39:
            r0 = r308
            if (r0 == 0) goto L4c
            r0 = r308
            com.google.common.collect.ImmutableList r0 = r0.A01
            r308 = r0
            r0 = r308
            int r0 = r0.size()
            r307 = r0
        L4c:
            r0 = r301
            android.os.Bundle r0 = r0.resultDataBundle
            java.lang.String r1 = "source"
            java.lang.String r0 = r0.getString(r1)
            r309 = r0
            r0 = r306
            java.lang.String r1 = "message_loading_data_source"
            r2 = r309
            r0.putString(r1, r2)
            r0 = r306
            java.lang.String r1 = "number_of_messages_loaded"
            r2 = r307
            r0.putInt(r1, r2)
            r0 = r302
            X.00i r0 = r0.A0O
            java.lang.Object r0 = r0.get()
            r0 = r303
            A0I(r0)
            return
        L7b:
            r0 = r308
            com.facebook.messaging.service.model.FetchThreadResult r0 = (com.facebook.messaging.service.model.FetchThreadResult) r0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L4c
            r0 = r308
            com.facebook.messaging.model.messages.MessagesCollection r0 = r0.A03
            r308 = r0
            goto L39
        L91:
            r0 = r301
            java.lang.Throwable r0 = r0.errorThrowable
            r308 = r0
            r0 = r302
            r1 = r303
            r2 = r308
            A0D(r0, r1, r2)
            r0 = r303
            A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cc8.A09(com.facebook.fbservice.service.OperationResult, X.Cc8, java.lang.String, boolean):void");
    }

    public static void A0A(Cc8 cc8, C3F c3f, CHi cHi) {
        AbstractC01593ro A0A = AbJ.A0A(AgQ.A00(1BK.A06(cc8.A0H)), "thread_view_loader_failure");
        if (A0A.A0B()) {
            A0A.A06("params", cHi.toString());
            A0A.A06("error", c3f.toString());
            A0A.A06("load_type", cHi.A06.name());
            A0A.A0A();
        }
    }

    public static void A0B(Cc8 cc8, Object obj) {
        1G1 r0 = (1G1) obj;
        0fH.A14("BIZ_VC_DEBUG", "ThreadViewLoader.loadThread() - logged_in_user == page_id is %b and context=%s", new Object[]{Boolean.valueOf(r0.A02.equals(r0.A05)), cc8.A09.toString()});
    }

    public static void A0C(Cc8 cc8, String str) {
        1BK.A05().putString("thread_id", str);
        cc8.A0O.get();
        new Bundle();
    }

    public static void A0D(Cc8 cc8, String str, Throwable th) {
        Bundle A05 = 1BK.A05();
        A05.putString("thread_id", str);
        A05.putSerializable("exception", th);
        cc8.A0O.get();
    }

    private void A0E(CHi cHi, String str, boolean z) {
        Bundle A05 = 1BK.A05();
        A05.putString("thread_id", str);
        A05.putBoolean("is_head_load", z);
        String str2 = cHi.A04.A04;
        if (str2 == null) {
            str2 = "unknown";
        }
        A05.putString("message_loading_trigger", str2);
        this.A0O.get();
    }

    public static void A0F(CHN chn, String str) {
        ImmutableList immutableList;
        if (0fH.A01.BTv(2)) {
            StringBuilder sb = new StringBuilder("Updating Result:\n");
            sb.append("Reason: ");
            sb.append(str);
            sb.append('\n');
            sb.append("DeliveryTimes:\n");
            ThreadSummary threadSummary = chn.A02;
            if (threadSummary != null) {
                1Du A12 = AbF.A12(threadSummary);
                while (A12.hasNext()) {
                    ThreadParticipant A0W = 4YU.A0W(A12);
                    sb.append("   ");
                    sb.append(C28p.A01(A0W));
                    sb.append(":");
                    sb.append(A0W.A01);
                    sb.append('\n');
                }
            }
            sb.append("Messages:\n");
            MessagesCollection messagesCollection = chn.A01;
            if (messagesCollection != null) {
                ImmutableList immutableList2 = messagesCollection.A01;
                if (!immutableList2.isEmpty() || ((immutableList = chn.A05) != null && !immutableList.isEmpty())) {
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i2 >= 10) {
                            break;
                        }
                        ImmutableList immutableList3 = chn.A05;
                        if (i4 >= immutableList3.size()) {
                            while (i < immutableList2.size()) {
                                Object obj = immutableList2.get(i);
                                sb.append("   ");
                                sb.append(obj);
                                sb.append("\n");
                                i2++;
                                i++;
                                if (i2 >= 10) {
                                    break;
                                }
                            }
                        } else {
                            Object obj2 = immutableList3.get(i4);
                            sb.append("   ");
                            sb.append(obj2);
                            sb.append("(PENDING) \n");
                            i2++;
                            i3 = i4 + 1;
                        }
                    }
                    0fH.A0m(__redex_internal_original_name, sb.toString());
                }
            }
            sb.append("    none\n");
            0fH.A0m(__redex_internal_original_name, sb.toString());
        }
    }

    private void A0G(String str) {
        1BK.A05().putString("message_loading_data_source", str);
        this.A0O.get();
    }

    public static void A0H(String str) {
        if (1BL.A0Q().AZk(36320970759421816L)) {
            2dU.A01((6Bw) null, new MessageListDataFetchFail(str.hashCode()));
        }
    }

    public static void A0I(String str) {
        if (1BL.A0Q().AZk(36320970759421816L)) {
            2dU.A01((6Bw) null, new MessageListDataFetchEnd(str.hashCode()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x011f, code lost:
    
        if (r302.A02 > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0J(X.CHi r302) {
        /*
            Method dump skipped, instructions count: 1545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cc8.A0J(X.CHi):void");
    }

    public void AEC() {
        AbF.A0b(this.A0C).A00(this.A04, (Object) null, "cancelLoad", __redex_internal_original_name);
        A04();
    }

    public void CmR(2TV r302) {
        0fH.A0g(r302, __redex_internal_original_name, "setCallback, %s");
        this.A02 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
