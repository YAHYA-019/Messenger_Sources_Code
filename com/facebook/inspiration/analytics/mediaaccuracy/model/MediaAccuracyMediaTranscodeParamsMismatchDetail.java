package com.facebook.inspiration.analytics.mediaaccuracy.model;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MediaAccuracyMediaTranscodeParamsMismatchDetail.class */
public final class MediaAccuracyMediaTranscodeParamsMismatchDetail implements Parcelable {
    public static volatile MediaAccuracyMediaTranscodeParams A03;
    public static volatile MediaAccuracyMediaTranscodeParams A04;
    public static final Parcelable.Creator CREATOR = FKf.A01(18);
    public final MediaAccuracyMediaTranscodeParams A00;
    public final MediaAccuracyMediaTranscodeParams A01;
    public final Set A02;

    public MediaAccuracyMediaTranscodeParamsMismatchDetail(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        MediaAccuracyMediaTranscodeParams mediaAccuracyMediaTranscodeParams = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (MediaAccuracyMediaTranscodeParams) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readInt() != 0 ? (MediaAccuracyMediaTranscodeParams) parcel.readParcelable(A0e) : mediaAccuracyMediaTranscodeParams;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public MediaAccuracyMediaTranscodeParamsMismatchDetail(MediaAccuracyMediaTranscodeParams mediaAccuracyMediaTranscodeParams, MediaAccuracyMediaTranscodeParams mediaAccuracyMediaTranscodeParams2, Set set) {
        this.A00 = mediaAccuracyMediaTranscodeParams;
        this.A01 = mediaAccuracyMediaTranscodeParams2;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public MediaAccuracyMediaTranscodeParams A00() {
        if (this.A02.contains("mediaAccuracyTranscodeParamsBase")) {
            return this.A00;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = new MediaAccuracyMediaTranscodeParams(ImmutableList.of(), ImmutableList.of(), "DUMMY", -1, -1, -1, -1, 0, false, false, false);
                }
            }
        }
        return A03;
    }

    public MediaAccuracyMediaTranscodeParams A01() {
        if (this.A02.contains("mediaAccuracyTranscodeParamsCompare")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = new MediaAccuracyMediaTranscodeParams(ImmutableList.of(), ImmutableList.of(), "DUMMY", -1, -1, -1, -1, 0, false, false, false);
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
            if (!(obj instanceof MediaAccuracyMediaTranscodeParamsMismatchDetail)) {
                return false;
            }
            MediaAccuracyMediaTranscodeParamsMismatchDetail mediaAccuracyMediaTranscodeParamsMismatchDetail = (MediaAccuracyMediaTranscodeParamsMismatchDetail) obj;
            if (!11T.A0O(A00(), mediaAccuracyMediaTranscodeParamsMismatchDetail.A00()) || !11T.A0O(A01(), mediaAccuracyMediaTranscodeParamsMismatchDetail.A01())) {
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
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
