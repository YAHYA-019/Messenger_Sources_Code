package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;

/* loaded from: Fqk.class */
public final class Fqk implements 29I {
    /* JADX WARN: Type inference failed for: r309v1, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager, com.bloks.stdlib.components.bkcomponentscollection.BloksStaggeredGridLayoutManager] */
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = (RecyclerView) obj;
        Eg1 eg1 = ((E8i) obj2).A0C;
        if (eg1 instanceof E8u) {
            E8u e8u = (E8u) eg1;
            11T.A0F(context, 0);
            boolean z = e8u.A00;
            int i = ((Eg1) e8u).A00;
            LinearLayoutManager stickyHeadersLinearLayoutManager = z ? new StickyHeadersLinearLayoutManager(context, i) : new LinearLayoutManager(context, i, false);
            stickyHeadersLinearLayoutManager.A1v(e8u.A01);
            linearLayoutManager = stickyHeadersLinearLayoutManager;
        } else if (eg1 instanceof E8s) {
            E8s e8s = (E8s) eg1;
            ?? staggeredGridLayoutManager = new StaggeredGridLayoutManager(e8s.A00, ((Eg1) e8s).A00);
            staggeredGridLayoutManager.A00 = true;
            linearLayoutManager = staggeredGridLayoutManager;
        } else {
            E8t e8t = (E8t) eg1;
            11T.A0F(context, 0);
            linearLayoutManager = new GridLayoutManager(context, false, e8t.A00, ((Eg1) e8t).A00);
        }
        recyclerView.A1D(linearLayoutManager);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (r310 != r309) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ boolean Cyz(java.lang.Object r302, java.lang.Object r303, java.lang.Object r304, java.lang.Object r305) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fqk.Cyz(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((RecyclerView) obj).A1D(null);
    }
}
