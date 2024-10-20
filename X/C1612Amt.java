package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import java.util.ArrayList;

/* renamed from: X.Amt, reason: case insensitive filesystem */
/* loaded from: Amt.class */
public final class C1612Amt extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C1612Amt(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str2;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        2JY A0B;
        C2563Ghc c2563Ghc;
        GhG A0u;
        Class cls;
        int i;
        int i2;
        String A0k;
        C1306Adj c1306Adj;
        Long A14;
        ArrayList A03;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                11T.A0F(abstractC08294mh, 0);
                2JY r0 = (2JY) abstractC08294mh.A03;
                if (r0 != null && (A0B = 1BK.A0B(r0, 2JX.class, 1705130161, 915884307)) != null && (c2563Ghc = (C2563Ghc) A0B.A0L(1385608141, C2563Ghc.class, 1463903662)) != null && (A0u = c2563Ghc.A0u()) != null) {
                    switch (A0u.mTypeTag) {
                        case -2028623322:
                            cls = C1691Apx.class;
                            i = 112202875;
                            i2 = -1205081106;
                            break;
                        case 1124590056:
                            cls = GhD.class;
                            i = 112202875;
                            i2 = 447559301;
                            break;
                    }
                    2JY A0B2 = 1BK.A0B(A0u, cls, i, i2);
                    if (A0B2 != null && (A0k = A0B2.A0k()) != null && A0k.length() != 0) {
                        String str = this.A04;
                        boolean A1a = 4YV.A1a(str, A0k, false);
                        Hzl hzl = (Hzl) this.A02;
                        Hzl.A00((FbUserSession) this.A01, hzl, this.A03, str, A1a);
                        GP5.A00((GP5) 1Br.A0B(hzl.A02), "error_cowatch_collision");
                        return;
                    }
                }
                ((I1y) 1Br.A0B(((Hzl) this.A02).A03)).A01((FbUserSession) this.A01, this.A03, this.A04, null);
                return;
            case 1:
                AmK amK = (AmK) this.A01;
                AmK.A06(amK.A05, amK, this.A04, 2131964429);
                if (amK.A0D != null && 2oI.A07(amK.A0C)) {
                    c1306Adj = amK.A0D;
                    A14 = AbF.A14(amK.A0C.A0n);
                    A03 = 1JW.A03(new String[]{this.A03});
                    i3 = 38;
                    i4 = 13;
                    break;
                } else {
                    return;
                }
                break;
            case 2:
                AmK amK2 = (AmK) this.A01;
                AmK.A06(amK2.A05, amK2, this.A04, 2131964424);
                if (amK2.A0D != null && 2oI.A07(amK2.A0C)) {
                    c1306Adj = amK2.A0D;
                    A14 = AbF.A14(amK2.A0C.A0n);
                    A03 = 1JW.A03(new String[]{this.A03});
                    11T.A0F(A03, 1);
                    i3 = 37;
                    i4 = 2;
                    break;
                } else {
                    return;
                }
            default:
                7Ql r02 = (7Ql) obj;
                if (!0S2.A0N.equals(r02.A03)) {
                    ((DHE) this.A02).onFailure(AbF.A1D("Upload not successful"));
                    return;
                } else {
                    CNh cNh = (CNh) this.A01;
                    CNh.A00(cNh.A04, (DHE) this.A02, cNh, this.A04, this.A03, r02.A05);
                    return;
                }
        }
        C1306Adj.A0C(c1306Adj, A14, A03, i3, i4);
    }

    public void A03(Throwable th) {
        AmK amK;
        LithoView lithoView;
        String str;
        int i;
        switch (this.A00) {
            case 0:
                Hzl hzl = (Hzl) this.A02;
                Hzl.A00((FbUserSession) this.A01, hzl, this.A03, this.A04, false);
                GP5.A00((GP5) 1Br.A0B(hzl.A02), "error_cowatch_collision");
                return;
            case 1:
                amK = (AmK) this.A01;
                lithoView = amK.A05;
                str = this.A04;
                i = 2131964428;
                break;
            case 2:
                amK = (AmK) this.A01;
                lithoView = amK.A05;
                str = this.A04;
                i = 2131964423;
                break;
            default:
                ((DHE) this.A02).onFailure(th);
                return;
        }
        AmK.A03(lithoView, amK, str, i);
        amK.A0Y.remove(this.A02);
        AmK.A0A(amK);
    }
}
