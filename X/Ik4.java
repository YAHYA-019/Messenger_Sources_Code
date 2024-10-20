package X;

import java.util.List;

/* loaded from: Ik4.class */
public final class Ik4 implements JJJ {
    public long A00 = -1;
    public long A01;
    public Hce A02;
    public I8v A03;
    public IjV A04;
    public Hud A05;
    public Hud A06;
    public I0T A07;
    public boolean A08;
    public boolean A09;
    public final IEP A0A;

    public Ik4(IEP iep) {
        this.A0A = iep;
    }

    public static void A00(Ik4 ik4) {
        ik4.A02.getClass();
        ik4.A07.getClass();
        if (ik4.A08) {
            return;
        }
        ik4.A08 = true;
        I0T i0t = ik4.A07;
        boolean z = !ik4.A02.A01;
        List list = i0t.A0B;
        list.getClass();
        List list2 = i0t.A0D;
        int i = 0;
        IFX.A07(AnonymousClass001.A1Q(list2.size(), list.size()), "Presentation time list and FrameBufferTexture time list should be the same");
        long j = 0;
        Hce hce = i0t.A05;
        hce.getClass();
        if (!hce.A01) {
            j = AbK.A08(list2, GOn.A0A(list2, 1));
        }
        int size = list.size();
        int i2 = size - 1;
        if (z) {
            i2 = size - 2;
            i = 1;
        }
        while (i2 >= i) {
            I0T.A00((HsS) list.get(i2), i0t, AbK.A08(list2, GOn.A0A(list2, 1) - i2) + j);
            i2--;
        }
    }

    @Override // X.JJJ
    public JN9 AJT() {
        return new Ijw(this);
    }

    @Override // X.JJJ
    public JNR AJi() {
        return new Ijz(this);
    }
}
