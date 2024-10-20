package com.facebook.account.recovery.common.protocol;

import X.1BK;
import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: AccountRecoveryShortUrlHandlerMethodResult.class */
public class AccountRecoveryShortUrlHandlerMethodResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(72);
    public final ImmutableList mUrlHandlerResultList;

    /* loaded from: AccountRecoveryShortUrlHandlerMethodResult$UrlHandlerResult.class */
    public class UrlHandlerResult implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LGo(73);
        public String mLongUrl = new String();
        public Boolean mIsCodeValid = 1BK.A0d();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mLongUrl);
            parcel.writeInt(this.mIsCodeValid.booleanValue() ? 1 : 0);
        }
    }

    public AccountRecoveryShortUrlHandlerMethodResult() {
        this.mUrlHandlerResultList = null;
    }

    public AccountRecoveryShortUrlHandlerMethodResult(Parcel parcel) {
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, UrlHandlerResult.CREATOR);
        this.mUrlHandlerResultList = ImmutableList.copyOf((Collection) A0s);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mUrlHandlerResultList);
    }
}
