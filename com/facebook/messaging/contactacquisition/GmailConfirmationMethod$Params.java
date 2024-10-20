package com.facebook.messaging.contactacquisition;

import X.1BL;
import X.7zL;
import X.AnonymousClass001;
import X.CJm;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.growth.model.Contactpoint;

/* loaded from: GmailConfirmationMethod$Params.class */
public final class GmailConfirmationMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(22);
    public final Contactpoint A00;
    public final Integer A01;
    public final String A02;

    public GmailConfirmationMethod$Params(Parcel parcel) {
        this.A00 = (Contactpoint) 1BL.A0C(parcel, Contactpoint.class);
        this.A02 = parcel.readString();
        this.A01 = CJm.A00(parcel.readString());
        String readString = parcel.readString();
        if (!readString.equals("GOOGLE")) {
            throw AnonymousClass001.A0L(readString);
        }
    }

    public GmailConfirmationMethod$Params(Contactpoint contactpoint, Integer num, String str) {
        this.A00 = contactpoint;
        this.A02 = str;
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(CJm.A02(this.A01));
        parcel.writeString("GOOGLE");
    }
}
