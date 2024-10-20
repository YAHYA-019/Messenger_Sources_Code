package X;

import com.facebook.common.util.TriState;
import com.facebook.quicklog.MarkerEditor;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.LinkedList;

/* renamed from: X.4rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rm.class */
public final class C09824rm implements 4qU {
    public final boolean A00;
    public final /* synthetic */ C09814rl A01;
    public final /* synthetic */ C09814rl A02;

    public C09824rm(C09814rl c09814rl, boolean z) {
        this.A02 = c09814rl;
        this.A01 = c09814rl;
        this.A00 = z;
    }

    public Iterable B0L() {
        C09814rl c09814rl;
        LinkedList linkedList;
        C00i c00i;
        if (this.A00) {
            c09814rl = this.A01;
            if (c09814rl.A0E) {
                linkedList = new LinkedList(((2tY) 1Br.A0B(c09814rl.A04)).A02());
                c00i = c09814rl.A0A.A00;
                if (!((2yD) c00i.get()).AZk(36324110380912081L) || ((2yD) c00i.get()).AZk(36324110381043154L)) {
                    linkedList.remove("11042");
                }
                ImmutableList copyOf = ImmutableList.copyOf((Collection) linkedList);
                11T.A0A(copyOf);
                C09814rl c09814rl2 = this.A02;
                C04013zk c04013zk = c09814rl2.A0C;
                C04013zk.A01(c04013zk, copyOf, c04013zk.A00);
                MarkerEditor withMarker = c04013zk.A02.withMarker(716778457, c04013zk.A00);
                11T.A0D(withMarker);
                withMarker.point(C04023zl.A00(c04013zk.A03, "qp_graphql_batch_fetch_start", false, false));
                withMarker.markerEditingCompleted();
                C3sa A01 = ((C09954rz) c09814rl2.A07.A00.get()).A01(copyOf, false);
                ImmutableList of = ImmutableList.of((Object) new C4r6(TriState.UNSET, (C4r4) c09814rl2.A03.A00.get(), A01, null, "fetch_interstititals_graphql"));
                11T.A0A(of);
                return of;
            }
        }
        c09814rl = this.A01;
        linkedList = new LinkedList(((2tY) c09814rl.A04.A00.get()).A01());
        linkedList.remove("8148");
        linkedList.remove("10836");
        c00i = c09814rl.A0A.A00;
        if (!((2yD) c00i.get()).AZk(36324110380912081L)) {
        }
        linkedList.remove("11042");
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) linkedList);
        11T.A0A(copyOf2);
        C09814rl c09814rl22 = this.A02;
        C04013zk c04013zk2 = c09814rl22.A0C;
        C04013zk.A01(c04013zk2, copyOf2, c04013zk2.A00);
        MarkerEditor withMarker2 = c04013zk2.A02.withMarker(716778457, c04013zk2.A00);
        11T.A0D(withMarker2);
        withMarker2.point(C04023zl.A00(c04013zk2.A03, "qp_graphql_batch_fetch_start", false, false));
        withMarker2.markerEditingCompleted();
        C3sa A012 = ((C09954rz) c09814rl22.A07.A00.get()).A01(copyOf2, false);
        ImmutableList of2 = ImmutableList.of((Object) new C4r6(TriState.UNSET, (C4r4) c09814rl22.A03.A00.get(), A012, null, "fetch_interstititals_graphql"));
        11T.A0A(of2);
        return of2;
    }

    public void CA9(java.util.Map map) {
        11T.A0F(map, 0);
        2JX r0 = (2JX) map.get("fetch_interstititals_graphql");
        C09814rl c09814rl = this.A02;
        ImmutableList A00 = AbstractC10564tu.A00(r0, ((C0dp) c09814rl.A01.A00.get()).now());
        C04013zk c04013zk = c09814rl.A0C;
        MarkerEditor withMarker = c04013zk.A02.withMarker(716778457, c04013zk.A00);
        11T.A0D(withMarker);
        withMarker.point(C04023zl.A00(c04013zk.A03, "qp_graphql_batch_fetch_end", false, false));
        withMarker.markerEditingCompleted();
        C04013zk.A00(c04013zk, c04013zk.A00);
        if (A00 != null) {
            ((C2t1) this.A01.A05.A00.get()).A0V(A00);
        }
    }
}
