package com.facebook.messaging.rtc.meetups.speakeasy.model;

import X.11T;
import X.1BL;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CallLinkParticipant.class */
public final class CallLinkParticipant implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(58);
    public final String A00;
    public final String A01;
    public final String A02;

    public CallLinkParticipant(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = parcel.readString();
        this.A02 = C3o5.A0O(parcel);
    }

    public CallLinkParticipant(String str, String str2, String str3) {
        this.A00 = str;
        AbF.A1U(str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallLinkParticipant)) {
                return false;
            }
            CallLinkParticipant callLinkParticipant = (CallLinkParticipant) obj;
            if (!11T.A0O(this.A00, callLinkParticipant.A00) || !11T.A0O(this.A01, callLinkParticipant.A01) || !11T.A0O(this.A02, callLinkParticipant.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
    }
}
