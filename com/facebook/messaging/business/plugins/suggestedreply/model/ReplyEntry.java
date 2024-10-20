package com.facebook.messaging.business.plugins.suggestedreply.model;

import X.11T;
import X.1BL;
import X.7zO;
import X.AnonymousClass001;
import X.BKs;
import X.C1pq;
import X.C3o5;
import X.CSW;
import X.JQw;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ReplyEntry.class */
public final class ReplyEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(42);
    public final int A00;
    public final BKs A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public ReplyEntry(BKs bKs, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        this.A03 = str;
        this.A04 = str2;
        this.A02 = l;
        this.A05 = str3;
        C1pq.A08("messageBody", str4);
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A01 = bKs;
        C1pq.A08("sourceLocationText", str7);
        this.A09 = str7;
        this.A00 = i;
        this.A0A = str8;
    }

    public ReplyEntry(Parcel parcel) {
        BKs bKs = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? BKs.values()[parcel.readInt()] : bKs;
        this.A09 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0A = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReplyEntry)) {
                return false;
            }
            ReplyEntry replyEntry = (ReplyEntry) obj;
            if (!11T.A0O(this.A03, replyEntry.A03) || !11T.A0O(this.A04, replyEntry.A04) || !11T.A0O(this.A02, replyEntry.A02) || !11T.A0O(this.A05, replyEntry.A05) || !11T.A0O(this.A06, replyEntry.A06) || !11T.A0O(this.A07, replyEntry.A07) || !11T.A0O(this.A08, replyEntry.A08) || this.A01 != replyEntry.A01 || !11T.A0O(this.A09, replyEntry.A09) || this.A00 != replyEntry.A00 || !11T.A0O(this.A0A, replyEntry.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A03(this.A03)))))));
        return C1pq.A04(this.A0A, (C1pq.A04(this.A09, (A04 * 31) + C3o5.A03(this.A01)) * 31) + this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ReplyEntry{attachmentFbId=");
        A0k.append(this.A03);
        A0k.append(", attachmentUrl=");
        A0k.append(this.A04);
        A0k.append(", catalogId=");
        A0k.append(this.A02);
        A0k.append(JQw.A00(5));
        A0k.append(this.A05);
        A0k.append(", messageBody=");
        A0k.append(this.A06);
        A0k.append(", previewImageUrl=");
        A0k.append(this.A07);
        A0k.append(JQw.A00(41));
        A0k.append(this.A08);
        A0k.append(", replyType=");
        A0k.append(this.A01);
        A0k.append(", sourceLocationText=");
        A0k.append(this.A09);
        A0k.append(", sourceLocationTextId=");
        A0k.append(this.A00);
        A0k.append(", title=");
        A0k.append(this.A0A);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        C3o5.A0g(parcel, this.A02);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        C3o5.A0e(parcel, this.A01);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A0A);
    }
}
