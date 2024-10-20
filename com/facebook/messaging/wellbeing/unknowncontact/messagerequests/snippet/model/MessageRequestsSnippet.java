package com.facebook.messaging.wellbeing.unknowncontact.messagerequests.snippet.model;

import X.11T;
import X.4YV;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: MessageRequestsSnippet.class */
public final class MessageRequestsSnippet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(96);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;

    public MessageRequestsSnippet(int i, int i2, int i3, int i4, String str) {
        this.A02 = i;
        this.A04 = i2;
        this.A05 = str;
        this.A01 = i3;
        this.A03 = i4;
    }

    public MessageRequestsSnippet(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof MessageRequestsSnippet) {
            MessageRequestsSnippet messageRequestsSnippet = (MessageRequestsSnippet) obj;
            if (this.A02 == messageRequestsSnippet.A02 && this.A04 == messageRequestsSnippet.A04 && 11T.A0O(this.A05, messageRequestsSnippet.A05) && this.A01 == messageRequestsSnippet.A01 && this.A03 == messageRequestsSnippet.A03) {
                z = 4YV.A1a(this.A00, messageRequestsSnippet.A00, false);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A02), Integer.valueOf(this.A04), this.A05, Integer.valueOf(this.A01), Integer.valueOf(this.A03), this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A00);
    }
}
