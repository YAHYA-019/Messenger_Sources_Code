package com.facebook.messaging.business.attachments.generic.model;

import X.1BL;
import X.4YV;
import X.C53v;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLMessengerPlatformWebviewPerformanceOption;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: PlatformGenericAttachmentItem.class */
public final class PlatformGenericAttachmentItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(9);
    public final float A00;
    public final int A01;
    public final Uri A02;
    public final Uri A03;
    public final GraphQLMessengerPlatformWebviewPerformanceOption A04;
    public final CallToAction A05;
    public final ImmutableList A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public PlatformGenericAttachmentItem(Uri uri, Uri uri2, GraphQLMessengerPlatformWebviewPerformanceOption graphQLMessengerPlatformWebviewPerformanceOption, CallToAction callToAction, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, float f, int i) {
        str4.getClass();
        this.A0A = str4;
        str9.getClass();
        this.A0F = str9;
        this.A07 = str;
        this.A03 = uri2;
        this.A02 = uri;
        this.A09 = str3;
        this.A01 = i;
        this.A0B = str5;
        this.A0C = str6;
        this.A0D = str7;
        this.A0E = str8;
        this.A00 = f;
        this.A05 = callToAction;
        this.A06 = ImmutableList.copyOf((Collection) (list == null ? Collections.EMPTY_LIST : list));
        this.A08 = str2;
        this.A04 = graphQLMessengerPlatformWebviewPerformanceOption;
    }

    public PlatformGenericAttachmentItem(Parcel parcel) {
        this.A0A = parcel.readString();
        this.A0F = parcel.readString();
        this.A07 = parcel.readString();
        this.A03 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A09 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A0E = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A05 = (CallToAction) 1BL.A0C(parcel, CallToAction.class);
        Collection A0y = 4YV.A0y(parcel, CallToAction.class);
        this.A06 = ImmutableList.copyOf(A0y == null ? Collections.EMPTY_LIST : A0y);
        this.A02 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A08 = parcel.readString();
        this.A04 = (GraphQLMessengerPlatformWebviewPerformanceOption) C53v.A07(parcel, GraphQLMessengerPlatformWebviewPerformanceOption.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A05, i);
        parcel.writeList(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A08);
        C53v.A0J(parcel, this.A04);
    }
}
