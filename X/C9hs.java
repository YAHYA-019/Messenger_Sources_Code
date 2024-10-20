package X;

import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.OverlayLayout;
import java.util.BitSet;

/* renamed from: X.9hs, reason: invalid class name */
/* loaded from: 9hs.class */
public final class C9hs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public LithoView A04;
    public 95Y A05;
    public boolean A06;
    public final 1Br A07;
    public final 1Br A08;
    public final C7ns A09;
    public final OverlayLayout A0A;
    public final 1De A0B;

    /* JADX WARN: Multi-variable type inference failed */
    public C9hs(1De r302, C7ns c7ns, OverlayLayout overlayLayout) {
        11T.A0F(overlayLayout, 2);
        this.A0B = r302;
        this.A08 = 7zM.A0h(r302, 67704);
        this.A07 = 1HG.A00(4YU.A08(overlayLayout), 115015);
        this.A0A = overlayLayout;
        this.A09 = c7ns;
    }

    public static final void A00(LithoView lithoView, C9hs c9hs, 95Y r303) {
        c9hs.A05 = r303;
        8Oj r0 = new 8Oj(lithoView.A09, new 8kA());
        MigColorScheme Axg = ((5zD) 1Br.A0B(c9hs.A08)).Axg();
        8kA r02 = r0.A01;
        r02.A01 = Axg;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        r02.A00 = r303;
        bitSet.set(1);
        C1rs.A00(bitSet, r0.A03);
        r0.A0J();
        lithoView.A0y(r02);
    }

    public final void A01() {
        LithoView lithoView = this.A04;
        if (lithoView != null) {
            A00(lithoView, this, 95Y.A02);
        }
    }

    public final void A02(boolean z) {
        LithoView lithoView = this.A04;
        if (lithoView != null) {
            if (z) {
                A01();
            } else {
                A00(lithoView, this, this.A06 ? 95Y.A03 : 95Y.A04);
            }
        }
    }
}
