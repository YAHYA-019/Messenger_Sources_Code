package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Co7.class */
public final class Co7 implements DFV {
    public final /* synthetic */ CQ1 A00;

    public Co7(CQ1 cq1) {
        this.A00 = cq1;
    }

    public void C9A(ImmutableList immutableList, boolean z) {
        11T.A0F(immutableList, 0);
        CQ1 cq1 = this.A00;
        if (cq1.A0A) {
            CHR chr = cq1.A02;
            if (chr == null) {
                11T.A0L("omnipickerSearchRankingManager");
                throw 0Q8.createAndThrow();
            }
            chr.A01(cq1.A04(immutableList), cq1.A07, z, true);
            C6Q A00 = CQ1.A00(cq1);
            cq1.A0B = A00 != null ? A00.A01 : false;
        }
    }
}
