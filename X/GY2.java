package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: GY2.class */
public final class GY2 extends 0NL {
    public List A00 = C0ty.A00;
    public final Context A01;

    public GY2(Context context) {
        this.A01 = context;
    }

    public int A0C() {
        return this.A00.size();
    }

    public int A0D(Object obj) {
        View view;
        11T.A0F(obj, 0);
        Object obj2 = null;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            obj2 = view.getTag();
        }
        int i = 0;
        for (Object obj3 : this.A00) {
            int i2 = i + 1;
            if (i < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            int type = ((JOL) obj3).getType();
            if ((obj2 instanceof Integer) && type == AnonymousClass001.A03(obj2)) {
                return i;
            }
            i = i2;
        }
        return -2;
    }

    public Object A0E(ViewGroup viewGroup, int i) {
        11T.A0F(viewGroup, 0);
        JOL jol = (JOL) this.A00.get(i);
        View Az5 = jol.Az5(this.A01);
        Az5.setTag(Integer.valueOf(jol.getType()));
        viewGroup.addView(Az5);
        return Az5;
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        4YV.A1N(viewGroup, obj);
        viewGroup.removeView(obj instanceof View ? (View) obj : null);
    }

    public boolean A0H(View view, Object obj) {
        11T.A0H(view, obj);
        return view.equals(obj);
    }
}
