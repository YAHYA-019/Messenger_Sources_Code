package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.BitSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Duy.class */
public final class Duy extends 1LH {
    public final List A00;
    public final Function1 A01;

    public Duy(List list, Function1 function1) {
        this.A00 = list;
        this.A01 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        List list = (List) 2rO.A00(c2k5, new AQl(this, 38), new Object[]{this.A00});
        DsJ dsJ = new DsJ(new DzL(), c2k5.A05);
        DzL dzL = dsJ.A00;
        dzL.A00 = 500;
        BitSet bitSet = dsJ.A02;
        bitSet.set(0);
        dzL.A01 = 6000;
        bitSet.set(1);
        if (list != null) {
            if (dzL.A04.isEmpty()) {
                dzL.A04 = list;
            } else {
                dzL.A04.addAll(list);
            }
        }
        dzL.A03 = CallerContext.A0B("HTImmersiveSlideshowBackgroundComponent");
        dsJ.A10(100.0f);
        dsJ.A0m(100.0f);
        7zR.A1A(dsJ, new AVD(this, 7));
        C1rs.A00(bitSet, dsJ.A03);
        dsJ.A0J();
        return dzL;
    }
}
