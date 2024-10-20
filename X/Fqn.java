package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* loaded from: Fqn.class */
public final class Fqn implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((E8i) obj2).A08;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            recyclerView.A1B((2kG) it.next());
        }
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return !2Go.A00(((E8i) obj).A08, ((E8i) obj2).A08);
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((E8i) obj2).A08;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.A1C((2kG) it.next());
            }
        }
    }
}
