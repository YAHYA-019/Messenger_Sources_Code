package com.facebook.composer.stories.camerarollinspiration.suggestions.model;

import X.11T;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKI;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationRMSClip.class */
public final class InspirationRMSClip implements Parcelable {
    public static volatile MediaData A04;
    public static final Parcelable.Creator CREATOR = FKX.A00(10);
    public final int A00;
    public final int A01;
    public final MediaData A02;
    public final Set A03;

    public InspirationRMSClip(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A02 = parcel.readInt() == 0 ? null : DKG.A0Y(parcel);
        this.A01 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public InspirationRMSClip(MediaData mediaData, Set set, int i, int i2) {
        this.A00 = i;
        this.A02 = mediaData;
        this.A01 = i2;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public MediaData A00() {
        if (this.A03.contains("mediaData")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = DKI.A0C();
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
            if (!(obj instanceof InspirationRMSClip)) {
                return false;
            }
            InspirationRMSClip inspirationRMSClip = (InspirationRMSClip) obj;
            if (this.A00 != inspirationRMSClip.A00 || !11T.A0O(A00(), inspirationRMSClip.A00()) || this.A01 != inspirationRMSClip.A01) {
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
        DKI.A0Q(parcel, this.A02, i);
        parcel.writeInt(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
