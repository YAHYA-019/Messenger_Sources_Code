package com.facebook.messaging.business.attachments.generic.model;

import X.1BL;
import X.4YV;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: PlatformGenericAttachment.class */
public final class PlatformGenericAttachment implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(8);
    public final LogoImage A00;
    public final PlatformGenericAttachmentItem A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public PlatformGenericAttachment(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = (LogoImage) 1BL.A0C(parcel, LogoImage.class);
        Collection A0y = 4YV.A0y(parcel, CallToAction.class);
        this.A02 = ImmutableList.copyOf(A0y == null ? Collections.EMPTY_LIST : A0y);
        this.A01 = (PlatformGenericAttachmentItem) 1BL.A0C(parcel, PlatformGenericAttachmentItem.class);
        this.A03 = parcel.readString();
    }

    public PlatformGenericAttachment(LogoImage logoImage, PlatformGenericAttachmentItem platformGenericAttachmentItem, String str, String str2, String str3, List list) {
        str2.getClass();
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = logoImage;
        this.A02 = ImmutableList.copyOf((Collection) list);
        this.A01 = platformGenericAttachmentItem;
        this.A03 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
    }
}
