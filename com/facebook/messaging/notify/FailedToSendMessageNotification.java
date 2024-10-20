package com.facebook.messaging.notify;

import X.AbG;
import X.BLU;
import X.C53v;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: FailedToSendMessageNotification.class */
public final class FailedToSendMessageNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(60);
    public boolean A00;
    public final ThreadKey A01;
    public final BLU A02;

    public FailedToSendMessageNotification(Parcel parcel) {
        super(parcel);
        this.A01 = AbG.A0j(parcel.readString());
        this.A00 = C53v.A0S(parcel);
        this.A02 = C53v.A07(parcel, BLU.class);
    }

    public FailedToSendMessageNotification(ThreadKey threadKey, BLU blu) {
        super(C5ap.A07, null);
        this.A01 = threadKey;
        this.A02 = blu;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ThreadKey threadKey = this.A01;
        parcel.writeString(threadKey == null ? "" : threadKey.toString());
        parcel.writeInt(this.A00 ? 1 : 0);
        C53v.A0J(parcel, this.A02);
    }
}
