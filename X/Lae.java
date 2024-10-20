package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: Lae.class */
public final class Lae implements 6aL {
    public final int A00;
    public final long A01;
    public final int[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long[] A05;

    public Lae(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A02 = iArr;
        this.A04 = jArr;
        this.A03 = jArr2;
        this.A05 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A01 = jArr2[i] + jArr3[i];
        }
    }

    public long Aic() {
        return this.A01;
    }

    public C7sm B9X(long j) {
        long[] jArr = this.A05;
        int A07 = Util.A07(jArr, j, true);
        long j2 = jArr[A07];
        long[] jArr2 = this.A04;
        L42 l42 = new L42(j2, jArr2[A07]);
        if (l42.A01 >= j || A07 == this.A00 - 1) {
            return new C7sm(l42, l42);
        }
        int i = A07 + 1;
        return new C7sm(l42, new L42(jArr[i], jArr2[i]));
    }

    public /* synthetic */ long BGn(int i) {
        return this.A01;
    }

    public boolean BVw() {
        return true;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ChunkIndex(length=");
        A0k.append(this.A00);
        A0k.append(", sizes=");
        A0k.append(Arrays.toString(this.A02));
        A0k.append(", offsets=");
        A0k.append(Arrays.toString(this.A04));
        A0k.append(", timeUs=");
        A0k.append(Arrays.toString(this.A05));
        A0k.append(", durationsUs=");
        A0k.append(Arrays.toString(this.A03));
        return AnonymousClass001.A0d(")", A0k);
    }
}
