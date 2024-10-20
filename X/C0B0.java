package X;

import android.util.SparseArray;

/* renamed from: X.0B0, reason: invalid class name */
/* loaded from: 0B0.class */
public final class C0B0 extends C0B1 {
    public static final C0B2 A00 = new Object();
    public boolean isAttributionEnabled;
    public final SparseArray sensorConsumption;
    public final C0B2 total;

    public C0B0() {
        this(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0B2, java.lang.Object] */
    public C0B0(boolean z) {
        this.total = new Object();
        this.sensorConsumption = new SparseArray();
        this.isAttributionEnabled = z;
    }

    public static void A00(SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, int i) {
        sparseArray3.clear();
        int size = sparseArray.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            C0B1 c0b1 = (C0B1) sparseArray.valueAt(i3);
            C0B2 c0b2 = A00;
            C0B1 c0b12 = (C0B1) sparseArray2.get(keyAt, c0b2);
            C0B1 A0A = i > 0 ? c0b1.A0A(c0b12, null) : c0b1.A09(c0b12, null);
            if (!c0b2.equals(A0A)) {
                sparseArray3.put(keyAt, A0A);
            }
            i2 = i3 + 1;
        }
        int size2 = sparseArray2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            int keyAt2 = sparseArray2.keyAt(i4);
            if (sparseArray.get(keyAt2) == null) {
                C0B2 c0b22 = A00;
                C0B1 c0b13 = (C0B1) sparseArray2.valueAt(i4);
                C0B1 A0A2 = i > 0 ? c0b22.A0A(c0b13, null) : c0b22.A09(c0b13, null);
                if (!c0b22.equals(A0A2)) {
                    sparseArray3.put(keyAt2, A0A2);
                }
            }
        }
    }

    @Override // X.C0B1
    public /* bridge */ /* synthetic */ C0B1 A08(C0B1 c0b1) {
        A0B((C0B0) c0b1);
        return this;
    }

    @Override // X.C0B1
    public /* bridge */ /* synthetic */ C0B1 A09(C0B1 c0b1, C0B1 c0b12) {
        C0B0 c0b0 = (C0B0) c0b1;
        C0B0 c0b02 = (C0B0) c0b12;
        if (c0b02 == null) {
            c0b02 = new C0B0(this.isAttributionEnabled);
        }
        if (c0b0 == null) {
            c0b02.A0B(this);
        } else {
            this.total.A09(c0b0.total, c0b02.total);
            if (c0b02.isAttributionEnabled) {
                A00(this.sensorConsumption, c0b0.sensorConsumption, c0b02.sensorConsumption, -1);
                return c0b02;
            }
        }
        return c0b02;
    }

    @Override // X.C0B1
    public /* bridge */ /* synthetic */ C0B1 A0A(C0B1 c0b1, C0B1 c0b12) {
        C0B0 c0b0 = (C0B0) c0b1;
        C0B0 c0b02 = (C0B0) c0b12;
        if (c0b02 == null) {
            c0b02 = new C0B0(this.isAttributionEnabled);
        }
        if (c0b0 == null) {
            c0b02.A0B(this);
        } else {
            this.total.A0A(c0b0.total, c0b02.total);
            if (c0b02.isAttributionEnabled) {
                A00(this.sensorConsumption, c0b0.sensorConsumption, c0b02.sensorConsumption, 1);
                return c0b02;
            }
        }
        return c0b02;
    }

    public void A0B(C0B0 c0b0) {
        this.total.A0D(c0b0.total);
        if (this.isAttributionEnabled && c0b0.isAttributionEnabled) {
            this.sensorConsumption.clear();
            SparseArray sparseArray = c0b0.sensorConsumption;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                SparseArray sparseArray2 = this.sensorConsumption;
                int keyAt = sparseArray.keyAt(i);
                sparseArray = c0b0.sensorConsumption;
                sparseArray2.put(keyAt, sparseArray.valueAt(i));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0B0 c0b0 = (C0B0) obj;
            if (this.isAttributionEnabled != c0b0.isAttributionEnabled || !this.total.equals(c0b0.total) || !0Ln.A01(this.sensorConsumption, c0b0.sensorConsumption)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.total, (this.isAttributionEnabled ? 1 : 0) * 31) + this.sensorConsumption.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SensorMetrics{isAttributionEnabled=");
        A0k.append(this.isAttributionEnabled);
        A0k.append(", total=");
        A0k.append(this.total);
        A0k.append(", sensorConsumption=");
        A0k.append(this.sensorConsumption);
        return AnonymousClass001.A0f(A0k);
    }
}
