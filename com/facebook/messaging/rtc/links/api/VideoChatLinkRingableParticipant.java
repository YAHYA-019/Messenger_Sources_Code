package com.facebook.messaging.rtc.links.api;

import X.11T;
import X.4YV;
import X.AbI;
import X.AbN;
import X.C1pq;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.user.model.User;

/* loaded from: VideoChatLinkRingableParticipant.class */
public final class VideoChatLinkRingableParticipant implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(55);
    public final User A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;

    public VideoChatLinkRingableParticipant(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readInt() == 0 ? null : AbI.A0z(parcel);
        this.A03 = AbN.A1U(parcel);
        this.A02 = parcel.readString();
        this.A00 = (User) parcel.readParcelable(A0e);
    }

    public VideoChatLinkRingableParticipant(User user, Integer num, String str, boolean z) {
        this.A01 = num;
        this.A03 = z;
        C1pq.A08("inviteType", str);
        this.A02 = str;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user);
        this.A00 = user;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoChatLinkRingableParticipant)) {
                return false;
            }
            VideoChatLinkRingableParticipant videoChatLinkRingableParticipant = (VideoChatLinkRingableParticipant) obj;
            if (!11T.A0O(this.A01, videoChatLinkRingableParticipant.A01) || this.A03 != videoChatLinkRingableParticipant.A03 || !11T.A0O(this.A02, videoChatLinkRingableParticipant.A02) || !11T.A0O(this.A00, videoChatLinkRingableParticipant.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A02(C1pq.A03(this.A01), this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(AbN.A01(parcel, this.A01));
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
