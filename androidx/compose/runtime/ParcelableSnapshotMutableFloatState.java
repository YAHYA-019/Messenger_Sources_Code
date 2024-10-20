package androidx.compose.runtime;

import X.11T;
import X.7zM;
import X.AnonymousClass001;
import X.C2878Jbz;
import X.GOn;
import X.L2v;
import X.LEY;
import X.LGo;
import X.LNr;
import X.LO7;
import X.MED;
import X.MMx;
import X.MMy;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: ParcelableSnapshotMutableFloatState.class */
public final class ParcelableSnapshotMutableFloatState extends LO7 implements Parcelable, MMy, MMx {
    public static final Parcelable.Creator CREATOR = LGo.A00(15);
    public C2878Jbz A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Jbz, X.L2v] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.Jbz, X.L2v] */
    public ParcelableSnapshotMutableFloatState(float f) {
        ?? l2v = new L2v();
        l2v.A00 = f;
        if (LEY.A05.A01() != null) {
            ?? l2v2 = new L2v();
            l2v2.A00 = f;
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
        LNr lNr = LNr.A00;
        11T.A0I(lNr, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return lNr;
    }

    public void CZ0(L2v l2v) {
        11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.A00 = (C2878Jbz) l2v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MMy
    public void Cor(float f) {
        Snapshot A00;
        C2878Jbz c2878Jbz = (C2878Jbz) LEY.A07(this.A00);
        if (c2878Jbz.A00 != f) {
            C2878Jbz c2878Jbz2 = this.A00;
            synchronized (LEY.A07) {
                A00 = LEY.A00();
                ((C2878Jbz) LEY.A03(A00, this, c2878Jbz2, c2878Jbz)).A00 = f;
            }
            LEY.A0F(A00, this);
        }
    }

    @Override // X.MN4
    public /* bridge */ /* synthetic */ void Cvx(Object obj) {
        Cor(7zM.A00(obj));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.MN4
    public /* bridge */ /* synthetic */ Object getValue() {
        return Float.valueOf(L2v.A00(this));
    }

    public String toString() {
        C2878Jbz c2878Jbz = (C2878Jbz) LEY.A07(this.A00);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MutableFloatState(value=");
        A0k.append(c2878Jbz.A00);
        A0k.append(")@");
        return GOn.A1B(A0k, hashCode());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(L2v.A00(this));
    }
}
