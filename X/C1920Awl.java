package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Awl, reason: case insensitive filesystem */
/* loaded from: Awl.class */
public final class C1920Awl extends 1LH {
    public final 5Op A00;

    public C1920Awl(5Op r302) {
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        5Op r02 = this.A00;
        ImmutableList immutableList = r02.A00.A01;
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            1BK.A1N(((BcK) it.next()).A00, A0z);
        }
        2rS A00 = 2rR.A00(r0);
        4YU.A1N(A00, 2RH.A05);
        4YU.A1M(A00, 2RH.A09);
        A00.A2a(5);
        A00.A2d(true);
        A00.A2Z(28.0f);
        A00.A2X(3.0f);
        A00.A0L();
        A00.A2c(new 2rQ(A0z, (List) null));
        A00.A2L(4YT.A00(1131));
        A00.A0d();
        A00.A2b(r02.A01);
        A0s.add(A00.A2W());
        return new C1rh(null, null, null, null, A0s, false);
    }
}
