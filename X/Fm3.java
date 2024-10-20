package X;

import android.view.ViewGroup;
import com.facebook.payments.ui.PaymentsComponentViewGroup;
import java.util.List;

/* loaded from: Fm3.class */
public final class Fm3 implements GFU {
    public final Fm2 A00 = (Fm2) 1Bn.A0A(99013);

    public DTE Bs5(ViewGroup viewGroup, GOR gor) {
        switch (gor.Ado().ordinal()) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 7:
                List list = C2lb.A0J;
                return new C2lb((PaymentsComponentViewGroup) AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543595));
            case 2:
            case 3:
            case 9:
            default:
                return this.A00.Bs5(viewGroup, gor);
            case 4:
                List list2 = C2lb.A0J;
                return new C2lb((PaymentsComponentViewGroup) AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543596));
            case 8:
                List list3 = C2lb.A0J;
                return new C2lb(AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543593));
            case 10:
                List list4 = C2lb.A0J;
                return new C2lb(AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543594));
        }
    }
}
