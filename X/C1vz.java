package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1vz, reason: invalid class name */
/* loaded from: 1vz.class */
public final class C1vz {
    public final float A00;
    public final int A01;
    public final long A02;
    public final C0Av A03;
    public final List A04 = new ArrayList();

    public C1vz(int i, float f, int i2) {
        this.A02 = TimeUnit.MILLISECONDS.toNanos(i);
        this.A00 = f;
        this.A01 = i2;
        this.A03 = new C0Av(i2);
    }
}
