package X;

import com.facebook.games.nativetos.kcomponents.GamingLoginNativeToSProfileCardComponent;

/* loaded from: E3h.class */
public final class E3h extends FIJ {
    public final GL7 A00;

    public E3h(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A00 = gl7;
    }

    public void A08(FyG fyG) {
        Rsq A00;
        11T.A0F(fyG, 0);
        GL7 gl7 = this.A00;
        String A07 = GL7.A07(gl7);
        String A06 = GL7.A06(gl7);
        String A05 = GL7.A05(gl7);
        if (A07 == null || A06 == null || A05 == null || (A00 = FJ3.A01(fyG).A00(Rsq.class)) == null) {
            return;
        }
        Ehz ehz = A00.A00;
        GamingLoginNativeToSProfileCardComponent gamingLoginNativeToSProfileCardComponent = ehz.A01;
        gamingLoginNativeToSProfileCardComponent.A06.invoke(A07);
        gamingLoginNativeToSProfileCardComponent.A05.invoke(A06);
        ExP exP = ehz.A00;
        exP.A05 = A07;
        exP.A04 = A06;
        exP.A03 = A05;
    }
}
