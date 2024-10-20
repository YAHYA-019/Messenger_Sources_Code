package com.facebook.messaging.profilepicture.notifications;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C53v;
import X.C5ap;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: FailedToSetProfilePictureNotification.class */
public final class FailedToSetProfilePictureNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CSS.A00(27);
    public boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public FailedToSetProfilePictureNotification(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = readString3;
        this.A00 = C53v.A0S(parcel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedToSetProfilePictureNotification(String str, String str2, String str3) {
        super(C5ap.A08, null);
        1BL.A1H(str, str2, str3);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
