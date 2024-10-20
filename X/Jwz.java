package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.listcell.ListCell;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: Jwz.class */
public final class Jwz extends AbstractC3052Jhk {
    public final Context A00;
    public final LifecycleOwner A01;
    public final C3033Jgw A02;
    public final QWp A03;
    public final java.util.Map A04;
    public final Function1 A05;
    public final Function1 A06;
    public final Function2 A07;
    public final 0Be A08;
    public final boolean A09;
    public final boolean A0A;

    public Jwz(Context context, LifecycleOwner lifecycleOwner, C3033Jgw c3033Jgw, LoggingContext loggingContext, QWp qWp, Function1 function1, Function1 function12, Function2 function2, 0Be r310, boolean z, boolean z2) {
        super(KP0.A06, loggingContext, false);
        this.A06 = function1;
        this.A05 = function12;
        this.A07 = function2;
        this.A08 = r310;
        this.A00 = context;
        this.A01 = lifecycleOwner;
        this.A0A = z;
        this.A09 = z2;
        this.A03 = qWp;
        this.A02 = c3033Jgw;
        this.A04 = 1BK.A1C();
    }

    public static final void A03(Jx0 jx0) {
        ListCell listCell = jx0.A02;
        listCell.setOnClickListener(null);
        listCell.A0R(null);
        listCell.A0S(null);
        listCell.A0U(null);
        listCell.A0P(null);
        7zQ.A19(listCell.A07);
        listCell.A0B(null);
        listCell.A0A(null);
        listCell.A0Q(null);
        listCell.A0L(0S2.A0Y);
        Integer num = 0S2.A00;
        listCell.A0M(num);
        listCell.A0N(num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x02f5, code lost:
    
        if (r306 == null) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A04(X.Jx0 r301, X.Jwz r302, X.FJC r303) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jwz.A04(X.Jx0, X.Jwz, X.FJC):void");
    }

    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ C2lb A07(ViewGroup viewGroup) {
        11T.A0F(viewGroup, 0);
        Context A08 = 4YU.A08(viewGroup);
        FrameLayout q0y = new Q0y(A08);
        InlineActionMenu A00 = AbstractC3052Jhk.A00(A08, viewGroup);
        View A002 = C06014fk.A0A().A00(A08, viewGroup, KP0.A06);
        11T.A0I(A002, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
        ListCell listCell = (ListCell) A002;
        listCell.A0G(KOS.A02);
        listCell.A0C(q0y);
        C2lb c2lb = null;
        if (this.A09) {
            QWp qWp = this.A03;
            if (qWp != null) {
                c2lb = qWp.A07(viewGroup);
            }
            11T.A0I(c2lb, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.ecp.InlineFormViewBinder.InlineFormViewHolder");
            c2lb = (Q3D) c2lb;
        }
        return new Jx0(A00, this, c2lb, listCell, q0y);
    }

    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ void A08(C2lb c2lb, FJC fjc) {
        KOW kow;
        Jx0 jx0 = (Jx0) c2lb;
        11T.A0H(fjc, jx0);
        if (!FJC.A0C(fjc)) {
            if (FJC.A0B(fjc)) {
                A03(jx0);
                InlineActionMenu inlineActionMenu = jx0.A00;
                inlineActionMenu.A02((View.OnClickListener) null);
                inlineActionMenu.A03((View.OnClickListener) null);
                C2rp.A02(jx0.A02, 0S2.A00);
                return;
            }
            if (FJC.A0A(fjc)) {
                ListCell listCell = jx0.A02;
                listCell.A06();
                listCell.setOnClickListener(null);
                InlineActionMenu inlineActionMenu2 = jx0.A00;
                inlineActionMenu2.A02((View.OnClickListener) null);
                inlineActionMenu2.A03((View.OnClickListener) null);
                return;
            }
            return;
        }
        A04(jx0, this, fjc);
        Object obj = fjc.A01;
        if (obj == null) {
            throw 1BK.A0h();
        }
        SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) obj;
        ListCell listCell2 = jx0.A02;
        Context context = listCell2.getContext();
        boolean A1W = AnonymousClass001.A1W(selectionPaymentMethodItem.A09, EnumC3490Mfk.A06);
        InlineActionMenu inlineActionMenu3 = jx0.A00;
        inlineActionMenu3.A02(new LKL(fjc, this, 25));
        if (selectionPaymentMethodItem.A0K) {
            inlineActionMenu3.A01();
        } else {
            inlineActionMenu3.A03(new Rjh(context, selectionPaymentMethodItem, jx0, this, fjc, A1W));
        }
        if (selectionPaymentMethodItem.A06) {
            kow = KOW.A0B;
        } else {
            jx0.A03.setVisibility(8);
            inlineActionMenu3.setVisibility(8);
            listCell2.A0B(null);
            listCell2.setClickable(false);
            kow = KOW.A04;
        }
        listCell2.A0J(kow);
    }
}
