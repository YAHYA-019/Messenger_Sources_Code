package X;

import android.view.View;
import java.util.List;

/* loaded from: Ida.class */
public final class Ida implements JOX {
    public final JOX A00;

    public Ida(JOX jox) {
        this.A00 = jox;
        HJS hjs = JQ9.A00;
        if (jox.BRE(hjs)) {
            ((JQ9) this.A00.AdD(hjs)).Cmk(3);
        }
    }

    public static JQ2 A00(Ida ida) {
        return (JQ2) ida.A00.AdC(JQ2.A00);
    }

    public static C2420Gch A01(Ida ida) {
        return (C2420Gch) A00(ida);
    }

    public View A02() {
        return ((JQ1) this.A00.AdC(JQ1.A00)).AeA();
    }

    public void A03(int i) {
        C2420Gch A01 = A01(this);
        if (!A01.A0V) {
            throw AnonymousClass001.A0N("Initial camera facing must be set before initializing the camera.");
        }
        ((AbstractC2421Gci) A01).A00 = i;
    }

    public void A04(int i) {
        C2420Gch A01 = A01(this);
        if (!A01.A0V) {
            throw AnonymousClass001.A0N("Photo resolution level must be set before initializing the camera.");
        }
        A01.A01 = i;
    }

    public void A05(int i) {
        C2420Gch A01 = A01(this);
        if (!A01.A0V) {
            throw AnonymousClass001.A0N("Preview resolution level must be set before initializing the camera.");
        }
        A01.A03 = i;
    }

    public void A06(int i) {
        List A1H;
        AbstractC2421Gci abstractC2421Gci = (AbstractC2421Gci) A00(this);
        JNk jNk = ((C2420Gch) abstractC2421Gci).A0g;
        if (jNk == null || !jNk.isConnected()) {
            return;
        }
        int i2 = i * 1000;
        I1R A0F = abstractC2421Gci.A0F();
        if (A0F == null || (A1H = GOn.A1H(I1R.A11, A0F)) == null || A1H.isEmpty()) {
            return;
        }
        int[] iArr = (int[]) A1H.get(0);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = 1;
        while (true) {
            int i6 = i5;
            if (i6 >= A1H.size()) {
                I4E i4e = new I4E();
                i4e.A02(I82.A0n, iArr);
                jNk.BeT(new GuU(1), i4e.A01());
                return;
            }
            int[] iArr2 = (int[]) A1H.get(i6);
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            if (i4 > i2 ? i8 <= i2 || i8 < i4 || (i8 == i4 && i7 < i3) : i8 <= i2 && (i8 > i4 || (i8 == i4 && i7 < i3))) {
                iArr = iArr2;
                i3 = i7;
                i4 = i8;
            }
            i5 = i6 + 1;
        }
    }

    public void A07(JKr jKr) {
        AbstractC2421Gci abstractC2421Gci = (AbstractC2421Gci) A00(this);
        if (jKr != null) {
            abstractC2421Gci.A01.A02(jKr);
        }
    }

    public void A08(JKr jKr) {
        AbstractC2421Gci abstractC2421Gci = (AbstractC2421Gci) A00(this);
        if (jKr != null) {
            abstractC2421Gci.A01.A03(jKr);
        }
    }

    public void A09(Hh2 hh2, JHs jHs) {
        AAp("LiteCameraController must be initialized before taking photo.");
        ((JPq) this.A00.AdC(JPq.A00)).D41(hh2, jHs, null);
    }

    public void A0A(boolean z) {
        A01(this).A0T = z;
    }

    public void A0B(boolean z) {
        C2420Gch A01 = A01(this);
        Hh3 hh3 = A01.A09;
        if (hh3 == null) {
            hh3 = new Hh3(A01.A0g);
            A01.A09 = hh3;
        }
        hh3.A03 = z;
    }

    public boolean A0C() {
        return AnonymousClass001.A1W(((C2427Gco) ((JPt) this.A00.AdC(JPt.A00))).A05, 0S2.A01);
    }

    public void AAp(String str) {
        this.A00.AAp("LiteCameraController must be initialized before taking photo.");
    }

    public JQC AdC(GuJ guJ) {
        return this.A00.AdC(guJ);
    }

    public JG5 AdD(HJS hjs) {
        return this.A00.AdD(hjs);
    }

    public boolean BRD(GuJ guJ) {
        return this.A00.BRD(guJ);
    }

    public boolean BRE(HJS hjs) {
        return this.A00.BRE(hjs);
    }

    public void destroy() {
        this.A00.destroy();
    }

    public void pause() {
        this.A00.pause();
    }

    public void resume() {
        this.A00.resume();
    }
}
