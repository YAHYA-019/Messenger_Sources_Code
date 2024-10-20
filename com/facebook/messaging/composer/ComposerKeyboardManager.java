package com.facebook.messaging.composer;

import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Fv;
import X.1HH;
import X.1Lo;
import X.1pK;
import X.2Oc;
import X.2S4;
import X.53U;
import X.5T8;
import X.5zD;
import X.67O;
import X.6QS;
import X.6QZ;
import X.6Qb;
import X.6Qc;
import X.6Qf;
import X.6Qg;
import X.6R7;
import X.6R8;
import X.6R9;
import X.6RA;
import X.6RB;
import X.6Sp;
import X.6fA;
import X.C00i;
import X.C1Y6;
import X.C7aX;
import X.C7aY;
import X.H9x;
import X.Hjm;
import X.Hrr;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.ui.keyboard.CustomKeyboardLayout;
import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: ComposerKeyboardManager.class */
public final class ComposerKeyboardManager {
    public CustomKeyboardLayout A00;
    public 1BY A01;
    public 67O A02;
    public Hjm A03;
    public 6fA A04;
    public ComposerInitParamsSpec$ComposerLaunchSource A05;
    public 5zD A06;
    public MigColorScheme A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final FbUserSession A0B;
    public final 1pK A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final 6Qg A0I;
    public final 6RB A0J;
    public final Map A0K;
    public final Context A0L;
    public final C00i A0M = new 1BV((1BY) null, 148038);
    public final C00i A0N;
    public final 6R7 A0O;

    public ComposerKeyboardManager(LifecycleOwner lifecycleOwner, 1pK r303, 2S4 r304, 1BO r305, 6Qc r306, 6Qg r307, 6QZ r308, 6Qb r309, 6Qf r310, 53U r311) {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A0L = context;
        this.A0F = new 1HH(context, 100189);
        this.A0N = new 1BV((1BY) null, 17019);
        this.A0D = new 1BQ(116048);
        this.A0G = new 1BQ(16766);
        this.A0H = new 1BQ(16973);
        this.A0E = new 1BQ(16511);
        this.A05 = ComposerInitParamsSpec$ComposerLaunchSource.A06;
        6R7 r0 = new 6R7(this);
        this.A0O = r0;
        this.A01 = new 1BY(r305);
        this.A0C = r303;
        6QS r02 = r306.A00;
        this.A07 = r02.A0O.Axg();
        FbUserSession A06 = ((1Fv) 1Bi.A03(66351)).A06(r303);
        this.A0B = A06;
        this.A06 = r02.A0O;
        this.A0I = r307;
        this.A0K = new HashMap();
        this.A02 = new 6R8(this);
        this.A0J = new 6RB((6R9) C1Y6.A00(r303.getContext(), "com_facebook_messaging_composer_plugins_interfaces_keyboard_ComposerKeyboardFactoryInterfaceSpec", "All", new Object[]{r304, r311, r310, r308, r309, r306, r0, r303.mFragmentManager, lifecycleOwner, A06}));
    }

    public static int A00(6RA r301, AtomicInteger atomicInteger) {
        6RA.A00(r301);
        return atomicInteger.getAndIncrement();
    }

