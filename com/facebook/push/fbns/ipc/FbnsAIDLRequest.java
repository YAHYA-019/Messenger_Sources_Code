package com.facebook.push.fbns.ipc;

import X.C0px;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbnsAIDLRequest.class */
public final class FbnsAIDLRequest extends FbnsAIDLResult {
    public static final Parcelable.Creator CREATOR = new C0px(1);
    public int A00;

    @Override // com.facebook.push.fbns.ipc.FbnsAIDLResult
    public void A00(Parcel parcel, int i) {
        super.A00(parcel, i);
        parcel.writeInt(this.A00);
    }
}
