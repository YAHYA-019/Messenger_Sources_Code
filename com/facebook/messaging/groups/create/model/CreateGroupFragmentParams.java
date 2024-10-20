package com.facebook.messaging.groups.create.model;

import X.1BL;
import X.2TP;
import X.7zL;
import X.AbN;
import X.BKi;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: CreateGroupFragmentParams.class */
public final class CreateGroupFragmentParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(69);
    public final 2TP A00;
    public final 2TP A01;
    public final BKi A02;
    public final MediaResource A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final String A06;
    public final String A07;
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
    public final String A0L;
    public final boolean A0M;
    public final boolean A0N;

    public CreateGroupFragmentParams(2TP r302, BKi bKi, ImmutableList.Builder builder, ImmutableList.Builder builder2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A07 = str;
        this.A0D = str2;
        this.A0H = null;
        this.A0C = null;
        this.A0F = str8;
        this.A0A = str6;
        this.A09 = str5;
        this.A04 = builder.build();
        this.A05 = builder2.build();
        this.A02 = bKi;
        this.A06 = str3;
        this.A0G = str9;
        this.A0B = str7;
        this.A0J = str10;
        this.A0L = str12;
        this.A0K = str11;
        this.A08 = str4;
        this.A00 = r302;
        this.A01 = null;
        this.A0E = null;
        this.A0M = false;
        this.A0N = true;
        this.A0I = null;
        this.A03 = null;
    }

    public CreateGroupFragmentParams(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A0D = parcel.readString();
        this.A0H = parcel.readString();
        this.A0C = parcel.readString();
        this.A0F = parcel.readString();
        this.A0A = parcel.readString();
        this.A09 = parcel.readString();
        this.A06 = parcel.readString();
        this.A0G = parcel.readString();
        this.A0B = parcel.readString();
        this.A0J = parcel.readString();
        this.A0L = parcel.readString();
        this.A0K = parcel.readString();
        this.A08 = parcel.readString();
        this.A04 = AbN.A0e(parcel, User.class);
        this.A05 = AbN.A0e(parcel, String.class);
        this.A02 = C53v.A07(parcel, BKi.class);
        this.A00 = C53v.A07(parcel, 2TP.class);
        this.A01 = C53v.A07(parcel, 2TP.class);
        this.A0E = parcel.readString();
        this.A0M = C53v.A0S(parcel);
        this.A0N = C53v.A0S(parcel);
        this.A0I = parcel.readString();
        this.A03 = (MediaResource) 1BL.A0C(parcel, MediaResource.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A08);
        parcel.writeArray(this.A04.toArray());
        parcel.writeArray(this.A05.toArray());
        1BL.A12(parcel, this.A02);
        1BL.A12(parcel, this.A00);
        2TP r0 = this.A01;
        parcel.writeString(r0 != null ? r0.name() : null);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A0I);
        parcel.writeParcelable(this.A03, i);
    }
}
