package com.facebook.rapidreporting.util;

import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Range.class */
public final class Range implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(89);
    public final int A00;
    public final int A01;
    public final String A02;

    public Range(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public Range(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        r304 = new com.facebook.rapidreporting.util.Range(r308.A0m(), r305.getIntValue(-1019779949), r305.getIntValue(-1106363674));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        if (r308 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e8, code lost:
    
        if (r308 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r308 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.collect.ImmutableList A00(java.util.List r301) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rapidreporting.util.Range.A00(java.util.List):com.google.common.collect.ImmutableList");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
