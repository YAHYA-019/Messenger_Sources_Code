package com.facebook.messaging.business.notificationmessages.model;

import X.11T;
import X.BSN;
import X.BSO;
import X.CSW;
import android.os.Parcel;
import com.facebook.messaging.blocking.ManageBlockingParam;

/* loaded from: NotificationMessageManageParam.class */
public final class NotificationMessageManageParam extends ManageBlockingParam {
    public static final CSW CREATOR = CSW.A00(41);
    public Integer A00;
    public String A01;

    public NotificationMessageManageParam(String str, int i) {
        this.A01 = str;
        this.A00 = BSN.A00(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(BSO.A00(this.A00));
    }
}
