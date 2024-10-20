package X;

import android.content.Context;
import android.view.View;
import com.facebook.acra.constants.ActionId;

/* loaded from: Eqs.class */
public final class Eqs {
    public EjY A00;
    public EsT A01;
    public Integer A02;
    public String A03;
    public final C00i A04;
    public final 1De A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final FAX A09;
    public final DQn A0A;
    public final C15h A0B;
    public final C00i A0C;

    public Eqs(1De r302, DQn dQn) {
        11T.A0F(dQn, 2);
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A06 = 1Bu.A03(r0, 98328);
        this.A07 = 1Bu.A03(r0, 98375);
        this.A08 = DKF.A0N();
        Context A0I = 7zQ.A0I(r0);
        1Br A0O = DKF.A0O(A0I);
        this.A0C = A0O;
        this.A04 = 1HG.A00(A0I, 98363);
        G7K g7k = new G7K(A0I, ActionId.RTMP_CONNECTION_FAILED);
        this.A0B = g7k;
        FAX fax = ((F6C) A0O.get()).A00;
        11T.A0A(fax);
        this.A09 = fax;
        this.A0A = dQn;
        dQn.setVisibility(8);
        FIT fit = (FIT) g7k.get();
        View.OnClickListener fXs = new FXs(fit, this, 64);
        View view = dQn.A01;
        if (view != null) {
            view.setOnClickListener(fXs);
        }
        View view2 = dQn.A02;
        if (view2 != null) {
            view2.setOnClickListener(fXs);
        }
        View.OnClickListener fXs2 = new FXs(fit, this, 65);
        View view3 = dQn.A00;
        if (view3 != null) {
            view3.setOnClickListener(fXs2);
        }
    }
}
