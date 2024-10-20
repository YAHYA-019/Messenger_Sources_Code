package X;

import org.json.JSONObject;

/* renamed from: X.1eF, reason: invalid class name */
/* loaded from: 1eF.class */
public final class C1eF {
    public int A01;
    public int A04;
    public int[] A0C = {-1, -1};
    public int[] A0A = {-1, -1};
    public int[] A0D = {-1, -1};
    public int[] A0B = {-1, -1};
    public int A00 = 0;
    public int A05 = 0;
    public int A03 = 0;
    public int A06 = 0;
    public int A02 = 0;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public int A0F = 0;
    public int A0E = 0;

    private boolean A00(int[] iArr, int i) {
        int i2;
        this.A0E = i;
        boolean z = false;
        int i3 = iArr[0];
        if (i3 <= 0 || (i2 = iArr[1]) <= 0) {
            this.A0F = 3;
            return false;
        }
        this.A0F = 4;
        if (i3 <= i2) {
            z = true;
        }
        return z;
    }

    public boolean A01() {
        if (this.A02 > 0) {
            return this.A07 ? A00(this.A0C, 1) && A00(this.A0A, 2) : A00(this.A0B, 0);
        }
        this.A0F = 1;
        return false;
    }

    public String toString() {
        if (!A01()) {
            return 0Pz.A0C(this.A0F, this.A0E, "invalid_", "_");
        }
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("cores", this.A02);
            A12.put("is_biglittle", this.A07);
            if (this.A07) {
                A12.put("little_freq_min", this.A0C[0]);
                A12.put("little_freq_max", this.A0C[1]);
                A12.put("big_freq_min", this.A0A[0]);
                A12.put("big_freq_max", this.A0A[1]);
                A12.put("little_cores", this.A03);
                A12.put("big_cores", this.A00);
                int i = this.A05;
                if (i != 0) {
                    A12.put("mid_cores", i);
                }
                A12.put("little_index", this.A04);
                A12.put("big_index", this.A01);
            } else {
                A12.put("freq_min", this.A0B[0]);
                A12.put("freq_max", this.A0B[1]);
            }
            A12.put("prebuild", this.A09);
            return A12.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
