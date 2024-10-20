package com.facebook.orca.notify;

import X.04J;
import X.0DA;
import X.0Pz;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1EZ;
import X.1Ex;
import X.1Fw;
import X.1G2;
import X.1GU;
import X.1Lo;
import X.1NK;
import X.1P8;
import X.1PB;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.4wA;
import X.AbE;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C01353qs;
import X.C01443r5;
import X.C04154a4;
import X.C0A2;
import X.C11314w5;
import X.C1233Aba;
import X.C1253Abv;
import X.C15h;
import X.C45d;
import X.C45m;
import X.C4Zz;
import X.C5a9;
import X.C5aA;
import X.C5b6;
import X.C5e0;
import X.DBP;
import X.DLB;
import X.InterfaceC04174a7;
import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.FriendInstallNotification;
import com.facebook.messaging.notify.LoggedOutMessageNotification;
import com.facebook.messaging.notify.PaymentNotification;
import com.facebook.messaging.notify.UriNotification;
import com.facebook.messaging.notify.type.MessageRequestNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.profilepicture.notifications.FailedToSetProfilePictureNotification;
import com.facebook.orca.notify.MessagesNotificationManager;
import com.facebook.push.constants.PushProperty;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: MessagesNotificationManager.class */
public final class MessagesNotificationManager {
    public static final 1G2 A0X = 1NK.A24.A0D("processed_logout_notification");
    public final C00i A0H;
    public final C4Zz A0N;
    public final C4Zz A0O;
    public final 1PB A0P;
    public final C00i A0U;
    public final C00i A0V;
    public final Context A00 = FbInjector.A00();
    public final C00i A0B = new 1BV(147791);
    public final C00i A0T = new 1BQ(83846);
    public final C00i A08 = new 1BV(49353);
    public final C15h A0Q = new DBP(this, 56);
    public final C00i A03 = new 1BQ(16616);
    public final C00i A02 = new 1BQ(16458);
    public final C00i A05 = new 1BQ(32789);
    public final C00i A07 = new 1BQ(33013);
    public final C00i A04 = new 1BQ(83426);
    public final C00i A0C = new 1BQ(83168);
    public final C00i A0J = new 1BV(17010);
    public final C00i A0W = new 1BQ(32798);
    public final C00i A0E = new 1BQ(49169);
    public final C00i A0F = new 1BV(83835);
    public final C15h A0R = new DBP(this, 57);
    public final C00i A01 = new 1BQ(49441);
    public final C00i A0L = new 1BQ(16520);
    public final C00i A0M = new 1BV(82442);
    public final C00i A06 = new 1BQ(16511);
    public final C00i A0G = new 1BQ(49797);
    public final C00i A0S = new 1BQ(49806);
    public final C00i A0A = new 1BV(49796);
    public final C00i A0I = new 1BQ(83411);
    public final C00i A0K = new 1BV(82763);
    public final C00i A0D = new 1BV(66592);
    public final C00i A09 = new 1BQ(83826);

    public MessagesNotificationManager() {
        1BQ r0 = new 1BQ(16626);
        this.A0V = r0;
        this.A0P = ((1P8) r0.get()).A00("notification_instance");
        this.A0U = new 1BQ(83868);
        this.A0H = new 1BQ(16385);
        this.A0O = new C4Zz() { // from class: X.4Zy
            @Override // X.C4Zz
            public void Bnd(Uri uri, C11314w5 c11314w5, boolean z) {
                if (z) {
                    return;
                }
                1G2 r02 = MessagesNotificationManager.A0X;
                0fH.A07(MessagesNotificationManager.class, uri, "PeerState changed on uri %s ");
                ThreadKey A0K = ThreadKey.A0K(Uri.decode(uri.getLastPathSegment()), true);
                if (A0K != null) {
                    MessagesNotificationManager.this.A07(A0K, "ClearUnreadThread");
                }
            }
        };
        this.A0N = new C4Zz() { // from class: X.4a0
            @Override // X.C4Zz
            public void Bnd(Uri uri, C11314w5 c11314w5, boolean z) {
                if (z) {
                    return;
                }
                1G2 r02 = MessagesNotificationManager.A0X;
                0fH.A07(MessagesNotificationManager.class, uri, "PeerState changed on uri %s ");
                MessagesNotificationManager.this.A0F("ClearAllUnreadThreads");
            }
        };
    }

