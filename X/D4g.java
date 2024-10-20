package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* loaded from: D4g.class */
public final class D4g implements 1K9 {
    public final /* synthetic */ BOF A00;
    public final /* synthetic */ DK4 A01;
    public final /* synthetic */ Cbc A02;
    public final /* synthetic */ ImmutableMap A03;
    public final /* synthetic */ ImmutableMap A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public D4g(BOF bof, DK4 dk4, Cbc cbc, ImmutableMap immutableMap, ImmutableMap immutableMap2, String str, String str2, String str3) {
        this.A02 = cbc;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = dk4;
        this.A03 = immutableMap;
        this.A04 = immutableMap2;
        this.A00 = bof;
        this.A05 = str3;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        Cbc cbc = this.A02;
        cbc.A00.setException(th);
        if (cbc.A0F) {
            I5L A0P = AbN.A0P(cbc);
            BOR bor = Cbc.A0J;
            BOF bof = this.A00;
            String message = th.getMessage();
            1Br.A0C(((CIl) 1Br.A0B(cbc.A0A)).A03);
            A0P.A01(bof, bor, message, 1, 0, C7t3.A00());
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImmutableList immutableList = (ImmutableList) obj;
        11T.A0F(immutableList, 0);
        Cbc cbc = this.A02;
        boolean z = cbc.A0F;
        if (z) {
            AbN.A0P(cbc).A02(Cbc.A0J);
        }
        C8v c8v = (C8v) 1Br.A0B(cbc.A07);
        String str = this.A06;
        cbc.A00.set(c8v.A02(Cbc.A0I, this.A01, immutableList, this.A03, this.A04, str, this.A07));
        if (z) {
            I5L A0P = AbN.A0P(cbc);
            BOR bor = Cbc.A0J;
            BOF bof = this.A00;
            int size = immutableList.size();
            String str2 = this.A05;
            1Br.A0C(((CIl) 1Br.A0B(cbc.A0A)).A03);
            A0P.A01(bof, bor, str2, 0, size, C7t3.A00());
        }
    }
}
