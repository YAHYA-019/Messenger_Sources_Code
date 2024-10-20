package X;

/* loaded from: Hpc.class */
public final class Hpc {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Integer A04;

    public Hpc(Integer num, long j, long j2, long j3, long j4) {
        this.A04 = num;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = j3;
        this.A00 = j4;
    }

    public String toString() {
        StringBuilder A0o;
        long j;
        int intValue = this.A04.intValue();
        if (intValue == 4) {
            A0o = AnonymousClass001.A0o("target_buffer_size_reached");
            A0o.append(". Target:");
            A0o.append(this.A02);
            A0o.append(". Allocation:");
            j = this.A03;
        } else if (intValue == 2) {
            A0o = AnonymousClass001.A0o("buffer_draining_above_low_watermark");
            A0o.append(". Low watermark:");
            j = this.A01;
        } else {
            if (intValue != 3) {
                return 1 - intValue != 0 ? "unknown" : "paused";
            }
            A0o = AnonymousClass001.A0o("above_high_watermark");
            A0o.append(". High watermark:");
            j = this.A00;
        }
        return AnonymousClass001.A0h(A0o, j);
    }
}
