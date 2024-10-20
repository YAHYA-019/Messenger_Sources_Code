package com.facebook.messaging.model.threads.ads;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AdContextMediaAttachmentData.class */
public final class AdContextMediaAttachmentData implements Parcelable {
    public static volatile String A03;
    public static final Parcelable.Creator CREATOR = CSV.A00(83);
    public final String A00;
    public final String A01;
    public final Set A02;

    public AdContextMediaAttachmentData(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A00 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public AdContextMediaAttachmentData(String str, String str2, Set set) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A02.contains("graphQLAdContextMediaType")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = "PHOTO";
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdContextMediaAttachmentData)) {
                return false;
            }
            AdContextMediaAttachmentData adContextMediaAttachmentData = (AdContextMediaAttachmentData) obj;
            if (!11T.A0O(A00(), adContextMediaAttachmentData.A00()) || !11T.A0O(this.A00, adContextMediaAttachmentData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
