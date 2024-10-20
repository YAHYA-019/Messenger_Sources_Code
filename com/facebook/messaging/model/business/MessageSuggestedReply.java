package com.facebook.messaging.model.business;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.CSV;
import X.RR8;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MessageSuggestedReply.class */
public final class MessageSuggestedReply implements Parcelable {
    public static volatile String A04;
    public static final Parcelable.Creator CREATOR = new CSV(46);
    public final String A00;
    public final String A01;
    public final String A02;
    public final Set A03;

    public MessageSuggestedReply(RR8 rr8) {
        String str = rr8.A00;
        C1pq.A08("label", str);
        this.A00 = str;
        String str2 = rr8.A01;
        C1pq.A08("triggerId", str2);
        this.A01 = str2;
        this.A02 = rr8.A02;
        this.A03 = Collections.unmodifiableSet(rr8.A03);
    }

    public MessageSuggestedReply(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readInt() == 0 ? null : parcel.readString();
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A03 = Collections.unmodifiableSet(hashSet);
    }

    public String A00() {
        if (this.A03.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageSuggestedReply)) {
                return false;
            }
            MessageSuggestedReply messageSuggestedReply = (MessageSuggestedReply) obj;
            if (!11T.A0O(this.A00, messageSuggestedReply.A00) || !11T.A0O(this.A01, messageSuggestedReply.A01) || !11T.A0O(A00(), messageSuggestedReply.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        String str = this.A02;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
