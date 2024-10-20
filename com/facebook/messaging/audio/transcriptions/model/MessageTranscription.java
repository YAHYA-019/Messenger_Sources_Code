package com.facebook.messaging.audio.transcriptions.model;

import X.11T;
import X.4YV;
import X.4YW;
import X.AbE;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessageTranscription.class */
public final class MessageTranscription implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(96);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public MessageTranscription(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : parcel.readString();
        this.A03 = 4YV.A1U(parcel.readInt());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public MessageTranscription(String str, String str2, String str3, boolean z) {
        this.A00 = str;
        this.A03 = z;
        C1pq.A08(AbE.A00(761), str2);
        this.A01 = str2;
        C1pq.A08(AbE.A00(762), str3);
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageTranscription)) {
                return false;
            }
            MessageTranscription messageTranscription = (MessageTranscription) obj;
            if (!11T.A0O(this.A00, messageTranscription.A00) || this.A03 != messageTranscription.A03 || !11T.A0O(this.A01, messageTranscription.A01) || !11T.A0O(this.A02, messageTranscription.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C1pq.A03(this.A00), this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
