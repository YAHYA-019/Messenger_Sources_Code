package com.facebook.msys.mci;

import X.1BL;
import X.2yC;
import X.AnonymousClass001;
import X.C1ju;
import java.util.Map;

/* loaded from: JQLResultSet.class */
public final class JQLResultSet implements CQLResultSet {
    public static final JQLResultSet A0D = new JQLResultSet(null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null);
    public final int A00;
    public final 2yC A01;
    public final short A02;
    public final short A03;
    public final short A04;
    public final short A05;
    public final short A06;
    public final short A07;
    public final byte[] A08;
    public final short[] A09;
    public final short A0A;
    public final short[] A0B;
    public final short[] A0C;

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.2yC] */
    public JQLResultSet(byte[] bArr, short[] sArr, short[] sArr2, short[] sArr3, short s, short s2, short s3, short s4, short s5, short s6, short s7, int i, int[] iArr, long[] jArr, double[] dArr, boolean[] zArr, boolean[] zArr2, Object[] objArr, Map map) {
        this.A08 = bArr;
        this.A09 = sArr;
        this.A0B = sArr2;
        this.A0C = sArr3;
        this.A03 = s;
        this.A05 = s2;
        this.A06 = s3;
        this.A04 = s4;
        this.A02 = s5;
        this.A0A = s6;
        this.A07 = s7;
        this.A00 = i;
        ?? obj = new Object();
        ((2yC) obj).A02 = iArr;
        ((2yC) obj).A03 = jArr;
        ((2yC) obj).A01 = dArr;
        ((2yC) obj).A05 = zArr;
        ((2yC) obj).A06 = zArr2;
        ((2yC) obj).A04 = objArr;
        ((2yC) obj).A00 = map;
        this.A01 = obj;
    }

    private void A00(int i, int i2, byte b) {
        boolean z = true;
        C1ju.A00(1BL.A1S(i));
        boolean z2 = false;
        if (i < this.A00) {
            z2 = true;
        }
        C1ju.A00(z2);
        C1ju.A00(1BL.A1S(i2));
        if (i2 >= this.A03) {
            z = false;
        }
        C1ju.A00(z);
        C1ju.A00(AnonymousClass001.A1Q((byte) (this.A08[i2] & 63), b));
    }

    private boolean A01(int i, int i2) {
        byte b = this.A08[i2];
        boolean z = false;
        if (((byte) (b & 63)) > 4) {
            z = true;
        }
        boolean z2 = false;
        if (z) {
            if (2yC.A00(this, i, i2) == null) {
                z2 = true;
            }
        } else if ((b & Byte.MIN_VALUE) == 0) {
            return this.A01.A06[(i * this.A0A) + this.A0B[i2]];
        }
        return z2;
    }

    public static JQLResultSet emptyResultSet() {
        return A0D;
    }

    public JQLResultSet A02(String str, int i) {
        Map map = this.A01.A00;
        if (map == null) {
            return null;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(i);
        return (JQLResultSet) map.get(1BL.A0u("::", str, A0k));
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public byte[] getBlob(int i, int i2) {
        A00(i, i2, (byte) 6);
        return (byte[]) 2yC.A00(this, i, i2);
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public boolean getBoolean(int i, int i2) {
        A00(i, i2, (byte) 4);
        return this.A01.A05[(i * this.A02) + this.A09[i2]];
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public CQLResultSet getChildResultSet(int i, int i2) {
        A00(i, i2, (byte) 7);
        return (CQLResultSet) 2yC.A00(this, i, i2);
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public int getCount() {
        return this.A00;
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public double getDouble(int i, int i2) {
        A00(i, i2, (byte) 3);
        return this.A01.A01[(i * this.A04) + this.A09[i2]];
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public int getInteger(int i, int i2) {
        A00(i, i2, (byte) 1);
        return this.A01.A02[(i * this.A05) + this.A09[i2]];
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public long getLong(int i, int i2) {
        A00(i, i2, (byte) 2);
        return this.A01.A03[(i * this.A06) + this.A09[i2]];
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public Boolean getNullableBoolean(int i, int i2) {
        A00(i, i2, (byte) 4);
        if (A01(i, i2)) {
            return null;
        }
        return Boolean.valueOf(this.A01.A05[(i * this.A02) + this.A09[i2]]);
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public Double getNullableDouble(int i, int i2) {
        A00(i, i2, (byte) 3);
        if (A01(i, i2)) {
            return null;
        }
        return Double.valueOf(this.A01.A01[(i * this.A04) + this.A09[i2]]);
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public Integer getNullableInteger(int i, int i2) {
        A00(i, i2, (byte) 1);
        if (A01(i, i2)) {
            return null;
        }
        return Integer.valueOf(this.A01.A02[(i * this.A05) + this.A09[i2]]);
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public Long getNullableLong(int i, int i2) {
        A00(i, i2, (byte) 2);
        if (A01(i, i2)) {
            return null;
        }
        return Long.valueOf(this.A01.A03[(i * this.A06) + this.A09[i2]]);
    }

    @Override // com.facebook.msys.mci.CQLResultSet
    public String getString(int i, int i2) {
        A00(i, i2, (byte) 5);
        return (String) 2yC.A00(this, i, i2);
    }
}
