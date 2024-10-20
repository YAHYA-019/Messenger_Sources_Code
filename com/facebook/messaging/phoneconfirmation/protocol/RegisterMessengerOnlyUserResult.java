package com.facebook.messaging.phoneconfirmation.protocol;

import X.1BL;
import X.4YV;
import X.7zS;
import X.AnonymousClass001;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.http.protocol.ApiErrorResult;
import java.util.List;

/* loaded from: RegisterMessengerOnlyUserResult.class */
public final class RegisterMessengerOnlyUserResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(5);
    public boolean A00;
    public final AuthenticationResult A01;
    public final RegisterMessengerOnlyUserParams A02;
    public final List A03;
    public final List A04;

    public RegisterMessengerOnlyUserResult(Parcel parcel) {
        this.A02 = (RegisterMessengerOnlyUserParams) 1BL.A0C(parcel, RegisterMessengerOnlyUserParams.class);
        this.A01 = (AuthenticationResult) 1BL.A0C(parcel, AuthenticationResult.class);
        this.A03 = 4YV.A0y(parcel, RecoveredAccount.class);
        this.A04 = 4YV.A0y(parcel, ApiErrorResult.class);
        this.A00 = 7zS.A1Z(parcel);
    }

    public RegisterMessengerOnlyUserResult(AuthenticationResult authenticationResult, RegisterMessengerOnlyUserParams registerMessengerOnlyUserParams, List list, boolean z) {
        this.A02 = registerMessengerOnlyUserParams;
        this.A01 = authenticationResult;
        this.A03 = list;
        this.A04 = AnonymousClass001.A0s();
        this.A00 = z;
    }

    public RegisterMessengerOnlyUserResult(RegisterMessengerOnlyUserParams registerMessengerOnlyUserParams, List list) {
        this.A02 = registerMessengerOnlyUserParams;
        this.A01 = null;
        this.A03 = AnonymousClass001.A0s();
        this.A04 = list;
        this.A00 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeList(this.A03);
        parcel.writeList(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
