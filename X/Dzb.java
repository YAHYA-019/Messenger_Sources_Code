package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.facebook.litho.ComponentTree;

/* loaded from: Dzb.class */
public final class Dzb extends C1rj {
    public int A00;
    public 1LI A01;
    public 9HC A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public Dzb() {
        super("HorizontalScroll");
        this.A00 = -1;
        this.A04 = true;
    }

    private ComponentTree A00(1Iw r302) {
        String A0C = r302.A0C();
        Evs evs = new Evs(A0C);
        ComponentTree componentTree = (ComponentTree) r302.A0B(evs, A0C, 0);
        if (componentTree == null) {
            C1s0 A02 = ComponentTree.A02(r302);
            A02.A01(false);
            componentTree = A02.A00();
            r302.A0I(evs, componentTree, A0C, 0);
        }
        return componentTree;
    }

    public static DuU A01(1Iw r301) {
        return new DuU(r301, new Dzb());
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        Dzb dzb = (Dzb) super.A0l();
        dzb.A01 = 4YV.A0J(dzb.A01);
        return dzb;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new DQA(context);
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.274, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ AnonymousClass274 A10() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1E(1Iw r302) {
        Boolean bool = null;
        TypedArray A02 = r302.A02(0, C53r.A01);
        int indexCount = A02.getIndexCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= indexCount) {
                break;
            }
            int index = A02.getIndex(i2);
            if (index == 0) {
                bool = Boolean.valueOf(AnonymousClass001.A1N(A02.getInt(index, 0)));
            }
            i = i2 + 1;
        }
        A02.recycle();
        if (bool != null) {
            this.A04 = bool.booleanValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        int i3;
        Integer num = null;
        Integer num2 = null;
        boolean z = this.A05;
        1LI r0 = this.A01;
        ComponentTree A00 = A00(r302);
        if (A00.BVK()) {
            if (c23p != null) {
                num = 0;
                num2 = 0;
                c23p.A01 = Math.max(0, c23p.A01);
                i3 = Math.max(0, c23p.A00);
            }
            Fij fij = (Fij) anonymousClass274;
            fij.A04 = num;
            fij.A03 = num2;
        }
        ?? obj = new Object();
        A00.A0Q(r0, obj, View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        int i4 = obj.A01;
        i3 = obj.A00;
        num = Integer.valueOf(i4);
        num2 = Integer.valueOf(i3);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 0) {
            if (mode == ((-1) << (-1)) && z) {
                i4 = Math.min(i4, size);
            } else {
                c23p.A01 = size;
            }
        }
        c23p.A01 = i4;
        c23p.A00 = i3;
        Fij fij2 = (Fij) anonymousClass274;
        fij2.A04 = num;
        fij2.A03 = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
        AnonymousClass255 anonymousClass255 = null;
        1LI r0 = this.A01;
        boolean z = this.A03;
        ComponentTree A00 = A00(r302);
        Fij fij = (Fij) anonymousClass274;
        Integer num = fij.A04;
        Integer num2 = fij.A03;
        int A05 = (c27g.A05() - c27g.A02()) - c27g.A03();
        Integer num3 = 0;
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if (!z) {
                A05 = 0;
            }
            num3 = Integer.valueOf(Math.max(intValue, A05));
        } else {
            if (A00.BVK()) {
                num2 = null;
                fij.A02 = num3;
                fij.A01 = num2;
                fij.A00 = anonymousClass255;
            }
            ?? obj = new Object();
            A00.A0Q(r0, obj, View.MeasureSpec.makeMeasureSpec(0, 0), DKD.A00(c27g.A00()));
            int i = obj.A01;
            if (!z) {
                A05 = 0;
            }
            int max = Math.max(i, A05);
            int i2 = obj.A00;
            num3 = Integer.valueOf(max);
            num2 = Integer.valueOf(i2);
        }
        anonymousClass255 = c27g.A06();
        fij.A02 = num3;
        fij.A01 = num2;
        fij.A00 = anonymousClass255;
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        Dzr dzr = (Dzr) 4YU.A0P(r302);
        DQA dqa = (DQA) obj;
        boolean z = this.A04;
        9HC r0 = this.A02;
        ESs eSs = dzr.A00;
        ComponentTree A00 = A00(r302);
        Fij fij = (Fij) anonymousClass274;
        Integer num = fij.A02;
        Integer num2 = fij.A01;
        AnonymousClass255 anonymousClass255 = fij.A00;
        dqa.setHorizontalScrollBarEnabled(z);
        dqa.setOverScrollMode(1);
        dqa.setHorizontalFadingEdgeEnabled(false);
        dqa.setFadingEdgeLength(0);
        int intValue = num != null ? num.intValue() : 0;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        dqa.A03.A10(A00, true);
        dqa.A02 = eSs;
        dqa.A01 = intValue;
        dqa.A00 = intValue2;
        G3n g3n = new G3n(eSs, dqa, anonymousClass255);
        if (C02A.useOneShotPreDrawListener) {
            0SG.A00(dqa, g3n);
        } else {
            dqa.getViewTreeObserver().addOnPreDrawListener(new FYI(g3n, dqa, 0));
        }
        if (r0 != null) {
            r0.A00 = dqa;
        }
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DQA dqa = (DQA) obj;
        9HC r0 = this.A02;
        dqa.A03.A10(null, false);
        dqa.A01 = 0;
        dqa.A00 = 0;
        dqa.A02 = null;
        dqa.setScrollX(0);
        if (r0 != null) {
            r0.A00 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.ESs, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        int i = this.A00;
        ?? obj = new Object();
        ((ESs) obj).A00 = i;
        ((Dzr) r303).A00 = obj;
    }

    @Override // X.C1rj
    public void A1O(AnonymousClass274 anonymousClass274, AnonymousClass274 anonymousClass2742) {
        Fij fij = (Fij) anonymousClass274;
        Fij fij2 = (Fij) anonymousClass2742;
        fij.A01 = fij2.A01;
        fij.A02 = fij2.A02;
        fij.A00 = fij2.A00;
        fij.A03 = fij2.A03;
        fij.A04 = fij2.A04;
    }

    @Override // X.C1rj
    public boolean A1S() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1X() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Dzb dzb = (Dzb) r302;
            1LI r0 = this.A01;
            1LI r02 = dzb.A01;
            if (r0 != null) {
                if (!C4Cv.A05(r0, r02, z)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            9HC r03 = this.A02;
            9HC r04 = dzb.A02;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            if (this.A03 != dzb.A03 || this.A00 != dzb.A00 || this.A04 != dzb.A04 || this.A05 != dzb.A05) {
                return false;
            }
        }
        return true;
    }
}
