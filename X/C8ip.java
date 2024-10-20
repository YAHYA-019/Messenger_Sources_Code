package X;

import com.facebook.litho.ComponentTree;
import java.util.List;

/* renamed from: X.8ip, reason: invalid class name */
/* loaded from: 8ip.class */
public final class C8ip extends 2Kb {
    public static final C2lk A07 = new C2lk(C29N.A00, A2d.A00, 15, true);
    public final 1LI A00;
    public final 1Im A01;
    public final 8CE A02;
    public final 8CE A03;
    public final C5eR A04;
    public final 5eX A05;
    public final List A06;

    public C8ip(1LI r302, 1Im r303, 8CE r304, 8CE r305, C5eR c5eR, 5eX r307, List list) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A06 = list;
        this.A04 = c5eR;
        this.A01 = r303;
        this.A02 = r304;
        this.A03 = r305;
        this.A05 = r307;
    }

    public C2lt A0s(2lX r302) {
        ComponentTree componentTree = (ComponentTree) 2rO.A00(r302, new AQU(r302, 39), 7zL.A1Z(r302));
        1Iw r0 = r302.A05;
        1LI r02 = this.A00;
        11T.A0D(componentTree);
        return new C2lt(null, new A2j(r02, r0, componentTree, this), 7zQ.A0r(r302, A07, new GBq(this, componentTree, 1)));
    }
}
