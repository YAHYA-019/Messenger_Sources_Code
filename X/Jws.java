package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem;
import com.facebookpay.widget.listcell.ListCell;

/* loaded from: Jws.class */
public final class Jws extends AbstractC3052Jhk {
    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        View A01 = AbstractC3052Jhk.A01(viewGroup, this);
        11T.A0I(A01, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
        ListCell listCell = (ListCell) A01;
        if (this.A01) {
            listCell.A0G(KOS.A03);
        }
        return new Q3C(this, listCell);
    }

    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ void A08(C2lb c2lb, FJC fjc) {
        Q3C q3c = (Q3C) c2lb;
        boolean A1X = 1BL.A1X(fjc, q3c);
        SelectionTextViewItem selectionTextViewItem = (SelectionTextViewItem) fjc.A01;
        if (selectionTextViewItem != null) {
            String str = selectionTextViewItem.A01;
            if ((str == null || 0CU.A0O(str)) && selectionTextViewItem.A00 == null) {
                return;
            }
            ListCell listCell = q3c.A00;
            String str2 = null;
            ListCell.A02(listCell, false, A1X);
            if (str == null) {
                Integer num = selectionTextViewItem.A00;
                if (num != null) {
                    str2 = listCell.getContext().getString(num.intValue());
                }
            } else {
                str2 = str;
            }
            listCell.A0R(str2);
            listCell.A09(7zM.A0H(listCell, 2131366672), 25, 2132607303);
            listCell.A0K(KOv.A12);
            if (selectionTextViewItem.A02) {
                View view = listCell.A02;
                if (view == null) {
                    11T.A0L("dividerView");
                    throw 0Q8.createAndThrow();
                }
                view.setVisibility(0);
                FAF A04 = C06014fk.A04();
                7zN.A11(listCell);
                AbH.A1K(view, A04.A01(19));
            }
        }
    }
}
