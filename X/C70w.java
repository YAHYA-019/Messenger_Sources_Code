package X;

import android.content.Context;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.70w, reason: invalid class name */
/* loaded from: 70w.class */
public abstract class C70w {
    public static final void A00(C6qu c6qu) {
        final 6yM Ad4 = c6qu.A00.Ad4();
        C6rN c6rN = ((6rM) c6qu.A06).A0S;
        final C70i c70i = (C70i) c6rN.Ax4().getValue();
        final C70x BAY = c6rN.BAY();
        AnonymousClass713 anonymousClass713 = (AnonymousClass713) c6rN.B64().getValue();
        if (anonymousClass713 == null) {
            anonymousClass713 = C74o.A01;
        }
        final AnonymousClass713 anonymousClass7132 = anonymousClass713;
        c6qu.A07.add(new AnonymousClass715(BAY, anonymousClass7132, c70i, Ad4) { // from class: X.714
            public final C00i A00 = new 1BQ(16385);
            public final C70y A01;
            public final AnonymousClass713 A02;
            public final C70i A03;
            public final 6yJ A04;

            {
                c70i.getClass();
                this.A03 = c70i;
                this.A01 = BAY;
                Ad4.getClass();
                this.A04 = Ad4;
                anonymousClass7132.getClass();
                this.A02 = anonymousClass7132;
            }

            @Override // X.AnonymousClass715
            public 1LI AdF(1LI r302, C1qb c1qb, C5j5 c5j5, 5vW r305, List list, int i) {
                C5fv c5fv = ((5vV) r305).A00;
                C2670Gkm c2670Gkm = new C2670Gkm(c1qb, new GlK());
                GlK glK = c2670Gkm.A01;
                glK.A05 = c5fv;
                BitSet bitSet = c2670Gkm.A02;
                bitSet.set(1);
                glK.A04 = this.A01;
                glK.A00 = ((C1rs) c2670Gkm).A02.A06(2132279337);
                bitSet.set(0);
                glK.A06 = this.A03;
                bitSet.set(2);
                glK.A03 = r302.A0l();
                bitSet.set(3);
                6yJ r0 = this.A04;
                Context context = ((1Iw) c1qb).A0D;
                glK.A01 = r0.BDv(context);
                glK.A02 = this.A02.Chw(context.getResources(), c5fv, null, list, i);
                C1rs.A05(bitSet, c2670Gkm.A03, 4);
                c2670Gkm.A0J();
                return glK;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
            
                if (((X.2yD) r301.A00.get()).AZr(X.1GD.A07, 2342158521071707162L) == false) goto L6;
             */
            @Override // X.AnonymousClass715
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean BQh(X.5vW r302) {
                /*
                    r301 = this;
                    r0 = r301
                    X.70i r0 = r0.A03
                    r303 = r0
                    r0 = r302
                    X.5vV r0 = (X.5vV) r0
                    r302 = r0
                    r0 = r302
                    X.5fv r0 = r0.A00
                    r304 = r0
                    r0 = r303
                    r1 = r304
                    boolean r0 = r0.A01(r1)
                    r305 = r0
                    r0 = r305
                    if (r0 != 0) goto L46
                    r0 = r301
                    X.00i r0 = r0.A00
                    java.lang.Object r0 = r0.get()
                    X.2yD r0 = (X.2yD) r0
                    r306 = r0
                    r0 = 2342158521071707162(0x208104c40022241a, double:4.061780316550985E-152)
                    r307 = r0
                    X.1GD r0 = X.1GD.A07
                    r304 = r0
                    r0 = r306
                    r1 = r304
                    r2 = r307
                    boolean r0 = r0.AZr(r1, r2)
                    r309 = r0
                    r0 = 1
                    r305 = r0
                    r0 = r309
                    if (r0 != 0) goto L4b
                L46:
                    r0 = 0
                    r305 = r0
                    r0 = 0
                    r304 = r0
                L4b:
                    r0 = r305
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass714.BQh(X.5vW):boolean");
            }
        });
    }
}
