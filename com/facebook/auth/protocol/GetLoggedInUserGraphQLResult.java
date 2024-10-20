package com.facebook.auth.protocol;

import X.1BL;
import X.DKf;
import X.EnumC08284mf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.BaseResult;
import com.facebook.user.model.User;

/* loaded from: GetLoggedInUserGraphQLResult.class */
public final class GetLoggedInUserGraphQLResult extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(35);
    public final User A00;

    public GetLoggedInUserGraphQLResult(EnumC08284mf enumC08284mf, User user, long j) {
        super(enumC08284mf, j);
        this.A00 = user;
    }

    public GetLoggedInUserGraphQLResult(Parcel parcel) {
        super(parcel);
        this.A00 = (User) 1BL.A0C(parcel, User.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
