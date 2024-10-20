package com.facebook.media.model.features;

import X.11T;
import X.1BK;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.DKG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.facedetection.model.TagDescriptor;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MediaFeatures.class */
public final class MediaFeatures implements Parcelable {
    public static volatile ImmutableList A03;
    public static volatile ImmutableList A04;
    public static final Parcelable.Creator CREATOR = new CSR(75);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final Set A02;

    public MediaFeatures(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            TagDescriptor[] tagDescriptorArr = new TagDescriptor[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = DKG.A02(parcel, TagDescriptor.CREATOR, tagDescriptorArr, i2);
            }
            this.A00 = ImmutableList.copyOf(tagDescriptorArr);
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            XRayConcept[] xRayConceptArr = new XRayConcept[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbI.A01(parcel, A0e, xRayConceptArr, i3);
            }
            immutableList = ImmutableList.copyOf(xRayConceptArr);
        }
        this.A01 = immutableList;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public MediaFeatures(ImmutableList immutableList, ImmutableList immutableList2, Set set) {
        this.A00 = immutableList;
        this.A01 = immutableList2;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public ImmutableList A00() {
        if (this.A02.contains("faces")) {
            return this.A00;
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

    public ImmutableList A01() {
        if (this.A02.contains("xRayConcepts")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = 1BK.A0b();
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
            if (!(obj instanceof MediaFeatures)) {
                return false;
            }
            MediaFeatures mediaFeatures = (MediaFeatures) obj;
            if (!11T.A0O(A00(), mediaFeatures.A00()) || !11T.A0O(A01(), mediaFeatures.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A01(), C1pq.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                ((TagDescriptor) A0Y.next()).writeToParcel(parcel, i);
            }
        }
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeParcelable((XRayConcept) A0Y2.next(), i);
            }
        }
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
