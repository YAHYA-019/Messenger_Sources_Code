package com.facebook.messaginginblue.threadview.data.model.messages.metadata;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: QuickReply.class */
public final class QuickReply implements Parcelable {
    public static volatile QuickReplyContentType A05;
    public static final Parcelable.Creator CREATOR = FKY.A00(4);
    public final String A00;
    public final String A01;
    public final String A02;
    public final QuickReplyContentType A03;
    public final Set A04;

    public QuickReply(Parcel parcel) {
        QuickReplyContentType quickReplyContentType = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
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
        this.A03 = parcel.readInt() != 0 ? QuickReplyContentType.values()[parcel.readInt()] : quickReplyContentType;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public QuickReply(QuickReplyContentType quickReplyContentType, String str, String str2, String str3, Set set) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = quickReplyContentType;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public QuickReplyContentType A00() {
        if (this.A04.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A03;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = QuickReplyContentType.A04;
                }
            }
        }
        return A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof QuickReply)) {
                return false;
            }
            QuickReply quickReply = (QuickReply) obj;
            if (!11T.A0O(this.A00, quickReply.A00) || !11T.A0O(this.A01, quickReply.A01) || !11T.A0O(this.A02, quickReply.A02) || A00() != quickReply.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
        return (A04 * 31) + C3o5.A03(A00());
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("QuickReply{payload=");
        A0k.append(this.A00);
        A0k.append(", promptId=");
        A0k.append(this.A01);
        A0k.append(", title=");
        A0k.append(this.A02);
        A0k.append(", type=");
        A0k.append(A00());
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        C3o5.A0e(parcel, this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
