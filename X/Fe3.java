package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.advancedcryptotransport.model.PeerDevice;

/* loaded from: Fe3.class */
public final class Fe3 implements GEd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fe3(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.GEd
    public void CQq(C2137Deq c2137Deq) {
        String A0W;
        if (this.A00 == 0) {
            GJj gJj = (GJj) this.A02;
            if (gJj != null) {
                FY7 fy7 = (FY7) this.A01;
                FAv.A01(fy7.A06, fy7.A04, DKc.A01, gJj);
            }
            FY7 fy72 = (FY7) this.A01;
            if (F2Z.A00(fy72.A06, 40, false)) {
                fy72.A03.A01("bk.action.navigation.CloseScreen");
                return;
            }
            return;
        }
        11T.A0F(c2137Deq, 0);
        C2lh c2lh = (C2lh) this.A02;
        c2lh.A02(7zU.A0d(c2lh.A02));
        View A0K = c2137Deq.A0K(2131364049);
        11T.A0I(A0K, GOm.A00(80));
        if (0CV.A0b(((TextView) A0K).getText().toString(), "��", false)) {
            A0W = ((PeerDevice) this.A01).A08;
            if (A0W == null) {
                throw 1BK.A0h();
            }
        } else {
            A0W = 0Pz.A0W("�� ", ((PeerDevice) this.A01).A07);
        }
        c2137Deq.A0U(A0W);
        c2137Deq.A07();
    }
}
