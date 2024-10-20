package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zO;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.EMo;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerSchedulingOptionsData.class */
public final class ComposerSchedulingOptionsData implements Parcelable {
    public static volatile EMo A05;
    public static final Parcelable.Creator CREATOR = FKa.A00(64);
    public final ImmutableList A00;
    public final Long A01;
    public final boolean A02;
    public final EMo A03;
    public final Set A04;

    public ComposerSchedulingOptionsData(EMo eMo, ImmutableList immutableList, Long l, Set set, boolean z) {
        this.A02 = z;
        this.A03 = eMo;
        C1pq.A08("recommendedTimes", immutableList);
        this.A00 = immutableList;
        this.A01 = l;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public ComposerSchedulingOptionsData(Parcel parcel) {
        int i = 0;
        this.A02 = 4YV.A1U(C3o5.A01(parcel, this));
        this.A03 = parcel.readInt() != 0 ? EMo.values()[parcel.readInt()] : null;
        int readInt = parcel.readInt();
        Long[] lArr = new Long[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            lArr[i2] = 7zO.A0j(parcel);
        }
        this.A00 = ImmutableList.copyOf(lArr);
        this.A01 = AbN.A0h(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public EMo A00() {
        if (this.A04.contains("publishMode")) {
            return this.A03;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = EMo.A02;
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
            if (!(obj instanceof ComposerSchedulingOptionsData)) {
                return false;
            }
            ComposerSchedulingOptionsData composerSchedulingOptionsData = (ComposerSchedulingOptionsData) obj;
            if (this.A02 != composerSchedulingOptionsData.A02 || A00() != composerSchedulingOptionsData.A00() || !11T.A0O(this.A00, composerSchedulingOptionsData.A00) || !11T.A0O(this.A01, composerSchedulingOptionsData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A052 = C1pq.A05(this.A02);
        return C1pq.A04(this.A01, C1pq.A04(this.A00, (A052 * 31) + C3o5.A03(A00())));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        C3o5.A0e(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeLong(AnonymousClass001.A05(A0b.next()));
        }
        C3o5.A0g(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
