package X;

import android.content.Context;
import com.facebook.widget.CountdownRingContainer;

/* loaded from: Gpp.class */
public final class Gpp extends IYb {
    public final int A00;
    public final Object A01;

    public Gpp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.H2o, android.view.View] */
    public void CCZ() {
        switch (this.A00) {
            case 0:
                H2s.A00((H2s) this.A01);
                return;
            case 1:
                QUv.A00((QUv) this.A01);
                return;
            case 2:
                ?? r0 = (H2o) this.A01;
                CountdownRingContainer countdownRingContainer = r0.A02;
                if (countdownRingContainer.A0D) {
                    Context context = r0.getContext();
                    countdownRingContainer.setVisibility(GOp.A01(((I99) 1Lo.A04(context, 4YV.A0C(context), (1BY) null, 99500)).A02 ? 1 : 0));
                    return;
                }
                return;
            case 3:
                Gr4.A00((Gr4) this.A01);
                return;
            case 4:
                Gr1.A00((Gr1) this.A01, true);
                return;
            case 5:
                GrB grB = (GrB) this.A01;
                GrB.A08(grB);
                grB.A0Z(IDo.A01(grB));
                return;
            case 6:
                Gr5 gr5 = (Gr5) this.A01;
                Gr5.A00(gr5, GOq.A0p(gr5.A09));
                return;
            case 7:
                I0I.A00((I0I) this.A01);
                return;
            default:
                GrG.A08((GrG) this.A01);
                return;
        }
    }
}
