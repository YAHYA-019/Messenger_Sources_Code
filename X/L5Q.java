package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.List;

/* loaded from: L5Q.class */
public final class L5Q {
    public K8K A00;
    public final K8M A01;
    public final Context A02;

    public L5Q(K8M k8m) {
        this.A01 = k8m;
        this.A02 = 4YU.A08(((LBS) k8m).A0D);
    }

    public static final L5Q A00(View view, String str, int i, int i2) {
        11T.A0F(str, 1);
        Resources resources = view.getResources();
        L5Q A00 = KXg.A00(view, str, i);
        A00.A06(resources.getColor(2132213766));
        A00.A04(resources.getColor(i2));
        return A00;
    }

    public final void A01() {
        this.A01.A07(3);
    }

    public final void A02() {
        K8M k8m = this.A01;
        ((LBS) k8m).A0D.addOnAttachStateChangeListener(new LK9(this, 6));
        if (DKE.A0c().AZk(72339292356411886L)) {
            ((1Od) 1Bi.A03(16616)).A09();
        }
        k8m.A06();
    }

    public final void A03(int i) {
        View requireViewById = ((LBS) this.A01).A0D.requireViewById(2131367430);
        11T.A0I(requireViewById, "null cannot be cast to non-null type android.widget.Button");
        ((TextView) requireViewById).setTextColor(i);
    }

    public final void A04(int i) {
        ((LBS) this.A01).A0D.setBackground(new ColorDrawable(i));
    }

    public final void A05(int i) {
        View requireViewById = ((LBS) this.A01).A0D.requireViewById(2131367431);
        11T.A0I(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) requireViewById).setMaxLines(i);
    }

    public final void A06(int i) {
        View requireViewById = ((LBS) this.A01).A0D.requireViewById(2131367431);
        11T.A0I(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) requireViewById).setTextColor(i);
    }

    public final void A07(View.OnClickListener onClickListener, int i) {
        this.A01.A0C(onClickListener, this.A02.getString(i));
    }

    public final void A08(K8K k8k) {
        List list;
        this.A00 = k8k;
        K8M k8m = this.A01;
        KT3 kt3 = k8m.A00;
        if (kt3 != null && (list = ((LBS) k8m).A08) != null) {
            list.remove(kt3);
        }
        List list2 = ((LBS) k8m).A08;
        if (list2 == null) {
            list2 = AnonymousClass001.A0s();
            ((LBS) k8m).A08 = list2;
        }
        list2.add(k8k);
        k8m.A00 = k8k;
    }

    public final boolean A09() {
        boolean A03;
        K8M k8m = this.A01;
        LCp A00 = LCp.A00();
        MDJ mdj = ((LBS) k8m).A07;
        synchronized (A00.A03) {
            A03 = LCp.A03(mdj, A00);
        }
        return A03;
    }
}
