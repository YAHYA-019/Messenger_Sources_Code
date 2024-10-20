package com.facebook.messaging.wellbeing.selfremediation.block.user;

import X.11T;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbF;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.BNJ;
import X.BNT;
import X.BOM;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: BlockUserPersistingState.class */
public final class BlockUserPersistingState implements Parcelable {
    public static volatile BNT A0C;
    public static volatile BNJ A0D;
    public static final Parcelable.Creator CREATOR = CSU.A00(95);
    public final BOM A00;
    public final ThreadSummary A01;
    public final BNT A02;
    public final BNJ A03;
    public final UserKey A04;
    public final ImmutableList A05;
    public final String A06;
    public final String A07;
    public final Set A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public BlockUserPersistingState(BOM bom, ThreadSummary threadSummary, BNT bnt, BNJ bnj, UserKey userKey, ImmutableList immutableList, String str, String str2, Set set, boolean z, boolean z2, boolean z3) {
        this.A02 = bnt;
        this.A05 = immutableList;
        this.A09 = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A03 = bnj;
        this.A00 = bom;
        this.A01 = threadSummary;
        C1pq.A08("userDisplayOrFullName", str);
        this.A06 = str;
        C1pq.A08("userKey", userKey);
        this.A04 = userKey;
        C1pq.A08("userName", str2);
        this.A07 = str2;
        this.A08 = Collections.unmodifiableSet(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlockUserPersistingState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ThreadSummary threadSummary = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = BNT.values()[parcel.readInt()];
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            int readInt = parcel.readInt();
            ThreadSummary[] threadSummaryArr = new ThreadSummary[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                threadSummaryArr[i2] = ThreadSummary.CREATOR.createFromParcel(parcel);
            }
            this.A05 = ImmutableList.copyOf(threadSummaryArr);
        }
        this.A09 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0A = 1BM.A07(parcel);
        this.A0B = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = BNJ.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = BOM.values()[parcel.readInt()];
        }
        this.A01 = parcel.readInt() != 0 ? (ThreadSummary) ThreadSummary.CREATOR.createFromParcel(parcel) : threadSummary;
        this.A06 = parcel.readString();
        this.A04 = (UserKey) parcel.readParcelable(A0e);
        this.A07 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public BNT A00() {
        if (this.A08.contains("entryPoint")) {
            return this.A02;
        }
        if (A0C == null) {
            synchronized (this) {
                if (A0C == null) {
                    A0C = BNT.A0g;
                }
            }
        }
        return A0C;
    }

    public BNJ A01() {
        if (this.A08.contains(Property.SYMBOL_Z_ORDER_SOURCE)) {
            return this.A03;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    A0D = BNJ.A0J;
                }
            }
        }
        return A0D;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BlockUserPersistingState)) {
                return false;
            }
            BlockUserPersistingState blockUserPersistingState = (BlockUserPersistingState) obj;
            if (A00() != blockUserPersistingState.A00() || !11T.A0O(this.A05, blockUserPersistingState.A05) || this.A09 != blockUserPersistingState.A09 || this.A0A != blockUserPersistingState.A0A || this.A0B != blockUserPersistingState.A0B || A01() != blockUserPersistingState.A01() || this.A00 != blockUserPersistingState.A00 || !11T.A0O(this.A01, blockUserPersistingState.A01) || !11T.A0O(this.A06, blockUserPersistingState.A06) || !11T.A0O(this.A04, blockUserPersistingState.A04) || !11T.A0O(this.A07, blockUserPersistingState.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A02 = (C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A05, C3o5.A03(A00()) + 31), this.A09), this.A0A), this.A0B) * 31) + C3o5.A03(A01());
        BOM bom = this.A00;
        if (bom != null) {
            i = bom.ordinal();
        }
        return C1pq.A04(this.A07, C1pq.A04(this.A04, C1pq.A04(this.A06, C1pq.A04(this.A01, (A02 * 31) + i))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A02);
        ImmutableList immutableList = this.A05;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                AbF.A0j(A0Y).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        C3o5.A0e(parcel, this.A03);
        C3o5.A0e(parcel, this.A00);
        ThreadSummary threadSummary = this.A01;
        if (threadSummary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadSummary.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A07);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
