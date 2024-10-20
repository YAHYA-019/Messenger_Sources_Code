package com.facebook.contacts.model;

import X.1BK;
import X.4YV;
import X.C53v;
import X.DKH;
import X.DKI;
import X.Er3;
import X.FKX;
import X.G6c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: PhonebookContact.class */
public final class PhonebookContact implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(27);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
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
    public final boolean A0M;

    public PhonebookContact(Er3 er3) {
        this.A0B = er3.A0B;
        this.A0C = er3.A00;
        this.A0E = er3.A02;
        this.A0D = er3.A01;
        this.A0J = er3.A07;
        this.A0F = er3.A03;
        this.A0K = er3.A08;
        this.A0H = er3.A05;
        this.A0I = er3.A06;
        this.A0G = er3.A04;
        this.A0M = er3.A0A;
        this.A0L = er3.A09;
        this.A07 = ImmutableList.copyOf((Collection) er3.A0J);
        this.A02 = ImmutableList.copyOf((Collection) er3.A0E);
        this.A04 = ImmutableList.copyOf((Collection) er3.A0G);
        this.A05 = ImmutableList.copyOf((Collection) er3.A0H);
        this.A00 = ImmutableList.copyOf((Collection) er3.A0C);
        this.A09 = ImmutableList.copyOf((Collection) er3.A0L);
        this.A08 = ImmutableList.copyOf((Collection) er3.A0K);
        this.A06 = ImmutableList.copyOf((Collection) er3.A0I);
        this.A03 = ImmutableList.copyOf((Collection) er3.A0F);
        this.A01 = ImmutableList.copyOf((Collection) er3.A0D);
        this.A0A = ImmutableList.copyOf((Collection) er3.A0M);
    }

    public PhonebookContact(Parcel parcel) {
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A0E = parcel.readString();
        this.A0D = parcel.readString();
        this.A0J = parcel.readString();
        this.A0F = parcel.readString();
        this.A0K = parcel.readString();
        this.A0H = parcel.readString();
        this.A0I = parcel.readString();
        this.A0G = parcel.readString();
        this.A0M = C53v.A0S(parcel);
        this.A0L = C53v.A0S(parcel);
        ArrayList A0y = 4YV.A0y(parcel, PhonebookPhoneNumber.class);
        this.A07 = DKH.A0f(A0y);
        this.A02 = DKI.A0H(parcel, PhonebookEmailAddress.class);
        this.A04 = DKI.A0H(parcel, PhonebookInstantMessaging.class);
        this.A05 = DKI.A0H(parcel, PhonebookNickname.class);
        this.A00 = DKI.A0H(parcel, PhonebookAddress.class);
        this.A09 = DKI.A0H(parcel, PhonebookWebsite.class);
        this.A08 = A0y == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) 4YV.A0y(parcel, PhonebookRelation.class));
        this.A06 = DKI.A0H(parcel, PhonebookOrganization.class);
        this.A03 = DKI.A0H(parcel, PhonebookEvent.class);
        this.A01 = DKI.A0H(parcel, PhonebookContactMetadata.class);
        this.A0A = DKI.A0H(parcel, PhonebookWhatsappProfile.class);
    }

    public static ImmutableList A00(List list) {
        ArrayList A17 = 1BK.A17(list);
        Collections.sort(A17, new G6c(4));
        return ImmutableList.copyOf((Collection) A17);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0B, this.A0C, this.A0E, this.A0D, this.A0J, this.A0F, this.A0K, this.A0H, this.A0I, this.A0G, Boolean.valueOf(this.A0M), Boolean.valueOf(this.A0L), A00(this.A07), A00(this.A02), A00(this.A04), A00(this.A05), A00(this.A00), A00(this.A09), A00(this.A08), A00(this.A06), A00(this.A03), A00(this.A01), A00(this.A0A)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeList(this.A07);
        parcel.writeList(this.A02);
        parcel.writeList(this.A04);
        parcel.writeList(this.A05);
        parcel.writeList(this.A00);
        parcel.writeList(this.A09);
        parcel.writeList(this.A08);
        parcel.writeList(this.A06);
        parcel.writeList(this.A03);
        parcel.writeList(this.A01);
        parcel.writeList(this.A0A);
    }
}
