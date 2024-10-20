package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.UserKey;

/* renamed from: X.60a, reason: invalid class name */
/* loaded from: 60a.class */
public final class C60a {
    public 1BY A00;
    public final C60e A03;
    public final FbUserSession A04;
    public final 60P A0A;
    public final C60d A0C;
    public final UserKey A0D;
    public final C12114ys A07 = (C12114ys) 1Bi.A03(49420);
    public final C60b A09 = (C60b) 1Bn.A0E((Context) null, (1BY) null, 82380);
    public final 60N A08 = (60N) 1Bi.A03(49924);
    public final C00i A01 = new 1BQ(33013);
    public final C00i A06 = new 1BV((1BY) null, 66297);
    public final C00i A05 = new 1BV((1BY) null, 99855);
    public final C00i A02 = new 1BQ(16385);
    public final C60c A0B = (C60c) 1Bi.A03(49931);

    public C60a(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A0D = new UserKey(1Js.A03, ((1G1) fbUserSession).A05);
        this.A0A = (60P) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 49926);
        this.A0C = (C60d) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 49932);
        this.A03 = (C60e) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 66695);
        this.A04 = fbUserSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x035c, code lost:
    
        if (r303.A0G == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06b9, code lost:
    
        if (r0.equals(r0.id) == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x08ee, code lost:
    
        if (r0.A02.equals(r0) != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016b, code lost:
    
        if (r0 != 3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0191, code lost:
    
        r307 = 2131960429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018e, code lost:
    
        if (r0.A0G != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa A[Catch: all -> 0x0bcb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0bcb, blocks: (B:3:0x0012, B:5:0x001d, B:6:0x0023, B:7:0x0029, B:9:0x0032, B:11:0x003c, B:14:0x0048, B:15:0x004e, B:17:0x005b, B:18:0x0062, B:19:0x0069, B:22:0x0075, B:23:0x007c, B:25:0x008a, B:28:0x0098, B:29:0x009f, B:34:0x00b5, B:35:0x00be, B:36:0x00c5, B:37:0x00cc, B:40:0x00d8, B:42:0x00e1, B:46:0x00ed, B:48:0x0101, B:50:0x0109, B:52:0x0117, B:53:0x011e, B:55:0x0125, B:56:0x012c, B:59:0x0138, B:62:0x0144, B:66:0x019e, B:69:0x01aa, B:71:0x01b3, B:72:0x01ba, B:74:0x01c1, B:78:0x01d4, B:86:0x0179, B:89:0x0185, B:96:0x01db, B:97:0x01e2, B:98:0x01e7, B:99:0x01ec, B:99:0x01ec, B:101:0x01f1, B:103:0x01f8, B:105:0x0201, B:106:0x0208, B:109:0x0216, B:110:0x021f, B:111:0x0226, B:114:0x0235, B:115:0x023c, B:116:0x0243, B:117:0x024a, B:118:0x0251, B:119:0x0258, B:121:0x0276, B:123:0x027d, B:127:0x029d, B:129:0x02a6, B:130:0x02ad, B:131:0x02b4, B:135:0x02d0, B:152:0x02f5, B:147:0x0300, B:158:0x028d, B:160:0x0296, B:162:0x0311, B:164:0x031e, B:166:0x0325, B:167:0x032a, B:169:0x0334, B:171:0x033c, B:173:0x0344, B:176:0x0350, B:179:0x0362, B:181:0x036b, B:182:0x0372, B:184:0x037b, B:185:0x0382, B:187:0x038b, B:188:0x0392, B:190:0x039b, B:191:0x03a2, B:192:0x03a9, B:194:0x03c1, B:195:0x03c8, B:198:0x03d4, B:200:0x03db, B:203:0x03e7, B:204:0x03ee, B:205:0x03f5, B:207:0x03fe, B:208:0x0405, B:209:0x040c, B:210:0x0411, B:211:0x0416, B:213:0x0429, B:214:0x0430, B:215:0x0437, B:220:0x04c1, B:221:0x04c8, B:226:0x04e5, B:228:0x04ec, B:231:0x04f8, B:233:0x0501, B:234:0x0508, B:237:0x0514, B:241:0x0522, B:242:0x0529, B:244:0x0534, B:246:0x053f, B:249:0x0546, B:251:0x0554, B:254:0x057b, B:258:0x0592, B:260:0x059d, B:261:0x05a4, B:262:0x05ab, B:263:0x05b2, B:265:0x05e9, B:266:0x05f0, B:268:0x05fd, B:269:0x0602, B:269:0x0602, B:271:0x0607, B:272:0x060e, B:274:0x0619, B:275:0x0620, B:277:0x0627, B:278:0x062c, B:280:0x0635, B:282:0x0640, B:284:0x064b, B:286:0x0652, B:288:0x0659, B:290:0x0664, B:292:0x066f, B:294:0x0676, B:295:0x067b, B:300:0x068c, B:303:0x0698, B:306:0x06a4, B:308:0x06ad, B:312:0x06c4, B:314:0x06cb, B:316:0x06d2, B:318:0x06db, B:320:0x06e2, B:321:0x06e9, B:323:0x06f4, B:325:0x06fd, B:326:0x0704, B:328:0x070d, B:329:0x0714, B:330:0x071b, B:333:0x0728, B:336:0x0734, B:340:0x0746, B:342:0x0757, B:343:0x075e, B:347:0x0771, B:348:0x0778, B:349:0x077f, B:350:0x0784, B:352:0x078d, B:353:0x0794, B:357:0x07a4, B:359:0x0838, B:361:0x07ad, B:363:0x07b4, B:365:0x07bb, B:368:0x07c7, B:370:0x07ce, B:372:0x07d5, B:374:0x07dc, B:376:0x07e5, B:377:0x07ec, B:379:0x07f5, B:381:0x07fe, B:382:0x0805, B:384:0x080e, B:389:0x0858, B:391:0x0863, B:393:0x086e, B:395:0x0879, B:397:0x0880, B:399:0x0887, B:400:0x0890, B:403:0x089c, B:405:0x08a3, B:410:0x08b8, B:412:0x08bf, B:415:0x08c9, B:416:0x08d0, B:419:0x08dc, B:421:0x08e5, B:425:0x08f3, B:427:0x08fd, B:429:0x0905, B:431:0x090e, B:433:0x0919, B:435:0x0920, B:437:0x0927, B:439:0x092e, B:440:0x0933, B:441:0x093c, B:443:0x094a, B:446:0x0958, B:447:0x095f, B:449:0x0968, B:451:0x0971, B:453:0x097c, B:455:0x0983, B:456:0x0988, B:458:0x0991, B:460:0x0998, B:461:0x099d, B:462:0x09a6, B:463:0x09ad, B:464:0x09b4, B:465:0x09bb, B:466:0x09c2, B:468:0x09cb, B:470:0x09d4, B:472:0x09db, B:474:0x09e2, B:476:0x09e9, B:478:0x09f0, B:480:0x09f7, B:481:0x09fc, B:485:0x0a83, B:486:0x0a8b, B:487:0x0a92, B:489:0x0a9b, B:491:0x0aa2, B:496:0x0ad5, B:498:0x0adc, B:500:0x0ae3, B:502:0x0aeb, B:503:0x0af2, B:504:0x0af9, B:506:0x0b02, B:508:0x0b09, B:510:0x0b10, B:512:0x0b17, B:514:0x0b1e, B:516:0x0b25, B:517:0x0b2c, B:519:0x0b33, B:521:0x0b3a, B:525:0x0b59, B:526:0x0b60, B:527:0x0b65, B:527:0x0b65, B:530:0x0b6c, B:532:0x0b7d, B:533:0x0b84, B:535:0x0b8b, B:536:0x0b92, B:537:0x0b97, B:537:0x0b97, B:540:0x0b9e, B:542:0x0ba5, B:545:0x0baf, B:547:0x0bbe, B:553:0x0b50, B:555:0x0abd, B:556:0x0ac5, B:557:0x0acc, B:559:0x0a0b, B:560:0x0a12, B:561:0x0a1b, B:562:0x0a22, B:564:0x0a37, B:565:0x0a3e, B:566:0x0a45, B:567:0x0a4c, B:568:0x0a55, B:570:0x0a5e, B:571:0x0a6a, B:573:0x0818, B:576:0x0824, B:577:0x082c, B:582:0x0454, B:584:0x045b, B:587:0x0467, B:589:0x0470, B:590:0x0477, B:593:0x0483, B:597:0x0491, B:598:0x0498, B:600:0x04a3, B:602:0x04ae), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass622 A00(com.facebook.messaging.model.messages.Message r302, X.60I r303, X.60W r304, java.lang.Integer r305) {
        /*
            Method dump skipped, instructions count: 3030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60a.A00(com.facebook.messaging.model.messages.Message, X.60I, X.60W, java.lang.Integer):X.622");
    }
}
