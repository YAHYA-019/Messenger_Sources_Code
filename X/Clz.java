package X;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: Clz.class */
public final class Clz implements DIc {
    public ImmutableMap A00 = RegularImmutableMap.A03;
    public final 1De A01;

    public Clz(1De r302) {
        this.A01 = r302;
    }

    @Override // X.DIc
    public void ARz(C46 c46, ImmutableMap immutableMap) {
        this.A00 = immutableMap;
        c46.A00();
    }

    @Override // X.DIc
    public String Ah0() {
        Context A04 = AbI.A04(this.A01);
        String A1C = AbF.A1C(this.A00, "plan_other_member_name");
        Boolean valueOf = Boolean.valueOf(AbF.A1C(this.A00, "is_buyer"));
        if (A1C == null || A1C.length() == 0) {
            return 1BK.A0u(A04, 2131965825);
        }
        11T.A0D(valueOf);
        int i = 2131965828;
        if (valueOf.booleanValue()) {
            i = 2131965829;
        }
        String A0v = 1BK.A0v(A04, A1C, i);
        11T.A0D(A0v);
        return A0v;
    }

    @Override // X.DIc
    public 2Jd B6k() {
        2Jd r0 = new 2Jd(85);
        String A1C = AbF.A1C(this.A00, "plan_other_member_name");
        if (A1C != null) {
            r0.A09("plan_other_member_name", A1C);
        }
        return r0;
    }

    @Override // X.DIc
    public String B6l() {
        Context A04 = AbI.A04(this.A01);
        String A1C = AbF.A1C(this.A00, "sharer_name");
        String string = (A1C == null || A1C.length() == 0) ? A04.getString(2131965827) : 1BK.A0v(A04, A1C, 2131965826);
        11T.A0A(string);
        return string;
    }

    @Override // X.DIc
    public String B6m() {
        return "MARKETPLACE";
    }
}
