package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.widget.RoundedCornersFrameLayout;

/* loaded from: H5y.class */
public final class H5y extends RoundedCornersFrameLayout implements JPB {
    public 1Br A00;
    public Gqv A01;
    public String A02;
    public boolean A03;

    public H5y(Context context) {
        super(context);
        this.A00 = 1Bu.A00(115709);
        FbUserSession A01 = IDw.A01(this, "RtcMediaGridParticipantContainerView");
        1Bn.A0A(115710);
        this.A01 = new Gqv(getContext(), A01);
    }

    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        IZq iZq = (IZq) jdb;
        11T.A0F(iZq, 0);
        1Br r0 = this.A00;
        if (r0 == null) {
            11T.A0L("rtcMediaGridLayoutHelperFactory");
            throw 0Q8.createAndThrow();
        }
        r0.get();
        int i = iZq.A00;
        boolean z = iZq.A07;
        boolean z2 = iZq.A06;
        boolean z3 = iZq.A05;
        Point A00 = iZq.A00();
        int i2 = A00.x;
        int i3 = A00.y;
        Rect A01 = iZq.A01();
        11T.A0A(A01);
        Rect rect = iZq.A02;
        Context A08 = 4YU.A08(this);
        if (i > 8) {
            i = 8;
        }
        JNb jNb = (JNb) (z2 ? new Rr5(i, i2, i3, z) : z3 ? new Gpz(A08, A01, rect, i, i2, i3, z) : new IYn(A01, rect, i, i2, i3, z, false));
        setCornerRadius(jNb.B1V());
        ViewGroup.MarginLayoutParams A0N = GOq.A0N(this);
        ((ViewGroup.LayoutParams) A0N).height = jNb.B1Y();
        ((ViewGroup.LayoutParams) A0N).width = jNb.B1a();
        if (!this.A03) {
            A0N.leftMargin = jNb.B1Z();
        }
        A0N.bottomMargin = jNb.B1X();
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(836535420);
        super.onAttachedToWindow();
        Gqv gqv = this.A01;
        if (gqv == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        gqv.A0Y(this);
        0FI.A0C(1006503514, A06);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        Gqv gqv = this.A01;
        if (gqv == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        Gqv.A00(gqv);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1309433226);
        Gqv gqv = this.A01;
        if (gqv == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        gqv.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-808907243, A06);
    }
}
