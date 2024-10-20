package X;

import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Cr6.class */
public final class Cr6 implements DFi {
    public final /* synthetic */ 2Ok A00;

    public Cr6(2Ok r302) {
        this.A00 = r302;
    }

    @Override // X.DFi
    public void Cfa(ByH byH, ImmutableList immutableList, ImmutableList immutableList2) {
        C2kV c2kV;
        2Ok r0 = this.A00;
        if (1JF.A0B(r0.A08)) {
            r0.A03.setVisibility(4);
            r0.A04.setVisibility(0);
            return;
        }
        LithoView lithoView = r0.A03;
        C00i c00i = r0.A0D;
        MigColorScheme.A00(lithoView, AbF.A0p(c00i));
        1Iw r02 = r0.A03.A09;
        if (immutableList.isEmpty()) {
            C2ki A00 = C2kV.A00(r02);
            2hP A0I = 2hO.A0I(new C1qb(r02));
            8T6 A002 = C8mg.A00(r02);
            A002.A2X(AbF.A0p(c00i));
            A002.A2Y(r0.A08);
            A002.A01.A04 = true;
            A002.A1C(30.0f);
            7zO.A1G(A002, 4YU.A0E(r02).getBoolean(2131034116) ? 2RH.A06 : 2RH.A04);
            A0I.A05(A002.A2W());
            A00.A01.A0L = A0I.A01();
            A00.A02.set(0);
            A00.A2Z(r0.A0C);
            A00.A2j(true);
            c2kV = A00.A2W();
        } else {
            8T0 A003 = 8mB.A00(r02);
            A003.A2Y(immutableList);
            A003.A01.A02 = r0.A0C;
            A003.A0R();
            A003.A0J();
            c2kV = A003.A01;
        }
        LithoView lithoView2 = r0.A03;
        ComponentTree componentTree = lithoView2.A00;
        if (componentTree == null) {
            AbN.A19(c2kV, r02, lithoView2);
        } else {
            componentTree.A0O(c2kV);
        }
        if (r0.A03.getVisibility() == 4) {
            r0.A03.setVisibility(0);
            r0.A04.setVisibility(4);
        }
    }
}
