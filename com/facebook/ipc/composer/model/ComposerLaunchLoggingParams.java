package com.facebook.ipc.composer.model;

import X.11T;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.END;
import X.EPQ;
import X.FKa;
import X.GOm;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerLaunchLoggingParams.class */
public final class ComposerLaunchLoggingParams implements Parcelable {
    public static volatile END A04;
    public static volatile EPQ A05;
    public static final Parcelable.Creator CREATOR = FKa.A00(34);
    public final END A00;
    public final EPQ A01;
    public final String A02;
    public final Set A03;

    public ComposerLaunchLoggingParams(END end, EPQ epq, String str, Set set) {
        this.A00 = end;
        C1pq.A08(GOm.A00(244), str);
        this.A02 = str;
        this.A01 = epq;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public ComposerLaunchLoggingParams(Parcel parcel) {
        EPQ epq = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = END.values()[parcel.readInt()];
        }
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt() != 0 ? EPQ.values()[parcel.readInt()] : epq;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public END A00() {
        if (this.A03.contains("entryPicker")) {
            return this.A00;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = END.A08;
                }
            }
        }
        return A04;
    }

    public EPQ A01() {
        if (this.A03.contains("sourceScreen")) {
            return this.A01;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = EPQ.A14;
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
            if (!(obj instanceof ComposerLaunchLoggingParams)) {
                return false;
            }
            ComposerLaunchLoggingParams composerLaunchLoggingParams = (ComposerLaunchLoggingParams) obj;
            if (A00() != composerLaunchLoggingParams.A00() || !11T.A0O(this.A02, composerLaunchLoggingParams.A02) || A01() != composerLaunchLoggingParams.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A042 = C1pq.A04(this.A02, C3o5.A03(A00()) + 31);
        return (A042 * 31) + DKF.A04(A01());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        parcel.writeString(this.A02);
        C3o5.A0e(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
