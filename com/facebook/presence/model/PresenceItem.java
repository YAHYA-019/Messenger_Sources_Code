package com.facebook.presence.model;

import X.1BL;
import X.4YV;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.user.model.UserKey;
import com.google.common.base.MoreObjects;

/* loaded from: PresenceItem.class */
public final class PresenceItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(99);
    public final int A00;
    public final long A01;
    public final UserKey A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final boolean A07;

    public PresenceItem(Parcel parcel) {
        this.A02 = (UserKey) 1BL.A0C(parcel, UserKey.class);
        this.A07 = C53v.A0S(parcel);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A03 = (Long) 4YV.A0l(parcel, Long.class);
        this.A04 = (Long) 4YV.A0l(parcel, Long.class);
        this.A05 = (Long) 4YV.A0l(parcel, Long.class);
        this.A06 = parcel.readString();
    }

    public PresenceItem(UserKey userKey, Long l, Long l2, String str, int i, long j, boolean z) {
        this.A02 = userKey;
        this.A07 = z;
        this.A01 = j;
        this.A00 = i;
        this.A03 = l;
        this.A04 = l2;
        this.A05 = null;
        this.A06 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_USER, this.A02);
        stringHelper.add("active", this.A07);
        stringHelper.add("last active", this.A01);
        stringHelper.add("active client bits", this.A00);
        stringHelper.add("all capability bits", this.A03);
        stringHelper.add("aloha proxy user Id", this.A04);
        stringHelper.add("correlation id", this.A05);
        return 4YV.A0s(stringHelper, this.A06, "publish id");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A04);
        parcel.writeValue(this.A05);
        parcel.writeString(this.A06);
    }
}
