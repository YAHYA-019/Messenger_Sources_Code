package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.1Ah, reason: invalid class name */
/* loaded from: 1Ah.class */
public abstract class C1Ah {
    public static final MFE A00() {
        LVV lvv;
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        String packageName = A00.getPackageName();
        11T.A0A(packageName);
        0fH.A0l("PlayIntegrityRewindModule", 0Pz.A0W("context package name is ", A00.getPackageName()));
        if (((packageName.equals("com.facebook.katana") || packageName.equals("com.facebook.wakizashi")) && ((2yD) 1Bq.A01(16385)).AZk(36321052363800496L)) || (packageName.equals("com.facebook.orca") && ((2yD) 1Bq.A01(16387)).AZk(72339769094572160L))) {
            0fH.A0l("PlayIntegrityRewindModule", "Using immediate token provider");
            lvv = LVW.A00;
        } else {
            0fH.A0l("PlayIntegrityRewindModule", "Using classic token provider");
            lvv = new LVV(A00);
        }
        return (MFE) lvv;
    }

    public static final C1Ae A01() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        1H2 r0 = (1H2) 1Bq.A01(33032);
        3XZ A0G = 1VX.A0G(A00);
        11T.A0A(A0G);
        String A02 = r0.A02();
        11T.A0A(A02);
        return new C1Ae(A0G, A02);
    }

    public static final C1Ae A02() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        1H2 r0 = (1H2) 1Bq.A01(33032);
        1Fw.A04((1EZ) 1Bu.A06(A00, 16428));
        1Vd A0C = 1VX.A0C(A00);
        11T.A0A(A0C);
        String A02 = r0.A02();
        11T.A0A(A02);
        return new C1Ae(A0C, A02);
    }

    public static final C1Ag A03() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        1H2 r0 = (1H2) 1Bq.A01(33032);
        3XZ A0G = 1VX.A0G(A00);
        11T.A0A(A0G);
        String A02 = r0.A02();
        11T.A0A(A02);
        return new C1Ag(A0G, A02);
    }

    public static final C1Ag A04() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        1H2 r0 = (1H2) 1Bq.A01(33032);
        1Fw.A04((1EZ) 1Bu.A06(A00, 16428));
        1Vd A0C = 1VX.A0C(A00);
        11T.A0A(A0C);
        String A02 = r0.A02();
        11T.A0A(A02);
        return new C1Ag(A0C, A02);
    }
}
