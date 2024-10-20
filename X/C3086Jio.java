package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: X.Jio, reason: case insensitive filesystem */
/* loaded from: Jio.class */
public final class C3086Jio extends L5P {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    public C3086Jio(Parcel parcel) {
        this(parcel, new 0QO(0), new 0QO(0), new 0QO(0), "", parcel.dataPosition(), parcel.dataSize());
    }

    public C3086Jio(Parcel parcel, 0QO r303, 0QO r304, 0QO r305, String str, int i, int i2) {
        super(r303, r304, r305);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i;
        this.A07 = str;
    }
}
