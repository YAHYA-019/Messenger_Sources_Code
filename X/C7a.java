package X;

import com.facebook.fbtrace.FbTraceNode;

/* loaded from: C7a.class */
public final class C7a {
    public final long A00;
    public final FbTraceNode A01;
    public final Object A02;

    public C7a(FbTraceNode fbTraceNode, Object obj, long j) {
        this.A02 = obj;
        this.A00 = j;
        this.A01 = fbTraceNode;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof C7a)) {
            C7a c7a = (C7a) obj;
            if (this.A02.equals(c7a.A02) && this.A00 == c7a.A00 && this.A01.equals(c7a.A01)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(this.A02, Long.valueOf(this.A00), this.A01);
    }
}
