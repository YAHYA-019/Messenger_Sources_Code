package X;

/* loaded from: E3j.class */
public final class E3j extends FIJ {
    public final GL7 A00;

    public E3j(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A00 = gl7;
    }

    public void A08(FyG fyG) {
        boolean z;
        int max;
        int A00;
        GL7 gl7 = this.A00;
        String A06 = GL7.A06(gl7);
        if (A06 != null) {
            String BCx = gl7.BCx(35, "RIGHT");
            Object obj = null;
            Eik A01 = DKC.A0Y(fyG).A01(fyG, A06, 0Pz.A0W("NTHScrollScrollToNextAction", ".controllerForModel"));
            if (A01 != null) {
                obj = FJ3.A07(A01.A00, A01.A01);
            }
            E4g e4g = (E4g) obj;
            if (e4g != null) {
                C2kx c2kx = e4g.A00;
                c2kx.getClass();
                try {
                } catch (Exception e) {
                    DKE.A1U(R2B.class, BCx, e);
                }
                if (BCx.length() == 5) {
                    z = true;
                    max = Math.max(0, c2kx.A01 + 1);
                    A00 = C2kx.A00(c2kx, max, true);
                    C2kx.A01(null, c2kx, max, A00, z);
                }
                z = true;
                max = Math.max(0, c2kx.A00 - 1);
                A00 = C2kx.A00(c2kx, max, false);
                C2kx.A01(null, c2kx, max, A00, z);
            }
        }
    }
}
