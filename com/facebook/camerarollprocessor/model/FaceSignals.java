package com.facebook.camerarollprocessor.model;

import X.11T;
import X.1BK;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FaceSignals.class */
public final class FaceSignals implements Parcelable {
    public static volatile ImmutableList A03;
    public static final Parcelable.Creator CREATOR = DKf.A00(89);
    public final ImageInfo A00;
    public final ImmutableList A01;
    public final Set A02;

    public FaceSignals(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImageInfo imageInfo = null;
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            FacePose[] facePoseArr = new FacePose[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, facePoseArr, i2);
            }
            this.A01 = ImmutableList.copyOf(facePoseArr);
        }
        this.A00 = parcel.readInt() != 0 ? (ImageInfo) parcel.readParcelable(A0e) : imageInfo;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public FaceSignals(ImageInfo imageInfo, ImmutableList immutableList, Set set) {
        this.A01 = immutableList;
        this.A00 = imageInfo;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public ImmutableList A00() {
        if (this.A02.contains("facePoses")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = 1BK.A0b();
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
            if (!(obj instanceof FaceSignals)) {
                return false;
            }
            FaceSignals faceSignals = (FaceSignals) obj;
            if (!11T.A0O(A00(), faceSignals.A00()) || !11T.A0O(this.A00, faceSignals.A00)) {
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
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((FacePose) A0Y.next(), i);
            }
        }
        C3o5.A0d(parcel, this.A00, i);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
