package com.facebook.messaging.highlightstab.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.5Yu;
import X.5cS;
import X.7mU;
import X.7zL;
import X.7zM;
import X.7zV;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsEventContent.class */
public final class HighlightsEventContent extends C04v implements Parcelable {
    public final long A00;
    public final long A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = 7zL.A0v(75);

    /* loaded from: HighlightsEventContent$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return 5cS.A00;
        }
    }

    public /* synthetic */ HighlightsEventContent(Long l, String str, String str2, String str3, String str4, int i, long j, long j2) {
        if (127 != (i & 127)) {
            7mU.A00(5cS.A01, i, 127);
            throw 0Q8.createAndThrow();
        }
        this.A04 = str;
        this.A05 = str2;
        this.A00 = j;
        this.A01 = j2;
        this.A06 = str3;
        this.A02 = l;
        this.A03 = str4;
    }

    public HighlightsEventContent(Long l, String str, String str2, String str3, String str4, long j, long j2) {
        1BL.A1F(str, str2);
        11T.A0F(str4, 7);
        this.A04 = str;
        this.A05 = str2;
        this.A00 = j;
        this.A01 = j2;
        this.A06 = str3;
        this.A02 = l;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsEventContent)) {
                return false;
            }
            HighlightsEventContent highlightsEventContent = (HighlightsEventContent) obj;
            if (!11T.A0O(this.A04, highlightsEventContent.A04) || !11T.A0O(this.A05, highlightsEventContent.A05) || this.A00 != highlightsEventContent.A00 || this.A01 != highlightsEventContent.A01 || !11T.A0O(this.A06, highlightsEventContent.A06) || !11T.A0O(this.A02, highlightsEventContent.A02) || !11T.A0O(this.A03, highlightsEventContent.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A03, (((AnonymousClass002.A02(this.A01, AnonymousClass002.A02(this.A00, AnonymousClass002.A07(this.A05, 4YV.A02(this.A04)))) + 1BL.A05(this.A06)) * 31) + 4YU.A03(this.A02)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A06);
        7zV.A0m(parcel, this.A02);
        parcel.writeString(this.A03);
    }
}
