package X;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* loaded from: Kx7.class */
public abstract class Kx7 {
    public static final Class[] A00 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean A00(Object obj) {
        boolean z = true;
        if (obj instanceof MMx) {
            MMx mMx = (MMx) obj;
            LNp B3o = mMx.B3o();
            LNp lNp = LNp.A00;
            11T.A0I(lNp, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
            if (B3o != lNp) {
                LNr B3o2 = mMx.B3o();
                LNr lNr = LNr.A00;
                11T.A0I(lNr, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
                if (B3o2 != lNr) {
                    LNq B3o3 = mMx.B3o();
                    LNq lNq = LNq.A00;
                    11T.A0I(lNq, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                    if (B3o3 != lNq) {
                        return false;
                    }
                }
            }
            Object value = mMx.getValue();
            if (value != null) {
                z = A00(value);
            }
        } else {
            if ((obj instanceof C00l) && (obj instanceof Serializable)) {
                return false;
            }
            Class[] clsArr = A00;
            int i = 0;
            while (!clsArr[i].isInstance(obj)) {
                i++;
                if (i >= 7) {
                    return false;
                }
            }
        }
        return z;
    }
}
