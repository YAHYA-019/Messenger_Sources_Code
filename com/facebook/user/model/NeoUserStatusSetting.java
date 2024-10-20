package com.facebook.user.model;

import X.0J6;
import X.1BL;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: NeoUserStatusSetting.class */
public class NeoUserStatusSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(96);
    public final int expirationTime;
    public final NeoUserStatusTag neoUserStatusTag;
    public final int updateTime;

    public NeoUserStatusSetting() {
        this.neoUserStatusTag = new NeoUserStatusTag(null, null);
        this.expirationTime = 0;
        this.updateTime = 0;
    }

    public NeoUserStatusSetting(Parcel parcel) {
        this.neoUserStatusTag = (NeoUserStatusTag) 1BL.A0C(parcel, NeoUserStatusTag.class);
        this.expirationTime = parcel.readInt();
        this.updateTime = parcel.readInt();
    }

    public NeoUserStatusSetting(NeoUserStatusTag neoUserStatusTag, int i, int i2) {
        this.neoUserStatusTag = neoUserStatusTag;
        this.expirationTime = i;
        this.updateTime = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof NeoUserStatusSetting)) {
                return false;
            }
            NeoUserStatusSetting neoUserStatusSetting = (NeoUserStatusSetting) obj;
            if (Objects.equal(this.neoUserStatusTag, neoUserStatusSetting.neoUserStatusTag) && Objects.equal(Integer.valueOf(this.expirationTime), Integer.valueOf(neoUserStatusSetting.expirationTime)) && Objects.equal(Integer.valueOf(this.updateTime), Integer.valueOf(neoUserStatusSetting.updateTime))) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 0J6.A01(this.neoUserStatusTag, Integer.valueOf(this.expirationTime), Integer.valueOf(this.updateTime));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.neoUserStatusTag, i);
        parcel.writeInt(this.expirationTime);
        parcel.writeInt(this.updateTime);
    }
}
