package com.facebook.account.recovery.common.model;

import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: AccountCandidateContactPointList.class */
public class AccountCandidateContactPointList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(59);
    public List candidateContactPoints = AnonymousClass001.A0s();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.candidateContactPoints);
    }
}
