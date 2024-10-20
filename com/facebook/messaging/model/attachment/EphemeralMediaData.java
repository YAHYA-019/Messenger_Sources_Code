package com.facebook.messaging.model.attachment;

import X.1BL;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: EphemeralMediaData.class */
public final class EphemeralMediaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(44);
    public final long A00;
    public final EphemeralMediaState A01;
    public final EphemeralMediaType A02;

    public EphemeralMediaData(Parcel parcel) {
        this.A01 = EphemeralMediaState.valueOf(parcel.readString());
        this.A02 = EphemeralMediaType.valueOf(parcel.readString());
        this.A00 = parcel.readLong();
    }

    public EphemeralMediaData(EphemeralMediaState ephemeralMediaState, EphemeralMediaType ephemeralMediaType, long j) {
        this.A01 = ephemeralMediaState;
        this.A02 = ephemeralMediaType;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EphemeralMediaData ephemeralMediaData = (EphemeralMediaData) obj;
            if (!Objects.equal(this.A01, ephemeralMediaData.A01) || !Objects.equal(this.A02, ephemeralMediaData.A02) || this.A00 != ephemeralMediaData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Long.valueOf(this.A00)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A12(parcel, this.A01);
        1BL.A12(parcel, this.A02);
        parcel.writeLong(this.A00);
    }
}
