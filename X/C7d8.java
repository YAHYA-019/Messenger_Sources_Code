package X;

import java.util.List;

/* renamed from: X.7d8, reason: invalid class name */
/* loaded from: 7d8.class */
public final class C7d8 extends 6CM {
    public final double A00;
    public final double A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public C7d8(List list, double d, double d2, double d3, double d4, int i, long j, long j2, long j3) {
        super("frame_metrics", list, d, d2, j);
        this.A04 = j2;
        this.A02 = i;
        this.A05 = true;
        this.A03 = j3;
        this.A01 = d3;
        this.A00 = d4;
    }

    public C7d8(List list, double d, double d2, int i, long j, long j2) {
        super("frame_metrics", list, d, d2, j);
        this.A04 = j2;
        this.A02 = i;
        this.A05 = false;
        this.A03 = 0L;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
    }
}
