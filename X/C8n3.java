package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import java.util.BitSet;

/* renamed from: X.8n3, reason: invalid class name */
/* loaded from: 8n3.class */
public final class C8n3 extends C1rj {
    public static final C5j5 A0D = C5j5.A01;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C5j5 A04;
    public 5vH A05;
    public C5ft A06;
    public 5vW A07;
    public 7Jt A08;
    public 9Zg A09;
    public C66e A0A;
    public boolean A0B;
    public boolean A0C;

    public C8n3() {
        super("PhotoGridWrapperComponent");
        this.A00 = -1907223;
        this.A0B = true;
        this.A01 = -1;
        this.A04 = A0D;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A0B), this.A0A, this.A06, null, this.A05, Integer.valueOf(this.A01), this.A09, Integer.valueOf(this.A02), this.A08, Integer.valueOf(this.A03), this.A07, Boolean.valueOf(this.A0C), this.A04};
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0092, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8n3.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1619314521) {
            if (i != -1048037474) {
                return null;
            }
            1LI.A0J(r302, obj);
            return null;
        }
        9Rp r0 = (9Rp) obj;
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        float[] fArr = r0.A02;
        Photo photo = r0.A01;
        int i2 = r0.A00;
        C8n3 c8n3 = (C8n3) r03;
        C5ft c5ft = c8n3.A06;
        C66e c66e = c8n3.A0A;
        int i3 = c8n3.A00;
        7Jt r05 = c8n3.A08;
        9Zg r06 = c8n3.A09;
        int i4 = c8n3.A03;
        int i5 = c8n3.A02;
        int i6 = c8n3.A01;
        boolean z = c8n3.A0B;
        C5j5 c5j5 = c8n3.A04;
        5vW r07 = c8n3.A07;
        boolean z2 = c8n3.A0C;
        11T.A0F(r04, 0);
        11T.A0G(c5ft, 1, c66e);
        7zP.A1Q(c5j5, 11, fArr);
        11T.A0F(photo, 15);
        8SJ r08 = new 8SJ(r04, new 8oG());
        r08.A0f(1.0f);
        8oG r09 = r08.A01;
        r09.A00 = i3;
        r08.A0j(1.0f);
        r09.A0D = z;
        r09.A0E = true;
        r08.A1Q(i2);
        r09.A07 = c5ft;
        r09.A01 = i6;
        r09.A08 = photo;
        BitSet bitSet = r08.A02;
        bitSet.set(0);
        r09.A0B = r06;
        r09.A0C = c66e.AwG(c5ft, photo);
        r09.A02 = i5;
        r09.A0A = r05;
        r09.A03 = i4;
        r09.A09 = r07;
        5SA r010 = new 5SA();
        C0By.A05(AnonymousClass001.A1Q(fArr.length, 8), 4YT.A00(1403));
        float[] fArr2 = r010.A07;
        if (fArr2 == null) {
            fArr2 = new float[8];
            r010.A07 = fArr2;
        }
        System.arraycopy(fArr, 0, fArr2, 0, 8);
        if (z) {
            r010.A05(7zL.A01(4YU.A0E(r04), 2132279351), i3);
        }
        if (photo.A0H) {
            r010.A03 = i6;
            r010.A04 = 0S2.A00;
        }
        r09.A05 = r010;
        r09.A04 = InterfaceC07034in.A01;
        r09.A06 = c5j5;
        r09.A0F = z2;
        C1rs.A05(bitSet, r08.A03, 1);
        r08.A0J();
        return r09;
    }
}
