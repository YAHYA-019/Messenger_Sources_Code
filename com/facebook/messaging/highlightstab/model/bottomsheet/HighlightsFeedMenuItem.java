package com.facebook.messaging.highlightstab.model.bottomsheet;

import X.11T;
import X.1BK;
import X.4YV;
import X.7zL;
import X.AnonymousClass001;
import X.C1pq;
import X.C1u3;
import X.C3o5;
import X.C98S;
import X.C9ky;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: HighlightsFeedMenuItem.class */
public final class HighlightsFeedMenuItem implements Parcelable {
    public static volatile C1u3 A06;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(81);
    public final int A00;
    public final C98S A01;
    public final String A02;
    public final boolean A03;
    public final C1u3 A04;
    public final Set A05;

    public HighlightsFeedMenuItem(C9ky c9ky) {
        this.A04 = c9ky.A02;
        this.A00 = c9ky.A00;
        this.A03 = c9ky.A05;
        this.A01 = c9ky.A01;
        String str = c9ky.A03;
        C1pq.A08("title", str);
        this.A02 = str;
        this.A05 = Collections.unmodifiableSet(c9ky.A04);
        if (this.A02.length() == 0) {
            throw 1BK.A0g();
        }
    }

    public HighlightsFeedMenuItem(Parcel parcel) {
        C98S c98s = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = C1u3.values()[parcel.readInt()];
        }
        this.A00 = parcel.readInt();
        int i = 0;
        this.A03 = 4YV.A1U(parcel.readInt());
        this.A01 = parcel.readInt() != 0 ? C98S.values()[parcel.readInt()] : c98s;
        this.A02 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public C1u3 A00() {
        if (this.A05.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = C1u3.A3u;
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsFeedMenuItem)) {
                return false;
            }
            HighlightsFeedMenuItem highlightsFeedMenuItem = (HighlightsFeedMenuItem) obj;
            if (A00() != highlightsFeedMenuItem.A00() || this.A00 != highlightsFeedMenuItem.A00 || this.A03 != highlightsFeedMenuItem.A03 || this.A01 != highlightsFeedMenuItem.A01 || !11T.A0O(this.A02, highlightsFeedMenuItem.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A02 = C1pq.A02(((C3o5.A03(A00()) + 31) * 31) + this.A00, this.A03);
        C98S c98s = this.A01;
        if (c98s != null) {
            i = c98s.ordinal();
        }
        return C1pq.A04(this.A02, (A02 * 31) + i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        C3o5.A0e(parcel, this.A01);
        parcel.writeString(this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
