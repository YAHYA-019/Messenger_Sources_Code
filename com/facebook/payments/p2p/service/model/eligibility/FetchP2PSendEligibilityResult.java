package com.facebook.payments.p2p.service.model.eligibility;

import X.C53v;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchP2PSendEligibilityResult.class */
public class FetchP2PSendEligibilityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(12);
    public final boolean mCanSend;

    public FetchP2PSendEligibilityResult() {
        this.mCanSend = false;
    }

    public FetchP2PSendEligibilityResult(Parcel parcel) {
        this.mCanSend = C53v.A0S(parcel);
    }

    public FetchP2PSendEligibilityResult(Boolean bool) {
        this.mCanSend = bool.booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCanSend ? 1 : 0);
    }
}
