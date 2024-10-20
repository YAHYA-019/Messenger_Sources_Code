package X;

import android.view.View;

/* renamed from: X.91W, reason: invalid class name */
/* loaded from: 91W.class */
public final class C91W extends C66m {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91W(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        if (2 - this.A00 != 0) {
            super.CMP(c66i);
            return;
        }
        11T.A0F(c66i, 0);
        if (c66i.A01 == 1.0d) {
            ((View) this.A01).setVisibility(0);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        switch (this.A00) {
            case 0:
                ((Eri) this.A02).A00();
                return;
            case 1:
            default:
                super.CMR(c66i);
                return;
            case 2:
                11T.A0F(c66i, 0);
                if (c66i.A01 == 0.0d) {
                    ((View) this.A01).setVisibility(8);
                    return;
                }
                return;
            case 3:
                9Pq r0 = (9Pq) this.A01;
                if (r0 != null) {
                    9hQ r02 = (9hQ) this.A02;
                    if (r02.A06.A0C() && r02.A04.A0C()) {
                        r0.A00.A00();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        9hQ r304;
        7Fe r0;
        6RU r02;
        switch (this.A00) {
            case 1:
                JXU.A00((JXU) this.A01);
                return;
            case 2:
                11T.A0F(c66i, 0);
                boolean z = ((GoE) this.A02).A00;
                View view = (View) this.A01;
                float f = (float) c66i.A09.A00;
                float A00 = C0ed.A00(f, 0.0f, 1.0f);
                if (!z) {
                    view.setAlpha(A00);
                    return;
                }
                view.setAlpha(A00);
                float f2 = (f * 0.2f) + 0.8f;
                view.setScaleX(f2);
                view.setScaleY(f2);
                return;
            case 3:
                r304 = (9hQ) this.A02;
                break;
            case 4:
                r304 = (9hQ) this.A02;
                if (r304.A05.A09.A00 > 0.800000011920929d) {
                    9Pq r03 = (9Pq) this.A01;
                    if (r03 != null) {
                        7sX r04 = r03.A00;
                        C5jf c5jf = r04.A01;
                        if (c5jf != null) {
                            String str = r03.A01;
                            if (str == null) {
                                str = 4YT.A00(571);
                            }
                            C5jd c5jd = c5jf.A00;
                            java.util.Map map = c5jd.A05;
                            if (map.remove(str) == null) {
                                0fH.A0o(4YT.A00(633), 4YT.A00(704));
                            } else {
                                map.remove(str);
                                C5je c5je = c5jd.A04;
                                synchronized (c5je) {
                                    r0 = c5je.A00;
                                }
                                if (r0 != null && (r02 = (6RU) r0.A00.get()) != null) {
                                    7FI.A02(r02, 7Ba.A02);
                                }
                                c5jd.A05(0DW.A00(c5jd.A05.values()).reverse());
                            }
                        }
                        r04.A00();
                        return;
                    }
                    return;
                }
                break;
            default:
                super.CMV(c66i);
                return;
        }
        9ZH r05 = r304.A00;
        if (r05 != null) {
            r05.A00(r304);
        }
    }
}
