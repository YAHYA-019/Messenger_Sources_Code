package X;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ggl, reason: case insensitive filesystem */
/* loaded from: Ggl.class */
public final class C2537Ggl extends ETq {
    public final AtomicReference A00;
    public final HkU A01;

    public C2537Ggl(HkU hkU, IEy iEy) {
        11T.A0F(hkU, 2);
        this.A01 = hkU;
        this.A00 = GOn.A1L(iEy);
    }

    public void A00() {
        AtomicReference atomicReference = this.A00;
        IEy iEy = (IEy) atomicReference.get();
        if (iEy != null) {
            IEy.A03(iEy);
            iEy.A02.Bn2();
        }
        atomicReference.set(null);
    }

    public void A02(Exception exc, java.util.Map map, int i, boolean z) {
        AbK.A1S(exc, map);
        AtomicReference atomicReference = this.A00;
        IEy iEy = (IEy) atomicReference.get();
        if (iEy != null) {
            this.A01.A06.A00(exc);
            IEy.A01(H9V.A02, iEy, exc, "Failed GET request for fetching offset", map, i, IEy.A00(exc), z);
        }
        atomicReference.set(null);
    }

    public void A03(String str, int i, java.util.Map map) {
        4YV.A1N(str, map);
        AtomicReference atomicReference = this.A00;
        IEy iEy = (IEy) atomicReference.get();
        if (iEy != null) {
            try {
                iEy.A02.Byn(str, map);
                try {
                    AbstractC01033pi A00 = EYr.A00(str);
                    11T.A0F(A00, 0);
                    boolean z = false;
                    long j = -1;
                    try {
                        if (A00.A1J() != C42h.A06) {
                            A00.A20();
                        } else {
                            while (A00.A1K() != C42h.A02) {
                                String A1C = AbG.A1C(A00);
                                if ("offset".equals(A1C)) {
                                    j = A00.A1B();
                                } else if ("duplicate".equals(A1C)) {
                                    z = A00.A1l();
                                }
                                A00.A20();
                            }
                            if (j >= 0) {
                                if (z) {
                                    j = iEy.A07.A00;
                                }
                                IEy.A05(iEy, j, z);
                            }
                        }
                        new Exception(str);
                    } catch (IOException e) {
                        e = e;
                    } catch (Exception e2) {
                        new IOException(e2);
                    }
                    throw e;
                } catch (IOException unused) {
                    throw new Exception(str);
                }
            } catch (HD7 e3) {
                IEy.A01(H9V.A02, iEy, e3, 0Pz.A0W("Failed to parse offset from GET response:", str), map, i, -1, true);
            }
        }
        atomicReference.set(null);
    }
}
