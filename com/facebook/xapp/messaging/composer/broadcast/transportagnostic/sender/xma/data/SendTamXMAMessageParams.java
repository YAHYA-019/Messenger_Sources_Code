package com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: SendTamXMAMessageParams.class */
public final class SendTamXMAMessageParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(47);
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
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
    public final List A0H;
    public final boolean A0I;

    public SendTamXMAMessageParams(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, int i2, boolean z) {
        11T.A0F(str, 3);
        this.A01 = i;
        this.A00 = i2;
        this.A0F = str;
        this.A0I = z;
        this.A0A = str2;
        this.A0H = list;
        this.A05 = l;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A02 = num;
        this.A0E = str6;
        this.A0D = str7;
        this.A0G = str8;
        this.A03 = num2;
        this.A04 = num3;
        this.A0C = str9;
        this.A0B = str10;
        this.A09 = str11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SendTamXMAMessageParams)) {
                return false;
            }
            SendTamXMAMessageParams sendTamXMAMessageParams = (SendTamXMAMessageParams) obj;
            if (this.A01 != sendTamXMAMessageParams.A01 || this.A00 != sendTamXMAMessageParams.A00 || !11T.A0O(this.A0F, sendTamXMAMessageParams.A0F) || this.A0I != sendTamXMAMessageParams.A0I || !11T.A0O(this.A0A, sendTamXMAMessageParams.A0A) || !11T.A0O(this.A0H, sendTamXMAMessageParams.A0H) || !11T.A0O(this.A05, sendTamXMAMessageParams.A05) || !11T.A0O(this.A06, sendTamXMAMessageParams.A06) || !11T.A0O(this.A07, sendTamXMAMessageParams.A07) || !11T.A0O(this.A08, sendTamXMAMessageParams.A08) || !11T.A0O(this.A02, sendTamXMAMessageParams.A02) || !11T.A0O(this.A0E, sendTamXMAMessageParams.A0E) || !11T.A0O(this.A0D, sendTamXMAMessageParams.A0D) || !11T.A0O(this.A0G, sendTamXMAMessageParams.A0G) || !11T.A0O(this.A03, sendTamXMAMessageParams.A03) || !11T.A0O(this.A04, sendTamXMAMessageParams.A04) || !11T.A0O(this.A0C, sendTamXMAMessageParams.A0C) || !11T.A0O(this.A0B, sendTamXMAMessageParams.A0B) || !11T.A0O(this.A09, sendTamXMAMessageParams.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A07 = (((((((((((((((((((((((((((((AnonymousClass002.A07(this.A0F, ((this.A01 * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A0I ? 1 : 0)) * 31) + 1BL.A05(this.A0A)) * 31) + AnonymousClass001.A02(this.A0H)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A08)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 1BL.A05(this.A0E)) * 31) + 1BL.A05(this.A0D)) * 31) + 1BL.A05(this.A0G)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 1BL.A05(this.A0C)) * 31) + 1BL.A05(this.A0B)) * 31;
        String str = this.A09;
        if (str != null) {
            i = str.hashCode();
        }
        return A07 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SendTamXMAMessageParams(xmaLayoutType=");
        A0k.append(this.A01);
        A0k.append(", xmaContentType=");
        A0k.append(this.A00);
        A0k.append(", xmaShareSurface=");
        A0k.append(this.A0F);
        A0k.append(", xmaIsPrivate=");
        A0k.append(this.A0I);
        A0k.append(", xmaDefaultCTA=");
        A0k.append(this.A0A);
        A0k.append(", xmaStyleList=");
        A0k.append(this.A0H);
        A0k.append(", xmaExpiryTimestamp=");
        A0k.append(this.A05);
        A0k.append(", xmaContentCreator=");
        A0k.append(this.A06);
        A0k.append(", xmaContentCreatorId=");
        A0k.append(this.A07);
        A0k.append(", xmaContentId=");
        A0k.append(this.A08);
        A0k.append(", xmaContentAttributionId=");
        A0k.append(this.A02);
        A0k.append(", xmaPreviewUri=");
        A0k.append(this.A0E);
        A0k.append(", xmaMainTitle=");
        A0k.append(this.A0D);
        A0k.append(", xmaSubTitle=");
        A0k.append(this.A0G);
        A0k.append(", xmaMaxMainTitleLines=");
        A0k.append(this.A03);
        A0k.append(", xmaMaxSubTitleLines=");
        A0k.append(this.A04);
        A0k.append(", xmaHeaderTitle=");
        A0k.append(this.A0C);
        A0k.append(", xmaHeaderAttributionUri=");
        A0k.append(this.A0B);
        A0k.append(", xmaContentUri=");
        A0k.append(this.A09);
        return AnonymousClass001.A0g(A0k, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeStringList(this.A0H);
        C3o5.A0g(parcel, this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        C3o5.A0f(parcel, this.A02);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0G);
        C3o5.A0f(parcel, this.A03);
        C3o5.A0f(parcel, this.A04);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
    }
}
