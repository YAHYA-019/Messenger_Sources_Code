package com.facebook.ipc.composer.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKc;
import X.I9Q;
import X.Qns;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CollaborativePostContributionData.class */
public final class CollaborativePostContributionData implements Parcelable {
    public static volatile Qns A04;
    public static volatile MediaData A05;
    public static final Parcelable.Creator CREATOR = FKc.A00(89);
    public final String A00;
    public final Qns A01;
    public final MediaData A02;
    public final Set A03;

    public CollaborativePostContributionData(Qns qns, MediaData mediaData, String str, Set set) {
        this.A00 = str;
        this.A01 = qns;
        this.A02 = mediaData;
        this.A03 = Collections.unmodifiableSet(set);
        if (A01().A03() == null) {
            throw 1BK.A0h();
        }
    }

    public CollaborativePostContributionData(Parcel parcel) {
        MediaData mediaData = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Qns.values()[parcel.readInt()];
        }
        this.A02 = parcel.readInt() != 0 ? DKG.A0Y(parcel) : mediaData;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public Qns A00() {
        if (this.A03.contains("contributionFormatType")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = Qns.A02;
                }
            }
        }
        return A04;
    }

    public MediaData A01() {
        if (this.A03.contains("mediaData")) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = new MediaData(new I9Q());
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
            if (!(obj instanceof CollaborativePostContributionData)) {
                return false;
            }
            CollaborativePostContributionData collaborativePostContributionData = (CollaborativePostContributionData) obj;
            if (!11T.A0O(this.A00, collaborativePostContributionData.A00) || A00() != collaborativePostContributionData.A00() || !11T.A0O(A01(), collaborativePostContributionData.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A00);
        return C1pq.A04(A01(), (A03 * 31) + C3o5.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        C3o5.A0e(parcel, this.A01);
        DKH.A10(parcel, this.A02, i);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
