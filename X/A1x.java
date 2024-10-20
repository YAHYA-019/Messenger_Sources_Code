package X;

import android.widget.LinearLayout;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import com.facebook.user.model.User;

/* loaded from: A1x.class */
public final class A1x implements Aag {
    public final /* synthetic */ 8uM A00;

    public A1x(8uM r302) {
        this.A00 = r302;
    }

    @Override // X.Aag
    public void BNy() {
        8uM r0 = this.A00;
        r0.A0E = false;
        7zU.A1P(r0);
        8uM.A03(r0);
        7zT.A1A(r0);
        LinearLayout linearLayout = r0.A03;
        if (linearLayout != null) {
            linearLayout.setPadding(0, 0, 0, 0);
        }
        FbRelativeLayout fbRelativeLayout = r0.A0C;
        if (fbRelativeLayout != null) {
            fbRelativeLayout.setPadding(0, 0, 0, 0);
        }
    }

    @Override // X.Aag
    public void Bez(User user) {
        11T.A0F(user, 0);
        8uM r0 = this.A00;
        C03513yC c03513yC = r0.A0A;
        if (c03513yC != null) {
            c03513yC.A09(null, null);
            C03513yC c03513yC2 = r0.A0A;
            if (c03513yC2 == null) {
                11T.A0L("notesLogger");
                throw 0Q8.createAndThrow();
            }
            c03513yC2.A03();
        }
        C9f2.A00().markerEnd(91365879, (short) 2);
        HGD hgd = r0.A03;
        if (hgd != null) {
            hgd.A08(user.A0k, 0S2.A0j);
        }
    }

    @Override // X.Aag
    public void Bx3() {
    }

    @Override // X.Aag
    public void C7F() {
    }

    @Override // X.Aag
    public void C8C() {
        7zU.A1P(this.A00);
    }

    @Override // X.Aag
    public void C8F() {
        this.A00.A1e();
    }

    @Override // X.Aag
    public void CW3() {
    }
}
