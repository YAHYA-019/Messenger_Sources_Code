package X;

import android.view.View;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: I7U.class */
public final class I7U {
    public int A00;
    public HBA A01;
    public boolean A02;
    public final LithoView A03;
    public final Hls A04;
    public final 5zD A05;

    public I7U(LithoView lithoView, Hls hls) {
        this.A03 = lithoView;
        this.A04 = hls;
        this.A05 = (5zD) 1Bn.A0E(lithoView.getContext(), (1BY) null, 67704);
    }

    public static void A00(I7U i7u) {
        if (i7u.A01 != null) {
            LithoView lithoView = i7u.A03;
            C2664Gkg c2664Gkg = new C2664Gkg(lithoView.A09, new GlA());
            HBA hba = i7u.A01;
            GlA glA = c2664Gkg.A01;
            glA.A03 = hba;
            BitSet bitSet = c2664Gkg.A02;
            bitSet.set(1);
            glA.A02 = i7u.A05.Axg();
            bitSet.set(2);
            glA.A00 = i7u.A00;
            bitSet.set(3);
            glA.A01 = IKE.A00(i7u, 24);
            bitSet.set(0);
            C1rs.A02(bitSet, c2664Gkg.A03);
            c2664Gkg.A0J();
            lithoView.A0y(glA);
        }
    }

    public static void A01(I7U i7u, boolean z) {
        Integer num;
        C9hs c9hs;
        if (i7u.A02 != z) {
            i7u.A02 = z;
            ICT ict = i7u.A04.A00;
            View view = ict.A05;
            float f = 1.0f;
            if (z) {
                f = 0.6f;
            }
            view.setAlpha(f);
            HQw hQw = ict.A00;
            if (hQw != null) {
                6Sm r0 = hQw.A00;
                if (!z) {
                    if (r0.A0D == 0S2.A0C) {
                        num = 0S2.A00;
                    }
                    6Sm.A03(r0);
                    if (r0.A0J || (c9hs = r0.A06) == null) {
                    }
                    c9hs.A02(z);
                    return;
                }
                num = 0S2.A0C;
                r0.A0D = num;
                6Sm.A03(r0);
                if (r0.A0J) {
                }
            }
        }
    }
}
