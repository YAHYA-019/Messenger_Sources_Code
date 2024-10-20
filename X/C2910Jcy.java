package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jcy, reason: case insensitive filesystem */
/* loaded from: Jcy.class */
public final class C2910Jcy extends KuR {
    public static final MEL A0E = new LOV(2);
    public final float A00;
    public final float A01;
    public final MEL A02;
    public final MEL A03;
    public final MEL A04;
    public final MEL A05;
    public final KtX A06;
    public final Kty A07;
    public final boolean A08;
    public final float[] A09;
    public final float[] A0A;
    public final float[] A0B;
    public final Function1 A0C;
    public final Function1 A0D;

    public C2910Jcy(KtX ktX, Kty kty, String str, float[] fArr, int i) {
        this(new LOX(ktX, 2), new LOX(ktX, 3), ktX, kty, str, fArr, null, 0.0f, 1.0f, i);
    }

    public C2910Jcy(Kty kty, String str, float[] fArr, double d, float f, float f2, int i) {
        this(d == 1.0d ? A0E : new LOW(0, d), d == 1.0d ? A0E : new LOW(1, d), new KtX(d, 1.0d, 0.0d, 0.0d, 0.0d), kty, str, fArr, null, f, f2, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0574, code lost:
    
        r324 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2910Jcy(X.MEL r302, X.MEL r303, X.KtX r304, X.Kty r305, java.lang.String r306, float[] r307, float[] r308, float r309, float r310, int r311) {
        /*
            Method dump skipped, instructions count: 1717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2910Jcy.<init>(X.MEL, X.MEL, X.KtX, X.Kty, java.lang.String, float[], float[], float, float, int):void");
    }

    public static final float A00(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float A00 = ((((JQz.A00(f, f4, f2, f5) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (A00 < 0.0f) {
            A00 = -A00;
        }
        return A00;
    }

    @Override // X.KuR
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean z = false;
            if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
                C2910Jcy c2910Jcy = (C2910Jcy) obj;
                if (Float.compare(c2910Jcy.A01, this.A01) == 0 && Float.compare(c2910Jcy.A00, this.A00) == 0 && 11T.A0O(this.A07, c2910Jcy.A07) && Arrays.equals(this.A0A, c2910Jcy.A0A)) {
                    KtX ktX = this.A06;
                    KtX ktX2 = c2910Jcy.A06;
                    if (ktX != null) {
                        z = ktX.equals(ktX2);
                    } else if (ktX2 != null) {
                        if (11T.A0O(this.A05, c2910Jcy.A05)) {
                            return 11T.A0O(this.A03, c2910Jcy.A03);
                        }
                    }
                }
            }
            return z;
        }
        return true;
    }

    @Override // X.KuR
    public int hashCode() {
        int A05 = (AnonymousClass002.A05(this.A07, super.hashCode() * 31) + Arrays.hashCode(this.A0A)) * 31;
        float f = this.A01;
        int floatToIntBits = (A05 + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.A00;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        KtX ktX = this.A06;
        int A0E2 = floatToIntBits2 + JQz.A0E(ktX, 0);
        if (ktX == null) {
            A0E2 = 1BK.A03(this.A03, AnonymousClass002.A05(this.A05, A0E2 * 31));
        }
        return A0E2;
    }
}
