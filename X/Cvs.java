package X;

import android.view.View;
import com.google.common.base.Preconditions;

/* loaded from: Cvs.class */
public final class Cvs implements C5wx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CqO A01;
    public final /* synthetic */ RFa A02;
    public final /* synthetic */ DK4 A03;
    public final /* synthetic */ AcX A04;

    public Cvs(CqO cqO, RFa rFa, DK4 dk4, AcX acX, int i) {
        this.A01 = cqO;
        this.A04 = acX;
        this.A03 = dk4;
        this.A00 = i;
        this.A02 = rFa;
    }

    @Override // X.C5wx
    public boolean onLongClick(View view) {
        CqO cqO = this.A01;
        DJ0 dj0 = cqO.A01;
        AcX acX = this.A04;
        DK4 dk4 = this.A03;
        BP5 bp5 = cqO.A00;
        int i = this.A00;
        RFa rFa = this.A02;
        Preconditions.checkArgument(4YV.A1W(rFa.A00, -1), "mNumTotalItems was never set!");
        dj0.CJX(view, bp5, dk4, acX, i, i, i, -1, rFa.A00);
        return true;
    }
}
