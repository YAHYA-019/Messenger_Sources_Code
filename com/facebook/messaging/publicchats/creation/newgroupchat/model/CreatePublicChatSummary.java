package com.facebook.messaging.publicchats.creation.newgroupchat.model;

import X.11T;
import X.1BL;
import X.AbI;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CreatePublicChatSummary.class */
public final class CreatePublicChatSummary implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(31);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public CreatePublicChatSummary(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = AbN.A1U(parcel);
        this.A04 = C3o5.A0O(parcel);
    }

    public CreatePublicChatSummary(Integer num, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = num;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = z;
        this.A04 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreatePublicChatSummary)) {
                return false;
            }
            CreatePublicChatSummary createPublicChatSummary = (CreatePublicChatSummary) obj;
            if (!11T.A0O(this.A00, createPublicChatSummary.A00) || !11T.A0O(this.A01, createPublicChatSummary.A01) || !11T.A0O(this.A02, createPublicChatSummary.A02) || !11T.A0O(this.A03, createPublicChatSummary.A03) || this.A05 != createPublicChatSummary.A05 || !11T.A0O(this.A04, createPublicChatSummary.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))), this.A05));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CreatePublicChatSummary{errorCode=");
        A0k.append(this.A00);
        A0k.append(", errorDescription=");
        A0k.append(this.A01);
        A0k.append(", errorSummary=");
        A0k.append(this.A02);
        A0k.append(", inviteUri=");
        A0k.append(this.A03);
        A0k.append(", status=");
        A0k.append(this.A05);
        A0k.append(", threadId=");
        A0k.append(this.A04);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        1BL.A13(parcel, this.A04);
    }
}
