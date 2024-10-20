package X;

import com.facebook.litho.LithoView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: Cpj.class */
public final /* synthetic */ class Cpj implements GF8 {
    public final /* synthetic */ AcQ A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF8
    public final void CJR(8Ks r302, int i) {
        BqX bqX;
        AcQ acQ = this.A00;
        C1784AsI c1784AsI = acQ.A0D;
        if (c1784AsI != null) {
            List A00 = CB2.A00(acQ.requireContext());
            if (i == 0) {
                bqX = A00.get(acQ.A0D.A00 - 1);
            } else {
                bqX = new BqX(0S2.A15, r302.A02, true);
            }
            String str = r302.A03;
            11T.A0G(bqX, 1, str);
            ArrayList A10 = 7zO.A10((Collection) c1784AsI.A02, 0);
            A10.set(c1784AsI.A00, bqX);
            c1784AsI.A02 = A10;
            int i2 = c1784AsI.A00 - 1;
            if (i2 >= 0) {
                Integer[] numArr = (Integer[]) c1784AsI.A03;
                if (i2 < numArr.length) {
                    numArr[i2] = Integer.valueOf(i);
                    Object[] objArr = (Object[]) c1784AsI.A01;
                    if (i == 0) {
                        str = "";
                    }
                    objArr[i2] = str;
                }
            }
            LithoView lithoView = acQ.A0E;
            if (lithoView != null) {
                AcQ.A0H(lithoView, acQ);
            }
            AcQ.A0Q(acQ, true);
        }
    }
}
