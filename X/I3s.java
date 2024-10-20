package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: I3s.class */
public final class I3s {
    public 1Iw A00;
    public C2iw A01;
    public JGO A02;
    public HsN A03;
    public Hri A04;
    public final 1Br A05;
    public final 1De A06;
    public final HXX A07 = new HXX(this);

    public I3s(1De r302) {
        this.A06 = r302;
        this.A05 = 7zM.A0h(r302, 114881);
    }

    public static final void A00(I3s i3s) {
        C2iw c2iw;
        if (i3s.A00 == null || (c2iw = i3s.A01) == null) {
            return;
        }
        i3s.A04 = null;
        Hri A01 = i3s.A01();
        C2ko A0G = 1LI.A0G(c2iw, 1753227300);
        if (A0G != null) {
            A0G.A00(new Object(), new Object[]{A01});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x017b, code lost:
    
        if (r314 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.Hri A01() {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3s.A01():X.Hri");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2iw, java.lang.Object] */
    public final void A02(JGO jgo) {
        this.A02 = jgo;
        if (jgo == null) {
            this.A01 = null;
            this.A00 = null;
            HzF hzF = (HzF) 1Br.A0B(this.A05);
            hzF.A00 = null;
            FbUserSession A03 = 1Br.A03(hzF.A02);
            1BY r0 = hzF.A01.A00;
            ((2QO) 1Lm.A07(A03, r0, 99977)).Cf7(hzF.A03);
            ((2QT) 1Lm.A07(A03, r0, 99981)).CeZ(hzF.A04);
            return;
        }
        this.A01 = new Object();
        HzF hzF2 = (HzF) 1Br.A0B(this.A05);
        HXX hxx = this.A07;
        11T.A0F(hxx, 0);
        hzF2.A00 = hxx;
        FbUserSession A032 = 1Br.A03(hzF2.A02);
        1BY r02 = hzF2.A01.A00;
        ((2QO) 1Lm.A07(A032, r02, 99977)).A7G(hzF2.A03);
        ((2QT) 1Lm.A07(A032, r02, 99981)).A67(hzF2.A04);
    }
}
