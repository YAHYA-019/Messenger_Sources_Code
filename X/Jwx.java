package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.listcell.ListCell;
import kotlin.jvm.functions.Function1;

/* loaded from: Jwx.class */
public final class Jwx extends AbstractC3052Jhk {
    public final Context A00;
    public final LifecycleOwner A01;
    public final Function1 A02;
    public final Function1 A03;
    public final Function1 A04;
    public final C0Bd A05;

    public Jwx(Context context, LifecycleOwner lifecycleOwner, LoggingContext loggingContext, Function1 function1, Function1 function12, Function1 function13, C0Bd c0Bd) {
        super(KP0.A0r, loggingContext, false);
        this.A04 = function1;
        this.A02 = function12;
        this.A03 = function13;
        this.A05 = c0Bd;
        this.A00 = context;
        this.A01 = lifecycleOwner;
    }

    public static final void A03(C3071Ji9 c3071Ji9, Jwx jwx, FJC fjc) {
        ListCell listCell = c3071Ji9.A01;
        listCell.A06();
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) fjc.A01;
        if (selectionPhoneNumberViewItem != null) {
            listCell.A0R(selectionPhoneNumberViewItem.A01);
            JQz.A1J(listCell, selectionPhoneNumberViewItem.A03, listCell.A0W, ListCell.A0q, 3);
        }
        FrameLayout frameLayout = listCell.A07;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        listCell.A0A(c3071Ji9.A00);
        listCell.setOnClickListener(new LKM(c3071Ji9, jwx, fjc, 11));
    }

    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        11T.A0F(viewGroup, 0);
        Context A08 = 4YU.A08(viewGroup);
        FrameLayout q0y = new Q0y(A08);
        InlineActionMenu A00 = AbstractC3052Jhk.A00(A08, viewGroup);
        ListCell A02 = AbstractC3052Jhk.A02(A08, viewGroup, KP0.A0r, C06014fk.A0A());
        A02.A0J(KOW.A07);
        A02.A0G(KOS.A02);
        A02.A0C(q0y);
        A02.A0A(A00);
        A02.A07();
        return new C3071Ji9(this, A00, A02, q0y);
    }

    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ void A08(C2lb c2lb, FJC fjc) {
        C3071Ji9 c3071Ji9 = (C3071Ji9) c2lb;
        11T.A0H(fjc, c3071Ji9);
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) fjc.A01;
        if (selectionPhoneNumberViewItem != null) {
            ListCell listCell = c3071Ji9.A01;
            Q0y q0y = c3071Ji9.A02;
            q0y.A01(AnonymousClass001.A1W(selectionPhoneNumberViewItem.A00, 0S2.A0C));
            listCell.A0C(q0y);
            if (!selectionPhoneNumberViewItem.A05) {
                c3071Ji9.A00.A00();
            } else if (!selectionPhoneNumberViewItem.A06) {
                c3071Ji9.A00.A01();
            }
            listCell.A05();
            Rga.A02(selectionPhoneNumberViewItem, listCell, (String) null, (String) null);
            InlineActionMenu inlineActionMenu = c3071Ji9.A00;
            Context context = listCell.getContext();
            inlineActionMenu.A04(1BK.A0u(context, 2131956105));
            inlineActionMenu.A05(1BK.A0u(context, 2131956216));
        }
        if (FJC.A0C(fjc) || FJC.A0A(fjc)) {
            A03(c3071Ji9, this, fjc);
            InlineActionMenu inlineActionMenu2 = c3071Ji9.A00;
            inlineActionMenu2.A02(new LKL(fjc, this, 16));
            inlineActionMenu2.A03(new LKM(c3071Ji9, this, fjc, 10));
            return;
        }
        ListCell listCell2 = c3071Ji9.A01;
        listCell2.setOnClickListener(null);
        InlineActionMenu inlineActionMenu3 = c3071Ji9.A00;
        inlineActionMenu3.A02((View.OnClickListener) null);
        inlineActionMenu3.A03((View.OnClickListener) null);
        C2rp.A02(listCell2, 0S2.A00);
    }
}
