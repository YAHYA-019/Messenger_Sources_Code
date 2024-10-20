package X;

import android.view.ViewGroup;
import com.facebook.payments.ui.PaymentsComponentViewGroup;
import java.util.List;

/* loaded from: Fm2.class */
public final class Fm2 implements GFU {
    public DTE Bs5(ViewGroup viewGroup, GOR gor) {
        QpY Ado = gor.Ado();
        switch (Ado.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
                break;
            case 1:
                if (((RuB) gor).A01) {
                    List list = C2lb.A0J;
                    return new C2lb((PaymentsComponentViewGroup) AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543589));
                }
                break;
            case 2:
                List list2 = C2lb.A0J;
                return new C2lb(AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543591));
            case 3:
            default:
                throw AnonymousClass001.A0q(AnonymousClass001.A0Z(Ado, "Unhandled row : ", AnonymousClass001.A0k()));
            case 4:
                List list3 = C2lb.A0J;
                return new C2lb((PaymentsComponentViewGroup) AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543592));
            case 8:
                List list4 = C2lb.A0J;
                return new C2lb((PaymentsComponentViewGroup) AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543582));
            case 9:
                List list5 = C2lb.A0J;
                return new C2lb((PaymentsComponentViewGroup) AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543583));
            case 10:
                List list6 = C2lb.A0J;
                return new C2lb(AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543580));
            case 11:
                List list7 = C2lb.A0J;
                return new C2lb(AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543579));
            case 12:
                List list8 = C2lb.A0J;
                return new C2lb(new QSR(viewGroup.getContext()));
        }
        List list9 = C2lb.A0J;
        return new C2lb(AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543590));
    }
}
