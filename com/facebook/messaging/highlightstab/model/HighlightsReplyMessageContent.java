package com.facebook.messaging.highlightstab.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.5Yu;
import X.5cN;
import X.7mU;
import X.7zL;
import X.7zN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsReplyMessageContent.class */
public final class HighlightsReplyMessageContent extends C04v implements Parcelable {
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
    public final Long A06;
    public final Long A07;
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
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final boolean A0Q;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = 7zL.A0v(80);

    /* loaded from: HighlightsReplyMessageContent$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return 5cN.A00;
        }
    }

    public /* synthetic */ HighlightsReplyMessageContent(Integer num, Integer num2, Integer num3, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, long j, long j2, boolean z) {
        int i2 = (-1) >>> 5;
        if (i2 != (i & i2)) {
            7mU.A00(5cN.A01, i, i2);
            throw 0Q8.createAndThrow();
        }
        this.A0M = str;
        this.A0P = str2;
        this.A01 = j;
        this.A0C = str3;
        this.A0L = str4;
        this.A00 = j2;
        this.A0N = str5;
        this.A0O = str6;
        this.A0Q = z;
        this.A0D = str7;
        this.A0E = str8;
        this.A0I = str9;
        this.A0F = str10;
        this.A04 = num;
        this.A03 = num2;
        this.A0J = str11;
        this.A07 = l;
        this.A0K = str12;
        this.A0G = str13;
        this.A0H = str14;
        this.A06 = l2;
        this.A08 = str15;
        this.A02 = num3;
        this.A05 = l3;
        this.A0B = str16;
        this.A0A = str17;
        this.A09 = str18;
    }

    public HighlightsReplyMessageContent(Integer num, Integer num2, Integer num3, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, long j, long j2, boolean z) {
        this.A0M = str;
        this.A0P = str2;
        this.A01 = j;
        this.A0C = str3;
        this.A0L = str4;
        this.A00 = j2;
        this.A0N = str5;
        this.A0O = str6;
        this.A0Q = z;
        this.A0D = str7;
        this.A0E = str8;
        this.A0I = str9;
        this.A0F = str10;
        this.A04 = num;
        this.A03 = num2;
        this.A0J = str11;
        this.A07 = l;
        this.A0K = str12;
        this.A0G = str13;
        this.A0H = str14;
        this.A06 = l2;
        this.A08 = str15;
        this.A02 = num3;
        this.A05 = l3;
        this.A0B = str16;
        this.A0A = str17;
        this.A09 = str18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsReplyMessageContent)) {
                return false;
            }
            HighlightsReplyMessageContent highlightsReplyMessageContent = (HighlightsReplyMessageContent) obj;
            if (!11T.A0O(this.A0M, highlightsReplyMessageContent.A0M) || !11T.A0O(this.A0P, highlightsReplyMessageContent.A0P) || this.A01 != highlightsReplyMessageContent.A01 || !11T.A0O(this.A0C, highlightsReplyMessageContent.A0C) || !11T.A0O(this.A0L, highlightsReplyMessageContent.A0L) || this.A00 != highlightsReplyMessageContent.A00 || !11T.A0O(this.A0N, highlightsReplyMessageContent.A0N) || !11T.A0O(this.A0O, highlightsReplyMessageContent.A0O) || this.A0Q != highlightsReplyMessageContent.A0Q || !11T.A0O(this.A0D, highlightsReplyMessageContent.A0D) || !11T.A0O(this.A0E, highlightsReplyMessageContent.A0E) || !11T.A0O(this.A0I, highlightsReplyMessageContent.A0I) || !11T.A0O(this.A0F, highlightsReplyMessageContent.A0F) || !11T.A0O(this.A04, highlightsReplyMessageContent.A04) || !11T.A0O(this.A03, highlightsReplyMessageContent.A03) || !11T.A0O(this.A0J, highlightsReplyMessageContent.A0J) || !11T.A0O(this.A07, highlightsReplyMessageContent.A07) || !11T.A0O(this.A0K, highlightsReplyMessageContent.A0K) || !11T.A0O(this.A0G, highlightsReplyMessageContent.A0G) || !11T.A0O(this.A0H, highlightsReplyMessageContent.A0H) || !11T.A0O(this.A06, highlightsReplyMessageContent.A06) || !11T.A0O(this.A08, highlightsReplyMessageContent.A08) || !11T.A0O(this.A02, highlightsReplyMessageContent.A02) || !11T.A0O(this.A05, highlightsReplyMessageContent.A05) || !11T.A0O(this.A0B, highlightsReplyMessageContent.A0B) || !11T.A0O(this.A0A, highlightsReplyMessageContent.A0A) || !11T.A0O(this.A09, highlightsReplyMessageContent.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((AnonymousClass002.A02(this.A00, (((AnonymousClass002.A02(this.A01, ((1BL.A05(this.A0M) * 31) + 1BL.A05(this.A0P)) * 31) + 1BL.A05(this.A0C)) * 31) + 1BL.A05(this.A0L)) * 31) + 1BL.A05(this.A0N)) * 31) + 1BL.A05(this.A0O)) * 31) + AnonymousClass002.A00(this.A0Q ? 1 : 0)) * 31) + 1BL.A05(this.A0D)) * 31) + 1BL.A05(this.A0E)) * 31) + 1BL.A05(this.A0I)) * 31) + 1BL.A05(this.A0F)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 1BL.A05(this.A0J)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + 1BL.A05(this.A0K)) * 31) + 1BL.A05(this.A0G)) * 31) + 1BL.A05(this.A0H)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + 1BL.A05(this.A08)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 1BL.A05(this.A0B)) * 31) + 1BL.A05(this.A0A)) * 31) + 7zN.A05(this.A09);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0P);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0L);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0O);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0F);
        C3o5.A0f(parcel, this.A04);
        C3o5.A0f(parcel, this.A03);
        parcel.writeString(this.A0J);
        C3o5.A0g(parcel, this.A07);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        C3o5.A0g(parcel, this.A06);
        parcel.writeString(this.A08);
        C3o5.A0f(parcel, this.A02);
        C3o5.A0g(parcel, this.A05);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
    }
}
