package com.facebook.quicksilver.model;

import X.11T;
import X.1BK;
import X.DKH;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLInstantGameContextType;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;

/* loaded from: QuicksilverIntentExtras.class */
public final class QuicksilverIntentExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(84);
    public final int A00;
    public final GraphQLInstantGameContextType A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
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
    public final String A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;

    public QuicksilverIntentExtras(Parcel parcel) {
        this.A0F = parcel.readString();
        this.A0M = parcel.readString();
        this.A01 = (GraphQLInstantGameContextType) parcel.readSerializable();
        this.A08 = parcel.readString();
        this.A0K = parcel.readString();
        this.A02 = DKH.A0f(parcel.createStringArrayList());
        this.A0B = parcel.readString();
        this.A0G = parcel.readString();
        String readString = parcel.readString();
        boolean z = true;
        this.A0R = readString != null && (readString.equals(ConstantsKt.CAMERA_ID_BACK) || readString.equals("true"));
        this.A00 = parcel.readInt();
        String readString2 = parcel.readString();
        this.A0T = readString2 != null && (readString2.equals(ConstantsKt.CAMERA_ID_BACK) || readString2.equals("true"));
        this.A0P = DKH.A1X(parcel);
        this.A0Q = DKH.A1X(parcel);
        this.A0O = DKH.A1X(parcel);
        this.A0N = DKH.A1X(parcel);
        String readString3 = parcel.readString();
        if (readString3 == null || (!readString3.equals(ConstantsKt.CAMERA_ID_BACK) && !readString3.equals("true"))) {
            z = false;
        }
        this.A0S = z;
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0J = parcel.readString();
        this.A0E = parcel.readString();
        this.A0D = parcel.readString();
        this.A0A = parcel.readString();
        this.A07 = parcel.readString();
        this.A03 = parcel.readString();
        this.A0C = parcel.readString();
        String readString4 = parcel.readString();
        this.A0I = readString4 == null ? "STANDARD" : readString4;
        this.A0H = parcel.readString();
        this.A0L = parcel.readString();
    }

    public QuicksilverIntentExtras(GraphQLInstantGameContextType graphQLInstantGameContextType, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A0F = str13;
        this.A0M = str20;
        this.A01 = graphQLInstantGameContextType;
        this.A08 = str6;
        this.A0K = str18;
        this.A02 = immutableList;
        this.A0B = str9;
        this.A0G = str14;
        this.A0R = z5;
        this.A0T = z7;
        this.A00 = i;
        this.A0P = z3;
        this.A0Q = z4;
        this.A0O = z2;
        this.A0N = z;
        this.A0S = z6;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A09 = str7;
        this.A0J = str17;
        this.A0E = str12;
        this.A0D = str11;
        this.A0A = str8;
        this.A07 = str5;
        this.A03 = str;
        this.A0I = str16;
        this.A0C = str10;
        this.A0H = str15;
        this.A0L = str19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0M);
        parcel.writeSerializable(this.A01);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0K);
        ImmutableList immutableList = this.A02;
        parcel.writeStringList(immutableList == null ? null : 1BK.A17(immutableList));
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0G);
        parcel.writeString(String.valueOf(this.A0R));
        parcel.writeInt(this.A00);
        parcel.writeString(String.valueOf(this.A0T));
        parcel.writeString(String.valueOf(this.A0P));
        parcel.writeString(String.valueOf(this.A0Q));
        parcel.writeString(String.valueOf(this.A0O));
        parcel.writeString(String.valueOf(this.A0N));
        parcel.writeString(String.valueOf(this.A0S));
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0L);
    }
}
