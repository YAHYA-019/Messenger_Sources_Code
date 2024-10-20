package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2zf, reason: invalid class name */
/* loaded from: 2zf.class */
public final class C2zf {
    public static final C2zf A00 = new Object();

    public static final int A00(C2zf c2zf, ImmutableList immutableList, int i, int i2, long j) {
        if (i >= i2) {
            return i2;
        }
        int i3 = (i2 + i) / 2;
        if (((ThreadSummary) immutableList.get(i3)).A0N != j) {
            if (((ThreadSummary) immutableList.get(i3)).A0N < j) {
                i2 = i3 - 1;
            } else {
                i = i3 + 1;
            }
            i3 = A00(c2zf, immutableList, i, i2, j);
        }
        return i3;
    }

    public static final long A01(ImmutableList immutableList, int i) {
        int size;
        if (immutableList.size() > i) {
            size = i - 1;
        } else {
            if (immutableList.isEmpty()) {
                return 0L;
            }
            size = immutableList.size() - 1;
        }
        Object obj = immutableList.get(size);
        11T.A0A(obj);
        return ((ThreadSummary) obj).A0N;
    }
}