    public static CustomKeyboardLayout A01(ComposerKeyboardManager composerKeyboardManager) {
        CustomKeyboardLayout customKeyboardLayout = composerKeyboardManager.A00;
        if (customKeyboardLayout == null) {
            composerKeyboardManager.A0M.get();
            1pK r0 = composerKeyboardManager.A0C;
            2Oc r302 = (2Oc) r0.CaT(2Oc.class);
            if (r302 == null) {
                View rootView = r0.requireView().getRootView();
                if (rootView instanceof 2Oc) {
                    r302 = (2Oc) rootView;
                } else {
                    customKeyboardLayout = (CustomKeyboardLayout) rootView.findViewById(2131363501);
                    composerKeyboardManager.A00 = customKeyboardLayout;
                    customKeyboardLayout.A03 = new C7aY(composerKeyboardManager);
                    customKeyboardLayout.A04 = new C7aX(composerKeyboardManager);
                }
            }
            customKeyboardLayout = r302.AgH();
            composerKeyboardManager.A00 = customKeyboardLayout;
            customKeyboardLayout.A03 = new C7aY(composerKeyboardManager);
            customKeyboardLayout.A04 = new C7aX(composerKeyboardManager);
        }
        return customKeyboardLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x04a4 A[Catch: Exception -> 0x07be, all -> 0x07d8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x07be, blocks: (B:193:0x0447, B:197:0x0455, B:200:0x0461, B:203:0x04a4, B:204:0x04ab, B:205:0x04b2, B:207:0x04bb, B:208:0x04c2, B:209:0x04c7, B:209:0x04c7, B:212:0x04ce, B:213:0x04e2, B:220:0x04d6, B:222:0x04dd, B:223:0x046b, B:224:0x0470, B:227:0x047c, B:230:0x0486, B:232:0x0498), top: B:192:0x0447, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d6 A[Catch: Exception -> 0x07be, all -> 0x07d8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x07be, blocks: (B:193:0x0447, B:197:0x0455, B:200:0x0461, B:203:0x04a4, B:204:0x04ab, B:205:0x04b2, B:207:0x04bb, B:208:0x04c2, B:209:0x04c7, B:209:0x04c7, B:212:0x04ce, B:213:0x04e2, B:220:0x04d6, B:222:0x04dd, B:223:0x046b, B:224:0x0470, B:227:0x047c, B:230:0x0486, B:232:0x0498), top: B:192:0x0447, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(X.Hjm r302, X.H9x r303) {
        /*
            Method dump skipped, instructions count: 2863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.ComposerKeyboardManager.A02(X.Hjm, X.H9x):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:1041:0x1427 A[Catch: Exception -> 0x1bfa, all -> 0x1c14, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x1bfa, blocks: (B:1031:0x13ce, B:1035:0x13dc, B:1038:0x13e8, B:1041:0x1427, B:1043:0x142e, B:1044:0x1442, B:1049:0x1436, B:1051:0x143d, B:1052:0x13f2, B:1053:0x13f7, B:1056:0x1403, B:1059:0x140d, B:1061:0x141b), top: B:1030:0x13ce, outer: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:1049:0x1436 A[Catch: Exception -> 0x1bfa, all -> 0x1c14, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x1bfa, blocks: (B:1031:0x13ce, B:1035:0x13dc, B:1038:0x13e8, B:1041:0x1427, B:1043:0x142e, B:1044:0x1442, B:1049:0x1436, B:1051:0x143d, B:1052:0x13f2, B:1053:0x13f7, B:1056:0x1403, B:1059:0x140d, B:1061:0x141b), top: B:1030:0x13ce, outer: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:1119:0x157e A[Catch: Exception -> 0x1c4d, all -> 0x1c67, TRY_ENTER, TRY_LEAVE, TryCatch #29 {Exception -> 0x1c4d, blocks: (B:1109:0x1525, B:1113:0x1533, B:1116:0x153f, B:1119:0x157e, B:1121:0x1585, B:1122:0x1599, B:1127:0x158d, B:1129:0x1594, B:1130:0x1549, B:1131:0x154e, B:1134:0x155a, B:1137:0x1564, B:1139:0x1572), top: B:1108:0x1525, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1127:0x158d A[Catch: Exception -> 0x1c4d, all -> 0x1c67, TRY_ENTER, TRY_LEAVE, TryCatch #29 {Exception -> 0x1c4d, blocks: (B:1109:0x1525, B:1113:0x1533, B:1116:0x153f, B:1119:0x157e, B:1121:0x1585, B:1122:0x1599, B:1127:0x158d, B:1129:0x1594, B:1130:0x1549, B:1131:0x154e, B:1134:0x155a, B:1137:0x1564, B:1139:0x1572), top: B:1108:0x1525, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1196:0x16d1 A[Catch: Exception -> 0x1ca0, all -> 0x1cba, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x1ca0, blocks: (B:1186:0x1678, B:1190:0x1686, B:1193:0x1692, B:1196:0x16d1, B:1198:0x16d8, B:1199:0x16ec, B:1204:0x16e0, B:1206:0x16e7, B:1207:0x169c, B:1208:0x16a1, B:1211:0x16ad, B:1214:0x16b7, B:1216:0x16c5), top: B:1185:0x1678, outer: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:1204:0x16e0 A[Catch: Exception -> 0x1ca0, all -> 0x1cba, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x1ca0, blocks: (B:1186:0x1678, B:1190:0x1686, B:1193:0x1692, B:1196:0x16d1, B:1198:0x16d8, B:1199:0x16ec, B:1204:0x16e0, B:1206:0x16e7, B:1207:0x169c, B:1208:0x16a1, B:1211:0x16ad, B:1214:0x16b7, B:1216:0x16c5), top: B:1185:0x1678, outer: #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x1801  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d9 A[Catch: Exception -> 0x1929, all -> 0x1943, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x1929, blocks: (B:163:0x0480, B:167:0x048e, B:170:0x049a, B:173:0x04d9, B:175:0x04e8, B:176:0x04ef, B:177:0x04f6, B:178:0x04fd, B:179:0x0504, B:184:0x0519, B:186:0x051e, B:187:0x0523, B:188:0x0528, B:188:0x0528, B:191:0x052f, B:192:0x0543, B:198:0x191e, B:200:0x1923, B:202:0x1928, B:203:0x0537, B:205:0x053e, B:206:0x04a4, B:207:0x04a9, B:210:0x04b5, B:213:0x04bf, B:215:0x04cd), top: B:162:0x0480, outer: #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0537 A[Catch: Exception -> 0x1929, all -> 0x1943, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x1929, blocks: (B:163:0x0480, B:167:0x048e, B:170:0x049a, B:173:0x04d9, B:175:0x04e8, B:176:0x04ef, B:177:0x04f6, B:178:0x04fd, B:179:0x0504, B:184:0x0519, B:186:0x051e, B:187:0x0523, B:188:0x0528, B:188:0x0528, B:191:0x052f, B:192:0x0543, B:198:0x191e, B:200:0x1923, B:202:0x1928, B:203:0x0537, B:205:0x053e, B:206:0x04a4, B:207:0x04a9, B:210:0x04b5, B:213:0x04bf, B:215:0x04cd), top: B:162:0x0480, outer: #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x066f A[Catch: Exception -> 0x195d, all -> 0x1977, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x195d, blocks: (B:261:0x0616, B:265:0x0624, B:268:0x0630, B:271:0x066f, B:272:0x0676, B:273:0x067d, B:274:0x0684, B:275:0x068b, B:276:0x0692, B:278:0x06ad, B:279:0x06b4, B:280:0x06b9, B:280:0x06b9, B:283:0x06c0, B:284:0x06d4, B:289:0x06c8, B:291:0x06cf, B:292:0x063a, B:293:0x063f, B:296:0x064b, B:299:0x0655, B:301:0x0663), top: B:260:0x0616, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06c8 A[Catch: Exception -> 0x195d, all -> 0x1977, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x195d, blocks: (B:261:0x0616, B:265:0x0624, B:268:0x0630, B:271:0x066f, B:272:0x0676, B:273:0x067d, B:274:0x0684, B:275:0x068b, B:276:0x0692, B:278:0x06ad, B:279:0x06b4, B:280:0x06b9, B:280:0x06b9, B:283:0x06c0, B:284:0x06d4, B:289:0x06c8, B:291:0x06cf, B:292:0x063a, B:293:0x063f, B:296:0x064b, B:299:0x0655, B:301:0x0663), top: B:260:0x0616, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x080c A[Catch: Exception -> 0x19a4, all -> 0x19be, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x19a4, blocks: (B:347:0x07b3, B:351:0x07c1, B:354:0x07cd, B:357:0x080c, B:358:0x0813, B:359:0x081a, B:360:0x0821, B:361:0x0828, B:362:0x082f, B:364:0x084a, B:365:0x0851, B:366:0x0856, B:366:0x0856, B:369:0x085d, B:370:0x0871, B:375:0x0865, B:377:0x086c, B:378:0x07d7, B:379:0x07dc, B:382:0x07e8, B:385:0x07f2, B:387:0x0800), top: B:346:0x07b3, outer: #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0865 A[Catch: Exception -> 0x19a4, all -> 0x19be, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x19a4, blocks: (B:347:0x07b3, B:351:0x07c1, B:354:0x07cd, B:357:0x080c, B:358:0x0813, B:359:0x081a, B:360:0x0821, B:361:0x0828, B:362:0x082f, B:364:0x084a, B:365:0x0851, B:366:0x0856, B:366:0x0856, B:369:0x085d, B:370:0x0871, B:375:0x0865, B:377:0x086c, B:378:0x07d7, B:379:0x07dc, B:382:0x07e8, B:385:0x07f2, B:387:0x0800), top: B:346:0x07b3, outer: #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x09a8 A[Catch: Exception -> 0x19eb, all -> 0x1a05, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x19eb, blocks: (B:433:0x094f, B:437:0x095d, B:440:0x0969, B:443:0x09a8, B:445:0x09af, B:446:0x09c3, B:451:0x09b7, B:453:0x09be, B:454:0x0973, B:455:0x0978, B:458:0x0984, B:461:0x098e, B:463:0x099c), top: B:432:0x094f, outer: #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x09b7 A[Catch: Exception -> 0x19eb, all -> 0x1a05, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x19eb, blocks: (B:433:0x094f, B:437:0x095d, B:440:0x0969, B:443:0x09a8, B:445:0x09af, B:446:0x09c3, B:451:0x09b7, B:453:0x09be, B:454:0x0973, B:455:0x0978, B:458:0x0984, B:461:0x098e, B:463:0x099c), top: B:432:0x094f, outer: #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0ae9 A[Catch: Exception -> 0x1a4b, all -> 0x1a65, TRY_ENTER, TRY_LEAVE, TryCatch #34 {Exception -> 0x1a4b, blocks: (B:506:0x0a90, B:510:0x0a9e, B:513:0x0aaa, B:516:0x0ae9, B:518:0x0af8, B:519:0x0aff, B:520:0x0b06, B:521:0x0b0d, B:522:0x0b14, B:523:0x0b1b, B:524:0x0b22, B:525:0x0b29, B:530:0x0b52, B:532:0x0b57, B:533:0x0b5c, B:534:0x0b61, B:534:0x0b61, B:537:0x0b68, B:538:0x0b7c, B:544:0x1a40, B:546:0x1a45, B:548:0x1a4a, B:549:0x0b70, B:551:0x0b77, B:552:0x0ab4, B:553:0x0ab9, B:556:0x0ac5, B:559:0x0acf, B:561:0x0add), top: B:505:0x0a90, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x026f A[Catch: Exception -> 0x18cd, all -> 0x18e7, TRY_ENTER, TRY_LEAVE, TryCatch #32 {Exception -> 0x18cd, blocks: (B:42:0x0216, B:46:0x0224, B:49:0x0230, B:52:0x026f, B:53:0x0276, B:55:0x0285, B:56:0x028b, B:58:0x0295, B:60:0x02a3, B:61:0x02aa, B:62:0x02b1, B:65:0x02bd, B:66:0x02c4, B:67:0x02cb, B:70:0x02d7, B:72:0x02de, B:73:0x02f2, B:78:0x02e6, B:80:0x02ed, B:81:0x023a, B:82:0x023f, B:85:0x024b, B:88:0x0255, B:90:0x0263), top: B:41:0x0216, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0b70 A[Catch: Exception -> 0x1a4b, all -> 0x1a65, TRY_ENTER, TRY_LEAVE, TryCatch #34 {Exception -> 0x1a4b, blocks: (B:506:0x0a90, B:510:0x0a9e, B:513:0x0aaa, B:516:0x0ae9, B:518:0x0af8, B:519:0x0aff, B:520:0x0b06, B:521:0x0b0d, B:522:0x0b14, B:523:0x0b1b, B:524:0x0b22, B:525:0x0b29, B:530:0x0b52, B:532:0x0b57, B:533:0x0b5c, B:534:0x0b61, B:534:0x0b61, B:537:0x0b68, B:538:0x0b7c, B:544:0x1a40, B:546:0x1a45, B:548:0x1a4a, B:549:0x0b70, B:551:0x0b77, B:552:0x0ab4, B:553:0x0ab9, B:556:0x0ac5, B:559:0x0acf, B:561:0x0add), top: B:505:0x0a90, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0d19 A[Catch: Exception -> 0x1a94, all -> 0x1aae, TRY_ENTER, TRY_LEAVE, TryCatch #37 {Exception -> 0x1a94, blocks: (B:616:0x0c8e, B:620:0x0c9c, B:623:0x0ca8, B:626:0x0d19, B:627:0x0d20, B:628:0x0d27, B:629:0x0d2e, B:630:0x0d35, B:632:0x0d42, B:633:0x0d49, B:634:0x0d4e, B:634:0x0d4e, B:637:0x0d55, B:638:0x0d69, B:643:0x0d5d, B:645:0x0d64, B:646:0x0cb2, B:647:0x0cb7, B:650:0x0cc3, B:653:0x0ccd, B:654:0x0cd7, B:657:0x0ce3, B:659:0x0cf2, B:660:0x0cf9, B:662:0x0d02, B:665:0x0d0d), top: B:615:0x0c8e, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0d5d A[Catch: Exception -> 0x1a94, all -> 0x1aae, TRY_ENTER, TRY_LEAVE, TryCatch #37 {Exception -> 0x1a94, blocks: (B:616:0x0c8e, B:620:0x0c9c, B:623:0x0ca8, B:626:0x0d19, B:627:0x0d20, B:628:0x0d27, B:629:0x0d2e, B:630:0x0d35, B:632:0x0d42, B:633:0x0d49, B:634:0x0d4e, B:634:0x0d4e, B:637:0x0d55, B:638:0x0d69, B:643:0x0d5d, B:645:0x0d64, B:646:0x0cb2, B:647:0x0cb7, B:650:0x0cc3, B:653:0x0ccd, B:654:0x0cd7, B:657:0x0ce3, B:659:0x0cf2, B:660:0x0cf9, B:662:0x0d02, B:665:0x0d0d), top: B:615:0x0c8e, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0ea2 A[Catch: Exception -> 0x1ae3, all -> 0x1afd, TRY_ENTER, TRY_LEAVE, TryCatch #25 {Exception -> 0x1ae3, blocks: (B:710:0x0e49, B:714:0x0e57, B:717:0x0e63, B:720:0x0ea2, B:722:0x0ea9, B:723:0x0ebd, B:728:0x0eb1, B:730:0x0eb8, B:731:0x0e6d, B:732:0x0e72, B:735:0x0e7e, B:738:0x0e88, B:740:0x0e96), top: B:709:0x0e49, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0eb1 A[Catch: Exception -> 0x1ae3, all -> 0x1afd, TRY_ENTER, TRY_LEAVE, TryCatch #25 {Exception -> 0x1ae3, blocks: (B:710:0x0e49, B:714:0x0e57, B:717:0x0e63, B:720:0x0ea2, B:722:0x0ea9, B:723:0x0ebd, B:728:0x0eb1, B:730:0x0eb8, B:731:0x0e6d, B:732:0x0e72, B:735:0x0e7e, B:738:0x0e88, B:740:0x0e96), top: B:709:0x0e49, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:808:0x109f A[Catch: Exception -> 0x1b64, all -> 0x1b7e, TRY_ENTER, TRY_LEAVE, TryCatch #21 {Exception -> 0x1b64, blocks: (B:798:0x0ffa, B:802:0x1008, B:805:0x1014, B:808:0x109f, B:810:0x10ae, B:811:0x10b5, B:812:0x10bc, B:813:0x10c3, B:814:0x10ca, B:815:0x10d1, B:826:0x1103, B:828:0x1108, B:829:0x110d, B:830:0x1112, B:830:0x1112, B:833:0x1119, B:834:0x112d, B:840:0x1b38, B:842:0x1b3d, B:844:0x1b42, B:845:0x1121, B:847:0x1128, B:848:0x101e, B:849:0x1023, B:852:0x102f, B:855:0x1039, B:856:0x1043, B:861:0x108e, B:861:0x108e, B:863:0x1093, B:864:0x1054, B:866:0x1066, B:874:0x1089, B:882:0x1b4f, B:884:0x1b5c, B:886:0x1b63), top: B:797:0x0ffa, outer: #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:845:0x1121 A[Catch: Exception -> 0x1b64, all -> 0x1b7e, TRY_ENTER, TRY_LEAVE, TryCatch #21 {Exception -> 0x1b64, blocks: (B:798:0x0ffa, B:802:0x1008, B:805:0x1014, B:808:0x109f, B:810:0x10ae, B:811:0x10b5, B:812:0x10bc, B:813:0x10c3, B:814:0x10ca, B:815:0x10d1, B:826:0x1103, B:828:0x1108, B:829:0x110d, B:830:0x1112, B:830:0x1112, B:833:0x1119, B:834:0x112d, B:840:0x1b38, B:842:0x1b3d, B:844:0x1b42, B:845:0x1121, B:847:0x1128, B:848:0x101e, B:849:0x1023, B:852:0x102f, B:855:0x1039, B:856:0x1043, B:861:0x108e, B:861:0x108e, B:863:0x1093, B:864:0x1054, B:866:0x1066, B:874:0x1089, B:882:0x1b4f, B:884:0x1b5c, B:886:0x1b63), top: B:797:0x0ffa, outer: #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:943:0x1288 A[Catch: Exception -> 0x1bb3, all -> 0x1bcd, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x1bb3, blocks: (B:933:0x11fd, B:937:0x120b, B:940:0x1217, B:943:0x1288, B:944:0x128f, B:945:0x1296, B:946:0x129d, B:947:0x12a4, B:949:0x12b1, B:950:0x12b8, B:951:0x12bd, B:951:0x12bd, B:954:0x12c4, B:955:0x12d8, B:963:0x12cc, B:965:0x12d3, B:966:0x1221, B:967:0x1226, B:970:0x1232, B:973:0x123c, B:974:0x1246, B:977:0x1252, B:979:0x1261, B:980:0x1268, B:982:0x1271, B:985:0x127c), top: B:932:0x11fd, outer: #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:959:0x12ea  */
    /* JADX WARN: Removed duplicated region for block: B:963:0x12cc A[Catch: Exception -> 0x1bb3, all -> 0x1bcd, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x1bb3, blocks: (B:933:0x11fd, B:937:0x120b, B:940:0x1217, B:943:0x1288, B:944:0x128f, B:945:0x1296, B:946:0x129d, B:947:0x12a4, B:949:0x12b1, B:950:0x12b8, B:951:0x12bd, B:951:0x12bd, B:954:0x12c4, B:955:0x12d8, B:963:0x12cc, B:965:0x12d3, B:966:0x1221, B:967:0x1226, B:970:0x1232, B:973:0x123c, B:974:0x1246, B:977:0x1252, B:979:0x1261, B:980:0x1268, B:982:0x1271, B:985:0x127c), top: B:932:0x11fd, outer: #38 }] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.concurrent.atomic.AtomicInteger, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(com.facebook.messaging.composer.ComposerKeyboardManager r301, com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData r302, java.lang.String r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 7529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.ComposerKeyboardManager.A03(com.facebook.messaging.composer.ComposerKeyboardManager, com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData, java.lang.String, java.lang.String):void");
    }

    public static void A04(ComposerKeyboardManager composerKeyboardManager, String str) {
        Hjm hjm = (Hjm) composerKeyboardManager.A0K.remove(str);
        if (hjm != null) {
            composerKeyboardManager.A02(hjm, H9x.INIT);
            ViewGroup viewGroup = (ViewGroup) hjm.A00.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(hjm.A00);
            }
        }
    }

    public Bundle A05() {
        if (this.A03 == null) {
            return null;
        }
        Bundle A05 = 1BK.A05();
        A05.putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A03.A07);
        A05.putBundle("bundle", this.A03.A04.CjV());
        A05.putString("zero_feature_key", this.A03.A09);
        return A05;
    }

    public void A06() {
        Hjm hjm = this.A03;
        if (hjm != null) {
            A08(hjm.A07);
        }
    }

    public void A07() {
        CustomKeyboardLayout A01 = A01(this);
        if (CustomKeyboardLayout.A03(A01)) {
            CustomKeyboardLayout.A02(A01, true);
            return;
        }
        5T8 r0 = A01.A02;
        if (r0 == null || r0.hasMessages(1001)) {
            return;
        }
        A01.A02.sendMessageDelayed(Message.obtain((Handler) A01.A02, 1001), 500L);
    }

    public void A08(String str) {
        Hjm hjm = this.A03;
        if (hjm == null || !Objects.equal(str, hjm.A07)) {
            return;
        }
        if (Objects.equal(this.A08, str)) {
            this.A08 = null;
        }
        Hjm hjm2 = (Hjm) this.A0K.get(str);
        if (hjm2 != null) {
            if (hjm2.A04.CxS()) {
                A04(this, str);
            } else {
                A02(hjm2, H9x.CREATED);
            }
        }
    }

    public void A09(String str, String str2) {
        6Sp r0 = (6Sp) 1Lo.A04((Context) null, this.A0B, this.A01, 50103);
        6fA r02 = this.A04;
        r0.A02(this.A0C.mFragmentManager, this.A02, r02 != null ? r02.A02 : null, new ComposerKeyboardZeroRatingParam(str, str2), str2);
    }

    public void A0A(boolean z) {
        this.A0A = z;
        if (this.A03 != null) {
            Hrr hrr = (Hrr) this.A0D.get();
            Hjm hjm = this.A03;
            hrr.A01(hjm.A07);
            A02(hjm, z ? H9x.SHOWN : H9x.OPENED);
        }
    }
}
