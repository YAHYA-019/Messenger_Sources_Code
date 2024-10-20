package com.facebook.messaging.threadview.environment.contextmenu.menuitem.forward;

import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.attachments.ImageAttachmentData;

/* loaded from: ForwardMenuItemExtraData.class */
public final class ForwardMenuItemExtraData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(76);
    public ImageAttachmentData A00;
    public String A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
