package X;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.044, reason: invalid class name */
/* loaded from: 044.class */
public final class AnonymousClass044 {
    public int A01;
    public long[] A03 = new long[5];
    public String[] A06 = new String[5];
    public AnonymousClass045[] A04 = new AnonymousClass045[5];
    public int[] A02 = new int[5];
    public AnonymousClass042[] A05 = new AnonymousClass042[5];
    public int A00 = 5;

    public void A00(AnonymousClass045 anonymousClass045, AnonymousClass042 anonymousClass042, String str, TimeUnit timeUnit, int i, long j) {
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 == i3) {
            int i4 = i3 + (i3 >> 1);
            long[] jArr = this.A03;
            if (jArr.length < i4) {
                this.A03 = Arrays.copyOf(jArr, i4);
            }
            String[] strArr = this.A06;
            if (strArr.length < i4) {
                this.A06 = (String[]) Arrays.copyOf(strArr, i4);
            }
            AnonymousClass045[] anonymousClass045Arr = this.A04;
            if (anonymousClass045Arr.length < i4) {
                this.A04 = (AnonymousClass045[]) Arrays.copyOf(anonymousClass045Arr, i4);
            }
            int[] iArr = this.A02;
            if (iArr.length < i4) {
                this.A02 = Arrays.copyOf(iArr, i4);
            }
            AnonymousClass042[] anonymousClass042Arr = this.A05;
            if (anonymousClass042Arr.length < i4) {
                this.A05 = (AnonymousClass042[]) Arrays.copyOf(anonymousClass042Arr, i4);
            }
            this.A00 = i4;
        }
        if (anonymousClass045 != null && !anonymousClass045.A03) {
            throw AnonymousClass001.A0N("PointData should be locked before passing to the storage");
        }
        this.A03[this.A01] = timeUnit.toNanos(j);
        String[] strArr2 = this.A06;
        int i5 = this.A01;
        strArr2[i5] = str;
        this.A04[i5] = anonymousClass045;
        this.A02[i5] = i;
        this.A05[i5] = anonymousClass042;
        this.A01 = i5 + 1;
    }
}
