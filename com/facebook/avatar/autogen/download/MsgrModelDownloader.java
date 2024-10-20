package com.facebook.avatar.autogen.download;

import X.11T;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.DKf;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.Executor;

/* loaded from: MsgrModelDownloader.class */
public final class MsgrModelDownloader implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(45);
    public final 1Br A00;
    public final Executor A01;
    public final Context A02;

    public MsgrModelDownloader(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A00 = 1Bu.A01(context, 16428);
        this.A01 = (Executor) 1Bi.A03(16467);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeValue(this.A02);
    }
}
