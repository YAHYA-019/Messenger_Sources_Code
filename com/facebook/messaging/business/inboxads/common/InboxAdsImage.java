package com.facebook.messaging.business.inboxads.common;

import X.11T;
import X.4YW;
import X.82M;
import X.C1pq;
import X.C3o5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InboxAdsImage.class */
public final class InboxAdsImage implements Parcelable {
    public static volatile Uri A04;
    public static final Parcelable.Creator CREATOR = new 82M(18);
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final Set A03;

    public InboxAdsImage(Uri uri, Set set, int i, int i2) {
        this.A00 = i;
        this.A02 = uri;
        this.A01 = i2;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public InboxAdsImage(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() == 0 ? null : (Uri) parcel.readParcelable(classLoader);
        this.A01 = parcel.readInt();
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        this.A03 = Collections.unmodifiableSet(hashSet);
    }

    public Uri A00() {
        if (this.A03.contains(TraceFieldType.Uri)) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = Uri.EMPTY;
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
            if (!(obj instanceof InboxAdsImage)) {
                return false;
            }
            InboxAdsImage inboxAdsImage = (InboxAdsImage) obj;
            if (this.A00 != inboxAdsImage.A00 || !11T.A0O(A00(), inboxAdsImage.A00()) || this.A01 != inboxAdsImage.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(A00(), this.A00 + 31) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        4YW.A0D(parcel, this.A02, i);
        parcel.writeInt(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
