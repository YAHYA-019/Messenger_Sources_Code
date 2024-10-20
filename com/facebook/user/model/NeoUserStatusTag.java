package com.facebook.user.model;

import X.0J6;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: NeoUserStatusTag.class */
public class NeoUserStatusTag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(97);
    public final String emoji;
    public final String id;

    public NeoUserStatusTag() {
        this.id = "";
        this.emoji = "";
    }

    public NeoUserStatusTag(Parcel parcel) {
        this.id = parcel.readString();
        this.emoji = parcel.readString();
    }

    public NeoUserStatusTag(String str, String str2) {
        this.id = str;
        this.emoji = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof NeoUserStatusTag)) {
                return false;
            }
            NeoUserStatusTag neoUserStatusTag = (NeoUserStatusTag) obj;
            if (Objects.equal(this.id, neoUserStatusTag.id) && Objects.equal(this.emoji, neoUserStatusTag.emoji)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 0J6.A00(this.id, this.emoji);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.emoji);
    }
}
