package com.facebook.messaging.rtc.analytics.model;

import X.0J6;
import X.11T;
import X.AnonymousClass001;
import X.BL0;
import X.C1ps;
import X.C53v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.MoreObjects;

/* loaded from: RtcListItemTrackableItem.class */
public final class RtcListItemTrackableItem implements Parcelable, C1ps {
    public static final Parcelable.Creator CREATOR = CSS.A00(49);
    public int A00;
    public int A01;
    public String A02;
    public final BL0 A03;
    public final String A04;
    public final String A05;

    public RtcListItemTrackableItem(BL0 bl0, String str, String str2, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = bl0;
        this.A02 = null;
        this.A04 = str2;
        this.A05 = str;
    }

    public RtcListItemTrackableItem(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        BL0 A07 = C53v.A07(parcel, BL0.class);
        if (A07 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = A07;
        this.A02 = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A05 = readString2;
    }

    @Override // X.C1ps
    public long AsR() {
        return 0J6.A01(Integer.valueOf(this.A05.hashCode()), Integer.valueOf(this.A00), this.A04);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper((Class) getClass());
        stringHelper.omitNullValues = true;
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A05);
        stringHelper.add("section", this.A04);
        stringHelper.add("posInSection", this.A00);
        stringHelper.add("actionType", this.A03.toString());
        stringHelper.add("requestId", this.A02);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        C53v.A0J(parcel, this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }
}
