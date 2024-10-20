package androidx.compose.runtime;

import X.0Pz;
import X.11T;
import X.AnonymousClass001;
import X.C2879Jc0;
import X.L2v;
import X.LEY;
import X.LGo;
import X.LNr;
import X.LO7;
import X.MED;
import X.MMx;
import X.MMz;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: ParcelableSnapshotMutableIntState.class */
public final class ParcelableSnapshotMutableIntState extends LO7 implements MMz, Parcelable, MMx {
    public static final Parcelable.Creator CREATOR = LGo.A00(16);
    public C2879Jc0 A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.L2v, X.Jc0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.L2v, X.Jc0] */
    public ParcelableSnapshotMutableIntState(int i) {
        ?? l2v = new L2v();
        l2v.A00 = i;
        if (LEY.A05.A01() != null) {
            ?? l2v2 = new L2v();
            l2v2.A00 = i;
            l2v2.A00 = 1;
            l2v.A01 = l2v2;
        }
        this.A00 = l2v;
    }

    public L2v Amc() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MMz
    public int ArX() {
        return ((C2879Jc0) LEY.A06(this, this.A00)).A00;
    }

    @Override // X.MMx
    public MED B3o() {
        LNr lNr = LNr.A00;
        11T.A0I(lNr, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return lNr;
    }

    public void CZ0(L2v l2v) {
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.A00 = (C2879Jc0) l2v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MMz
    public void Cq1(int i) {
        Snapshot A00;
        C2879Jc0 c2879Jc0 = (C2879Jc0) LEY.A07(this.A00);
        if (c2879Jc0.A00 != i) {
            C2879Jc0 c2879Jc02 = this.A00;
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                ((C2879Jc0) LEY.A03(A00, this, c2879Jc02, c2879Jc0)).A00 = i;
            }
            LEY.A0F(A00, this);
        }
    }

    @Override // X.MN4
    public /* bridge */ /* synthetic */ void Cvx(Object obj) {
        Cq1(AnonymousClass001.A03(obj));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.MN4
    public /* bridge */ /* synthetic */ Object getValue() {
        return Integer.valueOf(ArX());
    }

    public String toString() {
        return 0Pz.A0C(((C2879Jc0) LEY.A07(this.A00)).A00, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ArX());
    }
}
