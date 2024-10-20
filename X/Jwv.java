package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import kotlin.jvm.functions.Function1;

/* loaded from: Jwv.class */
public final class Jwv extends AbstractC3052Jhk {
    public final Function1 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jwv(LoggingContext loggingContext, Function1 function1) {
        super(KP0.A0p, loggingContext, false);
        11T.A0F(function1, 1);
        this.A00 = function1;
    }

    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        11T.A0F(viewGroup, 0);
        Context A08 = 4YU.A08(viewGroup);
        Q11 q11 = new Q11(A08);
        q11.A00(QuE.A0G);
        ListCell A02 = AbstractC3052Jhk.A02(A08, viewGroup, KP0.A0p, C06014fk.A0A());
        A02.A0J(KOW.A07);
        return new Q3M(this, A02, q11);
    }

    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ void A08(C2lb c2lb, FJC fjc) {
        ListCell listCell;
        int i;
        Q11 q11;
        Q3M q3m = (Q3M) c2lb;
        11T.A0H(fjc, q3m);
        Object obj = fjc.A01;
        SelectionNameViewItem selectionNameViewItem = (SelectionNameViewItem) obj;
        if (selectionNameViewItem != null) {
            ListCell listCell2 = q3m.A00;
            listCell2.A0R(selectionNameViewItem.A01);
            Integer num = selectionNameViewItem.A00;
            Integer num2 = 0S2.A01;
            if (num == num2) {
                RVu.A01(listCell2, num2, listCell2.getContext().getString(2131956102));
                q11 = q3m.A01;
            } else {
                RVu.A01(listCell2, 0S2.A00, (String) null);
                q11 = null;
            }
            listCell2.A0I(q11);
        }
        if (FJC.A0C(fjc)) {
            if (obj == null) {
                throw 1BK.A0h();
            }
            if (selectionNameViewItem.A00 != 0S2.A01) {
                q3m.A00.setOnClickListener(null);
                return;
            } else {
                listCell = q3m.A00;
                i = 21;
            }
        } else if (!FJC.A0A(fjc)) {
            q3m.A00.setOnClickListener(null);
            return;
        } else {
            listCell = q3m.A00;
            i = 22;
        }
        LKL.A00(listCell, fjc, this, i);
    }
}
