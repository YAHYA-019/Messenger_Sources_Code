package com.facebook.messaging.communitymessaging.pausechat.fragment;

import X.11T;
import X.7zL;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* loaded from: PauseDurationController.class */
public final class PauseDurationController implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(5);
    public Function1 A00 = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable((Serializable) this.A00);
    }
}
