package X;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: Cly.class */
public final class Cly implements DIc {
    public ImmutableMap A00 = RegularImmutableMap.A03;
    public final 1De A01;

    public Cly(1De r302) {
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
        String A1C = AbF.A1C(this.A00, "date_name");
        String string = (A1C == null || A1C.length() == 0) ? A04.getString(2131957218) : 1BK.A0v(A04, A1C, 2131957217);
        11T.A0A(string);
        return string;
    }

    @Override // X.DIc
    public 2Jd B6k() {
        2Jd r0 = new 2Jd(85);
        String A1C = AbF.A1C(this.A00, "date_name");
        if (A1C != null) {
            r0.A09("date_name", A1C);
        }
        return r0;
    }

    @Override // X.DIc
    public String B6l() {
        Context A04 = AbI.A04(this.A01);
        String A1C = AbF.A1C(this.A00, "sharer_name");
        String string = (A1C == null || A1C.length() == 0) ? A04.getString(2131957220) : 1BK.A0v(A04, A1C, 2131957219);
        11T.A0A(string);
        return string;
    }

    @Override // X.DIc
    public String B6m() {
        return "DATING";
    }
}
