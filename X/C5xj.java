package X;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.FbInjector;
import com.google.common.base.Objects;

/* renamed from: X.5xj, reason: invalid class name */
/* loaded from: 5xj.class */
public abstract class C5xj {
    public static void A00(int i, String str) {
        FbInjector.A00();
        AnonymousClass046 anonymousClass046 = (AnonymousClass046) 1Bn.A0A(16669);
        1Ex r0 = (1Ex) 1Bi.A03(83426);
        ViewerContext Aue = r0.Aue();
        String str2 = Aue != ViewerContext.A01 ? Aue.mUserId : "null";
        StringBuilder A0n = AnonymousClass001.A0n(str);
        A0n.append(" isLoggedIn: ");
        A0n.append(r0.BTw());
        anonymousClass046.ACu(1BL.A0u(" AuthDataStoreVC userId: ", str2, A0n), i).report();
    }

    public static void A01(String str, int i, String str2, String str3, boolean z) {
        boolean equal;
        C00s.A00();
        if (z) {
            equal = Objects.equal(str, str2);
        } else if (str == null || str2 == null) {
            return;
        } else {
            equal = str.equals(str2);
        }
        if (equal || !((2yD) 1Bi.A03(16386)).AZk(18302934412962988L)) {
            return;
        }
        A00(i, 0Pz.A0z(str3, "InjectedUserId: ", str, " PropagatedUserId: ", str2));
    }

    public static void A02(String str, String str2) {
        C00s.A00();
        if (((2yD) 1Bi.A03(16386)).AZk(18302934413290670L)) {
            A00(817900915, 0Pz.A0v("Session From Bundle with userId: ", str2, " not matching VCM userId: ", str));
        }
    }

    public static void A03(String str, String str2) {
        C00s.A00();
        if (((2yD) 1Bi.A03(16386)).AZk(18302934413356207L)) {
            A00(817890790, 0Pz.A0v("Session without Bundle (Foreground) with userId: ", str2, " not matching VCM userId: ", str));
        }
    }
}
