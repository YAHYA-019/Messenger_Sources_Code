package com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel;

import X.11T;
import X.7zQ;
import X.7zT;
import X.AnonymousClass002;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ChatTemplate.class */
public final class ChatTemplate extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(62);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public ChatTemplate(String str, String str2, String str3, long j, boolean z, boolean z2) {
        7zT.A1U(str, str2, str3);
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A04 = z;
        this.A05 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatTemplate)) {
                return false;
            }
            ChatTemplate chatTemplate = (ChatTemplate) obj;
            if (this.A00 != chatTemplate.A00 || !11T.A0O(this.A02, chatTemplate.A02) || !11T.A0O(this.A01, chatTemplate.A01) || !11T.A0O(this.A03, chatTemplate.A03) || this.A04 != chatTemplate.A04 || this.A05 != chatTemplate.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A02, 7zQ.A02(this.A00)))) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
