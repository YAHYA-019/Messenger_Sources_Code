package X;

import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.FailedToSendMessageNotification;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.sdk.mca.MailboxSDK$ProductMetadata;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.5fm, reason: invalid class name */
/* loaded from: 5fm.class */
public final class C5fm {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A04;
    public final C00i A09;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0N;
    public final C00i A0R;
    public final C00i A0T;
    public final C00i A0U;
    public final C00i A0Z;
    public final C00i A03 = FbInjector.A00;
    public final C00i A0V = new 1BQ(16520);
    public final C00i A08 = new 1BQ(16511);
    public final C00i A0J = new 1BQ(32769);
    public final Random A0Y = new Random();
    public final C00i A06 = new 1BQ(99390);
    public final C00i A0e = new 1BQ(Constants.LOAD_RESULT_PGO);
    public final C00i A0Q = new 1BV((1BY) null, 116182);
    public final C00i A0L = new 1BV((1BY) null, 66592);
    public final C00i A0M = new 1BQ(85048);
    public final C00i A0O = new 1BV((1BY) null, 68606);
    public final C00i A07 = new 1BQ(66265);
    public final C00i A0c = new 1BQ(66266);
    public final C00i A02 = new 1BV((1BY) null, 68365);
    public final C00i A05 = new 1BV((1BY) null, 33153);
    public final C00i A0A = new 1BV((1BY) null, 68925);
    public final C00i A0S = new 1BQ(66774);
    public final C00i A0X = new 1BV((1BY) null, 16671);
    public final C00i A0a = new 1BQ(84363);
    public final C00i A0P = new 1BQ(68077);
    public final C00i A0W = new 1BQ(67159);
    public final C00i A0K = new 1BV((1BY) null, 66962);
    public final C00i A0I = new 1BV((1BY) null, 68214);
    public final C00i A0b = new 1BQ(68470);
    public final C00i A0d = new 1BV((1BY) null, 83851);

