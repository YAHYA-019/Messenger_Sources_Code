package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: Fqj.class */
public final class Fqj implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        E8i e8i = (E8i) obj2;
        recyclerView.A16(e8i.A0D);
        recyclerView.A1A(null);
        Eg2 eg2 = e8i.A07;
        if (eg2 != null && eg2.A00 != null) {
            2XA r0 = recyclerView.A0F;
            r0.getClass();
            r0.A1N(e8i.A07.A00);
            return null;
        }
        int i = e8i.A03;
        if (i < 0) {
            return null;
        }
        recyclerView.A0u(i);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return 1BK.A1V(((E8i) obj).A0D, ((E8i) obj2).A0D);
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        Eg2 eg2 = ((E8i) obj2).A07;
        if (eg2 != null) {
            2XA r0 = recyclerView.A0F;
            r0.getClass();
            eg2.A00 = r0.A1D();
        }
        recyclerView.A16(null);
    }
}
