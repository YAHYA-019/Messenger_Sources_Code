package com.facebook.pages.adminedpages.protocol;

import X.2JX;
import X.AbF;
import X.FJ8;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.BaseResult;
import com.google.common.base.Optional;

/* loaded from: AdminedPagesPrefetchMethod$Result.class */
public final class AdminedPagesPrefetchMethod$Result extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(18);
    public 2JX A00;

    public Optional A00() {
        return Optional.fromNullable(AbF.A0K(this.A00, 2JX.class, -767383091).A0L(-64262029, 2JX.class, 1044799488));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        FJ8.A0A(parcel, this.A00);
    }
}
