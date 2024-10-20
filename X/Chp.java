package X;

import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: Chp.class */
public final class Chp implements 2YG {
    public C0dr A00;
    public CJ8 A01;
    public CIq A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07 = BMK.A0D.analyticsName;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public static final BroadcastFlowMnetItem A00(Chq chq, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7 = str2;
        String str8 = str;
        C3o5.A0k(chq, 0, str5);
        int i = chq.A00;
        long A03 = AbG.A03(chq.A06);
        HashSet A0v = AnonymousClass001.A0v();
        if (str == null) {
            str8 = "bcfSessionId";
        }
        if (str7 == null) {
            str7 = "querySessionId";
        }
        ImmutableMap A10 = AbG.A10(1BK.A0c(), Long.valueOf(A03), AnonymousClass550.FACEBOOK);
        11T.A0A(A10);
        return new BroadcastFlowMnetItem(null, z ? BOR.A02 : BOR.A01, A10, null, null, null, null, str8, str4, str3, null, str7, chq.A07, null, null, null, null, str5, str6, null, chq.A08, null, A0v, i, 0, i, chq.A02, A03);
    }

    public void Bbt(List list) {
    }

    public void Bfy(C2k8 c2k8) {
        C1ps c1ps;
        if (this.A01 == null || this.A00 == null || (c1ps = c2k8.A05) == null) {
            return;
        }
        BroadcastFlowMnetItem A00 = A00((Chq) c1ps, this.A06, this.A05, this.A04, this.A03, this.A07, this.A08, this.A09);
        CJ8 cj8 = this.A01;
        String A002 = BWE.A00(A00);
        Long A13 = AbH.A13(this.A00);
        Integer A0h = 7zN.A0h();
        cj8.A04(A0h, A0h, A13, A00, A002);
    }

    public void Bfz(C2k8 c2k8) {
        C1ps c1ps;
        if (this.A01 == null || this.A00 == null || (c1ps = c2k8.A05) == null) {
            return;
        }
        BroadcastFlowMnetItem A00 = A00((Chq) c1ps, this.A06, this.A05, this.A04, this.A03, this.A07, this.A08, this.A09);
        this.A01.A01(AbH.A13(this.A00), A00, BWE.A00(A00));
    }

    public void CqK(boolean z) {
        this.A0A = z;
    }

    public void D79(C00p c00p, boolean z) {
        2YE r0;
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        CIq cIq = this.A02;
        if (cIq == null || z || (r0 = cIq.A0A) == null) {
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        int A00 = c00p.A00();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                r0.Bbs(A0s);
                return;
            }
            C2k8 c2k8 = (C2k8) c00p.A04(i2);
            if (c2k8 != null && c2k8.A05 != null) {
                A0s.add(c2k8);
            }
            i = i2 + 1;
        }
    }
}
