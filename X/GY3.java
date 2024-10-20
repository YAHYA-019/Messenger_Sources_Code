package X;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: GY3.class */
public final class GY3 extends 0NL {
    public HTV A00;
    public final IWI A01 = new IWI(this);
    public final List A02;

    public GY3(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                this.A02 = 1Fj.A01(builder);
                A0I(0);
                return;
            }
            IA8 ia8 = new IA8(i2);
            IA8.A01(ia8, this.A01);
            ia8.A00 = GOq.A06((Pair) list.get(i2));
            IA8.A00(ia8);
            ia8.A02 = (String) ((Pair) list.get(i2)).second;
            builder.m11011add((Object) ia8);
            i = i2 + 1;
        }
    }

    public int A0C() {
        List list = this.A02;
        return (list.size() / 7) + (AnonymousClass001.A1P(list.size() % 7) ? 1 : 0);
    }

    public Object A0E(ViewGroup viewGroup, int i) {
        11T.A0F(viewGroup, 0);
        int i2 = i * 7;
        int i3 = i2 + 7;
        List list = this.A02;
        List subList = list.subList(i2, Math.min(i3, list.size()));
        View inflate = DKD.A0A(viewGroup).inflate(2132541714, viewGroup, false);
        11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        viewGroup.addView(viewGroup2);
        11T.A0F(viewGroup2, 1);
        11T.A0F(subList, 0);
        HI9.A00(viewGroup2, subList.size(), false);
        int size = subList.size();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= size) {
                return viewGroup2;
            }
            Object tag = viewGroup2.getChildAt(i5).getTag();
            if (tag == null) {
                throw 1BK.A0h();
            }
            ((I8N) tag).A01((IA8) subList.get(i5));
            i4 = i5 + 1;
        }
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
    }

    public boolean A0H(View view, Object obj) {
        11T.A0H(view, obj);
        return AnonymousClass001.A1W(view, obj);
    }

    public final void A0I(int i) {
        List list = this.A02;
        IA8 ia8 = (IA8) ((i < 0 || i >= list.size()) ? (IA8) list.get(0) : list.get(i));
        ia8.A05 = true;
        IA8.A00(ia8);
    }
}
