package com.facebook.xapp.messaging.mentions.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C6qi;
import X.C7s3;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: TextMentionRange.class */
public final class TextMentionRange implements Parcelable {
    public static volatile C6qi A08;
    public static final Parcelable.Creator CREATOR = new FKb(54);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final C6qi A04;
    public final String A05;
    public final Set A06;
    public final boolean A07;

    public TextMentionRange(C7s3 c7s3) {
        String str = c7s3.A03;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str);
        this.A02 = str;
        this.A07 = false;
        this.A00 = c7s3.A00;
        this.A04 = c7s3.A02;
        this.A03 = c7s3.A04;
        this.A01 = c7s3.A01;
        this.A05 = null;
        this.A06 = Collections.unmodifiableSet(c7s3.A05);
    }

    public TextMentionRange(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        int i = 0;
        this.A07 = 4YV.A1U(parcel.readInt());
        this.A00 = parcel.readInt();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = C6qi.values()[parcel.readInt()];
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A01 = parcel.readInt();
        this.A05 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public C6qi A00() {
        if (this.A06.contains("mentionType")) {
            return this.A04;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = C6qi.A04;
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof TextMentionRange)) {
                return false;
            }
            TextMentionRange textMentionRange = (TextMentionRange) obj;
            if (!11T.A0O(this.A02, textMentionRange.A02) || this.A07 != textMentionRange.A07 || this.A00 != textMentionRange.A00 || A00() != textMentionRange.A00() || !11T.A0O(this.A03, textMentionRange.A03) || this.A01 != textMentionRange.A01 || !11T.A0O(this.A05, textMentionRange.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = (C1pq.A02(C1pq.A03(this.A02), this.A07) * 31) + this.A00;
        return C1pq.A04(this.A05, (C1pq.A04(this.A03, (A02 * 31) + C3o5.A03(A00())) * 31) + this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        C3o5.A0e(parcel, this.A04);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A01);
        1BL.A13(parcel, this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
