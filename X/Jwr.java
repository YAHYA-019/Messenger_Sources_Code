package X;

import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.widget.listcell.ListCell;
import java.util.Arrays;

/* loaded from: Jwr.class */
public final class Jwr extends AbstractC3052Jhk {
    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        View A01 = AbstractC3052Jhk.A01(viewGroup, this);
        11T.A0I(A01, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
        ListCell listCell = (ListCell) A01;
        if (this.A01) {
            listCell.A0G(KOS.A03);
        }
        return new Q3B(this, listCell);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x00da. Please report as an issue. */
    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ void A08(C2lb c2lb, FJC fjc) {
        KOW kow;
        Q3B q3b = (Q3B) c2lb;
        1BK.A1M(fjc, q3b);
        SelectionHeaderItem selectionHeaderItem = (SelectionHeaderItem) fjc.A01;
        if (selectionHeaderItem != null) {
            ListCell listCell = q3b.A00;
            String str = selectionHeaderItem.A01;
            if (str == null) {
                Integer num = selectionHeaderItem.A00;
                str = num != null ? listCell.getContext().getString(num.intValue()) : null;
            }
            listCell.A0R(str);
            String str2 = selectionHeaderItem.A02;
            if (str2 != null) {
                listCell.A04();
                Integer num2 = selectionHeaderItem.A03;
                if (num2 == 0S2.A0j) {
                    listCell.A0S(1BK.A15(JR0.A0y(), "%1s %2s", Arrays.copyOf(new Object[]{listCell.getContext().getString(2131956077), str2}, 2)));
                    listCell.A09(7zM.A0H(listCell, 2131367209), 24, 2132607301);
                } else if (num2 == 0S2.A0Y) {
                    listCell.A0S(str2);
                    listCell.A09(7zM.A0H(listCell, 2131367209), 23, 2132607300);
                }
            }
            switch (selectionHeaderItem.A03.intValue()) {
                case 0:
                    kow = KOW.A06;
                    listCell.A0J(kow);
                    return;
                case 1:
                    if (this.A01) {
                        TypedArray A0J = JR2.A0J(listCell);
                        View view = listCell.A01;
                        if (view == null) {
                            11T.A0L("containerView");
                            throw 0Q8.createAndThrow();
                        }
                        LBg.A00(A0J, view, 6, 2132607287);
                        A0J.recycle();
                        kow = KOW.A0J;
                        listCell.A0J(kow);
                        return;
                    }
                    kow = KOW.A09;
                    listCell.A0J(kow);
                    return;
                case 2:
                default:
                    Q11 q11 = new Q11(4YU.A08(listCell));
                    q11.A00(QuE.A0V);
                    listCell.A0I(q11);
                    RVu.A01(listCell, 0S2.A01, (String) null);
                    kow = KOW.A09;
                    listCell.A0J(kow);
                    return;
                case 3:
                    listCell.A0I(null);
                    kow = KOW.A09;
                    listCell.A0J(kow);
                    return;
            }
        }
    }
}
