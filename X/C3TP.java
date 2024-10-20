package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.3TP, reason: invalid class name */
/* loaded from: 3TP.class */
public final class C3TP {
    public static final C3TP A00 = new Object();

    public static final 3Ef A00(24X r301) {
        11T.A0F(r301, 0);
        24X A0D = r301.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (A0D == null) {
            return null;
        }
        long A07 = A0D.A07();
        java.util.Map map = C3RS.A00;
        if (map.isEmpty()) {
            for (3Ef r0 : 3Ef.values()) {
                map.put(Long.valueOf(r0.mValue), r0);
            }
        }
        return (3Ef) map.get(Long.valueOf(A07));
    }

    public static final ArrayList A01(3TI r301) {
        C3OJ c3oj;
        ArrayList A0s = AnonymousClass001.A0s();
        while (r301 != null) {
            3OU A02 = r301.A02(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if (A02 != null) {
                Object A002 = A02.A00();
                if ((A002 instanceof C3OJ) && (c3oj = (C3OJ) A002) != null) {
                    2DM A003 = c3oj.A00();
                    11T.A0F(A003, 0);
                    3Ef A004 = A00(A003);
                    24X A0D = A003.A0D("index");
                    Integer valueOf = A0D != null ? Integer.valueOf(A0D.A03()) : null;
                    if (A004 != null) {
                        A0s.add(new 3KA(A004, valueOf));
                    }
                }
            }
            r301 = r301.A04;
        }
        return A0s;
    }
}
