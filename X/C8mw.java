package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.List;

/* renamed from: X.8mw, reason: invalid class name */
/* loaded from: 8mw.class */
public final class C8mw extends C1rj {
    public float A00;
    public 6TN A01;
    public PlayerOrigin A02;
    public 6TI A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public C8mw() {
        super("SimpleGrootComponent");
    }

    public static QFL A00(1Iw r301) {
        return new QFL(r301, new C8mw());
    }

    public final Object[] A0k() {
        List list = this.A04;
        Boolean valueOf = Boolean.valueOf(this.A05);
        PlayerOrigin playerOrigin = this.A02;
        6TN r0 = this.A01;
        6TI r02 = this.A03;
        Boolean A0d = 1BK.A0d();
        return new Object[]{list, valueOf, playerOrigin, r0, r02, A0d, A0d, Boolean.valueOf(this.A06), Boolean.valueOf(this.A07), Float.valueOf(this.A00)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        PlayerOrigin playerOrigin = this.A02;
        float f = this.A00;
        6TI r0 = this.A03;
        List list = this.A04;
        boolean z = this.A05;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        6TN r310 = this.A01;
        11T.A0F(r302, 0);
        7zR.A1N(playerOrigin, r0);
        QUe qUe = z2 ? new QUe() : new GR2();
        if (r310 == null) {
            r310 = 6TN.A0F;
        }
        GR6 A00 = GR5.A00(r302);
        A00.A2a(qUe);
        A00.A2Z(playerOrigin);
        A00.A2Y(r310);
        GR5 gr5 = A00.A01;
        gr5.A0J = list;
        A00.A2c(false);
        A00.A2b(r0);
        gr5.A0N = z;
        A00.A2X(f);
        if (z3) {
            7zN.A1C(A00, r302, C8mw.class, "SimpleGrootComponent");
        }
        return A00.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 900907473652242L);
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, java.lang.String] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.A01
            r304 = r0
            r0 = -1351902487(0xffffffffaf6b9ae9, float:-2.142816E-10)
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L17
            r0 = r302
            r1 = r303
            r2 = r304
            X.4YV.A1G(r0, r1, r2)
        L15:
            r0 = 0
            return r0
        L17:
            r0 = r302
            X.1Iv r0 = r0.A00
            X.1Is r0 = r0.A01
            X.8mw r0 = (X.C8mw) r0
            r306 = r0
            r0 = r306
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = r0.A02
            r307 = r0
            r0 = r306
            X.6TI r0 = r0.A03
            r308 = r0
            r0 = r307
            r1 = r308
            X.1BL.A1F(r0, r1)
            r0 = 115824(0x1c470, float:1.62304E-40)
            r305 = r0
            r0 = r308
            java.lang.String r0 = r0.A03()
            r308 = r0
            r0 = r305
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> Lb1
            X.6Tb r0 = (X.6Tb) r0     // Catch: java.lang.Throwable -> Lb1
            r1 = r307
            r2 = r308
            X.GRD r0 = r0.A07(r1, r2)
            r306 = r0
            r0 = r306
            X.6U2 r0 = r0.A07()
            r309 = r0
            r0 = r306
            java.lang.ref.WeakReference r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.GRS r0 = (X.GRS) r0
            r306 = r0
            r0 = r309
            if (r0 == 0) goto L15
            r0 = r306
            if (r0 == 0) goto L98
            r0 = r306
            boolean r0 = r0.A1B()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L98
            X.52j r0 = X.C52j.A2Z
            r306 = r0
            X.6U9 r0 = new X.6U9
            r307 = r0
            r0 = r307
            r1 = r306
            r0.<init>(r1)
        L8f:
            r0 = r309
            r1 = r307
            r0.A06(r1)
            r0 = 0
            return r0
        L98:
            X.52j r0 = X.C52j.A2Z
            r308 = r0
            r0 = -1
            r305 = r0
            X.6U4 r0 = new X.6U4
            r307 = r0
            r0 = r307
            r1 = r308
            r2 = r305
            r0.<init>(r1, r2)
            goto L8f
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8mw.A15(X.1Im, java.lang.Object):java.lang.Object");
    }
}
