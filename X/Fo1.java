package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.payments.ui.PaymentsComponentViewGroup;

/* loaded from: Fo1.class */
public final class Fo1 implements GFq {
    public final Fo5 A00 = (Fo5) 1Bn.A0A(98988);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.payments.ui.PaymentsComponentViewGroup] */
    /* JADX WARN: Type inference failed for: r302v0, types: [android.view.View] */
    @Override // X.GFq
    public View BK1(View view, ViewGroup viewGroup, GFt gFt, ETu eTu) {
        48A r302;
        if (gFt.B8P().ordinal() != 11) {
            return this.A00.BK1(view, viewGroup, gFt, eTu);
        }
        if (view == 0) {
            r302 = new 48A(viewGroup.getContext());
            r302.setContentView(2132543343);
            ((E7I) r302).A00 = AbG.A09(r302, 2131367401);
        } else {
            r302 = (PaymentsComponentViewGroup) view;
        }
        r302.A00 = eTu;
        throw AnonymousClass001.A0Q("title");
    }
}
