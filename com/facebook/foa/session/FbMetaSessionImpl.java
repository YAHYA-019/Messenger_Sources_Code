package com.facebook.foa.session;

import X.11T;
import X.1BJ;
import X.1BK;
import X.1G1;
import X.7zK;
import X.82M;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: FbMetaSessionImpl.class */
public final class FbMetaSessionImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(1);
    public final FbUserSession A00;

    public FbMetaSessionImpl(FbUserSession fbUserSession) {
        this.A00 = fbUserSession;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1G1 r0 = this.A00;
        Bundle A05 = 1BK.A05();
        1G1 r02 = r0;
        A05.putString("user_id", r02.A05);
        A05.putString(1BJ.A00(193), r02.A02);
        A05.putString(7zK.A00(248), r02.A04);
        parcel.writeBundle(A05);
    }
}
