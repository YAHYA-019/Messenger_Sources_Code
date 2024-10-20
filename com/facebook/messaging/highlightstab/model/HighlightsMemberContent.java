package com.facebook.messaging.highlightstab.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.5Yu;
import X.5cQ;
import X.7mU;
import X.7zL;
import X.7zR;
import X.7zV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightsMemberContent.class */
public final class HighlightsMemberContent extends C04v implements Parcelable {
    public final long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = 7zL.A0v(78);

    /* loaded from: HighlightsMemberContent$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return 5cQ.A00;
        }
    }

    public /* synthetic */ HighlightsMemberContent(Long l, String str, String str2, String str3, int i, long j) {
        if (31 != (i & 31)) {
            7mU.A00(5cQ.A01, i, 31);
            throw 0Q8.createAndThrow();
        }
        this.A02 = str;
        this.A00 = j;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = l;
    }

    public HighlightsMemberContent(Long l, String str, String str2, String str3, long j) {
        7zR.A1N(str, str2);
        this.A02 = str;
        this.A00 = j;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsMemberContent)) {
                return false;
            }
            HighlightsMemberContent highlightsMemberContent = (HighlightsMemberContent) obj;
            if (!11T.A0O(this.A02, highlightsMemberContent.A02) || this.A00 != highlightsMemberContent.A00 || !11T.A0O(this.A04, highlightsMemberContent.A04) || !11T.A0O(this.A03, highlightsMemberContent.A03) || !11T.A0O(this.A01, highlightsMemberContent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A04, AnonymousClass002.A02(this.A00, 4YV.A02(this.A02))) + 1BL.A05(this.A03)) * 31) + 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("HighlightsMemberContent(contentId=");
        A0k.append(this.A02);
        A0k.append(", userId=");
        A0k.append(this.A00);
        A0k.append(", profilePictureUrl=");
        A0k.append(this.A04);
        A0k.append(", profilePictureFallbackUrl=");
        A0k.append(this.A03);
        A0k.append(", profilePictureUrlExpirationTimestampMs=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        7zV.A0m(parcel, this.A01);
    }
}
