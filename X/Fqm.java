package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: Fqm.class */
public final class Fqm implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        3wX r0 = ((E8i) obj2).A06;
        if (r0 == null) {
            return null;
        }
        r0.A05(recyclerView);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return !2Go.A00(((E8i) obj).A06, ((E8i) obj2).A06);
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        3wX r0 = ((E8i) obj2).A06;
        if (r0 != null) {
            r0.A05((RecyclerView) null);
        }
    }
}
