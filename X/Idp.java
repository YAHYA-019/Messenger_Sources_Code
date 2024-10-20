package X;

import android.util.Pair;
import java.nio.ByteBuffer;

/* loaded from: Idp.class */
public final class Idp implements JGC {
    public final JE4 A00;
    public final IPQ A01 = new IPQ(new IPL(this));

    public Idp(JE4 je4) {
        this.A00 = je4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, X.Hd7] */
    public void CDf(I40 i40) {
        IPK A00;
        byte[] bArr = i40.A09;
        if (bArr != null) {
            int i = i40.A01;
            long j = i40.A03;
            int i2 = i40.A02;
            int i3 = i40.A00;
            A00 = this.A01.A00();
            try {
                I0F i0f = (I0F) A00.get();
                i0f.A0A = bArr;
                i0f.A03 = i;
                i0f.A07 = j;
                i0f.A09 = false;
                i0f.A04 = i2;
                i0f.A02 = i3;
                this.A00.CDe(A00);
                return;
            } finally {
            }
        }
        RLg[] rLgArr = i40.A0B;
        if (rLgArr == null) {
            throw AnonymousClass001.A0L("Preview frame data must have either byte[] or planes");
        }
        int i4 = i40.A01;
        long j2 = i40.A03;
        boolean z = i40.A08;
        int i5 = i40.A02;
        int i6 = i40.A00;
        float[] fArr = i40.A0A;
        Pair pair = i40.A04;
        Long l = i40.A07;
        Float f = i40.A05;
        Long l2 = i40.A06;
        A00 = this.A01.A00();
        try {
            int length = rLgArr.length;
            Hd7[] hd7Arr = new Hd7[length];
            for (int i7 = 0; i7 < length; i7++) {
                RLg rLg = rLgArr[i7];
                ByteBuffer byteBuffer = rLg.A02;
                int i8 = rLg.A00;
                int i9 = rLg.A01;
                ?? obj = new Object();
                obj.A02 = byteBuffer;
                obj.A00 = i8;
                obj.A01 = i9;
                hd7Arr[i7] = obj;
            }
            I0F i0f2 = (I0F) A00.get();
            float floatValue = f == null ? 0.0f : f.floatValue();
            long longValue = l == null ? 0L : l.longValue();
            long longValue2 = l2 != null ? l2.longValue() : 0L;
            I0F.A00(i0f2);
            i0f2.A0C = hd7Arr;
            i0f2.A03 = i4;
            i0f2.A07 = j2;
            i0f2.A09 = z;
            i0f2.A04 = i5;
            i0f2.A02 = i6;
            i0f2.A0B = fArr;
            i0f2.A08 = pair;
            i0f2.A00 = floatValue;
            i0f2.A06 = longValue;
            i0f2.A05 = longValue2;
            this.A00.CDe(A00);
        } finally {
        }
    }
}
