package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ComposerVideoPollData.class */
public final class ComposerVideoPollData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(78);
    public final ImmutableMap A00;
    public final Boolean A01;
    public final String A02;

    public ComposerVideoPollData(Parcel parcel) {
        int i = 0;
        ImmutableMap immutableMap = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = Boolean.valueOf(AbN.A1U(parcel));
        }
        if (parcel.readInt() != 0) {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            while (i < readInt) {
                i = AbL.A01(parcel, A0u, i);
            }
            immutableMap = ImmutableMap.copyOf((Map) A0u);
        }
        this.A00 = immutableMap;
        this.A02 = C3o5.A0O(parcel);
    }

    public ComposerVideoPollData(ImmutableMap immutableMap, Boolean bool, String str) {
        this.A01 = bool;
        this.A00 = immutableMap;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerVideoPollData)) {
                return false;
            }
            ComposerVideoPollData composerVideoPollData = (ComposerVideoPollData) obj;
            if (!11T.A0O(this.A01, composerVideoPollData.A01) || !11T.A0O(this.A00, composerVideoPollData.A00) || !11T.A0O(this.A02, composerVideoPollData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbN.A0s(parcel, this.A01);
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                AbL.A0n(parcel, A0g);
            }
        }
        1BL.A13(parcel, this.A02);
    }
}
