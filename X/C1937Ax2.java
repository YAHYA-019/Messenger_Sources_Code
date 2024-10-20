package X;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ax2, reason: case insensitive filesystem */
/* loaded from: Ax2.class */
public final class C1937Ax2 extends 1LH {
    public final BcA A00;
    public final MigColorScheme A01;
    public final LiveData A02;

    public C1937Ax2(LiveData liveData, BcA bcA, MigColorScheme migColorScheme) {
        7zR.A1O(liveData, bcA);
        this.A01 = migColorScheme;
        this.A02 = liveData;
        this.A00 = bcA;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Object A00 = C9iJ.A00(this.A02, c2k5);
        if (A00 == null) {
            A00 = BM0.A05;
        }
        2lQ r0 = 2lO.A02;
        2lO A0X = 7zQ.A0X(7zS.A0f(0S2.A01, 1.0f), 0S2.A0C, 0.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        C1i A0T = 7zU.A0T();
        1Iw AeS = A0L.AeS();
        CQY A002 = A0T.A00(AeS, this.A01);
        9hR r02 = new 9hR();
        r02.A05 = 3yH.A09(A0L, 2131953157);
        A002.A0F(r02.A01());
        Resources A0C = 4YU.A0C(AeS.A0D);
        String A09 = 3yH.A09(A0L, 2131953155);
        String A092 = 3yH.A09(A0L, 2131953156);
        C1354Aew c1354Aew = new C1354Aew(this, new DCx(this, 39), 1);
        0Dc r03 = new 0Dc(A0C);
        r03.A02(A09);
        A002.A0N(7zS.A0B(r03, c1354Aew, "[[learn-more-avatar-visibility]]", A092));
        A002.A0C(2131953153);
        CNf cNf = new CNf();
        CNf.A01(cNf, this, 3);
        cNf.A01 = A00;
        cNf.A05(3yH.A09(A0L, 2131953150), BM0.A02);
        if (!4YV.A1S()) {
            cNf.A05(3yH.A09(A0L, 2131953151), BM0.A03);
        }
        cNf.A05(3yH.A09(A0L, 2131953152), BM0.A04);
        CNf.A00(cNf, A002);
        A002.A0B(2131953149);
        return 7zM.A0l(CQY.A00(A002), A0L, c2k5, A0X);
    }
}
