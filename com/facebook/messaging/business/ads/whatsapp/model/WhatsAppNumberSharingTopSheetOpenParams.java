package com.facebook.messaging.business.ads.whatsapp.model;

import X.11T;
import X.1BL;
import X.4YT;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.composer.model.ComposerTopSheetOpenParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: WhatsAppNumberSharingTopSheetOpenParams.class */
public final class WhatsAppNumberSharingTopSheetOpenParams implements Parcelable, ComposerTopSheetOpenParams {
    public static volatile String A06;
    public static volatile String A07;
    public static volatile String A08;
    public static final Parcelable.Creator CREATOR = CSW.A00(5);
    public final Uri A00;
    public final ThreadKey A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Set A05;

    public WhatsAppNumberSharingTopSheetOpenParams(Uri uri, ThreadKey threadKey, String str, String str2, String str3, Set set) {
        this.A02 = str;
        this.A00 = uri;
        this.A03 = str2;
        this.A01 = threadKey;
        this.A04 = str3;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public WhatsAppNumberSharingTopSheetOpenParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ThreadKey threadKey = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel) : threadKey;
        this.A04 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public String A00() {
        if (this.A05.contains("pageName")) {
            return this.A02;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = "";
                }
            }
        }
        return A06;
    }

    public String A01() {
        if (this.A05.contains("sessionId")) {
            return this.A03;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = "";
                }
            }
        }
        return A07;
    }

    public String A02() {
        if (this.A05.contains(4YT.A00(1582))) {
            return this.A04;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = "";
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
            if (!(obj instanceof WhatsAppNumberSharingTopSheetOpenParams)) {
                return false;
            }
            WhatsAppNumberSharingTopSheetOpenParams whatsAppNumberSharingTopSheetOpenParams = (WhatsAppNumberSharingTopSheetOpenParams) obj;
            if (!11T.A0O(A00(), whatsAppNumberSharingTopSheetOpenParams.A00()) || !11T.A0O(this.A00, whatsAppNumberSharingTopSheetOpenParams.A00) || !11T.A0O(A01(), whatsAppNumberSharingTopSheetOpenParams.A01()) || !11T.A0O(this.A01, whatsAppNumberSharingTopSheetOpenParams.A01) || !11T.A0O(A02(), whatsAppNumberSharingTopSheetOpenParams.A02())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A02(), C1pq.A04(this.A01, C1pq.A04(A01(), C1pq.A04(this.A00, C1pq.A03(A00())))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("WhatsAppNumberSharingTopSheetOpenParams{pageName=");
        A0k.append(A00());
        A0k.append(", pageProfileImageUri=");
        A0k.append(this.A00);
        A0k.append(4YT.A00(45));
        A0k.append(A01());
        A0k.append(", threadKey=");
        A0k.append(this.A01);
        A0k.append(", whatsappNumber=");
        A0k.append(A02());
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A03);
        ThreadKey threadKey = this.A01;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