    public C5fm(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        Integer num = 1Lo.A05;
        this.A0T = new 1MV(fbUserSession, (1BY) null, 65868);
        this.A0N = new 1MV(fbUserSession, (1BY) null, 49879);
        this.A0B = new 1MV(fbUserSession, (1BY) null, 33124);
        this.A0E = new 1MV(fbUserSession, (1BY) null, 67405);
        this.A04 = new 1MV(fbUserSession, (1BY) null, 66451);
        this.A0U = new 1MV(fbUserSession, (1BY) null, 84052);
        this.A0H = new 1MV(fbUserSession, (1BY) null, 67534);
        this.A0D = new 1MV(fbUserSession, (1BY) null, 33148);
        this.A0G = new 1MV(fbUserSession, (1BY) null, 65961);
        this.A0F = new 1MV(fbUserSession, (1BY) null, 67249);
        this.A0Z = new 1MV(fbUserSession, (1BY) null, 65959);
        this.A0C = new 1MV(fbUserSession, (1BY) null, 67401);
        this.A09 = new 1MV(fbUserSession, (1BY) null, 67440);
        this.A0R = new 1MV(fbUserSession, (1BY) null, 68607);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        if (r0 == X.0OO.A08) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.msys.mci.Attachment A00(X.C5fm r301, com.facebook.ui.media.attachments.model.MediaResource r302, int r303, long r304) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5fm.A00(X.5fm, com.facebook.ui.media.attachments.model.MediaResource, int, long):com.facebook.msys.mci.Attachment");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.facebook.sdk.mca.MailboxSDK$ProductMetadata] */
    public static MailboxSDK$ProductMetadata A01(C7rh c7rh) {
        final String str;
        final String str2;
        final String str3 = c7rh.A03;
        if (str3 == null || (str = c7rh.A02) == null || (str2 = c7rh.A01) == null) {
            return null;
        }
        return new Object(str3, str, str2) { // from class: com.facebook.sdk.mca.MailboxSDK$ProductMetadata
            public final String productAttribution;
            public final String productFBID;
            public final String productType;

            {
                this.productType = str3;
                this.productFBID = str;
                this.productAttribution = str2;
            }
        };
    }

    public static Integer A02(Message message) {
        String str;
        int i;
        ImmutableMap immutableMap = message.A13;
        if (immutableMap == null || (str = (String) immutableMap.get("hot_emoji_size")) == null) {
            return null;
        }
        if (str.equals(5wF.A02.textSize)) {
            i = 3;
        } else {
            i = 1;
            if (str.equals(5wF.A03.textSize)) {
                i = 2;
            }
        }
        return Integer.valueOf(i);
    }

    public static Long A03(Message message) {
        String str = message.A1W;
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static String A04(Message message, C5fm c5fm) {
        StringBuilder sb;
        String str;
        ImmutableMap immutableMap = message.A13;
        String A07 = ((2Kq) c5fm.A0Z.get()).A07(ZonePolicy.A0C);
        if (immutableMap.containsKey("is_in_bubbles") && Boolean.parseBoolean((String) immutableMap.get("is_in_bubbles"))) {
            sb = new StringBuilder();
            str = "bubbles;";
        } else {
            if (!immutableMap.containsKey("is_in_chatheads") || !Boolean.parseBoolean((String) immutableMap.get("is_in_chatheads"))) {
                return A07;
            }
            sb = new StringBuilder();
            str = "chatheads;";
        }
        sb.append(str);
        sb.append(A07);
        return sb.toString();
    }

    public static String A05(Message message, C5fm c5fm, int i) {
        String str = message.A1h;
        if (!TextUtils.isEmpty(str)) {
            ((5Et) c5fm.A0Q.get()).A05(str, (List) null, i, 150);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r305 == null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A06(X.C5fm r301, com.facebook.ui.media.attachments.model.MediaResource r302) {
        /*
            r0 = r302
            android.net.Uri r0 = r0.A0E
            r303 = r0
            r0 = r303
            java.lang.String r1 = "Attachment uri is Null"
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0, r1)
            r0 = r303
            java.lang.String r0 = r0.getPath()
            r304 = r0
            r0 = r304
            java.lang.String r1 = "The path of attachment's uri is Null"
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0, r1)
            r0 = r303
            java.lang.Integer r0 = X.Hvw.A01(r0)
            r305 = r0
            java.lang.Integer r0 = X.0S2.A01
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto Lb9
            r0 = r303
            java.lang.Integer r0 = X.Hvw.A01(r0)
            r305 = r0
            java.lang.Integer r0 = X.0S2.A00
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto Lb1
            r0 = r301
            X.00i r0 = r0.A03     // Catch: java.lang.Throwable -> L87 java.lang.SecurityException -> La1
            r306 = r0
            r0 = r306
            android.content.Context r0 = X.1BK.A04(r0)     // Catch: java.lang.Throwable -> L87 java.lang.SecurityException -> La1
            r306 = r0
            r0 = r306
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L87 java.lang.SecurityException -> La1
            r308 = r0
            r0 = -8979519(0xffffffffff76fbc1, float:-3.2829727E38)
            r309 = r0
            r0 = 0
            r301 = r0
            r0 = r308
            r1 = r303
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r309
            android.database.Cursor r0 = X.0L0.A01(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L87 java.lang.SecurityException -> La1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb1
            r0 = r305
            boolean r0 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L8c java.lang.SecurityException -> Lbb
            r0 = 0
            r306 = r0
            r0 = r305
            r1 = 0
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> L8c java.lang.SecurityException -> Lbb
            r307 = r0
            goto Laa
        L87:
            r306 = move-exception
            goto L92
        L8c:
            r306 = move-exception
            r0 = r305
            r307 = r0
        L92:
            r0 = r307
            if (r0 == 0) goto L9e
            r0 = r307
            r0.close()
        L9e:
            r0 = r306
            throw r0
        La1:
            r0 = 0
            r305 = r0
        La5:
            r0 = r305
            if (r0 == 0) goto Lb1
        Laa:
            r0 = r305
            r0.close()
        Lb1:
            r0 = r307
            if (r0 == 0) goto Lb9
            r0 = r307
            return r0
        Lb9:
            r0 = r304
            return r0
        Lbb:
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5fm.A06(X.5fm, com.facebook.ui.media.attachments.model.MediaResource):java.lang.String");
    }

    public static String A07(String str, String str2) {
        String obj;
        try {
            if (!1JF.A0B(str2)) {
                2DM r0 = (2DM) new AnonymousClass244().A0V(str, 2DM.class);
                2DM r02 = (2DM) new AnonymousClass244().A0V(str2, 2DM.class);
                if (r02 != null && r0 != null) {
                    r0._children.putAll(r02._children);
                    obj = r0.toString();
                    return obj;
                }
            }
        } catch (IOException unused) {
            0fH.A0l("PLATFORM_TOKEN_CONSTRUCTION_ERROR", obj.toString());
        }
        return str;
    }

    public static void A08(Message message, C5fm c5fm, String str) {
        String str2;
        if (!((2rT) c5fm.A0c.get()).A00() || (str2 = message.A1W) == null) {
            return;
        }
        ((MessagingPerformanceLogger) c5fm.A0M.get()).A0m(str2, str);
    }

    public static void A09(Message message, C5fm c5fm, String str) {
        String str2;
        if (!((2rT) c5fm.A0c.get()).A00() || (str2 = message.A1W) == null) {
            return;
        }
        C00i c00i = c5fm.A0M;
        MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) c00i.get();
        ThreadKey threadKey = message.A0V;
        long j = message.A02;
        C08804o3 A02 = MessagingPerformanceLogger.A02(messagingPerformanceLogger);
        C08804o3.A01(A02, threadKey, str2, str, 5513931, j);
        if (j != 0) {
            A02.A07.put(str2, Long.valueOf(j));
            C08804o3.A01(A02, threadKey, str2, str, 231288954, j);
        }
        MessagingPerformanceLogger.A0C(messagingPerformanceLogger);
        ((MessagingPerformanceLogger) c00i.get()).A0m(str2, "send_api_start");
    }

    public static void A0A(ThreadKey threadKey, C5fm c5fm, C5fv c5fv, String str, String str2, String str3, String str4, boolean z) {
        if (str == null || !z) {
            return;
        }
        C97b A00 = 7TM.A00(c5fv, threadKey.A0y());
        ((C6o6) c5fm.A0a.get()).A03(threadKey, null, 1BK.A0d(), null, str, str2, str3, null, str4, String.valueOf(A00));
    }

    public static void A0B(ThreadKey threadKey, C5fm c5fm, IOException iOException, String str) {
        A0C(c5fm, iOException.getMessage() != null ? iOException.getMessage() : "An IO Exception has occurred");
        if (str != null) {
            ((5Et) c5fm.A0Q.get()).A05(str, (List) null, 4, ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE);
        }
        ((Cna) c5fm.A0d.get()).Bfp(new FailedToSendMessageNotification(threadKey, iOException instanceof FileNotFoundException ? BLU.A03 : BLU.A06));
    }

    public static void A0C(C5fm c5fm, String str) {
        1BK.A09(c5fm.A08).D0w(AbE.A00(314), str, 1);
    }

    public static void A0D(C5fm c5fm, String str, String str2) {
        if (str == null) {
            str2.getClass();
        } else {
            0fH.A0k(1BJ.A00(38), str);
            A0C(c5fm, str);
        }
    }

    public static boolean A0E(Message message, C5fm c5fm) {
        Capabilities capabilities;
        ThreadKey threadKey = message.A0V;
        if (threadKey == null || !threadKey.A1D() || (capabilities = message.A0h) == null || !4YU.A1Y(capabilities, 223)) {
            return false;
        }
        return ((1Wi) c5fm.A0b.get()).A05(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [long] */
    public long A0F(String str, String str2, List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) 1BK.A0n(((User) it.next()).A0k.id));
        }
        int hashCode = C04I.A00().hashCode();
        CQB.A01(hashCode);
        CQB.A03(hashCode, "group_size", list.size());
        CQB.A05(hashCode, "is_optimistic_group", true);
        ?? r0 = hashCode;
        CQB.A04((int) r0, "group_type", C1yg.GROUP.toString());
        try {
            MailboxFeature mailboxFeature = (MailboxFeature) this.A0D.get();
            ImmutableList build = builder.build();
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new A0Y(mailboxFeature, build, A0P, str, str2, 0), A0P, false);
            r0 = AnonymousClass001.A05(((Future) A0P.addResultCallback(new Cxf(hashCode, 1, this))).get());
            return r0;
        } catch (InterruptedException | NullPointerException | ExecutionException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }
}
