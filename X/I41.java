package X;

import android.util.Pair;

/* loaded from: I41.class */
public final class I41 {
    public Pair A00;
    public Boolean A01;
    public Float A02;
    public Float A03;
    public Float A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public float[] A0C;
    public float[] A0D;
    public int[] A0E;
    public static final HX8 A0Q = new HX8(0);
    public static final HX8 A0N = new HX8(1);
    public static final HX8 A0O = new HX8(2);
    public static final HX8 A0M = new HX8(3);
    public static final HX8 A0K = new HX8(4);
    public static final HX8 A0P = new HX8(5);
    public static final HX8 A0R = new HX8(6);
    public static final HX8 A0F = new HX8(7);
    public static final HX8 A0G = new HX8(8);
    public static final HX8 A0T = new HX8(9);
    public static final HX8 A0H = new HX8(10);
    public static final HX8 A0I = new HX8(11);
    public static final HX8 A0S = new HX8(12);
    public static final HX8 A0J = new HX8(13);
    public static final HX8 A0L = new HX8(14);

    public Object A00(HX8 hx8) {
        switch (hx8.A00) {
            case 0:
                return this.A0D;
            case 1:
                return this.A00;
            case 2:
                return this.A0A;
            case 3:
                return this.A03;
            case 4:
                return this.A09;
            case 5:
                return this.A0B;
            case 6:
                return this.A07;
            case 7:
                return this.A02;
            case 8:
                return this.A05;
            case 9:
                return this.A08;
            case 10:
                return this.A0C;
            case 11:
                return this.A0E;
            case 12:
                return this.A04;
            case 13:
                return this.A01;
            default:
                return this.A06;
        }
    }

    public void A01(HX8 hx8, Object obj) {
        switch (hx8.A00) {
            case 0:
                this.A0D = (float[]) obj;
                return;
            case 1:
                this.A00 = (Pair) obj;
                return;
            case 2:
                this.A0A = (Long) obj;
                return;
            case 3:
                this.A03 = (Float) obj;
                return;
            case 4:
                this.A09 = (Long) obj;
                return;
            case 5:
                this.A0B = (Long) obj;
                return;
            case 6:
                this.A07 = (Integer) obj;
                return;
            case 7:
                this.A02 = (Float) obj;
                return;
            case 8:
                this.A05 = (Integer) obj;
                return;
            case 9:
                this.A08 = (Integer) obj;
                return;
            case 10:
                if (obj == null) {
                    this.A0C = null;
                    return;
                }
                float[] fArr = (float[]) obj;
                if (fArr.length != 4) {
                    throw AnonymousClass001.A0L("Colour correction gain must be represented in a float array of length 4");
                }
                float[] fArr2 = this.A0C;
                if (fArr2 == null) {
                    fArr2 = new float[4];
                    this.A0C = fArr2;
                }
                System.arraycopy(fArr, 0, fArr2, 0, 4);
                return;
            case 11:
                if (obj == null) {
                    this.A0E = null;
                    return;
                }
                int[] iArr = (int[]) obj;
                if (iArr.length != 18) {
                    throw AnonymousClass001.A0L("Colour correction transform must be represented in a int array of length 18");
                }
                int[] iArr2 = this.A0E;
                if (iArr2 == null) {
                    iArr2 = new int[18];
                    this.A0E = iArr2;
                }
                System.arraycopy(iArr, 0, iArr2, 0, 18);
                return;
            case 12:
                this.A04 = (Float) obj;
                return;
            case 13:
                this.A01 = (Boolean) obj;
                return;
            default:
                this.A06 = (Integer) obj;
                return;
        }
    }
}
