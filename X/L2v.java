package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* loaded from: L2v.class */
public abstract class L2v {
    public int A00 = LEY.A00().A04();
    public L2v A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static float A00(ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState) {
        return ((C2878Jbz) LEY.A06(parcelableSnapshotMutableFloatState, parcelableSnapshotMutableFloatState.A00)).A00;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.Jbz, X.L2v] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.L2v, X.Jc0] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.L2v, X.Jc1] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.L2v, X.Jc2] */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.L2v, X.Jc3] */
    public L2v A01() {
        if (this instanceof C2882Jc3) {
            MRG mrg = ((C2882Jc3) this).A02;
            ?? l2v = new L2v();
            l2v.A02 = mrg;
            return l2v;
        }
        if (this instanceof C2881Jc2) {
            Object obj = ((C2881Jc2) this).A00;
            ?? l2v2 = new L2v();
            l2v2.A00 = obj;
            return l2v2;
        }
        if (this instanceof C2880Jc1) {
            long j = ((C2880Jc1) this).A00;
            ?? l2v3 = new L2v();
            l2v3.A00 = j;
            return l2v3;
        }
        if (this instanceof C2879Jc0) {
            int i = ((C2879Jc0) this).A00;
            ?? l2v4 = new L2v();
            l2v4.A00 = i;
            return l2v4;
        }
        if (!(this instanceof C2878Jbz)) {
            return new C2883Jc4();
        }
        float f = ((C2878Jbz) this).A00;
        ?? l2v5 = new L2v();
        l2v5.A00 = f;
        return l2v5;
    }

    public void A02(L2v l2v) {
        if (this instanceof C2882Jc3) {
            C2882Jc3 c2882Jc3 = (C2882Jc3) this;
            synchronized (Kwx.A00) {
                11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                C2882Jc3 c2882Jc32 = (C2882Jc3) l2v;
                c2882Jc3.A02 = c2882Jc32.A02;
                c2882Jc3.A00 = c2882Jc32.A00;
                c2882Jc3.A01 = c2882Jc32.A01;
            }
            return;
        }
        if (this instanceof C2881Jc2) {
            11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            ((C2881Jc2) this).A00 = ((C2881Jc2) l2v).A00;
            return;
        }
        if (this instanceof C2880Jc1) {
            11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            ((C2880Jc1) this).A00 = ((C2880Jc1) l2v).A00;
            return;
        }
        if (this instanceof C2879Jc0) {
            11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            ((C2879Jc0) this).A00 = ((C2879Jc0) l2v).A00;
        } else if (this instanceof C2878Jbz) {
            11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            ((C2878Jbz) this).A00 = ((C2878Jbz) l2v).A00;
        } else {
            C2883Jc4 c2883Jc4 = (C2883Jc4) this;
            11T.A0I(l2v, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            C2883Jc4 c2883Jc42 = (C2883Jc4) l2v;
            c2883Jc4.A03 = c2883Jc42.A03;
            c2883Jc4.A04 = c2883Jc42.A04;
            c2883Jc4.A00 = c2883Jc42.A00;
        }
    }
}
