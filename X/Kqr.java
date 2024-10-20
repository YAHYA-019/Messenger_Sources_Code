package X;

import android.util.Pair;
import java.util.Locale;

/* loaded from: Kqr.class */
public final class Kqr {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public long A05;
    public Pair A06;
    public boolean A08;
    public boolean A09;
    public final 6D1 A0A;
    public final String A0B;
    public String A07 = "";
    public long A03 = Long.MAX_VALUE;

    public Kqr(6D1 r302, String str) {
        long j = -1;
        Long valueOf = Long.valueOf(j);
        this.A02 = j;
        this.A06 = Pair.create(valueOf, valueOf);
        this.A0A = r302;
        this.A0B = str;
    }

    public String toString() {
        return String.format(Locale.US, "isKeyCached=%s, networkRequests=%d, mCacheRequests=%d, mRequestedRange=[%d,%d], mDynamicRange=%s", Boolean.valueOf(this.A09), Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A05), Long.valueOf(this.A04), Pair.create(Long.valueOf(this.A03), Long.valueOf(this.A02)));
    }
}
