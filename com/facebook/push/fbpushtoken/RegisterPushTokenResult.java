package com.facebook.push.fbpushtoken;

import X.AbM;
import X.AnonymousClass001;
import X.EnumC08284mf;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.BaseResult;

/* loaded from: RegisterPushTokenResult.class */
public final class RegisterPushTokenResult extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(69);
    public boolean A00;
    public boolean A01;
    public final int A02;

    public RegisterPushTokenResult(int i, long j, boolean z, boolean z2) {
        super(EnumC08284mf.A06, j);
        this.A00 = z;
        this.A01 = z2;
        this.A02 = i;
    }

    public RegisterPushTokenResult(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass001.A1N(parcel.readInt());
        this.A01 = AbM.A1V(parcel);
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02);
    }
}
