package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.smartcapture.logging.SmartCaptureQpl;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.62h, reason: invalid class name */
/* loaded from: 62h.class */
public final class C62h {
    public 6F5 A00;
    public String A01;
    public 1BY A02;
    public 5rQ A03;
    public final C00i A04;
    public final C62n A06;
    public final 5II A07;
    public final FbSharedPreferences A08;
    public final C0dr A0B;
    public final C00i A0C;
    public final C62i A0D;
    public final 53F A0E;
    public final C62j A0F;
    public final C00i A05 = new 1BQ(68024);
    public final java.util.Map A09 = new HashMap();
    public final java.util.Map A0A = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v43, types: [X.62m] */
    public C62h(1BO r302, FbUserSession fbUserSession) {
        C84r c84r = new C84r(this, 2);
        this.A0D = c84r;
        this.A02 = new 1BY(r302);
        5II r0 = (5II) 1Bi.A03(68025);
        C0dr c0dr = (C0dr) 1Bi.A03(84488);
        53F r02 = (53F) 1Bi.A03(67858);
        C62j c62j = (C62j) 1Bn.A0E((Context) null, (1BY) null, 49939);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        Integer num = 1Lo.A05;
        this.A0C = new 1MV(fbUserSession, (1BY) null, 65854);
        this.A04 = new 1MV(fbUserSession, (1BY) null, 68022);
        this.A07 = r0;
        this.A0B = c0dr;
        this.A0E = r02;
        this.A0F = c62j;
        this.A08 = fbSharedPreferences;
        this.A06 = new C62n(c84r, new Object() { // from class: X.62m
        });
    }

    public static void A00(View view, C62h c62h) {
        String str;
        float f;
        float f2;
        if (c62h.A01 != null) {
            if (view != null) {
                view.setPressed(false);
            }
            String str2 = null;
            C9gR c9gR = (C9gR) c62h.A09.get(c62h.A01);
            float f3 = (float) (c9gR.A02 ? c9gR.A07 : c9gR.A08).A09.A00;
            int intValue = (f3 <= 0.37f ? ((6P0) c62h.A05.get()).A00() ? 0S2.A01 : 0S2.A00 : f3 <= 0.65f ? 0S2.A0C : 0S2.A0N).intValue();
            switch (intValue) {
                case 2:
                    str = "369239343222814";
                    break;
                case 3:
                    str = "369239383222810";
                    break;
                default:
                    str = "369239263222822";
                    break;
            }
            C66i c66i = c9gR.A07;
            float f4 = (float) c66i.A09.A00;
            C66i c66i2 = c9gR.A08;
            c66i2.A06(f4);
            switch (intValue) {
                case 2:
                    f = 5.0f;
                    break;
                case 3:
                    f = 7.0f;
                    break;
                default:
                    f = 3.0f;
                    break;
            }
            c66i2.A08(f);
            c66i2.A07(89N.A00(r312));
            C66i c66i3 = c9gR.A06;
            switch (intValue) {
                case 2:
                    f2 = -2.0f;
                    break;
                case 3:
                    f2 = -3.0f;
                    break;
                default:
                    f2 = -1.0f;
                    break;
            }
            c66i3.A08(f2);
            c9gR.A02 = false;
            c66i.A02();
            if (intValue == 1 || intValue == 0) {
                5II r0 = c62h.A07;
                if (r0.A0B()) {
                    r0.A07("hot_like_small", 0.25f);
                }
                str2 = "small";
            } else {
                if (intValue == 2) {
                    5II r02 = c62h.A07;
                    if (r02.A0B()) {
                        r02.A07("hot_like_medium", 0.25f);
                    }
                    str2 = SmartCaptureQpl.ANNOTATION_KEY_MEDIUM;
                } else if (intValue == 3) {
                    5II r03 = c62h.A07;
                    if (r03.A0B()) {
                        r03.A07("hot_like_large", 0.25f);
                    }
                    str2 = "large";
                }
                1Ql.A01(c62h.A08.edit(), 1NK.A1e, true);
            }
            5rQ r04 = c62h.A03;
            if (r04 != null) {
                r04.A08();
            }
            String str3 = ((6kC) c62h.A0A.get(c62h.A01)).A00.A03;
            String str4 = c62h.A01;
            6F5 r05 = c62h.A00;
            if (r05 != null) {
                Preconditions.checkNotNull(str4, 7zK.A00(18));
                r05.C1A(new Bv5(str2, str3, str, str4, null));
            }
            c62h.A01 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.C62h r301, X.C9bx r302) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62h.A01(X.62h, X.9bx):void");
    }

    public static void A02(C62h c62h, String str) {
        A03(c62h, str);
        c62h.A01 = null;
        5rQ r0 = c62h.A03;
        if (r0 != null) {
            r0.A08();
        }
        6F5 r02 = c62h.A00;
        if (r02 != null) {
            r02.C19();
        }
    }

    public static void A03(C62h c62h, String str) {
        c62h.A0A.remove(str);
        C9gR c9gR = (C9gR) c62h.A09.remove(str);
        if (c9gR != null) {
            c9gR.A07.A02();
            c9gR.A06.A02();
            c9gR.A08.A02();
            c9gR.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0168, code lost:
    
        if (r301.A01 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
    
        if (r0 >= ((r302.getBottom() - r302.getTop()) + r0)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(android.view.View r302, android.view.MotionEvent r303) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62h.A04(android.view.View, android.view.MotionEvent):boolean");
    }
}
