package androidx.compose.runtime;

import X.11T;
import X.AnonymousClass001;
import X.C2880Jc1;
import X.GOn;
import X.L2v;
import X.LEY;
import X.LGo;
import X.LNr;
import X.LO7;
import X.MED;
import X.MMx;
import X.MN0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: ParcelableSnapshotMutableLongState.class */
public final class ParcelableSnapshotMutableLongState extends LO7 implements Parcelable, MN0, MMx {
    public static final Parcelable.Creator CREATOR = LGo.A00(17);
    public C2880Jc1 A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.L2v, X.Jc1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.L2v, X.Jc1] */
    public ParcelableSnapshotMutableLongState(long j) {
        ?? l2v = new L2v();
        l2v.A00 = j;
        if (LEY.A05.A01() != null) {
            ?? l2v2 = new L2v();
            l2v2.A00 = j;
            l2v2.A00 = 1;
            l2v.A01 = l2v2;
        }
        this.A00 = l2v;
    }

    public L2v Amc() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MN0
    public long Av6() {
        return ((C2880Jc1) LEY.A06(this, this.A00)).A00;
    }

    @Override // X.MMx
    public MED B3o() {
        LNr lNr = LNr.A00;
        11T.A0I(lNr, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return lNr;
    }

    public void CZ0(L2v l2v) {
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.A00 = (C2880Jc1) l2v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MN0
    public void Cqx(long j) {
        Snapshot A00;
        C2880Jc1 c2880Jc1 = (C2880Jc1) LEY.A07(this.A00);
        if (c2880Jc1.A00 != j) {
            C2880Jc1 c2880Jc12 = this.A00;
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                ((C2880Jc1) LEY.A03(A00, this, c2880Jc12, c2880Jc1)).A00 = j;
            }
            LEY.A0F(A00, this);
        }
    }

    @Override // X.MN4
    public /* bridge */ /* synthetic */ void Cvx(Object obj) {
        Cqx(AnonymousClass001.A05(obj));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.MN4
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(Av6());
    }

    public String toString() {
        C2880Jc1 c2880Jc1 = (C2880Jc1) LEY.A07(this.A00);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MutableLongState(value=");
        A0k.append(c2880Jc1.A00);
        A0k.append(")@");
        return GOn.A1B(A0k, hashCode());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(Av6());
    }
}
