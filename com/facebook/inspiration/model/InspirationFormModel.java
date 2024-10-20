package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zN;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.ELz;
import X.FKf;
import X.Raf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.capture.layout.model.InspirationLayoutModeState;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: InspirationFormModel.class */
public final class InspirationFormModel implements Parcelable {
    public static volatile InspirationLayoutModeState A05;
    public static volatile ELz A06;
    public static volatile ImmutableMap A07;
    public static final Parcelable.Creator CREATOR = FKf.A01(55);
    public final InspirationLayoutModeState A00;
    public final ELz A01;
    public final ImmutableList A02;
    public final ImmutableMap A03;
    public final Set A04;

    public InspirationFormModel(Raf raf) {
        this.A01 = raf.A01;
        this.A00 = raf.A00;
        this.A03 = raf.A03;
        ImmutableList immutableList = raf.A02;
        C1pq.A08("sortedEnabledFormTypes", immutableList);
        this.A02 = immutableList;
        this.A04 = Collections.unmodifiableSet(raf.A04);
    }

    public InspirationFormModel(Parcel parcel) {
        ImmutableMap immutableMap = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = ELz.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationLayoutModeState) InspirationLayoutModeState.CREATOR.createFromParcel(parcel);
        }
        int i = 0;
        if (parcel.readInt() != 0) {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbL.A01(parcel, A0u, i2);
            }
            immutableMap = ImmutableMap.copyOf((Map) A0u);
        }
        this.A03 = immutableMap;
        int readInt2 = parcel.readInt();
        ELz[] eLzArr = new ELz[readInt2];
        for (int i3 = 0; i3 < readInt2; i3++) {
            eLzArr[i3] = ELz.values()[parcel.readInt()];
        }
        this.A02 = ImmutableList.copyOf(eLzArr);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    private ImmutableMap A02() {
        if (this.A04.contains("savedInstances")) {
            return this.A03;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    ImmutableMap immutableMap = RegularImmutableMap.A03;
                    11T.A0A(immutableMap);
                    A07 = immutableMap;
                }
            }
        }
        return A07;
    }

    public InspirationLayoutModeState A00() {
        if (this.A04.contains("layoutModeState")) {
            return this.A00;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = new InspirationLayoutModeState(null, ImmutableList.of(), AnonymousClass001.A0v());
                }
            }
        }
        return A05;
    }

    public ELz A01() {
        if (this.A04.contains("activeFormType")) {
            return this.A01;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = ELz.A09;
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationFormModel)) {
                return false;
            }
            InspirationFormModel inspirationFormModel = (InspirationFormModel) obj;
            if (A01() != inspirationFormModel.A01() || !11T.A0O(A00(), inspirationFormModel.A00()) || !11T.A0O(A02(), inspirationFormModel.A02()) || !11T.A0O(this.A02, inspirationFormModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(A02(), C1pq.A04(A00(), C3o5.A03(A01()) + 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A01);
        InspirationLayoutModeState inspirationLayoutModeState = this.A00;
        if (inspirationLayoutModeState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationLayoutModeState.writeToParcel(parcel, i);
        }
        ImmutableMap immutableMap = this.A03;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                AbL.A0n(parcel, A0g);
            }
        }
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            7zN.A0z(parcel, (ELz) A0b.next());
        }
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
