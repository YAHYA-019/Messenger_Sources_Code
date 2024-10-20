package androidx.compose.runtime;

import X.11T;
import X.AnonymousClass001;
import X.C2881Jc2;
import X.GOn;
import X.L2v;
import X.LEY;
import X.LGa;
import X.LNp;
import X.LNq;
import X.LNr;
import X.LO7;
import X.MED;
import X.MMx;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: ParcelableSnapshotMutableState.class */
public final class ParcelableSnapshotMutableState extends LO7 implements Parcelable, MMx {
    public static final Parcelable.Creator CREATOR = new LGa();
    public C2881Jc2 A00;
    public final MED A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.L2v, X.Jc2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.L2v, X.Jc2] */
    public ParcelableSnapshotMutableState(MED med, Object obj) {
        this.A01 = med;
        ?? l2v = new L2v();
        l2v.A00 = obj;
        if (LEY.A05.A01() != null) {
            ?? l2v2 = new L2v();
            l2v2.A00 = obj;
            l2v2.A00 = 1;
            l2v.A01 = l2v2;
        }
        this.A00 = l2v;
    }

    public L2v Amc() {
        return this.A00;
    }

    @Override // X.MMx
    public MED B3o() {
        return this.A01;
    }

    public void CZ0(L2v l2v) {
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.A00 = (C2881Jc2) l2v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MN4
    public void Cvx(Object obj) {
        Snapshot A00;
        C2881Jc2 c2881Jc2 = (C2881Jc2) LEY.A07(this.A00);
        if (this.A01.AQs(c2881Jc2.A00, obj)) {
            return;
        }
        C2881Jc2 c2881Jc22 = this.A00;
        synchronized (LEY.A07) {
            A00 = LEY.A00();
            ((C2881Jc2) LEY.A03(A00, this, c2881Jc22, c2881Jc2)).A00 = obj;
        }
        LEY.A0F(A00, this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MN4
    public Object getValue() {
        return ((C2881Jc2) LEY.A06(this, this.A00)).A00;
    }

    public String toString() {
        C2881Jc2 c2881Jc2 = (C2881Jc2) LEY.A07(this.A00);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MutableState(value=");
        A0k.append(c2881Jc2.A00);
        A0k.append(")@");
        return GOn.A1B(A0k, hashCode());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        MED med = this.A01;
        LNp lNp = LNp.A00;
        11T.A0I(lNp, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        if (11T.A0O(med, lNp)) {
            i2 = 0;
        } else {
            LNr lNr = LNr.A00;
            11T.A0I(lNr, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            if (11T.A0O(med, lNr)) {
                i2 = 1;
            } else {
                LNq lNq = LNq.A00;
                11T.A0I(lNq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                if (!11T.A0O(med, lNq)) {
                    throw AnonymousClass001.A0N("Only known types of MutableState's SnapshotMutationPolicy are supported");
                }
                i2 = 2;
            }
        }
        parcel.writeInt(i2);
    }
}
