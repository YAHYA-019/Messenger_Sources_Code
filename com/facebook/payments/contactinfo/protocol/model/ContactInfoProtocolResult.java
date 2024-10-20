package com.facebook.payments.contactinfo.protocol.model;

import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: ContactInfoProtocolResult.class */
public class ContactInfoProtocolResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(42);
    public final String mContactInfoId;

    public ContactInfoProtocolResult() {
        this.mContactInfoId = null;
    }

    public ContactInfoProtocolResult(Parcel parcel) {
        this.mContactInfoId = parcel.readString();
    }

    public ContactInfoProtocolResult(String str) {
        this.mContactInfoId = ConstantsKt.CAMERA_ID_FRONT;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mContactInfoId);
    }
}
