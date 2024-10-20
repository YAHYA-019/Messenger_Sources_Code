package com.facebook.messaging.business.commerce.model.retail;

import X.0S2;
import X.11T;
import X.1BK;
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

/* loaded from: Receipt.class */
public final class Receipt implements CommerceBubbleModel {
    public static final Parcelable.Creator CREATOR = new CSW(17);
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final Uri A03;
    public final LogoImage A04;
    public final RetailAddress A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final Integer A0M = 0S2.A01;

    public Receipt(Uri uri, Uri uri2, LogoImage logoImage, RetailAddress retailAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, int i, int i2, boolean z) {
        if (str6 == null) {
            throw 1BK.A0h();
        }
        this.A0D = str6;
        this.A0G = str9;
        this.A0J = str12;
        this.A0H = str10;
        this.A03 = uri2;
        this.A02 = uri;
        this.A05 = retailAddress;
        this.A0K = str13;
        this.A0B = str4;
        this.A0C = str5;
        this.A07 = 1BL.A0a(list2 == null ? C0ty.A00 : list2);
        this.A09 = str2;
        this.A0A = str3;
        this.A04 = logoImage;
        this.A0F = str8;
        this.A00 = i;
        this.A06 = 1BL.A0a(list == null ? C0ty.A00 : list);
        this.A0I = str11;
        this.A08 = str;
        this.A0L = z;
        this.A0E = str7;
        this.A01 = i2;
    }

    public Receipt(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw 1BK.A0h();
        }
        this.A0D = readString;
        this.A0G = parcel.readString();
        this.A0J = parcel.readString();
        this.A0H = parcel.readString();
        this.A03 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A02 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A05 = (RetailAddress) 1BL.A0C(parcel, RetailAddress.class);
        this.A0K = parcel.readString();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        RandomAccess readArrayList = parcel.readArrayList(RetailAdjustment.class.getClassLoader());
        this.A07 = 1BL.A0a((Collection) ((!(readArrayList instanceof List) || readArrayList == null) ? C0ty.A00 : readArrayList));
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A04 = (LogoImage) 1BL.A0C(parcel, LogoImage.class);
        this.A0F = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        RandomAccess readArrayList2 = parcel.readArrayList(PlatformGenericAttachmentItem.class.getClassLoader());
        this.A06 = 1BL.A0a((Collection) ((!(readArrayList2 instanceof List) || readArrayList2 == null) ? C0ty.A00 : readArrayList2));
        this.A0I = parcel.readString();
        this.A08 = parcel.readString();
        this.A0L = AnonymousClass001.A1N(parcel.readByte());
        this.A0E = parcel.readString();
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public ImmutableList AsZ() {
        return this.A06;
    }

    @Override // com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel
    public Integer BHe() {
        return this.A0M;
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
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0H);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeList(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A06);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A08);
        parcel.writeByte(this.A0L ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0E);
    }
}
