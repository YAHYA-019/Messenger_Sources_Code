package com.facebook.messaging.montage.model.art;

import X.4YV;
import X.AbM;
import X.C53v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.google.common.base.Objects;

/* loaded from: EffectAsset.class */
public final class EffectAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(6);
    public final VersionedCapability A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final ARRequestAsset.CompressionMethod A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public EffectAsset(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        Enum A07 = C53v.A07(parcel, VersionedCapability.class);
        A07.getClass();
        this.A00 = (VersionedCapability) A07;
        this.A07 = parcel.readString();
        this.A04 = parcel.readLong();
        this.A05 = parcel.readLong();
        this.A09 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A06 = (ARRequestAsset.CompressionMethod) C53v.A07(parcel, ARRequestAsset.CompressionMethod.class);
        this.A08 = parcel.readString();
    }

    public EffectAsset(ARRequestAsset.CompressionMethod compressionMethod, VersionedCapability versionedCapability, String str, String str2, String str3, String str4, String str5, long j, long j2) {
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = versionedCapability;
        this.A07 = str4;
        this.A04 = j;
        this.A05 = j2;
        this.A09 = str;
        this.A03 = 0;
        this.A06 = compressionMethod;
        this.A08 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof EffectAsset)) {
            if (obj == this) {
                return true;
            }
            EffectAsset effectAsset = (EffectAsset) obj;
            if (Objects.equal(this.A02, effectAsset.A02)) {
                z = 4YV.A1Z(this.A01, effectAsset.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A02, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        C53v.A0J(parcel, this.A00);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A03);
        C53v.A0J(parcel, this.A06);
        parcel.writeString(this.A08);
    }
}
