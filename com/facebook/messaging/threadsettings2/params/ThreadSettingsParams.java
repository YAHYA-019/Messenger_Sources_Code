package com.facebook.messaging.threadsettings2.params;

import X.11T;
import X.1BK;
import X.C04v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ThreadSettingsParams.class */
public final class ThreadSettingsParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(74);
    public final int A00;
    public final ThreadKey A01;
    public final ParcelableSecondaryData A02;
    public final String A03;
    public final boolean A04;

    public ThreadSettingsParams(ThreadKey threadKey, ParcelableSecondaryData parcelableSecondaryData, String str, int i, boolean z) {
        1BK.A1K(threadKey, 1, parcelableSecondaryData);
        this.A01 = threadKey;
        this.A00 = i;
        this.A04 = z;
        this.A02 = parcelableSecondaryData;
        this.A03 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
    }
}
