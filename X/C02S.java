package X;

import java.util.Arrays;

/* renamed from: X.02S, reason: invalid class name */
/* loaded from: 02S.class */
public final class C02S {
    public static final C02S A01 = new C02S(-1);
    public static final C02S A02 = new C02S(-2);
    public static final C02S A03 = new C02S(new int[0]);
    public final int[] A00;

    public C02S(int... iArr) {
        this.A00 = iArr;
    }

    public C02S(int[] iArr, int[] iArr2) {
        this.A00 = iArr;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && Arrays.equals(this.A00, ((C02S) obj).A00) && Arrays.equals((int[]) null, (int[]) null));
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + Arrays.hashCode((int[]) null);
    }

    public String toString() {
        return 0Pz.A0z("{normalMarkers: ", Arrays.toString(this.A00), ", metadataMarkers: ", Arrays.toString((int[]) null), "}");
    }
}
