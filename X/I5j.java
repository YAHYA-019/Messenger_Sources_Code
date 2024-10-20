package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: I5j.class */
public final class I5j {
    public static final Integer[] A0A = {0, 2, 1};
    public int A00;
    public Ida A01;
    public Function1 A02;
    public Function1 A03;
    public boolean A05;
    public final 1Br A06 = 1Bq.A00(65630);
    public final 1Br A07 = 1Bu.A00(83402);
    public boolean A04 = true;
    public final IUa A09 = new IUa(this);
    public final IOC A08 = new IOC();

    public final void A00() {
        if (this.A04) {
            return;
        }
        int i = this.A00 + 1;
        Integer[] numArr = A0A;
        int i2 = i % 3;
        this.A00 = i2;
        Ida ida = this.A01;
        if (ida == null) {
            11T.A0L("liteCameraController");
            throw 0Q8.createAndThrow();
        }
        Ida.A00(ida).Coq(numArr[i2].intValue());
    }

    public final void A01() {
        boolean z = !this.A05;
        this.A05 = z;
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        Ida ida = this.A01;
        if (ida == null) {
            11T.A0L("liteCameraController");
            throw 0Q8.createAndThrow();
        }
        Ida.A00(ida).Cod(f);
    }

    public final void A02(Context context) {
        HqO hqO = (HqO) 1Hv.A02(context, 115994);
        IUa iUa = this.A09;
        Set set = hqO.A08;
        iUa.getClass();
        set.remove(iUa);
        if (hqO.A02) {
            hqO.A02 = false;
            hqO.A06.disable();
            hqO.A03.unregisterComponentCallbacks(hqO.A07);
        }
        Ida ida = this.A01;
        if (ida == null) {
            11T.A0L("liteCameraController");
            throw 0Q8.createAndThrow();
        }
        ida.pause();
    }

    public final void A03(Context context) {
        HqO hqO = (HqO) 1Hv.A02(context, 115994);
        IUa iUa = this.A09;
        Set set = hqO.A08;
        iUa.getClass();
        set.add(iUa);
        hqO.A00();
        Ida ida = this.A01;
        if (ida == null) {
            11T.A0L("liteCameraController");
            throw 0Q8.createAndThrow();
        }
        ida.resume();
    }

    public final void A04(Context context, FrameLayout frameLayout) {
        Ida A00 = HGb.A00(context, new HZk(71000000L, 50000000L), "messenger_camera_profile");
        this.A01 = A00;
        A00.A03(1);
        A00.A05(921600);
        A00.A04(2097152);
        C2427Gco c2427Gco = (C2427Gco) ((JPt) A00.A00.AdC(JPt.A00));
        I4E i4e = new I4E();
        i4e.A02(I82.A0N, false);
        c2427Gco.A00.BeT(new GuU(1), i4e.A01());
        Ida.A01(A00).A0W = true;
        A00.A0A(false);
        Ida.A00(A00).CtC(9, 16);
        Ida ida = this.A01;
        if (ida == null) {
            11T.A0L("liteCameraController");
            throw 0Q8.createAndThrow();
        }
        frameLayout.addView(ida.A02());
        A03(context);
    }

    public final void A05(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        Hh2 A00 = Qz1.A00();
        Integer num = 1Lo.A05;
        1MV r0 = new 1MV(fbUserSession, 99907);
        A00.A04 = true;
        A00.A02 = false;
        A00.A00 = ((HnB) r0.get()).A00("photo", ".png");
        Ida ida = this.A01;
        if (ida == null) {
            11T.A0L("liteCameraController");
            throw 0Q8.createAndThrow();
        }
        JHs iob = new IOB(fbUserSession, this);
        JHt jHt = this.A08;
        ida.AAp("LiteCameraController must be initialized before taking photo.");
        ((JPq) ida.A00.AdC(JPq.A00)).D41(A00, iob, jHt);
    }
}
