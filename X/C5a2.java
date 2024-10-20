package X;

import android.content.Context;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;
import com.facebook.push.constants.PushProperty;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.5a2, reason: invalid class name */
/* loaded from: 5a2.class */
public final class C5a2 {
    public static ImmutableMap A0A = ImmutableMap.of((Object) "log:thread-name", (Object) C1q8.A0R, (Object) "log:thread-image", (Object) C1q8.A0Q, (Object) "log:unsubscribe", (Object) C1q8.A0P, (Object) "log:subscribe", (Object) C1q8.A03);
    public 1BY A00;
    public final C00i A01 = new 1BV((1BY) null, 82241);
    public final C00i A02 = new 1BV((1BY) null, 66592);
    public final 4yO A03;
    public final 4iI A04;
    public final AnonymousClass244 A05;
    public final C5a4 A06;
    public final C5a5 A07;
    public final C5a6 A08;
    public final C5a3 A09;

    public C5a2(1BO r302) {
        this.A00 = new 1BY(r302);
        C5a3 c5a3 = (C5a3) 1Bn.A0E((Context) null, (1BY) null, 49786);
        C5a4 c5a4 = (C5a4) 1Bn.A0E((Context) null, (1BY) null, 49787);
        AnonymousClass244 anonymousClass244 = (AnonymousClass244) 1Bi.A03(68335);
        4iI r0 = (4iI) 1Hv.A02((Context) 1Bn.A0E((Context) null, (1BY) null, 83719), 67720);
        C5a5 c5a5 = (C5a5) 1Bn.A0E((Context) null, (1BY) null, 49788);
        C5a6 c5a6 = (C5a6) 1Bn.A0E((Context) null, (1BY) null, 49789);
        4yO r02 = (4yO) 1Bn.A0E((Context) null, (1BY) null, 116230);
        this.A09 = c5a3;
        this.A06 = c5a4;
        this.A05 = anonymousClass244;
        this.A04 = r0;
        this.A07 = c5a5;
        this.A08 = c5a6;
        this.A03 = r02;
    }

    public static 5PR A00(24X r301) {
        5PR r0 = 5PR.A06;
        if (r301.A0Z("j")) {
            switch (JSONUtil.A02(r301.A0D("j"), 0)) {
                case 1:
                    return 5PR.A09;
                case 2:
                    return 5PR.A0B;
                case 3:
                    return 5PR.A0C;
                case 4:
                    return 5PR.A0A;
                case 5:
                    return 5PR.A07;
                case 6:
                    return 5PR.A08;
                case 7:
                    return 5PR.A02;
                case 8:
                    return 5PR.A03;
                case 9:
                    return 5PR.A05;
                case 10:
                    return 5PR.A04;
            }
        }
        return r0;
    }

    public static 5PI A01(24X r301) {
        5PI r303 = null;
        String A04 = A04(JSONUtil.A0H(r301.A0D("author"), null));
        if (A04 != null) {
            UserKey A0X = 1BK.A0X(A04);
            3pI r0 = new 3pI();
            r0.A09 = A0X;
            r0.A0D = null;
            ParticipantInfo A00 = r0.A00();
            String A0P = C3o5.A0P(r301, AbstractC00603o4.A00(539), null);
            long A07 = 4YV.A07(r301, "timestamp");
            String A0P2 = C3o5.A0P(r301, "message_id", null);
            if (A0P2 != null && 11T.A0P("m_", 1, A0P2)) {
                A0P2 = A0P2.substring(2);
                11T.A0A(A0P2);
            }
            r303 = new 5PI();
            r303.A0K = A00;
            5PI.A00(r303, A0P);
            r303.A05 = A07;
            r303.A0E(A0P2);
        }
        return r303;
    }

    public static 5PK A02(PushProperty pushProperty) {
        int ordinal = pushProperty.A04.ordinal();
        return ordinal != 1 ? ordinal != 5 ? ordinal != 7 ? 5PK.A07 : 5PK.A05 : 5PK.A04 : 5PK.A02;
    }

    public static ServerMessageAlertFlags A03(24X r301) {
        return new ServerMessageAlertFlags(JSONUtil.A0J(r301.A0D("disable_sound"), false), JSONUtil.A0J(r301.A0D("disable_vibrate"), false), JSONUtil.A0J(r301.A0D("disable_light"), false), false);
    }

    public static String A04(String str) {
        String str2 = null;
        if (str != null && str.startsWith("fbid:")) {
            String[] split = str.split(":");
            if (split.length == 2) {
                str2 = split[1];
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0787, code lost:
    
        if (r0 == 4) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x098e, code lost:
    
        if (r0.equalsIgnoreCase(com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt.CAMERA_ID_BACK) != false) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0666  */
    /* JADX WARN: Type inference failed for: r0v457, types: [X.1FX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.model.messages.Message A05(com.facebook.auth.usersession.FbUserSession r302, X.5PK r303, X.24X r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, boolean r308, boolean r309, boolean r310) {
        /*
            Method dump skipped, instructions count: 2638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5a2.A05(com.facebook.auth.usersession.FbUserSession, X.5PK, X.24X, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):com.facebook.messaging.model.messages.Message");
    }
}
