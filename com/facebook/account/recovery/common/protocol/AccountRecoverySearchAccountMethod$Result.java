package com.facebook.account.recovery.common.protocol;

import X.AnonymousClass001;
import X.DKH;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.account.recovery.common.model.AccountCandidatesSummary;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: AccountRecoverySearchAccountMethod$Result.class */
public class AccountRecoverySearchAccountMethod$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(68);
    public List mAccountCandidates = AnonymousClass001.A0s();
    public AccountCandidatesSummary mSummary = new AccountCandidatesSummary();

    public ImmutableList A00() {
        return DKH.A0f(this.mAccountCandidates);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mAccountCandidates);
        parcel.writeParcelable(this.mSummary, i);
    }
}
