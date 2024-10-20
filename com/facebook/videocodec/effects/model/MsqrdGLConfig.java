package com.facebook.videocodec.effects.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.2JZ;
import X.2tS;
import X.6As;
import X.AbF;
import X.AbG;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.Dkw;
import X.FJ8;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MsqrdGLConfig.class */
public final class MsqrdGLConfig implements Parcelable {
    public static volatile Dkw A0N;
    public static final Parcelable.Creator CREATOR = FKb.A00(19);
    public final float A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final Dkw A0L;
    public final Set A0M;

    public MsqrdGLConfig(Dkw dkw, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Set set, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.A00 = f;
        this.A03 = str;
        this.A01 = immutableList;
        this.A0A = z;
        this.A0B = z2;
        AbF.A1T(str2);
        this.A04 = str2;
        this.A05 = str3;
        C1pq.A08("instructions", immutableList2);
        this.A02 = immutableList2;
        this.A0C = z3;
        this.A06 = str4;
        this.A0L = dkw;
        this.A07 = str5;
        this.A08 = str6;
        C1pq.A08("renderKey", str7);
        this.A09 = str7;
        this.A0D = z4;
        this.A0E = z5;
        this.A0F = z6;
        this.A0G = z7;
        this.A0H = z8;
        this.A0I = z9;
        this.A0J = z10;
        this.A0K = z11;
        this.A0M = Collections.unmodifiableSet(set);
    }

    public MsqrdGLConfig(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = FJ8.A02(parcel);
        }
        int i = 0;
        this.A0A = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0B = 1BM.A07(parcel);
        this.A04 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A02 = FJ8.A02(parcel);
        this.A0C = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (Dkw) FJ8.A01(parcel);
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = C3o5.A0O(parcel);
        this.A09 = parcel.readString();
        this.A0D = 1BM.A07(parcel);
        this.A0E = 1BM.A07(parcel);
        this.A0F = 1BM.A07(parcel);
        this.A0G = 1BM.A07(parcel);
        this.A0H = 1BM.A07(parcel);
        this.A0I = 1BM.A07(parcel);
        this.A0J = 1BM.A07(parcel);
        this.A0K = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0M = Collections.unmodifiableSet(A0v);
    }

    public Dkw A00() {
        if (this.A0M.contains("maskModel")) {
            return this.A0L;
        }
        if (A0N == null) {
            synchronized (this) {
                if (A0N == null) {
                    Object obj = 2JZ.A01;
                    Dkw dkw = (Dkw) 2tS.A00().newTreeBuilder("NativeMask", 6As.class, -493292361).getResult(Dkw.class, -493292361);
                    11T.A0A(dkw);
                    A0N = dkw;
                }
            }
        }
        return A0N;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MsqrdGLConfig)) {
                return false;
            }
            MsqrdGLConfig msqrdGLConfig = (MsqrdGLConfig) obj;
            if (this.A00 != msqrdGLConfig.A00 || !11T.A0O(this.A03, msqrdGLConfig.A03) || !11T.A0O(this.A01, msqrdGLConfig.A01) || this.A0A != msqrdGLConfig.A0A || this.A0B != msqrdGLConfig.A0B || !11T.A0O(this.A04, msqrdGLConfig.A04) || !11T.A0O(this.A05, msqrdGLConfig.A05) || !11T.A0O(this.A02, msqrdGLConfig.A02) || this.A0C != msqrdGLConfig.A0C || !11T.A0O(this.A06, msqrdGLConfig.A06) || !11T.A0O(A00(), msqrdGLConfig.A00()) || !11T.A0O(this.A07, msqrdGLConfig.A07) || !11T.A0O(this.A08, msqrdGLConfig.A08) || !11T.A0O(this.A09, msqrdGLConfig.A09) || this.A0D != msqrdGLConfig.A0D || this.A0E != msqrdGLConfig.A0E || this.A0F != msqrdGLConfig.A0F || this.A0G != msqrdGLConfig.A0G || this.A0H != msqrdGLConfig.A0H || this.A0I != msqrdGLConfig.A0I || this.A0J != msqrdGLConfig.A0J || this.A0K != msqrdGLConfig.A0K) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(A00(), C1pq.A04(this.A06, C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A02(C1pq.A04(this.A01, C1pq.A04(this.A03, Float.floatToIntBits(this.A00) + 31)), this.A0A), this.A0B)))), this.A0C)))))), this.A0D), this.A0E), this.A0F), this.A0G), this.A0H), this.A0I), this.A0J), this.A0K);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        1BL.A13(parcel, this.A03);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0B(parcel, immutableList);
        }
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A04);
        1BL.A13(parcel, this.A05);
        FJ8.A0B(parcel, this.A02);
        parcel.writeInt(this.A0C ? 1 : 0);
        1BL.A13(parcel, this.A06);
        DKH.A0y(parcel, this.A0L);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A0M);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
