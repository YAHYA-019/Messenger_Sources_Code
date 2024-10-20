package com.facebook.messaging.communitymessaging.model;

import X.11T;
import X.1BL;
import X.7zT;
import X.AnonymousClass002;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GenAIChatSuggestion.class */
public final class GenAIChatSuggestion extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(88);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final int A07;
    public final int A08;

    public GenAIChatSuggestion(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, long j2) {
        7zT.A11(3, str2, str3, str4, str5);
        this.A01 = j;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A03 = str5;
        this.A00 = j2;
        this.A07 = i;
        this.A08 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GenAIChatSuggestion)) {
                return false;
            }
            GenAIChatSuggestion genAIChatSuggestion = (GenAIChatSuggestion) obj;
            if (this.A01 != genAIChatSuggestion.A01 || !11T.A0O(this.A05, genAIChatSuggestion.A05) || !11T.A0O(this.A06, genAIChatSuggestion.A06) || !11T.A0O(this.A02, genAIChatSuggestion.A02) || !11T.A0O(this.A04, genAIChatSuggestion.A04) || !11T.A0O(this.A03, genAIChatSuggestion.A03) || this.A00 != genAIChatSuggestion.A00 || this.A07 != genAIChatSuggestion.A07 || this.A08 != genAIChatSuggestion.A08) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A01;
        return ((AnonymousClass002.A02(this.A00, AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A02, AnonymousClass002.A07(this.A06, ((((int) (j ^ (j >>> 32))) * 31) + 1BL.A05(this.A05)) * 31))))) + this.A07) * 31) + this.A08;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
    }
}
