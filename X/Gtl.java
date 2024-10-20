package X;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.facebook.acra.constants.ActionId;

/* loaded from: Gtl.class */
public final class Gtl extends GuG implements JPi {
    public boolean A00;
    public final JLp A01;
    public final ICm A02;
    public final JNQ A03;
    public final JLu A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.HJc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.HyC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r305v2, types: [java.lang.Object, X.RtX] */
    public Gtl(JOW jow, boolean z) {
        super(jow);
        Ieh ieh;
        if (z) {
            Context context = jow.getContext();
            ?? obj = new Object();
            ((RtX) obj).A02 = context;
            ieh = obj;
        } else {
            ieh = new Ieh();
        }
        this.A04 = new Iei(this, 0);
        this.A01 = new Id3(this, 6);
        this.A03 = ieh;
        Context context2 = jow.getContext();
        ?? obj2 = new Object();
        String str = (String) A0C(Hxy.A02);
        H9N h9n = (H9N) ((GuG) this).A00.Adn(HOJ.A00);
        HBx hBx = HBx.A02;
        this.A02 = new ICm(context2, h9n, hBx, hBx, ieh, (HJc) obj2, (HyC) new Object(), str, 0, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.JGJ, java.lang.Object] */
    public void A05() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ICm iCm = this.A02;
        iCm.A0A(this.A04);
        HJO hjo = RDV.A00;
        JOW jow = ((GuG) this).A00;
        Number number = (Number) jow.Adm(hjo);
        if (number != null) {
            iCm.A06(number.intValue());
        }
        JLI jli = (JLI) jow.Adm(RDV.A02);
        if (jli != null) {
            iCm.A08(jli);
        }
        JOV jov = (JOV) jow.Adm(RDV.A01);
        JOV jov2 = jov;
        if (jov == null) {
            java.util.Map map = Ie9.A01;
            HBx hBx = HBx.A02;
            JLI jli2 = jli;
            if (jli == null) {
                jli2 = new Object();
            }
            Ie9 ie9 = new Ie9(hBx, hBx, new Object(), jli2, false, false);
            ie9.A00(JOV.A06, true);
            jov2 = ie9;
        }
        iCm.A07 = jov2;
        iCm.A0N.Cvi(!jow.BRD(JQ3.A00));
        Boolean bool = (Boolean) jow.Adm(RDV.A03);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            iCm.A0F = booleanValue;
            iCm.A0M.CrA(booleanValue);
        }
        jow.Adm(RDV.A04);
        iCm.A0C(true);
    }

    public void A0A() {
        GuJ guJ = JQ1.A00;
        JOW jow = ((GuG) this).A00;
        if (jow.BRD(guJ)) {
            ((JQ1) A0B(guJ)).A78(this.A01);
        } else {
            View view = (View) jow.Adn(HOJ.A03);
            if (view == null) {
                view = (View) A0C(HOJ.A02);
            }
            this.A03.CwS(view);
        }
        JQ7 jq7 = (JQ7) jow.AdD(JQ7.A00);
        this.A02.A02 = new I95((JQ9) jow.AdD(JQ9.A00), new GTN(((JQ8) jow.AdD(JQ8.A00)).BSa(ActionId.RTMP_CONNECTION_RELEASE) ? jq7.AoV("Lite-Controller-Thread").getLooper() : Looper.getMainLooper()));
    }

    @Override // X.JQC
    public GuJ Ase() {
        return JPi.A00;
    }
}
