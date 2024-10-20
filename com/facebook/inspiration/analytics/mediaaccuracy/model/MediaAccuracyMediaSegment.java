package com.facebook.inspiration.analytics.mediaaccuracy.model;

import X.11T;
import X.1BL;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MediaAccuracyMediaSegment.class */
public final class MediaAccuracyMediaSegment implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(16);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public MediaAccuracyMediaSegment(Parcel parcel) {
        this.A04 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A06 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A07 = AbJ.A1W(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A05 = C3o5.A0O(parcel);
    }

    public MediaAccuracyMediaSegment(String str, String str2, float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A04 = str;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = i;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = i3;
        this.A05 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaAccuracyMediaSegment)) {
                return false;
            }
            MediaAccuracyMediaSegment mediaAccuracyMediaSegment = (MediaAccuracyMediaSegment) obj;
            if (!11T.A0O(this.A04, mediaAccuracyMediaSegment.A04) || this.A06 != mediaAccuracyMediaSegment.A06 || this.A07 != mediaAccuracyMediaSegment.A07 || this.A01 != mediaAccuracyMediaSegment.A01 || this.A00 != mediaAccuracyMediaSegment.A00 || this.A02 != mediaAccuracyMediaSegment.A02 || this.A03 != mediaAccuracyMediaSegment.A03 || !11T.A0O(this.A05, mediaAccuracyMediaSegment.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, (((AbM.A00((C1pq.A02(C1pq.A02(C1pq.A03(this.A04), this.A06), this.A07) * 31) + this.A01, this.A00) * 31) + this.A02) * 31) + this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        1BL.A13(parcel, this.A05);
    }
}
