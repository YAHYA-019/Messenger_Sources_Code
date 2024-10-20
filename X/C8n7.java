package X;

import android.text.TextUtils;
import java.util.BitSet;

/* renamed from: X.8n7, reason: invalid class name */
/* loaded from: 8n7.class */
public final class C8n7 extends C1rj {
    public static final C6wc A06 = C6wb.A00;
    public 1LI A00;
    public 1LI A01;
    public 1LI A02;
    public 1Im A03;
    public 1Im A04;
    public C6wc A05;

    public C8n7() {
        super("AlbumComponent");
        this.A05 = A06;
    }

    public final Object[] A0k() {
        return new Object[]{7zN.A0h(), this.A03, null, this.A05, this.A00, this.A01, this.A02, this.A04};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8n7 c8n7 = (C8n7) super.A0l();
        1LI r304 = null;
        c8n7.A00 = 7zO.A0S(c8n7.A00);
        c8n7.A01 = 7zO.A0S(c8n7.A01);
        1LI r0 = c8n7.A02;
        if (r0 != null) {
            r304 = r0.A0l();
        }
        c8n7.A02 = r304;
        return c8n7;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1Im r0 = this.A03;
        C6wc c6wc = this.A05;
        1Im r305 = this.A04;
        2cL r306 = this.A00;
        2cL r307 = this.A01;
        2cL r308 = this.A02;
        String str = null;
        C2ki A00 = C2kV.A00(r302);
        A00.A1H(-1);
        A00.A2j(true);
        if (r306 == null) {
            2cM A0j = 7zM.A0j(r302, 0);
            A0j.A2c();
            3yF A0L = 2KZ.A0L(r302, 0);
            A0L.A3C(false);
            7zP.A1E(A0L);
            A0L.A2f();
            A0L.A30(2131952736);
            A0L.A32(2132279311);
            7zM.A1L(A0j, A0L);
            r306 = A0j.A00;
        }
        A00.A2a(r306);
        if (r307 == null) {
            2cM A0j2 = 7zM.A0j(r302, 0);
            A0j2.A2c();
            3yF A0L2 = 2KZ.A0L(r302, 0);
            A0L2.A3C(false);
            7zP.A1E(A0L2);
            A0L2.A2f();
            A0L2.A30(2131952735);
            A0L2.A32(2132279311);
            7zM.A1L(A0j2, A0L2);
            r307 = A0j2.A00;
        }
        A00.A2b(r307);
        if (r308 == null) {
            2cM A0j3 = 7zM.A0j(r302, 0);
            A0j3.A2c();
            C53p A01 = C53o.A01(r302, 0);
            A01.A1M(2132279303);
            A01.A2W();
            A01.A0c();
            A01.A1W(2132279303);
            A01.A0J();
            r308 = 7zL.A0V(A0j3, A01.A01);
        }
        A00.A2c(r308);
        A00.A1c(2132279305);
        7zL.A1K(r302);
        8qQ r02 = new 8qQ();
        r02.A02 = c6wc;
        r02.A00 = r0;
        if (r305 == null) {
            r305 = 1LI.A0A(r302, C8n7.class, "AlbumComponent", 1443438312);
        }
        r02.A01 = r305;
        if (TextUtils.isEmpty(null)) {
            str = r302.A0D(2131952730);
        }
        r02.A03 = str;
        A00.A2d(r02);
        A00.A0e();
        return A00.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        C8mm c8mm = null;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 1443438312) {
            1Iw r0 = r302.A00.A00;
            C9cc c9cc = ((9MC) obj).A00;
            8Rt r02 = new 8Rt(r0, new C8mm());
            c8mm = r02.A01;
            c8mm.A08 = c9cc;
            BitSet bitSet = r02.A02;
            bitSet.set(0);
            C1rs.A01(bitSet, r02.A03);
            r02.A0J();
        }
        return c8mm;
    }
}