    public static C45d A00(C5b6 c5b6) {
        return (C45d) c5b6.A08.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x015d, code lost:
    
        if (r306 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x019c, code lost:
    
        if (r315 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01bb, code lost:
    
        if (r315 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.notify.type.MessagingNotification r302, com.facebook.orca.notify.MessagesNotificationManager r303) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.orca.notify.MessagesNotificationManager.A01(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.notify.type.MessagingNotification, com.facebook.orca.notify.MessagesNotificationManager):void");
    }

    private void A02(DLB dlb, NewMessageNotification newMessageNotification, String str, boolean z) {
        C1253Abv.A01((C1253Abv) this.A0T.get(), ((MessagingNotification) newMessageNotification).A02, str);
        String str2 = null;
        C1233Aba c1233Aba = (C1233Aba) this.A0U.get();
        String str3 = newMessageNotification.A0H.A1V;
        Long l = newMessageNotification.A04;
        if (z) {
            if (l != null) {
                str2 = l.toString();
            }
            c1233Aba.A00(dlb, str3, str2);
        } else {
            if (l != null) {
                str2 = l.toString();
            }
            c1233Aba.A01(dlb, str3, str2, false);
        }
    }

    public static void A03(MessagingNotification messagingNotification, MessagesNotificationManager messagesNotificationManager) {
        int i;
        C5aA A00 = ((C5a9) messagesNotificationManager.A0F.get()).A00(messagingNotification);
        String lowerCase = messagingNotification.A01.name().toLowerCase(Locale.ROOT);
        11T.A0F(lowerCase, 1);
        A00.A00.A03("messaging_notification_type", lowerCase);
        C00i c00i = messagesNotificationManager.A0E;
        Iterator it = ((C04154a4) c00i.get()).iterator();
        while (it.hasNext()) {
            InterfaceC04174a7 interfaceC04174a7 = (InterfaceC04174a7) it.next();
            C00j.A04(interfaceC04174a7.getName(), "beforeNotify", "%s:%s", -1545743454);
            try {
                interfaceC04174a7.ABc(messagingNotification);
                C00j.A01(543654613);
            } catch (Throwable th) {
                th = th;
                i = 1275664087;
                C00j.A01(i);
                throw th;
            }
        }
        Iterator it2 = ((C04154a4) c00i.get()).iterator();
        while (it2.hasNext()) {
            InterfaceC04174a7 interfaceC04174a72 = (InterfaceC04174a7) it2.next();
            if (messagingNotification.A00) {
                A00.A02("dispatch_cancelled", null);
                return;
            }
            C00j.A04(interfaceC04174a72.getName(), "notify", "%s:%s", 1225124623);
            try {
                interfaceC04174a72.Bfa(messagingNotification);
                C00j.A01(256894699);
            } catch (Throwable th2) {
                th = th2;
                i = -920317266;
                C00j.A01(i);
                throw th;
            }
        }
    }

    public static void A04(MessagesNotificationManager messagesNotificationManager, PushProperty pushProperty, String str, String str2, String str3, String str4) {
        C01443r5 c01443r5 = (C01443r5) messagesNotificationManager.A0W.get();
        c01443r5.A02.get();
        HashMap A00 = C45m.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        if (str2 != null) {
            A00.put("push_id", str2);
        }
        c01443r5.A08(0Pz.A0W(AbstractC00603o4.A00(233), str), str4, null, null, null, A00);
        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0A(16428));
        C5e0 c5e0 = (C5e0) messagesNotificationManager.A0S.get();
        1UG A002 = 1UD.A00((04J) c5e0.A06.get(), 1ZG.A01, "messenger_business_notification_handle_action_impression");
        if (C5e0.A04(c5e0)) {
            String str5 = pushProperty.A0B;
            if (str5 == null) {
                str5 = "";
            }
            if (C5e0.A05(c5e0, str5) && A002.isSampled()) {
                1UG.A02(A002, "business_inbox_notification");
                0DA r0 = new 0DA();
                String str6 = pushProperty.A08;
                if (str6 == null) {
                    str6 = "";
                }
                r0.A07("notification_message_id", str6);
                r0.A07("notification_type", str3);
                r0.A07("notification_handle_action", str4);
                r0.A07("notification_state", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
                C5e0.A02(r0, A002, A04);
            }
        }
    }

    public void A05() {
        Iterator it = ((C04154a4) this.A0E.get()).iterator();
        while (it.hasNext()) {
            ((InterfaceC04174a7) it.next()).AFV();
        }
    }

    public void A06() {
        1GU.A00(this.A02);
        Context context = this.A00;
        A03(new FailedToSetProfilePictureNotification(context.getString(2131952789), context.getString(2131960107), context.getString(2131960106)), this);
    }

    public void A07(ThreadKey threadKey, String str) {
        Iterator it = ((C04154a4) this.A0E.get()).iterator();
        while (it.hasNext()) {
            ((InterfaceC04174a7) it.next()).AFx(threadKey, str);
        }
        C11314w5 c11314w5 = (C11314w5) 1Lo.A06(1Fw.A04((1EZ) 1Bn.A0A(16428)), 49366);
        Uri uri = 4wA.A00;
        String A0W = 0Pz.A0W("peer://msg_notification_unread_count/clear_thread/", Uri.encode(threadKey.toString()));
        LruCache lruCache = C0A2.A00;
        c11314w5.A05(Uri.parse(A0W), null);
    }

    public void A08(FriendInstallNotification friendInstallNotification) {
        String str;
        A01(1Fw.A00(), friendInstallNotification, this);
        1GU.A00(this.A02);
        PushProperty pushProperty = ((MessagingNotification) friendInstallNotification).A02;
        String obj = pushProperty.A04.toString();
        String str2 = pushProperty.A0A;
        String valueOf = String.valueOf(10003);
        if (((1Ex) this.A04.get()).BTw()) {
            ((C01353qs) this.A05.get()).A00(friendInstallNotification.A02, true);
            if (1BK.A0R(this.A07).AZn(1NK.A0m, true) && ((C5b6) this.A0A.get()).A00()) {
                A03(friendInstallNotification, this);
                str = friendInstallNotification.A00 ? "user_alerted_" : "user_not_alerted_";
            } else {
                str = "notifications_disabled";
            }
        } else {
            str = AbE.A00(71);
        }
        A04(this, pushProperty, obj, str2, valueOf, str);
    }

    public void A09(LoggedOutMessageNotification loggedOutMessageNotification) {
        String str;
        A01(1Fw.A00(), loggedOutMessageNotification, this);
        1GU.A00(this.A02);
        PushProperty pushProperty = ((MessagingNotification) loggedOutMessageNotification).A02;
        String obj = pushProperty.A04.toString();
        String str2 = pushProperty.A0A;
        String valueOf = String.valueOf(10004);
        if (((C5b6) this.A0A.get()).A00()) {
            A03(loggedOutMessageNotification, this);
            str = loggedOutMessageNotification.A00 ? "user_alerted_" : "user_not_alerted_";
        } else {
            str = "notifications_disabled";
        }
        A04(this, pushProperty, obj, str2, valueOf, str);
    }

    public void A0A(PaymentNotification paymentNotification) {
        String str;
        A01(1Fw.A00(), paymentNotification, this);
        1GU.A00(this.A02);
        PushProperty pushProperty = ((MessagingNotification) paymentNotification).A02;
        String obj = pushProperty.A04.toString();
        String str2 = pushProperty.A0A;
        String valueOf = String.valueOf(10014);
        if (!((1Ex) this.A04.get()).BTw()) {
            str = AbE.A00(71);
        } else if (((C5b6) this.A0A.get()).A00()) {
            A03(paymentNotification, this);
            str = paymentNotification.A01 ? "user_alerted_" : "user_not_alerted_";
        } else {
            str = "notifications_disabled";
        }
        A04(this, pushProperty, obj, str2, valueOf, str);
    }

    public void A0B(UriNotification uriNotification) {
        A01(1Fw.A00(), uriNotification, this);
        if (((C5b6) this.A0A.get()).A00()) {
            1GU.A00(this.A02);
            A03(uriNotification, this);
        }
    }

    public void A0C(MessageRequestNotification messageRequestNotification) {
        A01(1Fw.A04((1EZ) 1Bn.A0A(16428)), messageRequestNotification, this);
        C00i c00i = this.A0A;
        if (((C5b6) c00i.get()).A00()) {
            c00i.get();
            if (!ThreadKey.A0d(messageRequestNotification.A01)) {
                ((1GU) this.A02.get()).AAq();
                A03(messageRequestNotification, this);
                return;
            }
        }
        ThreadKey threadKey = messageRequestNotification.A01;
        PushProperty pushProperty = ((MessagingNotification) messageRequestNotification).A02;
        C00i c00i2 = this.A0C;
        if (c00i2 == null || c00i2.get() != null) {
            C45d c45d = (C45d) c00i2.get();
            String obj = pushProperty.A04.toString();
            String str = pushProperty.A0A;
            11T.A0F(obj, 2);
            HashMap A0u = AnonymousClass001.A0u();
            C45d.A07(threadKey, A0u);
            c45d.A01.A06(obj, str, "notifications_disabled", "message_id", null, A0u);
        }
    }

    public void A0D(MessagingNotification messagingNotification) {
        0fH.A0A(MessagesNotificationManager.class, "notifyMessagingNotification");
        A01(1Fw.A04((1EZ) 1Bn.A0A(16428)), messagingNotification, this);
        ((1GU) this.A02.get()).AAq();
        A03(messagingNotification, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0405, code lost:
    
        if (r324 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05cd, code lost:
    
        if (r305 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0707, code lost:
    
        if (r329 == null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:938:0x15d1, code lost:
    
        if (r342 != false) goto L957;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x1339 A[Catch: all -> 0x18c5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x18c5, blocks: (B:32:0x00e2, B:33:0x00e8, B:34:0x00f1, B:35:0x00f8, B:40:0x010a, B:43:0x0116, B:44:0x011d, B:45:0x0124, B:47:0x012f, B:49:0x013a, B:51:0x0145, B:53:0x0150, B:55:0x0167, B:57:0x0170, B:59:0x0177, B:60:0x017c, B:62:0x0183, B:63:0x0188, B:64:0x018f, B:65:0x0198, B:66:0x019f, B:67:0x01a6, B:68:0x01ad, B:70:0x01bd, B:72:0x01c4, B:74:0x01d2, B:76:0x01d9, B:78:0x01e7, B:80:0x01ee, B:82:0x01fc, B:84:0x0203, B:86:0x0211, B:88:0x0218, B:91:0x0222, B:93:0x0232, B:95:0x0239, B:96:0x023e, B:98:0x0259, B:100:0x0260, B:101:0x0265, B:102:0x026c, B:103:0x0275, B:104:0x027c, B:105:0x0283, B:107:0x028c, B:108:0x0293, B:112:0x02a6, B:114:0x02ad, B:115:0x02b2, B:117:0x02c2, B:119:0x02d0, B:121:0x02de, B:123:0x02f0, B:125:0x0302, B:127:0x0314, B:129:0x0326, B:131:0x032d, B:136:0x0331, B:137:0x0336, B:139:0x0344, B:140:0x034b, B:143:0x0357, B:149:0x038f, B:150:0x0398, B:151:0x039f, B:152:0x03a6, B:153:0x03ad, B:154:0x03b4, B:155:0x03bd, B:157:0x03c8, B:160:0x03d2, B:161:0x03d9, B:162:0x03e0, B:163:0x03e9, B:164:0x03f0, B:167:0x03fc, B:170:0x040d, B:171:0x0414, B:172:0x041b, B:173:0x0422, B:174:0x042b, B:176:0x0437, B:177:0x043e, B:179:0x0447, B:180:0x044e, B:184:0x0461, B:186:0x046f, B:188:0x0482, B:190:0x0489, B:193:0x0499, B:194:0x049d, B:197:0x04ac, B:199:0x04b3, B:200:0x04ba, B:202:0x04cc, B:204:0x04d2, B:206:0x04eb, B:208:0x04f5, B:219:0x051b, B:220:0x0524, B:221:0x052b, B:222:0x0532, B:223:0x0539, B:224:0x0540, B:226:0x0549, B:243:0x0598, B:247:0x05a3, B:248:0x05aa, B:249:0x05b1, B:250:0x05b8, B:253:0x05c4, B:256:0x05d5, B:258:0x05e0, B:260:0x05ed, B:262:0x05ff, B:263:0x0603, B:266:0x0614, B:268:0x061a, B:269:0x0621, B:271:0x0633, B:273:0x0639, B:275:0x0652, B:277:0x065c, B:281:0x0677, B:282:0x0680, B:283:0x0687, B:284:0x068e, B:285:0x0695, B:286:0x069c, B:287:0x06a3, B:288:0x06aa, B:290:0x06b4, B:293:0x06bf, B:294:0x06c6, B:295:0x06cd, B:297:0x06d8, B:299:0x06df, B:300:0x06e4, B:301:0x06eb, B:302:0x06f2, B:305:0x06fe, B:308:0x070f, B:310:0x071a, B:312:0x072c, B:313:0x0730, B:316:0x0741, B:318:0x0747, B:319:0x074e, B:321:0x0760, B:323:0x0766, B:325:0x077f, B:327:0x0789, B:335:0x18c1, B:337:0x18c4, B:338:0x07a4, B:339:0x07aa, B:340:0x07b3, B:342:0x07bc, B:343:0x07c3, B:344:0x07c9, B:345:0x07d2, B:348:0x07e1, B:350:0x07ec, B:354:0x0806, B:355:0x080d, B:357:0x0823, B:359:0x082a, B:360:0x082f, B:363:0x083b, B:365:0x0847, B:367:0x0853, B:369:0x085f, B:371:0x0867, B:373:0x0874, B:376:0x0886, B:377:0x088a, B:380:0x089b, B:382:0x08a0, B:383:0x08a5, B:384:0x08ae, B:386:0x08bf, B:387:0x08c5, B:388:0x08cb, B:390:0x08f2, B:395:0x08fa, B:396:0x0901, B:397:0x090a, B:398:0x0911, B:399:0x0918, B:400:0x091f, B:401:0x0928, B:402:0x092f, B:405:0x093d, B:408:0x0949, B:409:0x0950, B:411:0x0966, B:413:0x096d, B:414:0x0972, B:416:0x097f, B:417:0x0988, B:418:0x098f, B:421:0x09a2, B:424:0x09ae, B:427:0x09b8, B:428:0x09bf, B:430:0x09d5, B:432:0x09dc, B:434:0x09f8, B:436:0x0a07, B:438:0x0a13, B:439:0x0a1b, B:440:0x0a22, B:443:0x0a2e, B:444:0x0a35, B:446:0x0a53, B:448:0x0a5a, B:449:0x0a5f, B:451:0x0a6c, B:454:0x0a78, B:455:0x0a7f, B:457:0x0a9d, B:459:0x0aa4, B:460:0x0aa9, B:462:0x0ab6, B:465:0x0ac2, B:468:0x0ace, B:469:0x0ad5, B:470:0x0ade, B:471:0x0ae5, B:473:0x0b03, B:475:0x0b0a, B:477:0x0b14, B:479:0x0b1d, B:481:0x0b26, B:482:0x0b2b, B:484:0x0b30, B:486:0x0b3d, B:488:0x0b4e, B:489:0x0b55, B:490:0x0b5c, B:493:0x0b68, B:494:0x0b6f, B:496:0x0b8d, B:498:0x0b94, B:499:0x0b99, B:502:0x0baa, B:503:0x0bb1, B:504:0x0bb8, B:506:0x0bc1, B:507:0x0bc8, B:509:0x0bd1, B:510:0x0bd8, B:511:0x0bdd, B:512:0x0be4, B:514:0x0bee, B:516:0x0bf7, B:518:0x0bfe, B:519:0x0c03, B:521:0x0c0c, B:522:0x0c13, B:524:0x0c1a, B:526:0x0c23, B:528:0x0c2e, B:531:0x0c3a, B:532:0x0c41, B:534:0x0c5f, B:536:0x0c66, B:537:0x0c6b, B:540:0x0c82, B:541:0x0c89, B:542:0x0c90, B:545:0x0c9c, B:548:0x0ca8, B:551:0x0cb4, B:555:0x0cc5, B:556:0x0ccc, B:558:0x0cd5, B:562:0x0ce3, B:564:0x0cec, B:567:0x0cfa, B:568:0x0d01, B:569:0x0d0a, B:571:0x0d16, B:576:0x0d34, B:578:0x0d41, B:580:0x0d4c, B:582:0x0d55, B:584:0x0d5e, B:586:0x0d65, B:587:0x0d6a, B:589:0x0d84, B:591:0x0d90, B:593:0x0d97, B:594:0x0d9c, B:596:0x0d2b, B:597:0x0da9, B:598:0x0db0, B:599:0x0db9, B:600:0x0dc0, B:602:0x0dce, B:605:0x0ddc, B:606:0x0de3, B:607:0x0dea, B:608:0x0df3, B:609:0x0dfa, B:610:0x0e03, B:611:0x0e0c, B:612:0x0e13, B:613:0x0e18, B:615:0x0e26, B:617:0x0e31, B:620:0x0e4b, B:621:0x0e52, B:623:0x0e68, B:625:0x0e6f, B:627:0x0e79, B:629:0x0e8b, B:631:0x0e94, B:632:0x0e99, B:635:0x0ea6, B:636:0x0ead, B:637:0x0eb6, B:639:0x0ebf, B:640:0x0ec6, B:643:0x0ed2, B:646:0x0ede, B:649:0x0eea, B:650:0x0ef1, B:651:0x0efa, B:652:0x0f01, B:654:0x0f1f, B:656:0x0f26, B:658:0x0f30, B:660:0x0f39, B:662:0x0f42, B:663:0x0f47, B:665:0x0f4c, B:669:0x0f5e, B:670:0x0f63, B:672:0x0f6c, B:675:0x0f78, B:676:0x0f81, B:677:0x0f88, B:679:0x0f96, B:682:0x0fa4, B:685:0x0fb0, B:686:0x0fb7, B:687:0x0fc0, B:689:0x0fc9, B:695:0x0fe9, B:696:0x0ff0, B:698:0x0ff9, B:701:0x1005, B:704:0x13e8, B:705:0x13ef, B:707:0x140d, B:709:0x1414, B:710:0x1419, B:712:0x1011, B:713:0x1018, B:714:0x1021, B:715:0x1028, B:716:0x102f, B:719:0x103b, B:721:0x1049, B:724:0x1055, B:725:0x105c, B:726:0x1063, B:727:0x106c, B:729:0x107a, B:732:0x1088, B:733:0x108f, B:736:0x10ad, B:737:0x10b5, B:738:0x10be, B:739:0x10c5, B:742:0x10d1, B:743:0x10da, B:744:0x10e1, B:747:0x10ed, B:748:0x10f4, B:749:0x10fb, B:751:0x1109, B:754:0x1117, B:756:0x1125, B:759:0x1133, B:760:0x113a, B:761:0x1143, B:762:0x114a, B:763:0x1151, B:764:0x1158, B:766:0x1165, B:769:0x1173, B:770:0x117a, B:772:0x1187, B:773:0x1190, B:774:0x1197, B:777:0x11a3, B:778:0x11ac, B:779:0x11b3, B:782:0x11bf, B:783:0x11c6, B:786:0x11d4, B:787:0x11db, B:790:0x11e7, B:791:0x11ee, B:793:0x11fc, B:796:0x1208, B:797:0x120f, B:799:0x121c, B:800:0x1223, B:801:0x122a, B:804:0x1236, B:805:0x123d, B:806:0x1246, B:809:0x1252, B:810:0x1259, B:811:0x1262, B:812:0x1269, B:815:0x1275, B:818:0x1281, B:819:0x128a, B:820:0x1291, B:823:0x129d, B:827:0x12b3, B:828:0x12ba, B:829:0x12c1, B:830:0x12c8, B:831:0x12cd, B:833:0x12d6, B:836:0x12e2, B:837:0x12e9, B:838:0x12f2, B:840:0x12fe, B:842:0x1319, B:843:0x131f, B:844:0x1326, B:845:0x132d, B:848:0x1339, B:849:0x1340, B:850:0x1347, B:851:0x134e, B:853:0x136a, B:855:0x1371, B:856:0x1376, B:859:0x1461, B:882:0x14b8, B:884:0x14be, B:887:0x14c6, B:890:0x14d0, B:893:0x14da, B:896:0x14e4, B:900:0x14f2, B:902:0x14f9, B:905:0x1503, B:909:0x1532, B:913:0x153e, B:916:0x1548, B:917:0x154e, B:918:0x1557, B:919:0x155e, B:923:0x157f, B:924:0x1585, B:925:0x158e, B:927:0x1597, B:928:0x159e, B:934:0x15bf, B:940:0x15dd, B:941:0x15e3, B:942:0x15ea, B:944:0x15f5, B:946:0x1600, B:948:0x160b, B:950:0x1616, B:952:0x1621, B:954:0x162c, B:955:0x1633, B:957:0x163e, B:958:0x1645, B:959:0x164c, B:960:0x1653, B:961:0x165a, B:962:0x1661, B:963:0x1668, B:964:0x166f, B:965:0x1676, B:966:0x167d, B:968:0x16c8, B:970:0x16cf, B:972:0x16d5, B:974:0x16da, B:975:0x16df, B:976:0x16e8, B:978:0x16f6, B:981:0x1702, B:985:0x170e, B:988:0x171a, B:989:0x1720, B:990:0x1729, B:992:0x1735, B:993:0x173c, B:994:0x1741, B:996:0x1750, B:1001:0x1760, B:1005:0x176e, B:1007:0x1774, B:1008:0x177b, B:1009:0x1782, B:1011:0x178b, B:1045:0x1847, B:1048:0x1851, B:1067:0x18b6, B:1068:0x15b8, B:1072:0x1513, B:1073:0x1519, B:1074:0x1520, B:1076:0x152b, B:1088:0x1383, B:1089:0x138a, B:1090:0x1393, B:1091:0x139a, B:1093:0x13a6, B:1095:0x13c3, B:1096:0x13cc, B:1098:0x13d7, B:1100:0x13e0, B:229:0x054c, B:231:0x0553, B:235:0x0563, B:236:0x056c, B:237:0x0573, B:238:0x057a, B:241:0x0586), top: B:31:0x00e2, outer: #6, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:858:0x1456  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0222 A[Catch: all -> 0x18c5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x18c5, blocks: (B:32:0x00e2, B:33:0x00e8, B:34:0x00f1, B:35:0x00f8, B:40:0x010a, B:43:0x0116, B:44:0x011d, B:45:0x0124, B:47:0x012f, B:49:0x013a, B:51:0x0145, B:53:0x0150, B:55:0x0167, B:57:0x0170, B:59:0x0177, B:60:0x017c, B:62:0x0183, B:63:0x0188, B:64:0x018f, B:65:0x0198, B:66:0x019f, B:67:0x01a6, B:68:0x01ad, B:70:0x01bd, B:72:0x01c4, B:74:0x01d2, B:76:0x01d9, B:78:0x01e7, B:80:0x01ee, B:82:0x01fc, B:84:0x0203, B:86:0x0211, B:88:0x0218, B:91:0x0222, B:93:0x0232, B:95:0x0239, B:96:0x023e, B:98:0x0259, B:100:0x0260, B:101:0x0265, B:102:0x026c, B:103:0x0275, B:104:0x027c, B:105:0x0283, B:107:0x028c, B:108:0x0293, B:112:0x02a6, B:114:0x02ad, B:115:0x02b2, B:117:0x02c2, B:119:0x02d0, B:121:0x02de, B:123:0x02f0, B:125:0x0302, B:127:0x0314, B:129:0x0326, B:131:0x032d, B:136:0x0331, B:137:0x0336, B:139:0x0344, B:140:0x034b, B:143:0x0357, B:149:0x038f, B:150:0x0398, B:151:0x039f, B:152:0x03a6, B:153:0x03ad, B:154:0x03b4, B:155:0x03bd, B:157:0x03c8, B:160:0x03d2, B:161:0x03d9, B:162:0x03e0, B:163:0x03e9, B:164:0x03f0, B:167:0x03fc, B:170:0x040d, B:171:0x0414, B:172:0x041b, B:173:0x0422, B:174:0x042b, B:176:0x0437, B:177:0x043e, B:179:0x0447, B:180:0x044e, B:184:0x0461, B:186:0x046f, B:188:0x0482, B:190:0x0489, B:193:0x0499, B:194:0x049d, B:197:0x04ac, B:199:0x04b3, B:200:0x04ba, B:202:0x04cc, B:204:0x04d2, B:206:0x04eb, B:208:0x04f5, B:219:0x051b, B:220:0x0524, B:221:0x052b, B:222:0x0532, B:223:0x0539, B:224:0x0540, B:226:0x0549, B:243:0x0598, B:247:0x05a3, B:248:0x05aa, B:249:0x05b1, B:250:0x05b8, B:253:0x05c4, B:256:0x05d5, B:258:0x05e0, B:260:0x05ed, B:262:0x05ff, B:263:0x0603, B:266:0x0614, B:268:0x061a, B:269:0x0621, B:271:0x0633, B:273:0x0639, B:275:0x0652, B:277:0x065c, B:281:0x0677, B:282:0x0680, B:283:0x0687, B:284:0x068e, B:285:0x0695, B:286:0x069c, B:287:0x06a3, B:288:0x06aa, B:290:0x06b4, B:293:0x06bf, B:294:0x06c6, B:295:0x06cd, B:297:0x06d8, B:299:0x06df, B:300:0x06e4, B:301:0x06eb, B:302:0x06f2, B:305:0x06fe, B:308:0x070f, B:310:0x071a, B:312:0x072c, B:313:0x0730, B:316:0x0741, B:318:0x0747, B:319:0x074e, B:321:0x0760, B:323:0x0766, B:325:0x077f, B:327:0x0789, B:335:0x18c1, B:337:0x18c4, B:338:0x07a4, B:339:0x07aa, B:340:0x07b3, B:342:0x07bc, B:343:0x07c3, B:344:0x07c9, B:345:0x07d2, B:348:0x07e1, B:350:0x07ec, B:354:0x0806, B:355:0x080d, B:357:0x0823, B:359:0x082a, B:360:0x082f, B:363:0x083b, B:365:0x0847, B:367:0x0853, B:369:0x085f, B:371:0x0867, B:373:0x0874, B:376:0x0886, B:377:0x088a, B:380:0x089b, B:382:0x08a0, B:383:0x08a5, B:384:0x08ae, B:386:0x08bf, B:387:0x08c5, B:388:0x08cb, B:390:0x08f2, B:395:0x08fa, B:396:0x0901, B:397:0x090a, B:398:0x0911, B:399:0x0918, B:400:0x091f, B:401:0x0928, B:402:0x092f, B:405:0x093d, B:408:0x0949, B:409:0x0950, B:411:0x0966, B:413:0x096d, B:414:0x0972, B:416:0x097f, B:417:0x0988, B:418:0x098f, B:421:0x09a2, B:424:0x09ae, B:427:0x09b8, B:428:0x09bf, B:430:0x09d5, B:432:0x09dc, B:434:0x09f8, B:436:0x0a07, B:438:0x0a13, B:439:0x0a1b, B:440:0x0a22, B:443:0x0a2e, B:444:0x0a35, B:446:0x0a53, B:448:0x0a5a, B:449:0x0a5f, B:451:0x0a6c, B:454:0x0a78, B:455:0x0a7f, B:457:0x0a9d, B:459:0x0aa4, B:460:0x0aa9, B:462:0x0ab6, B:465:0x0ac2, B:468:0x0ace, B:469:0x0ad5, B:470:0x0ade, B:471:0x0ae5, B:473:0x0b03, B:475:0x0b0a, B:477:0x0b14, B:479:0x0b1d, B:481:0x0b26, B:482:0x0b2b, B:484:0x0b30, B:486:0x0b3d, B:488:0x0b4e, B:489:0x0b55, B:490:0x0b5c, B:493:0x0b68, B:494:0x0b6f, B:496:0x0b8d, B:498:0x0b94, B:499:0x0b99, B:502:0x0baa, B:503:0x0bb1, B:504:0x0bb8, B:506:0x0bc1, B:507:0x0bc8, B:509:0x0bd1, B:510:0x0bd8, B:511:0x0bdd, B:512:0x0be4, B:514:0x0bee, B:516:0x0bf7, B:518:0x0bfe, B:519:0x0c03, B:521:0x0c0c, B:522:0x0c13, B:524:0x0c1a, B:526:0x0c23, B:528:0x0c2e, B:531:0x0c3a, B:532:0x0c41, B:534:0x0c5f, B:536:0x0c66, B:537:0x0c6b, B:540:0x0c82, B:541:0x0c89, B:542:0x0c90, B:545:0x0c9c, B:548:0x0ca8, B:551:0x0cb4, B:555:0x0cc5, B:556:0x0ccc, B:558:0x0cd5, B:562:0x0ce3, B:564:0x0cec, B:567:0x0cfa, B:568:0x0d01, B:569:0x0d0a, B:571:0x0d16, B:576:0x0d34, B:578:0x0d41, B:580:0x0d4c, B:582:0x0d55, B:584:0x0d5e, B:586:0x0d65, B:587:0x0d6a, B:589:0x0d84, B:591:0x0d90, B:593:0x0d97, B:594:0x0d9c, B:596:0x0d2b, B:597:0x0da9, B:598:0x0db0, B:599:0x0db9, B:600:0x0dc0, B:602:0x0dce, B:605:0x0ddc, B:606:0x0de3, B:607:0x0dea, B:608:0x0df3, B:609:0x0dfa, B:610:0x0e03, B:611:0x0e0c, B:612:0x0e13, B:613:0x0e18, B:615:0x0e26, B:617:0x0e31, B:620:0x0e4b, B:621:0x0e52, B:623:0x0e68, B:625:0x0e6f, B:627:0x0e79, B:629:0x0e8b, B:631:0x0e94, B:632:0x0e99, B:635:0x0ea6, B:636:0x0ead, B:637:0x0eb6, B:639:0x0ebf, B:640:0x0ec6, B:643:0x0ed2, B:646:0x0ede, B:649:0x0eea, B:650:0x0ef1, B:651:0x0efa, B:652:0x0f01, B:654:0x0f1f, B:656:0x0f26, B:658:0x0f30, B:660:0x0f39, B:662:0x0f42, B:663:0x0f47, B:665:0x0f4c, B:669:0x0f5e, B:670:0x0f63, B:672:0x0f6c, B:675:0x0f78, B:676:0x0f81, B:677:0x0f88, B:679:0x0f96, B:682:0x0fa4, B:685:0x0fb0, B:686:0x0fb7, B:687:0x0fc0, B:689:0x0fc9, B:695:0x0fe9, B:696:0x0ff0, B:698:0x0ff9, B:701:0x1005, B:704:0x13e8, B:705:0x13ef, B:707:0x140d, B:709:0x1414, B:710:0x1419, B:712:0x1011, B:713:0x1018, B:714:0x1021, B:715:0x1028, B:716:0x102f, B:719:0x103b, B:721:0x1049, B:724:0x1055, B:725:0x105c, B:726:0x1063, B:727:0x106c, B:729:0x107a, B:732:0x1088, B:733:0x108f, B:736:0x10ad, B:737:0x10b5, B:738:0x10be, B:739:0x10c5, B:742:0x10d1, B:743:0x10da, B:744:0x10e1, B:747:0x10ed, B:748:0x10f4, B:749:0x10fb, B:751:0x1109, B:754:0x1117, B:756:0x1125, B:759:0x1133, B:760:0x113a, B:761:0x1143, B:762:0x114a, B:763:0x1151, B:764:0x1158, B:766:0x1165, B:769:0x1173, B:770:0x117a, B:772:0x1187, B:773:0x1190, B:774:0x1197, B:777:0x11a3, B:778:0x11ac, B:779:0x11b3, B:782:0x11bf, B:783:0x11c6, B:786:0x11d4, B:787:0x11db, B:790:0x11e7, B:791:0x11ee, B:793:0x11fc, B:796:0x1208, B:797:0x120f, B:799:0x121c, B:800:0x1223, B:801:0x122a, B:804:0x1236, B:805:0x123d, B:806:0x1246, B:809:0x1252, B:810:0x1259, B:811:0x1262, B:812:0x1269, B:815:0x1275, B:818:0x1281, B:819:0x128a, B:820:0x1291, B:823:0x129d, B:827:0x12b3, B:828:0x12ba, B:829:0x12c1, B:830:0x12c8, B:831:0x12cd, B:833:0x12d6, B:836:0x12e2, B:837:0x12e9, B:838:0x12f2, B:840:0x12fe, B:842:0x1319, B:843:0x131f, B:844:0x1326, B:845:0x132d, B:848:0x1339, B:849:0x1340, B:850:0x1347, B:851:0x134e, B:853:0x136a, B:855:0x1371, B:856:0x1376, B:859:0x1461, B:882:0x14b8, B:884:0x14be, B:887:0x14c6, B:890:0x14d0, B:893:0x14da, B:896:0x14e4, B:900:0x14f2, B:902:0x14f9, B:905:0x1503, B:909:0x1532, B:913:0x153e, B:916:0x1548, B:917:0x154e, B:918:0x1557, B:919:0x155e, B:923:0x157f, B:924:0x1585, B:925:0x158e, B:927:0x1597, B:928:0x159e, B:934:0x15bf, B:940:0x15dd, B:941:0x15e3, B:942:0x15ea, B:944:0x15f5, B:946:0x1600, B:948:0x160b, B:950:0x1616, B:952:0x1621, B:954:0x162c, B:955:0x1633, B:957:0x163e, B:958:0x1645, B:959:0x164c, B:960:0x1653, B:961:0x165a, B:962:0x1661, B:963:0x1668, B:964:0x166f, B:965:0x1676, B:966:0x167d, B:968:0x16c8, B:970:0x16cf, B:972:0x16d5, B:974:0x16da, B:975:0x16df, B:976:0x16e8, B:978:0x16f6, B:981:0x1702, B:985:0x170e, B:988:0x171a, B:989:0x1720, B:990:0x1729, B:992:0x1735, B:993:0x173c, B:994:0x1741, B:996:0x1750, B:1001:0x1760, B:1005:0x176e, B:1007:0x1774, B:1008:0x177b, B:1009:0x1782, B:1011:0x178b, B:1045:0x1847, B:1048:0x1851, B:1067:0x18b6, B:1068:0x15b8, B:1072:0x1513, B:1073:0x1519, B:1074:0x1520, B:1076:0x152b, B:1088:0x1383, B:1089:0x138a, B:1090:0x1393, B:1091:0x139a, B:1093:0x13a6, B:1095:0x13c3, B:1096:0x13cc, B:1098:0x13d7, B:1100:0x13e0, B:229:0x054c, B:231:0x0553, B:235:0x0563, B:236:0x056c, B:237:0x0573, B:238:0x057a, B:241:0x0586), top: B:31:0x00e2, outer: #6, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0E(com.facebook.messaging.notify.type.NewMessageNotification r302) {
        /*
            Method dump skipped, instructions count: 6377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.orca.notify.MessagesNotificationManager.A0E(com.facebook.messaging.notify.type.NewMessageNotification):void");
    }

    public void A0F(String str) {
        Iterator it = ((C04154a4) this.A0E.get()).iterator();
        while (it.hasNext()) {
            ((InterfaceC04174a7) it.next()).AFI(str);
        }
    }

    public void A0G(String str) {
        Iterator it = ((C04154a4) this.A0E.get()).iterator();
        while (it.hasNext()) {
            ((InterfaceC04174a7) it.next()).AFZ(str);
        }
    }

    public void A0H(List list) {
        Iterator it = ((C04154a4) this.A0E.get()).iterator();
        while (it.hasNext()) {
            ((InterfaceC04174a7) it.next()).AFi(list);
        }
    }
}
