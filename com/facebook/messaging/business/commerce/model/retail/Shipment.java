package com.facebook.messaging.business.commerce.model.retail;

import X.0S2;
import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C0ty;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.attachments.generic.model.LogoImage;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachmentItem;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: Shipment.class */
public final class Shipment implements CommerceBubbleModel {
    public static final Parcelable.Creator CREATOR = new CSW(22);
    public final long A00;
    public final long A01;
    public final long A02;
    public final Uri A03;
    public final LogoImage A04;
    public final RetailAddress A05;
    public final RetailAddress A06;
    public final RetailCarrier A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final Integer A0H = 0S2.A0N;

    public Shipment(Uri uri, LogoImage logoImage, RetailAddress retailAddress, RetailAddress retailAddress2, RetailCarrier retailCarrier, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, long j, long j2, long j3) {
        if (str4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0D = str4;
        this.A0E = str5;
        if (str7 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0G = str7;
        if (retailCarrier == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A07 = retailCarrier;
        this.A03 = uri;
        this.A02 = j3;
        this.A0C = str3;
        this.A06 = retailAddress2;
        this.A05 = retailAddress;
        this.A01 = j2;
        this.A0B = str2;
        this.A00 = j;
        this.A0A = str;
        if (str6 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0F = str6;
        this.A04 = logoImage;
        this.A08 = 1BL.A0a(list == null ? C0ty.A00 : list);
        this.A09 = 1BL.A0a(list2 == null ? C0ty.A00 : list2);
    }

    public Shipment(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0D = readString;
        this.A0E = parcel.readString();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0G = readString2;
        Parcelable A0C = 1BL.A0C(parcel, RetailCarrier.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A07 = (RetailCarrier) A0C;
        this.A03 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A02 = parcel.readLong();
        this.A0C = parcel.readString();
        this.A06 = (RetailAddress) 1BL.A0C(parcel, RetailAddress.class);
        this.A05 = (RetailAddress) 1BL.A0C(parcel, RetailAddress.class);
        this.A01 = parcel.readLong();
        this.A0B = parcel.readString();
        this.A00 = parcel.readLong();
        this.A0A = parcel.readString();
        String readString3 = parcel.readString();
        if (readString3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A0F = readString3;
        this.A04 = (LogoImage) 1BL.A0C(parcel, LogoImage.class);
        RandomAccess readArrayList = parcel.readArrayList(PlatformGenericAttachmentItem.class.getClassLoader());
        this.A08 = 1BL.A0a((Collection) ((!(readArrayList instanceof List) || readArrayList == null) ? C0ty.A00 : readArrayList));
        RandomAccess readArrayList2 = parcel.readArrayList(ShipmentTrackingEvent.class.getClassLoader());
        this.A09 = 1BL.A0a((Collection) ((!(readArrayList2 instanceof List) || readArrayList2 == null) ? C0ty.A00 : readArrayList2));
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public ImmutableList AsZ() {
        return this.A08;
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public Integer BHe() {
        return this.A0H;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public String getId() {
        return this.A0D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0F);
        parcel.writeParcelable(this.A04, i);
        parcel.writeList(this.A08);
        parcel.writeList(this.A09);
    }
}
