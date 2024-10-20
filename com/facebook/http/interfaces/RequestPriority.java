package com.facebook.http.interfaces;

import X.1BL;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RequestPriority.class */
public enum RequestPriority implements Parcelable {
    INTERACTIVE(0),
    NON_INTERACTIVE(1),
    CAN_WAIT(2),
    UNNECESSARY(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED_REQUEST_PRIORITY(999);

    public final int requestPriority;
    public static final RequestPriority A00 = NON_INTERACTIVE;
    public static final Parcelable.Creator CREATOR = new C2xc(9);

    RequestPriority(int i) {
        this.requestPriority = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A12(parcel, this);
    }
}
