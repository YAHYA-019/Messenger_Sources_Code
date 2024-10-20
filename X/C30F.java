package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.inject.FbInjector;
import java.io.IOException;

/* renamed from: X.30F, reason: invalid class name */
/* loaded from: 30F.class */
public abstract class C30F {
    public static final 1Cg A00() {
        Context A00 = FbInjector.A00();
        try {
            C1jQ c1jQ = new C1jQ();
            c1jQ.A05(A00.getAssets(), 4);
            return new 1Cg(c1jQ.A03.A02);
        } catch (IOException unused) {
            return 1Cg.A00(C7t7.A00(), 4);
        }
    }

    public static final 1Cg A01() {
        Context A00 = FbInjector.A00();
        try {
            C1jQ c1jQ = new C1jQ();
            c1jQ.A05(A00.getAssets(), 2);
            return new 1Cg(c1jQ.A03.A02);
        } catch (IOException unused) {
            return 1Cg.A00(C7t7.A00(), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0606 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07d4 A[Catch: IOException -> 0x089a, all -> 0x08df, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x089a, blocks: (B:88:0x0167, B:91:0x0173, B:93:0x017a, B:95:0x0181, B:96:0x0186, B:97:0x018f, B:99:0x0196, B:100:0x019d, B:102:0x01a4, B:103:0x01a9, B:104:0x01b0, B:106:0x01b7, B:107:0x01be, B:108:0x01c3, B:108:0x01c3, B:110:0x01c8, B:111:0x01cf, B:112:0x01d4, B:112:0x01d4, B:115:0x01db, B:116:0x01e0, B:116:0x01e0, B:119:0x01e7, B:121:0x01f2, B:122:0x01f9, B:123:0x0200, B:127:0x0212, B:128:0x0219, B:129:0x0220, B:130:0x0227, B:132:0x0238, B:134:0x0243, B:136:0x024a, B:137:0x024f, B:139:0x0258, B:142:0x0266, B:143:0x026d, B:145:0x0278, B:149:0x0286, B:151:0x0291, B:152:0x0296, B:152:0x0296, B:155:0x02a1, B:157:0x02a8, B:158:0x02ad, B:160:0x02b9, B:164:0x02cb, B:165:0x02d2, B:168:0x02de, B:170:0x02e7, B:172:0x02ee, B:174:0x02f5, B:175:0x02fa, B:177:0x031a, B:180:0x0326, B:181:0x032d, B:183:0x0339, B:187:0x0351, B:189:0x035a, B:191:0x0365, B:401:0x0377, B:402:0x037e, B:406:0x038c, B:407:0x0391, B:411:0x039f, B:415:0x03b5, B:416:0x03ba, B:420:0x03c8, B:424:0x03d8, B:425:0x03dd, B:429:0x03ef, B:430:0x03f5, B:437:0x0412, B:438:0x0419, B:440:0x0422, B:451:0x0430, B:452:0x0437, B:454:0x0442, B:456:0x0449, B:458:0x0456, B:444:0x046c, B:446:0x0475, B:447:0x047e, B:448:0x0485, B:469:0x087c, B:471:0x0889, B:472:0x0890, B:365:0x0899, B:196:0x0496, B:368:0x04a2, B:375:0x04bf, B:378:0x04cb, B:380:0x04d7, B:382:0x04e2, B:383:0x04e9, B:384:0x04f0, B:386:0x04f9, B:388:0x0504, B:391:0x0514, B:200:0x051b, B:203:0x0527, B:211:0x0546, B:213:0x0551, B:218:0x057d, B:222:0x058b, B:223:0x058f, B:224:0x0596, B:226:0x059f, B:338:0x05ad, B:339:0x05b4, B:341:0x05bd, B:342:0x05c6, B:343:0x05cd, B:345:0x05d6, B:347:0x05e3, B:348:0x05ea, B:350:0x05f7, B:230:0x0606, B:231:0x060d, B:233:0x0616, B:236:0x0624, B:237:0x0629, B:239:0x0638, B:241:0x063f, B:242:0x0644, B:244:0x064d, B:245:0x0656, B:246:0x065d, B:248:0x0665, B:250:0x066c, B:254:0x067d, B:255:0x0682, B:259:0x0690, B:266:0x06d0, B:267:0x06d7, B:269:0x06e6, B:271:0x0747, B:273:0x074d, B:275:0x075b, B:283:0x0782, B:287:0x079b, B:291:0x07a7, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:299:0x07db, B:303:0x07e9, B:307:0x07f7, B:309:0x07fe, B:311:0x080b, B:313:0x0812, B:314:0x0817, B:316:0x0822, B:324:0x072a, B:325:0x0731, B:327:0x0740, B:328:0x06ee, B:329:0x06f5, B:331:0x0704, B:332:0x070c, B:333:0x0713, B:335:0x0722, B:354:0x0565, B:363:0x0831, B:491:0x0840, B:493:0x0848, B:494:0x084f, B:496:0x085e, B:498:0x0866, B:499:0x086d), top: B:87:0x0167, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x070c A[Catch: IOException -> 0x089a, all -> 0x08df, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x089a, blocks: (B:88:0x0167, B:91:0x0173, B:93:0x017a, B:95:0x0181, B:96:0x0186, B:97:0x018f, B:99:0x0196, B:100:0x019d, B:102:0x01a4, B:103:0x01a9, B:104:0x01b0, B:106:0x01b7, B:107:0x01be, B:108:0x01c3, B:108:0x01c3, B:110:0x01c8, B:111:0x01cf, B:112:0x01d4, B:112:0x01d4, B:115:0x01db, B:116:0x01e0, B:116:0x01e0, B:119:0x01e7, B:121:0x01f2, B:122:0x01f9, B:123:0x0200, B:127:0x0212, B:128:0x0219, B:129:0x0220, B:130:0x0227, B:132:0x0238, B:134:0x0243, B:136:0x024a, B:137:0x024f, B:139:0x0258, B:142:0x0266, B:143:0x026d, B:145:0x0278, B:149:0x0286, B:151:0x0291, B:152:0x0296, B:152:0x0296, B:155:0x02a1, B:157:0x02a8, B:158:0x02ad, B:160:0x02b9, B:164:0x02cb, B:165:0x02d2, B:168:0x02de, B:170:0x02e7, B:172:0x02ee, B:174:0x02f5, B:175:0x02fa, B:177:0x031a, B:180:0x0326, B:181:0x032d, B:183:0x0339, B:187:0x0351, B:189:0x035a, B:191:0x0365, B:401:0x0377, B:402:0x037e, B:406:0x038c, B:407:0x0391, B:411:0x039f, B:415:0x03b5, B:416:0x03ba, B:420:0x03c8, B:424:0x03d8, B:425:0x03dd, B:429:0x03ef, B:430:0x03f5, B:437:0x0412, B:438:0x0419, B:440:0x0422, B:451:0x0430, B:452:0x0437, B:454:0x0442, B:456:0x0449, B:458:0x0456, B:444:0x046c, B:446:0x0475, B:447:0x047e, B:448:0x0485, B:469:0x087c, B:471:0x0889, B:472:0x0890, B:365:0x0899, B:196:0x0496, B:368:0x04a2, B:375:0x04bf, B:378:0x04cb, B:380:0x04d7, B:382:0x04e2, B:383:0x04e9, B:384:0x04f0, B:386:0x04f9, B:388:0x0504, B:391:0x0514, B:200:0x051b, B:203:0x0527, B:211:0x0546, B:213:0x0551, B:218:0x057d, B:222:0x058b, B:223:0x058f, B:224:0x0596, B:226:0x059f, B:338:0x05ad, B:339:0x05b4, B:341:0x05bd, B:342:0x05c6, B:343:0x05cd, B:345:0x05d6, B:347:0x05e3, B:348:0x05ea, B:350:0x05f7, B:230:0x0606, B:231:0x060d, B:233:0x0616, B:236:0x0624, B:237:0x0629, B:239:0x0638, B:241:0x063f, B:242:0x0644, B:244:0x064d, B:245:0x0656, B:246:0x065d, B:248:0x0665, B:250:0x066c, B:254:0x067d, B:255:0x0682, B:259:0x0690, B:266:0x06d0, B:267:0x06d7, B:269:0x06e6, B:271:0x0747, B:273:0x074d, B:275:0x075b, B:283:0x0782, B:287:0x079b, B:291:0x07a7, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:299:0x07db, B:303:0x07e9, B:307:0x07f7, B:309:0x07fe, B:311:0x080b, B:313:0x0812, B:314:0x0817, B:316:0x0822, B:324:0x072a, B:325:0x0731, B:327:0x0740, B:328:0x06ee, B:329:0x06f5, B:331:0x0704, B:332:0x070c, B:333:0x0713, B:335:0x0722, B:354:0x0565, B:363:0x0831, B:491:0x0840, B:493:0x0848, B:494:0x084f, B:496:0x085e, B:498:0x0866, B:499:0x086d), top: B:87:0x0167, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x04cb A[Catch: IOException -> 0x089a, all -> 0x08df, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x089a, blocks: (B:88:0x0167, B:91:0x0173, B:93:0x017a, B:95:0x0181, B:96:0x0186, B:97:0x018f, B:99:0x0196, B:100:0x019d, B:102:0x01a4, B:103:0x01a9, B:104:0x01b0, B:106:0x01b7, B:107:0x01be, B:108:0x01c3, B:108:0x01c3, B:110:0x01c8, B:111:0x01cf, B:112:0x01d4, B:112:0x01d4, B:115:0x01db, B:116:0x01e0, B:116:0x01e0, B:119:0x01e7, B:121:0x01f2, B:122:0x01f9, B:123:0x0200, B:127:0x0212, B:128:0x0219, B:129:0x0220, B:130:0x0227, B:132:0x0238, B:134:0x0243, B:136:0x024a, B:137:0x024f, B:139:0x0258, B:142:0x0266, B:143:0x026d, B:145:0x0278, B:149:0x0286, B:151:0x0291, B:152:0x0296, B:152:0x0296, B:155:0x02a1, B:157:0x02a8, B:158:0x02ad, B:160:0x02b9, B:164:0x02cb, B:165:0x02d2, B:168:0x02de, B:170:0x02e7, B:172:0x02ee, B:174:0x02f5, B:175:0x02fa, B:177:0x031a, B:180:0x0326, B:181:0x032d, B:183:0x0339, B:187:0x0351, B:189:0x035a, B:191:0x0365, B:401:0x0377, B:402:0x037e, B:406:0x038c, B:407:0x0391, B:411:0x039f, B:415:0x03b5, B:416:0x03ba, B:420:0x03c8, B:424:0x03d8, B:425:0x03dd, B:429:0x03ef, B:430:0x03f5, B:437:0x0412, B:438:0x0419, B:440:0x0422, B:451:0x0430, B:452:0x0437, B:454:0x0442, B:456:0x0449, B:458:0x0456, B:444:0x046c, B:446:0x0475, B:447:0x047e, B:448:0x0485, B:469:0x087c, B:471:0x0889, B:472:0x0890, B:365:0x0899, B:196:0x0496, B:368:0x04a2, B:375:0x04bf, B:378:0x04cb, B:380:0x04d7, B:382:0x04e2, B:383:0x04e9, B:384:0x04f0, B:386:0x04f9, B:388:0x0504, B:391:0x0514, B:200:0x051b, B:203:0x0527, B:211:0x0546, B:213:0x0551, B:218:0x057d, B:222:0x058b, B:223:0x058f, B:224:0x0596, B:226:0x059f, B:338:0x05ad, B:339:0x05b4, B:341:0x05bd, B:342:0x05c6, B:343:0x05cd, B:345:0x05d6, B:347:0x05e3, B:348:0x05ea, B:350:0x05f7, B:230:0x0606, B:231:0x060d, B:233:0x0616, B:236:0x0624, B:237:0x0629, B:239:0x0638, B:241:0x063f, B:242:0x0644, B:244:0x064d, B:245:0x0656, B:246:0x065d, B:248:0x0665, B:250:0x066c, B:254:0x067d, B:255:0x0682, B:259:0x0690, B:266:0x06d0, B:267:0x06d7, B:269:0x06e6, B:271:0x0747, B:273:0x074d, B:275:0x075b, B:283:0x0782, B:287:0x079b, B:291:0x07a7, B:293:0x07c4, B:295:0x07ca, B:298:0x07d4, B:299:0x07db, B:303:0x07e9, B:307:0x07f7, B:309:0x07fe, B:311:0x080b, B:313:0x0812, B:314:0x0817, B:316:0x0822, B:324:0x072a, B:325:0x0731, B:327:0x0740, B:328:0x06ee, B:329:0x06f5, B:331:0x0704, B:332:0x070c, B:333:0x0713, B:335:0x0722, B:354:0x0565, B:363:0x0831, B:491:0x0840, B:493:0x0848, B:494:0x084f, B:496:0x085e, B:498:0x0866, B:499:0x086d), top: B:87:0x0167, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x046c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0430 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.1Cg A02(int r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 2679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30F.A02(int, boolean):X.1Cg");
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.1jF] */
    public static final 1jF A03() {
        AssetManager assets = FbInjector.A00().getAssets();
        byte[] A04 = 1jH.A04(assets, "params_map_v4_u0.txt");
        if (A04 == null) {
            A04 = 1jH.A04(assets, 0Pz.A0j("params_map", "", OptSvcAnalyticsStore.FILE_SUFFIX));
        }
        C1jQ c1jQ = new C1jQ();
        c1jQ.A0B = true;
        c1jQ.A06(A04, 2);
        int i = c1jQ.A02.A04;
        int[] iArr = c1jQ.A0D;
        ?? obj = new Object();
        ((1jF) obj).A00 = i;
        ((1jF) obj).A01 = iArr;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.1jF] */
    public static final 1jF A04() {
        AssetManager assets = FbInjector.A00().getAssets();
        byte[] A04 = 1jH.A04(assets, 1jH.A02(4));
        if (A04 == null) {
            A04 = 1jH.A04(assets, 0Pz.A0j("params_map", "_kMobileConfigAdminId", OptSvcAnalyticsStore.FILE_SUFFIX));
        }
        C1jQ c1jQ = new C1jQ();
        c1jQ.A0B = true;
        c1jQ.A06(A04, 4);
        int i = c1jQ.A02.A04;
        int[] iArr = c1jQ.A0D;
        ?? obj = new Object();
        ((1jF) obj).A00 = i;
        ((1jF) obj).A01 = iArr;
        return obj;
    }
}
