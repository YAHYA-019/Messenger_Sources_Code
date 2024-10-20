package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.google.common.base.Platform;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1qx, reason: invalid class name */
/* loaded from: 1qx.class */
public final class C1qx implements 1UN, C1qy {
    public final java.util.Map A03;
    public final C00i A06 = new 1BQ(33103);
    public final C00i A01 = new 1BQ(16831);
    public final C00i A00 = new 1BQ(16828);
    public final C00i A07 = new 1BQ(66485);
    public final C00i A05 = new 1BQ(99390);
    public final C00i A02 = new 1BQ(66658);
    public final C00i A08 = new 1BQ(66630);
    public final 0AC A04 = (0AC) 1Bi.A03(46);

    public C1qx() {
        ((1UP) 1Bi.A03(66348)).A00(this);
        this.A03 = Collections.synchronizedMap(new HashMap());
    }

    public static 1Kq A00(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 16:
                return 1Kq.A02;
            case 4:
                return 1Kq.A08;
            case 5:
            case 6:
                return 1Kq.A07;
            case 7:
            case 11:
            case 12:
                return 1Kq.A04;
            case 8:
            case 9:
            case 13:
            case 14:
            case 15:
            default:
                return 1Kq.A0D;
            case 10:
                return 1Kq.A06;
        }
    }

    public static 1Kn A01(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return 1Kn.A02;
            }
            if (intValue == 1) {
                return 1Kn.A01;
            }
            if (intValue == 2) {
                return 1Kn.A04;
            }
            if (intValue == 3) {
                return 1Kn.A05;
            }
            if (intValue == 4) {
                return 1Kn.A03;
            }
        }
        return 1Kn.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r303 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.user.profilepic.PicSquare A02(com.facebook.auth.usersession.FbUserSession r301, java.lang.String r302, java.lang.String r303) {
        /*
            r0 = r302
            if (r0 != 0) goto Ld
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            if (r0 == 0) goto Lf
        Ld:
            r0 = 1
            r304 = r0
        Lf:
            r0 = r304
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = 65779(0x100f3, float:9.2176E-41)
            r304 = r0
            r0 = r301
            r1 = r304
            java.lang.Object r0 = X.1Lo.A06(r0, r1)
            X.1fC r0 = (X.1fC) r0
            r306 = r0
            r0 = 0
            r301 = r0
            r0 = r302
            if (r0 == 0) goto La2
            r0 = r306
            X.1gc r0 = r0.A03()
            java.lang.Integer r0 = r0.A01()
            r305 = r0
            r0 = r305
            int r0 = r0.intValue()
            r307 = r0
            r0 = r302
            boolean r0 = X.1JF.A0B(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L92
            r0 = 0
            r308 = r0
        L43:
            r0 = r303
            if (r0 == 0) goto L89
            r0 = r306
            X.1gc r0 = r0.A03()
            java.lang.Integer r0 = r0.A00()
            r305 = r0
            r0 = r305
            int r0 = r0.intValue()
            r309 = r0
            r0 = r303
            boolean r0 = X.1JF.A0B(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L79
            r0 = 0
            r307 = r0
            r0 = 0
            r310 = r0
        L67:
            com.facebook.user.profilepic.PicSquare r0 = new com.facebook.user.profilepic.PicSquare
            r305 = r0
            r0 = r305
            r1 = r308
            r2 = r310
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0 = r305
            return r0
        L79:
            com.facebook.user.profilepic.PicSquareUrlWithSize r0 = new com.facebook.user.profilepic.PicSquareUrlWithSize
            r310 = r0
            r0 = r310
            r1 = r309
            r2 = r303
            r0.<init>(r1, r2)
            goto L67
        L89:
            r0 = 0
            r307 = r0
            r0 = 0
            r310 = r0
            goto L67
        L92:
            com.facebook.user.profilepic.PicSquareUrlWithSize r0 = new com.facebook.user.profilepic.PicSquareUrlWithSize
            r308 = r0
            r0 = r308
            r1 = r307
            r2 = r302
            r0.<init>(r1, r2)
            goto L43
        La2:
            r0 = 0
            r308 = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1qx.A02(com.facebook.auth.usersession.FbUserSession, java.lang.String, java.lang.String):com.facebook.user.profilepic.PicSquare");
    }

    public static PicSquareUrlWithSize A03(FbUserSession fbUserSession, String str) {
        int intValue = ((1fC) 1Lo.A06(fbUserSession, 65779)).A03().A01().intValue();
        if (1JF.A0B(str)) {
            return null;
        }
        return new PicSquareUrlWithSize(intValue, str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0035. Please report as an issue. */
    public static void A04(1Kh r301, int i) {
        Integer num;
        1Kq r307;
        Integer num2;
        Integer num3;
        Integer num4;
        if (i == 1) {
            num = 0S2.A01;
        } else {
            if (i != 2) {
                if (i == 4) {
                    r301.A1T = "page";
                    r307 = 1Kq.A07;
                    r301.A0O = r307;
                }
                if (i == 16) {
                    r301.A1T = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                    r301.A01(1Kq.A02);
                    r301.A1x = true;
                    return;
                }
                if (i == 23) {
                    r301.A1T = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                    r301.A01(1Kq.A02);
                    r301.A1x = true;
                    r301.A1y = true;
                    return;
                }
                switch (i) {
                    case 6:
                        num3 = 0S2.A01;
                        r301.A04(num3);
                        r301.A1T = "InstagramMessagingUser";
                        r301.A01(1Kq.A04);
                        num4 = 0S2.A01;
                        num4.getClass();
                        r301.A0r = num4;
                        return;
                    case 7:
                        num2 = 0S2.A01;
                        r301.A04(num2);
                        r301.A1T = "InstagramMessagingUser";
                        r301.A01(1Kq.A04);
                        num4 = 0S2.A0C;
                        num4.getClass();
                        r301.A0r = num4;
                        return;
                    case 8:
                        num3 = 0S2.A0N;
                        r301.A04(num3);
                        r301.A1T = "InstagramMessagingUser";
                        r301.A01(1Kq.A04);
                        num4 = 0S2.A01;
                        num4.getClass();
                        r301.A0r = num4;
                        return;
                    case 9:
                        num2 = 0S2.A0N;
                        r301.A04(num2);
                        r301.A1T = "InstagramMessagingUser";
                        r301.A01(1Kq.A04);
                        num4 = 0S2.A0C;
                        num4.getClass();
                        r301.A0r = num4;
                        return;
                    default:
                        return;
                }
            }
            num = 0S2.A0N;
        }
        r301.A04(num);
        r301.A1T = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        r307 = 1Kq.A02;
        r301.A0O = r307;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a0, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0199, code lost:
    
        if (r0.booleanValue() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.user.model.User A05(com.facebook.auth.usersession.FbUserSession r302, X.Bz8 r303) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1qx.A05(com.facebook.auth.usersession.FbUserSession, X.Bz8):com.facebook.user.model.User");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0227, code lost:
    
        if (r0 == 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.user.model.User A06(com.facebook.auth.usersession.FbUserSession r302, X.C05124cx r303, int r304) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1qx.A06(com.facebook.auth.usersession.FbUserSession, X.4cx, int):com.facebook.user.model.User");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x02b5, code lost:
    
        if (r0.booleanValue() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02f6, code lost:
    
        if (r0.booleanValue() == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.user.model.User A07(com.facebook.auth.usersession.FbUserSession r302, X.BEl r303, int r304) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1qx.A07(com.facebook.auth.usersession.FbUserSession, X.BEl, int):com.facebook.user.model.User");
    }

    public User A08(FbUserSession fbUserSession, BF1 bf1, int i) {
        1Kh r0 = new 1Kh();
        r0.A05(1BK.A0m(((1qX) bf1).mResultSet, i, 0).toString());
        String string = ((1qX) bf1).mResultSet.getString(i, 1);
        if (string != null) {
            r0.A0t = string;
            r0.A1L = string;
        }
        String A04 = this.A04.A04(((1qX) bf1).mResultSet.getString(i, 2), ((1qX) bf1).mResultSet.getString(i, 3));
        if (!Platform.stringIsNullOrEmpty(A04)) {
            PicSquareUrlWithSize A03 = A03(fbUserSession, A04);
            A03.getClass();
            r0.A0g = new PicSquare(A03);
        }
        Double valueOf = Double.valueOf(((1qX) bf1).mResultSet.getDouble(i, 11));
        if (valueOf != null) {
            r0.A01 = valueOf.floatValue();
        }
        String string2 = ((1qX) bf1).mResultSet.getString(i, 5);
        if (string2 != null) {
            r0.A1U = string2;
        }
        r0.A1T = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        r0.A01(1Kq.A02);
        boolean z = true;
        r0.A1x = true;
        r0.A1n = AnonymousClass001.A1Q(((1qX) bf1).mResultSet.getInteger(i, 9), 2);
        if (((1qX) bf1).mResultSet.getInteger(i, 9) != 1) {
            z = false;
        }
        r0.A27 = z;
        int integer = ((1qX) bf1).mResultSet.getInteger(i, 10);
        r0.A04(integer != 1 ? integer != 2 ? integer != 4 ? 0S2.A00 : 0S2.A0C : 0S2.A01 : 0S2.A0N);
        if (((1qX) bf1).mResultSet.getNullableBoolean(i, 12) != null) {
            r0.A2H = ((1qX) bf1).mResultSet.getNullableBoolean(i, 12).booleanValue();
        }
        return new User(r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0119, code lost:
    
        if (r0 == 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0819, code lost:
    
        if (r0.booleanValue() != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0903, code lost:
    
        if (r0.booleanValue() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x05f1, code lost:
    
        if (r0.booleanValue() == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0752  */
    /* JADX WARN: Type inference failed for: r0v341, types: [X.1uO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v591, types: [java.lang.Object, X.1tl] */
    @Override // X.C1qy
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.user.model.User Anc(X.1qY r302, int r303) {
        /*
            Method dump skipped, instructions count: 3243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1qx.Anc(X.1qY, int):com.facebook.user.model.User");
    }

    public void AFz() {
        this.A03.clear();
    }
}
