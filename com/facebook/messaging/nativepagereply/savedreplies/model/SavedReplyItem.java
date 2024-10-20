package com.facebook.messaging.nativepagereply.savedreplies.model;

import X.11T;
import X.1BL;
import X.7zO;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CST;
import X.JQw;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SavedReplyItem.class */
public final class SavedReplyItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(47);
    public final long A00;
    public final Long A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public SavedReplyItem(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
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
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        this.A0B = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = 7zO.A0j(parcel);
        }
        this.A00 = parcel.readLong();
        this.A0C = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = AbN.A0h(parcel);
    }

    public SavedReplyItem(Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j) {
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = l;
        this.A09 = str4;
        this.A02 = l2;
        this.A03 = l3;
        this.A0A = str5;
        C1pq.A08("message", str6);
        this.A0B = str6;
        this.A04 = l4;
        this.A00 = j;
        this.A0C = str7;
        this.A05 = l5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SavedReplyItem)) {
                return false;
            }
            SavedReplyItem savedReplyItem = (SavedReplyItem) obj;
            if (!11T.A0O(this.A06, savedReplyItem.A06) || !11T.A0O(this.A07, savedReplyItem.A07) || !11T.A0O(this.A08, savedReplyItem.A08) || !11T.A0O(this.A01, savedReplyItem.A01) || !11T.A0O(this.A09, savedReplyItem.A09) || !11T.A0O(this.A02, savedReplyItem.A02) || !11T.A0O(this.A03, savedReplyItem.A03) || !11T.A0O(this.A0A, savedReplyItem.A0A) || !11T.A0O(this.A0B, savedReplyItem.A0B) || !11T.A0O(this.A04, savedReplyItem.A04) || this.A00 != savedReplyItem.A00 || !11T.A0O(this.A0C, savedReplyItem.A0C) || !11T.A0O(this.A05, savedReplyItem.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A0C, C1pq.A01(C1pq.A04(this.A04, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A09, C1pq.A04(this.A01, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A03(this.A06)))))))))), this.A00)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SavedReplyItem{attachmentFbId=");
        A0k.append(this.A06);
        A0k.append(", attachmentUrl=");
        A0k.append(this.A07);
        A0k.append(", composerPreviewUrl=");
        A0k.append(this.A08);
        A0k.append(", creationTime=");
        A0k.append(this.A01);
        A0k.append(", fullScreenImageUrl=");
        A0k.append(this.A09);
        A0k.append(", lastTimeUsed=");
        A0k.append(this.A02);
        A0k.append(", lastUpdatedTime=");
        A0k.append(this.A03);
        A0k.append(", listPreviewImageUrl=");
        A0k.append(this.A0A);
        A0k.append(JQw.A00(40));
        A0k.append(this.A0B);
        A0k.append(", savedReplyFetchedTimeInSeconds=");
        A0k.append(this.A04);
        A0k.append(", savedReplyId=");
        A0k.append(this.A00);
        A0k.append(", title=");
        A0k.append(this.A0C);
        A0k.append(", usageCount=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        C3o5.A0g(parcel, this.A01);
        1BL.A13(parcel, this.A09);
        C3o5.A0g(parcel, this.A02);
        C3o5.A0g(parcel, this.A03);
        1BL.A13(parcel, this.A0A);
        parcel.writeString(this.A0B);
        C3o5.A0g(parcel, this.A04);
        parcel.writeLong(this.A00);
        1BL.A13(parcel, this.A0C);
        C3o5.A0g(parcel, this.A05);
    }
}
