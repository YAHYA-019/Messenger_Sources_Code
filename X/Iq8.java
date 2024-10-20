package X;

import java.util.Iterator;

/* loaded from: Iq8.class */
public final class Iq8 implements Runnable {
    public static final String __redex_internal_original_name = "AudioComposerRecorder$2";
    public final /* synthetic */ I7p A00;

    public Iq8(I7p i7p) {
        this.A00 = i7p;
    }

    @Override // java.lang.Runnable
    public void run() {
        I7p i7p = this.A00;
        if (i7p.A04) {
            double A06 = ((7Fa) i7p.A05.get()).A06();
            Hlu hlu = i7p.A03;
            hlu.A00(A06);
            long A08 = (1BL.A08(i7p.A06) - i7p.A02) - i7p.A01;
            IEI iei = hlu.A00;
            Iterator it = iei.A01.A00.iterator();
            while (it.hasNext()) {
                ((JN6) it.next()).D7e(A08);
            }
            4YU.A0G(i7p.A07).postDelayed(this, 50);
            if (A08 >= i7p.A08.longValue()) {
                I7p.A01(i7p);
                Iterator it2 = iei.A01.A00.iterator();
                while (it2.hasNext()) {
                    ((JN6) it2.next()).CFl();
                }
            }
        }
    }
}
