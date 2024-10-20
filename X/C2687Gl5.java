package X;

import com.facebook.messaging.montage.forked.viewer.model.StoryBucketLaunchConfig;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.Gl5, reason: case insensitive filesystem */
/* loaded from: Gl5.class */
public final class C2687Gl5 extends C1rj {
    public I3e A00;
    public HTm A01;
    public HxC A02;
    public HhX A03;
    public GL2 A04;
    public EWd A05;
    public Hnb A06;
    public HIQ A07;
    public boolean A08;

    public C2687Gl5() {
        super("StoryViewerFeedbackOverlayComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A07, this.A06, 1BK.A0d(), this.A05, this.A01, Boolean.valueOf(this.A08), this.A04, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        I3e i3e = this.A00;
        HhX hhX = this.A03;
        GL2 gl2 = this.A04;
        HxC hxC = this.A02;
        HTm hTm = this.A01;
        Hnb hnb = this.A06;
        EWd eWd = this.A05;
        HIQ hiq = this.A07;
        boolean z = this.A08;
        11T.A0F(r302, 0);
        7zT.A1W(i3e, hhX, gl2, hxC);
        11T.A0F(hTm, 5);
        11T.A0F(hnb, 7);
        11T.A0F(eWd, 8);
        11T.A0F(hiq, 9);
        ImmutableList AmF = gl2.AmF();
        if (AmF == null) {
            return null;
        }
        2cM A00 = 2cK.A00(r302);
        7zP.A13(A00);
        if (gl2.AmF() != null && !gl2.AmF().isEmpty()) {
            StoryBucketLaunchConfig storyBucketLaunchConfig = (StoryBucketLaunchConfig) i3e.A01(StoryBucketLaunchConfig.class);
            1Du it = AmF.iterator();
            while (it.hasNext()) {
                C2578Ghr c2578Ghr = (C2578Ghr) it.next();
                GkC gkC = new GkC(r302, new C2689Gl7());
                C2689Gl7 c2689Gl7 = gkC.A01;
                c2689Gl7.A01 = i3e;
                BitSet bitSet = gkC.A02;
                bitSet.set(9);
                c2689Gl7.A04 = hhX;
                bitSet.set(1);
                c2689Gl7.A09 = storyBucketLaunchConfig.A02;
                bitSet.set(5);
                String str = storyBucketLaunchConfig.A04;
                if (str == null) {
                    str = "";
                }
                c2689Gl7.A0A = str;
                bitSet.set(10);
                c2689Gl7.A05 = gl2;
                bitSet.set(7);
                c2689Gl7.A07 = hnb;
                bitSet.set(3);
                c2689Gl7.A00 = c2578Ghr;
                bitSet.set(8);
                c2689Gl7.A03 = hxC;
                bitSet.set(0);
                c2689Gl7.A06 = eWd;
                bitSet.set(6);
                c2689Gl7.A08 = hiq;
                bitSet.set(2);
                c2689Gl7.A02 = (I4p) i3e.A01(I4p.class);
                bitSet.set(4);
                A00.A2d(gkC);
            }
        }
        C2655Gk9 c2655Gk9 = new C2655Gk9(r302, new Glb());
        Glb glb = c2655Gk9.A01;
        glb.A01 = z;
        glb.A00 = hTm;
        BitSet bitSet2 = c2655Gk9.A02;
        bitSet2.set(1);
        bitSet2.set(0);
        A00.A2d(c2655Gk9);
        return A00.A00;
    }
}
