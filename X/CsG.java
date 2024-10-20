package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;

/* loaded from: CsG.class */
public final class CsG implements DFm {
    public final Context A00;
    public final C1V A01;

    public CsG(Context context, C1V c1v) {
        11T.A0F(c1v, 1);
        this.A01 = c1v;
        this.A00 = context;
    }

    @Override // X.DFm
    public void CJc(int i) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(CB2.A01(this.A00));
        C1V c1v = this.A01;
        C1784AsI c1784AsI = c1v.A00.A0D;
        if (c1784AsI != null) {
            Integer A0k = 4YU.A0k();
            c1784AsI.A03 = new Integer[]{A0k, A0k, A0k, A0k};
        }
        c1v.A00(1Fj.A01(builder), -1);
    }
}
