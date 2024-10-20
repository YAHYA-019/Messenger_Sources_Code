package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.6b9, reason: invalid class name */
/* loaded from: 6b9.class */
public final class C6b9 extends C6b8 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public K15 A04;
    public final 5Li A05;
    public final ImmutableList A06;
    public final 5LX A07;

    public C6b9(6YP r302, 5Li r303, 5LX r304, List list, int[] iArr) {
        super(r302, iArr);
        this.A05 = r303;
        this.A06 = ImmutableList.copyOf((Collection) list);
        this.A07 = r304;
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A03 = -9223372036854775807L;
    }

    public static int A00(C6b9 c6b9, long j) {
        long bitrateEstimate = (((float) c6b9.A05.getBitrateEstimate()) * 0.75f) / c6b9.A00;
        ImmutableList immutableList = c6b9.A06;
        if (!immutableList.isEmpty()) {
            int i = 1;
            while (i < immutableList.size() - 1 && ((C7se) immutableList.get(i)).A01 < bitrateEstimate) {
                i++;
            }
            C7se c7se = (C7se) immutableList.get(i - 1);
            C7se c7se2 = (C7se) immutableList.get(i);
            long j2 = c7se.A01;
            float f = ((float) (bitrateEstimate - j2)) / ((float) (c7se2.A01 - j2));
            bitrateEstimate = c7se.A00 + (f * ((float) (c7se2.A00 - r0)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < ((C6b8) c6b9).A01; i3++) {
            if (j == Long.MIN_VALUE || !c6b9.BQv(i3, j)) {
                if (((C6b8) c6b9).A02[i3].A05 <= bitrateEstimate) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public static void A01(List list, long[] jArr) {
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jArr.length) {
                break;
            }
            j += jArr[i2];
            i = i2 + 1;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) list.get(i3);
            if (builder != null) {
                builder.m11011add((Object) new C7se(j, jArr[i3]));
            }
        }
    }

    public int B9j() {
        return this.A02;
    }

    public Object B9r() {
        return null;
    }

    public int B9t() {
        return this.A01;
    }

    public void D7q(long j, long j2, long j3) {
        D7s(new LinkedList(), new MLn[0], j, j2, j3);
    }
}
