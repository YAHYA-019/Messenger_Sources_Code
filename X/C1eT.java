package X;

import android.util.SparseArray;

/* renamed from: X.1eT, reason: invalid class name */
/* loaded from: 1eT.class */
public final class C1eT {
    public final SparseArray A00;
    public final C1dx A01;
    public final 1eU A02;
    public final C1dy A03;
    public final C1dv A04;
    public final C1dr A05;
    public final C1e5 A06;
    public final C1dz A07;
    public volatile boolean A09 = false;
    public volatile boolean A08 = false;

    public C1eT(SparseArray sparseArray, C1dx c1dx, C1dy c1dy, C1dr c1dr, C1e5 c1e5, C1dz c1dz) {
        this.A05 = c1dr;
        this.A04 = c1dr.A0J;
        this.A03 = c1dy;
        this.A01 = c1dx;
        this.A07 = c1dz;
        this.A06 = c1e5;
        this.A02 = new 1eU(c1e5, c1dz);
        this.A00 = sparseArray;
    }
}
