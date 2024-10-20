package com.facebook.messaging.highlightstab.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.5Yu;
import X.5cP;
import X.7mU;
import X.82M;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsAttachmentContent.class */
public final class HighlightsAttachmentContent extends C04v implements Parcelable {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
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
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new 82M(34);

    /* loaded from: HighlightsAttachmentContent$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return 5cP.A00;
        }
    }

    public HighlightsAttachmentContent(Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        11T.A0F(str, 1);
        11T.A0F(str2, 2);
        11T.A0F(str9, 12);
        this.A08 = str;
        this.A05 = str2;
        this.A09 = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A03 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A07 = str6;
        this.A0F = str7;
        this.A0E = str8;
        this.A0C = str9;
        this.A06 = str10;
        this.A0D = str11;
        this.A04 = l;
        this.A01 = num4;
    }

    public /* synthetic */ HighlightsAttachmentContent(Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        char c = (char) (-1);
        if (c != (i & c)) {
            7mU.A00(5cP.A01, i, c);
            throw 0Q8.createAndThrow();
        }
        this.A08 = str;
        this.A05 = str2;
        this.A09 = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A03 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A07 = str6;
        this.A0F = str7;
        this.A0E = str8;
        this.A0C = str9;
        this.A06 = str10;
        this.A0D = str11;
        this.A04 = l;
        this.A01 = num4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsAttachmentContent)) {
                return false;
            }
            HighlightsAttachmentContent highlightsAttachmentContent = (HighlightsAttachmentContent) obj;
            if (!11T.A0O(this.A08, highlightsAttachmentContent.A08) || !11T.A0O(this.A05, highlightsAttachmentContent.A05) || !11T.A0O(this.A09, highlightsAttachmentContent.A09) || !11T.A0O(this.A0B, highlightsAttachmentContent.A0B) || !11T.A0O(this.A0A, highlightsAttachmentContent.A0A) || !11T.A0O(this.A03, highlightsAttachmentContent.A03) || !11T.A0O(this.A00, highlightsAttachmentContent.A00) || !11T.A0O(this.A02, highlightsAttachmentContent.A02) || !11T.A0O(this.A07, highlightsAttachmentContent.A07) || !11T.A0O(this.A0F, highlightsAttachmentContent.A0F) || !11T.A0O(this.A0E, highlightsAttachmentContent.A0E) || !11T.A0O(this.A0C, highlightsAttachmentContent.A0C) || !11T.A0O(this.A06, highlightsAttachmentContent.A06) || !11T.A0O(this.A0D, highlightsAttachmentContent.A0D) || !11T.A0O(this.A04, highlightsAttachmentContent.A04) || !11T.A0O(this.A01, highlightsAttachmentContent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass002.A07(this.A0C, (((((((((((((((((AnonymousClass002.A07(this.A05, 4YV.A02(this.A08)) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A0B)) * 31) + 1BL.A05(this.A0A)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A0F)) * 31) + 1BL.A05(this.A0E)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A0D)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 4YU.A03(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        C3o5.A0f(parcel, this.A03);
        C3o5.A0f(parcel, this.A00);
        C3o5.A0f(parcel, this.A02);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0D);
        C3o5.A0g(parcel, this.A04);
        C3o5.A0f(parcel, this.A01);
    }
}
