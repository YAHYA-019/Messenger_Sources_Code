package X;

import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: E0q.class */
public final class E0q extends 2Yf {
    public int A00;
    public FIJ A01;
    public FIJ A02;
    public FIJ A03;
    public GL7 A04;
    public FyG A05;

    public E0q() {
        super("NTHScrollRecyclerGroupSection");
    }

    public void A0T(C1qb c1qb) {
        E0T e0t = ((2Yf) this).A03;
        GL7 gl7 = this.A04;
        if (e0t.A02) {
            if (c1qb.A0J() != null) {
                4YV.A1F(c1qb, false, (-1) << (-1));
            }
            String string = gl7.getString(57);
            if (string != null) {
                List A0A = GL7.A0A(gl7);
                for (int i = 0; i < A0A.size(); i++) {
                    if (string.equals(GL7.A04(DKC.A0n(A0A, i)))) {
                        2Yg.A0E(c1qb, i);
                        return;
                    }
                }
            }
        }
    }

    public void A0X(2Yv r302, 2Yv r303) {
        E0T e0t = (E0T) r302;
        E0T e0t2 = (E0T) r303;
        e0t2.A00 = e0t.A00;
        e0t2.A02 = e0t.A02;
        e0t2.A01 = e0t.A01;
    }

    public void A0a(C1qb c1qb) {
        E0T e0t = ((2Yf) this).A03;
        AtomicInteger atomicInteger = new AtomicInteger((-1) >>> 1);
        AtomicInteger atomicInteger2 = new AtomicInteger((-1) << (-1));
        e0t.A02 = true;
        e0t.A00 = atomicInteger;
        e0t.A01 = atomicInteger2;
    }

    public void A0b(C1qb c1qb, int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i5;
        E0T e0t = ((2Yf) this).A03;
        GL7 gl7 = this.A04;
        FyG fyG = this.A05;
        FIJ fij = this.A03;
        FIJ fij2 = this.A02;
        FIJ fij3 = this.A01;
        int i8 = this.A00;
        AtomicInteger atomicInteger = e0t.A00;
        AtomicInteger atomicInteger2 = e0t.A01;
        if (fij2 != null) {
            try {
                int andSet = atomicInteger2.getAndSet(i2);
                int max = Math.max(Math.min(i3 - gl7.getInt(63, 0), i3 - 1), 0);
                if (i2 >= max && andSet < max) {
                    fij2.A07();
                }
            } catch (Exception e) {
                FAo.A00(fyG, e);
                return;
            }
        }
        if (fij != null) {
            int andSet2 = atomicInteger.getAndSet(i6);
            int max2 = Math.max(Math.min(gl7.getInt(66, 0), i3 - 1), 0);
            if (i6 <= max2 && andSet2 > max2) {
                fij.A07();
            }
        }
        if (i8 != -1) {
            if (i8 != ((-1) >>> 1)) {
                i6 = -1;
            } else if (i4 == 0) {
                i6 = 0;
            } else {
                if (i7 != i3 - 1) {
                    i7 = (i + i2) / 2;
                }
                i6 = i7;
            }
        }
        HashMap A0u = AnonymousClass001.A0u();
        AnonymousClass001.A1A("currentIndex", A0u, i6);
        AnonymousClass001.A1A("numItems", A0u, i3);
        F4N.A00(DKG.A0b(gl7, fyG), A0u);
        if (fij3 != null) {
            fij3.A07();
        }
    }

    public 2Ys A0d(C1qb c1qb) {
        GL7 gl7 = this.A04;
        2Yr r0 = new 2Yr();
        C2hf A0I = C2he.A0I(c1qb);
        A0I.A06(GL7.A0A(gl7));
        A0I.A05(2Yg.A07(c1qb, E0q.class, "NTHScrollRecyclerGroupSection"));
        A0I.A04(2Yg.A04(c1qb, E0q.class, "NTHScrollRecyclerGroupSection"));
        r0.A00(A0I);
        return r0.A00;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.2hj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.2hj, java.lang.Object] */
    public Object A0e(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != 239257522) {
            if (i != 1171108835) {
                return null;
            }
            C2hu c2hu = (C2hu) obj;
            return Boolean.valueOf(AnonymousClass001.A1Q(((GL7) c2hu.A01).Acj(), ((GL7) c2hu.A00).Acj()));
        }
        1Iv r0 = r302.A00;
        E0q e0q = r0.A01;
        1Iw r02 = r0.A00;
        GL7 gl7 = (GL7) ((C2i6) obj).A01;
        FyG fyG = e0q.A05;
        try {
            ?? obj2 = new Object();
            Dtm dtm = new Dtm(r02, new Dwl());
            Dwl dwl = dtm.A01;
            dwl.A00 = gl7;
            BitSet bitSet = dtm.A02;
            bitSet.set(1);
            dwl.A01 = fyG;
            bitSet.set(0);
            obj2.A03(dtm);
            return new C2hl(obj2);
        } catch (Exception e) {
            FAo.A00(fyG, e);
            ?? obj3 = new Object();
            DrZ A00 = DyP.A00(r02);
            A00.A0J();
            return 7zM.A0t(A00.A01, (C2hj) obj3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0q e0q = (E0q) r302;
            FyG fyG = this.A05;
            FyG fyG2 = e0q.A05;
            if (fyG != null) {
                if (!fyG.equals(fyG2)) {
                    return false;
                }
            } else if (fyG2 != null) {
                return false;
            }
            FIJ fij = this.A01;
            FIJ fij2 = e0q.A01;
            if (fij != null) {
                if (!fij.equals(fij2)) {
                    return false;
                }
            } else if (fij2 != null) {
                return false;
            }
            FIJ fij3 = this.A02;
            FIJ fij4 = e0q.A02;
            if (fij3 != null) {
                if (!fij3.equals(fij4)) {
                    return false;
                }
            } else if (fij4 != null) {
                return false;
            }
            FIJ fij5 = this.A03;
            FIJ fij6 = e0q.A03;
            if (fij5 != null) {
                if (!fij5.equals(fij6)) {
                    return false;
                }
            } else if (fij6 != null) {
                return false;
            }
            if (this.A00 != e0q.A00) {
                return false;
            }
            GL7 gl7 = this.A04;
            GL7 gl72 = e0q.A04;
            if (gl7 != null) {
                if (!gl7.equals(gl72)) {
                    return false;
                }
            } else if (gl72 != null) {
                return false;
            }
        }
        return true;
    }
}
