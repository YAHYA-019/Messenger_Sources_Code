package com.facebook.messaging.highlightstab.model;

import X.0Q8;
import X.11T;
import X.4YV;
import X.5Yu;
import X.5cR;
import X.7mU;
import X.7zL;
import X.7zT;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsGenAiContent.class */
public final class HighlightsGenAiContent extends C04v implements Parcelable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = 7zL.A0v(76);

    /* loaded from: HighlightsGenAiContent$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return 5cR.A00;
        }
    }

    public HighlightsGenAiContent(String str, int i, String str2, int i2, String str3) {
        7zT.A1T(str, str2, str3);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A04 = str3;
        this.A01 = i2;
    }

    public /* synthetic */ HighlightsGenAiContent(String str, String str2, String str3, int i, int i2, int i3) {
        if (31 != (i & 31)) {
            7mU.A00(5cR.A01, i, 31);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i2;
        this.A04 = str3;
        this.A01 = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsGenAiContent)) {
                return false;
            }
            HighlightsGenAiContent highlightsGenAiContent = (HighlightsGenAiContent) obj;
            if (!11T.A0O(this.A03, highlightsGenAiContent.A03) || !11T.A0O(this.A02, highlightsGenAiContent.A02) || this.A00 != highlightsGenAiContent.A00 || !11T.A0O(this.A04, highlightsGenAiContent.A04) || this.A01 != highlightsGenAiContent.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A04, (AnonymousClass002.A07(this.A02, 4YV.A02(this.A03)) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
    }
}
