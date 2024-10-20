package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.listcell.ListCell;
import kotlin.jvm.functions.Function1;

/* loaded from: Jwy.class */
public final class Jwy extends AbstractC3052Jhk {
    public final Context A00;
    public final LifecycleOwner A01;
    public final Function1 A02;
    public final Function1 A03;
    public final Function1 A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jwy(Context context, LifecycleOwner lifecycleOwner, LoggingContext loggingContext, Function1 function1, Function1 function12, Function1 function13, boolean z) {
        super(KP0.A07, loggingContext, false);
        11T.A0F(function1, 2);
        this.A04 = function1;
        this.A02 = function12;
        this.A03 = function13;
        this.A00 = context;
        this.A01 = lifecycleOwner;
        this.A05 = z;
    }

    public static final void A03(JiA jiA, Jwy jwy, FJC fjc) {
        ListCell listCell = jiA.A01;
        listCell.A06();
        SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) fjc.A01;
        if (selectionShippingAddressItem != null) {
            listCell.A0R(selectionShippingAddressItem.A03);
            listCell.A0S(selectionShippingAddressItem.A02);
            listCell.A0U(selectionShippingAddressItem.A04);
            String str = null;
            listCell.A0A(selectionShippingAddressItem.A0H ? jiA.A00 : null);
            String str2 = selectionShippingAddressItem.A05;
            if (str2 == null) {
                Integer num = selectionShippingAddressItem.A00;
                if (num != null) {
                    str = jwy.A00.getString(num.intValue());
                }
            } else {
                str = str2;
            }
            listCell.A0P(str);
        }
        FrameLayout frameLayout = listCell.A07;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        listCell.setOnClickListener(new LKM(12, jiA, fjc, jwy));
    }

    @Override // X.AbstractC3052Jhk
    public C2lb A07(ViewGroup viewGroup) {
        11T.A0F(viewGroup, 0);
        Context A08 = 4YU.A08(viewGroup);
        FrameLayout q0y = new Q0y(A08);
        InlineActionMenu A00 = AbstractC3052Jhk.A00(A08, viewGroup);
        ListCell A02 = AbstractC3052Jhk.A02(A08, viewGroup, KP0.A07, C06014fk.A0A());
        A02.A0J(KOW.A0B);
        A02.A0G(KOS.A02);
        A02.A0C(q0y);
        if (this.A05) {
            ListCell.A02(A02, false, true);
        }
        return new JiA(this, A00, A02, q0y);
    }

    @Override // X.AbstractC3052Jhk
    public /* bridge */ /* synthetic */ void A08(C2lb c2lb, final FJC fjc) {
        String str;
        final JiA jiA = (JiA) c2lb;
        11T.A0H(fjc, jiA);
        String str2 = null;
        if (!FJC.A0C(fjc)) {
            if (FJC.A0B(fjc)) {
                ListCell listCell = jiA.A01;
                listCell.setOnClickListener(null);
                InlineActionMenu inlineActionMenu = jiA.A00;
                inlineActionMenu.A02((View.OnClickListener) null);
                inlineActionMenu.A03((View.OnClickListener) null);
                C2rp.A02(listCell, 0S2.A00);
                return;
            }
            if (FJC.A0A(fjc)) {
                ListCell listCell2 = jiA.A01;
                listCell2.A06();
                listCell2.A0R(listCell2.getContext().getString(2131956057));
                listCell2.A0K(KOv.A0W);
                listCell2.setOnClickListener(null);
                InlineActionMenu inlineActionMenu2 = jiA.A00;
                inlineActionMenu2.A02((View.OnClickListener) null);
                inlineActionMenu2.A03((View.OnClickListener) null);
                return;
            }
            return;
        }
        Object obj = fjc.A01;
        if (obj == null) {
            throw 1BK.A0h();
        }
        final SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) obj;
        ListCell listCell3 = jiA.A01;
        final Context context = listCell3.getContext();
        A03(jiA, this, fjc);
        String str3 = selectionShippingAddressItem.A09;
        if (str3 != null) {
            0G2 r0 = listCell3.A0W;
            C06z[] c06zArr = ListCell.A0q;
            JQz.A1J(listCell3, str3, r0, c06zArr, 3);
            JQz.A1J(listCell3, Integer.valueOf(DKC.A04(context.getResources())), listCell3.A0Y, c06zArr, 11);
            JQz.A1J(listCell3, Float.valueOf(context.getResources().getDimension(2132279337)), listCell3.A0X, c06zArr, 10);
        }
        Q0y q0y = jiA.A02;
        q0y.A01(AnonymousClass001.A1W(selectionShippingAddressItem.A01, 0S2.A0C));
        listCell3.A0C(q0y);
        listCell3.A05();
        if (JQz.A0g(listCell3, listCell3.A0T, ListCell.A0q, 12) != null) {
            str2 = context.getString(2131951945);
            str = context.getString(2131956120);
        } else {
            str = null;
        }
        Rga.A02(selectionShippingAddressItem, listCell3, str2, str);
        InlineActionMenu inlineActionMenu3 = jiA.A00;
        inlineActionMenu3.A04(1BK.A0u(context, 2131956106));
        inlineActionMenu3.A05(1BK.A0u(context, 2131956217));
        if (selectionShippingAddressItem.A0H) {
            inlineActionMenu3.A02(new LKL(fjc, this, 17));
            final int i = 3;
            inlineActionMenu3.A03(new View.OnClickListener(i, context, selectionShippingAddressItem, fjc, this, jiA) { // from class: X.9pf
                public final int A00;
                public final Object A01;
                public final Object A02;
                public final Object A03;
                public final Object A04;
                public final Object A05;

                {
                    this.A00 = i;
                    this.A05 = this;
                    this.A02 = selectionShippingAddressItem;
                    this.A04 = jiA;
                    this.A01 = context;
                    this.A03 = fjc;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Throwable, java.util.concurrent.Executor] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r302) {
                    /*
                        Method dump skipped, instructions count: 621
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9pf.onClick(android.view.View):void");
                }
            });
        }
    }
}
