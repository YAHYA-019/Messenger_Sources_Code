package X;

import android.view.View;
import java.util.Iterator;

/* loaded from: H0B.class */
public abstract class H0B extends C66m {
    public final Integer A00;
    public final /* synthetic */ I5M A01;

    public H0B(I5M i5m, Integer num) {
        this.A01 = i5m;
        this.A00 = num;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        I5M i5m = this.A01;
        Integer num = this.A00;
        Iterator it = i5m.A09.iterator();
        while (it.hasNext()) {
            ((JIK) it.next()).Bit(num);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        GmW gmW = (GmW) this;
        int i = gmW.A00;
        I5M i5m = (I5M) gmW.A01;
        switch (i) {
            case 0:
                C66i c66i2 = i5m.A00;
                if (c66i2 != null) {
                    c66i2.A01();
                }
                i5m.A00 = null;
                break;
            case 1:
                C66i c66i3 = i5m.A01;
                if (c66i3 != null) {
                    c66i3.A01();
                }
                i5m.A01 = null;
                break;
            case 2:
                C66i c66i4 = i5m.A02;
                if (c66i4 != null) {
                    c66i4.A01();
                }
                i5m.A02 = null;
                break;
            case 3:
                C66i c66i5 = i5m.A03;
                if (c66i5 != null) {
                    c66i5.A01();
                }
                i5m.A03 = null;
                break;
            default:
                C66i c66i6 = i5m.A04;
                if (c66i6 != null) {
                    c66i6.A01();
                }
                i5m.A04 = null;
                break;
        }
        I5M i5m2 = this.A01;
        Integer num = this.A00;
        Iterator it = i5m2.A09.iterator();
        while (it.hasNext()) {
            ((JIK) it.next()).Bix(num);
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = (float) c66i.A09.A00;
        GmW gmW = (GmW) this;
        int i = gmW.A00;
        View view = ((I5M) gmW.A01).A07;
        switch (i) {
            case 0:
                view.setAlpha(f);
                return;
            case 1:
                view.setScaleX(f);
                return;
            case 2:
                view.setScaleY(f);
                return;
            case 3:
                view.setTranslationX(f);
                return;
            default:
                view.setTranslationY(f);
                return;
        }
    }
}
