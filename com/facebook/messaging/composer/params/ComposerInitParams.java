package com.facebook.messaging.composer.params;

import X.11T;
import X.1BL;
import X.1BM;
import X.7zL;
import X.AbJ;
import X.AnonymousClass001;
import X.Byx;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ComposerAppAttribution;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerInitParams.class */
public final class ComposerInitParams implements Parcelable {
    public static volatile ComposerInitParamsSpec$ComposerLaunchSource A0F;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(14);
    public final ComposerInitParamsSpec$ComposerLaunchSource A00;
    public final ComposerAppAttribution A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public ComposerInitParams(Byx byx) {
        this.A01 = byx.A01;
        this.A06 = byx.A06;
        this.A00 = byx.A00;
        this.A02 = byx.A02;
        this.A07 = byx.A07;
        this.A08 = byx.A08;
        this.A03 = byx.A03;
        this.A09 = byx.A09;
        this.A04 = byx.A04;
        this.A0A = byx.A0A;
        this.A0B = byx.A0B;
        this.A0C = byx.A0C;
        this.A0D = byx.A0D;
        this.A0E = byx.A0E;
        this.A05 = Collections.unmodifiableSet(byx.A05);
    }

    public ComposerInitParams(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = (ComposerAppAttribution) ComposerAppAttribution.CREATOR.createFromParcel(parcel);
        }
        int i = 0;
        this.A06 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = ComposerInitParamsSpec$ComposerLaunchSource.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A09 = 1BM.A07(parcel);
        this.A04 = C3o5.A0O(parcel);
        this.A0A = 1BM.A07(parcel);
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0D = 1BM.A07(parcel);
        this.A0E = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public ComposerInitParamsSpec$ComposerLaunchSource A00() {
        if (this.A05.contains("composerLaunchSource")) {
            return this.A00;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = ComposerInitParamsSpec$ComposerLaunchSource.A06;
                }
            }
        }
        return A0F;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerInitParams)) {
                return false;
            }
            ComposerInitParams composerInitParams = (ComposerInitParams) obj;
            if (!11T.A0O(this.A01, composerInitParams.A01) || this.A06 != composerInitParams.A06 || A00() != composerInitParams.A00() || !11T.A0O(this.A02, composerInitParams.A02) || this.A07 != composerInitParams.A07 || this.A08 != composerInitParams.A08 || !11T.A0O(this.A03, composerInitParams.A03) || this.A09 != composerInitParams.A09 || !11T.A0O(this.A04, composerInitParams.A04) || this.A0A != composerInitParams.A0A || this.A0B != composerInitParams.A0B || this.A0C != composerInitParams.A0C || this.A0D != composerInitParams.A0D || this.A0E != composerInitParams.A0E) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C1pq.A02(C1pq.A03(this.A01), this.A06);
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A04(this.A02, (A02 * 31) + C3o5.A03(A00())), this.A07), this.A08)), this.A09)), this.A0A), this.A0B), this.A0C), this.A0D), this.A0E);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ComposerAppAttribution composerAppAttribution = this.A01;
        if (composerAppAttribution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerAppAttribution.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A06 ? 1 : 0);
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
