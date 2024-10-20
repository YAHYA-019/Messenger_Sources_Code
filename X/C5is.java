package X;

import android.content.Context;
import android.view.Choreographer;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5is, reason: invalid class name */
/* loaded from: 5is.class */
public final class C5is implements C5it {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final C5ir A05;
    public final 0Oc A06;

    public C5is(Context context, C5ir c5ir) {
        this.A05 = c5ir;
        final 0fL r0 = new 0fL() { // from class: X.5iu
            public void Bzn(long j) {
                C5is c5is = C5is.this;
                double d = c5is.A04;
                long max = Math.max(Math.round(j / d), 1L);
                long min = Math.min(max - 1, 100);
                double d2 = c5is.A01;
                double d3 = min;
                c5is.A01 = d2 + d3;
                if (min > 4) {
                    c5is.A00 += d3 / 4.0d;
                }
                c5is.A02 = (long) (c5is.A02 + (d * max));
            }
        };
        final Choreographer choreographer = Choreographer.getInstance();
        this.A06 = new 0Oc(choreographer, r0) { // from class: X.5iv
            public long A00;
            public long A01;
            public final Choreographer A03;
            public final 0fL A04;
            public boolean A02 = false;
            public final Choreographer.FrameCallback A05 = new JRT(this, 0);

            {
                long j = -1;
                this.A00 = j;
                this.A01 = j;
                this.A03 = choreographer;
                this.A04 = r0;
            }

            public void disable() {
                this.A02 = false;
                this.A03.removeFrameCallback(this.A05);
            }

            public void enable() {
                if (!this.A02) {
                    this.A00 = -1;
                }
                this.A02 = true;
                this.A03.postFrameCallback(this.A05);
            }
        };
        0Od r306 = 0Od.A01;
        if (r306 == null) {
            r306 = new 0Od();
            0Od.A01 = r306;
        }
        this.A04 = r306.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0L;
    }

    @Override // X.C5it
    public void disable() {
        if (this.A03) {
            this.A03 = false;
            this.A06.disable();
            C5ir c5ir = this.A05;
            c5ir.CGg(new 6CM("frame_based", (List) null, Math.min(this.A01, 3600.0d), Math.min(this.A00, 1000.0d), TimeUnit.NANOSECONDS.toMillis(Math.min(this.A02, A07))));
            c5ir.Bto();
            this.A01 = 0.0d;
            this.A00 = 0.0d;
            this.A02 = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.6CK, java.lang.Object] */
    @Override // X.C5it
    public void enable() {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A06.enable();
        this.A05.Bvt(new Object());
    }
}
