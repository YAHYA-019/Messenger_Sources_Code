package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: GY7.class */
public final class GY7 extends 0NL {
    public JLC A00;
    public Object A04;
    public final 1FP A05 = (1FP) 1Bi.A03(67765);
    public ImmutableList A01 = ImmutableList.of();
    public Queue A02 = AbF.A1F();
    public 0AE A03 = new 0AE();

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(android.view.ViewGroup r301, X.GY7 r302, java.lang.Object r303) {
        /*
            r0 = r302
            X.JLC r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r303
            int r0 = r0.AsS(r1)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = -1
            r308 = r0
            r0 = r305
            r1 = r308
            if (r0 == r1) goto Lb2
            r0 = r302
            X.0AE r0 = r0.A03
            r304 = r0
            r0 = r304
            r1 = r305
            java.lang.Object r0 = X.C0Ak.A00(r0, r1)
            java.util.List r0 = (java.util.List) r0
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Lb5
            r0 = r309
            int r0 = r0.size()
            r308 = r0
            r0 = r308
            if (r0 <= 0) goto Lb5
            r0 = r309
            r1 = r306
            int r0 = X.GOn.A0A(r0, r1)
            r308 = r0
            r0 = r309
            r1 = r308
            java.lang.Object r0 = r0.remove(r1)
            android.view.View r0 = (android.view.View) r0
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb5
            java.lang.Class<X.GY7> r0 = X.GY7.class
            r310 = r0
            java.lang.String r0 = "Instantiating position (recycled)"
            r304 = r0
        L64:
            r0 = r310
            r1 = r304
            X.0fH.A0D(r0, r1)
            r0 = r302
            X.JLC r0 = r0.A00
            r311 = r0
            r0 = r302
            java.lang.Object r0 = r0.A04
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L7d
            r0 = 0
            r306 = r0
        L7d:
            r0 = r311
            r1 = r307
            r2 = r301
            r3 = r303
            r4 = r306
            android.view.View r0 = r0.BK7(r1, r2, r3, r4)
            r311 = r0
            r0 = r307
            if (r0 == 0) goto Lab
            r0 = r311
            r1 = r307
            if (r0 == r1) goto Lab
            java.lang.String r0 = "Adapter did not recycle page"
            r304 = r0
            r0 = r310
            r1 = r304
            X.0fH.A0A(r0, r1)
            r0 = r309
            r1 = r307
            boolean r0 = r0.add(r1)
        Lab:
            r0 = r301
            r1 = r311
            r0.addView(r1)
            return
        Lb2:
            r0 = 0
            r309 = r0
        Lb5:
            java.lang.Class<X.GY7> r0 = X.GY7.class
            r310 = r0
            java.lang.String r0 = "Instantiating position (new)"
            r304 = r0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GY7.A00(android.view.ViewGroup, X.GY7, java.lang.Object):void");
    }

    public static void A01(GY7 gy7) {
        if (gy7.A02.isEmpty()) {
            return;
        }
        3Ds r0 = 3Ds.A02;
        gy7.A05.D3D(r0, 0S2.A00, new IsK(gy7), "TabbedPagerAdapter");
    }

    public int A0C() {
        return this.A01.size();
    }

    public int A0D(Object obj) {
        int indexOf = this.A01.indexOf(((Hea) obj).A02);
        if (indexOf < 0) {
            indexOf = -2;
        }
        return indexOf;
    }

    public Object A0E(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        Hea hea = new Hea(frameLayout, this.A01.get(i), i);
        this.A02.offer(hea);
        viewGroup.addView(frameLayout);
        A01(this);
        return hea;
    }

    public void A0F(ViewGroup viewGroup, Object obj, int i) {
        if (obj != null) {
            Hea hea = (Hea) obj;
            this.A04 = hea.A02;
            if (this.A02.remove(hea)) {
                0fH.A09(GY7.class, Integer.valueOf(i), "Getting view for deferred item %d that is now primary");
                A00(hea.A01, this, this.A01.get(i));
            }
        }
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        Hea hea = (Hea) obj;
        ViewGroup viewGroup2 = hea.A01;
        viewGroup.removeView(viewGroup2);
        this.A02.remove(hea);
        if (viewGroup2.getChildCount() > 0) {
            JLC jlc = this.A00;
            Object obj2 = hea.A02;
            int AsS = jlc.AsS(obj2);
            if (AsS != -1) {
                0AE r0 = this.A03;
                List list = (List) C0Ak.A00(r0, AsS);
                if (list == null) {
                    list = 1JW.A00(3);
                    r0.A09(AsS, list);
                }
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeView(childAt);
                if (list.size() < 3) {
                    this.A00.CUf(childAt, obj2);
                    list.add(childAt);
                }
            }
        }
    }

    public boolean A0H(View view, Object obj) {
        return AnonymousClass001.A1W(view, ((Hea) obj).A01);
    }

    public void A0I(List list) {
        list.getClass();
        this.A01 = ImmutableList.copyOf((Collection) list);
        A09();
    }
}
