package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Mcd, reason: case insensitive filesystem */
/* loaded from: Mcd.class */
public final class C3420Mcd extends C23s implements MQD {
    public C3420Mcd() {
        super(-1940252948);
    }

    public C3420Mcd(int i) {
        super(i);
    }

    public MPM AVr() {
        return A05(McY.class, "additional_authentication_error", 1);
    }

    public ImmutableList Ae8() {
        return A09("container_list", McZ.class, 0);
    }

    public MPN AkJ() {
        return A05(C3417Mca.class, "error", 2);
    }

    public MPP AzI() {
        return A05(C3419Mcc.class, "non_auth_step_up_error", 3);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRw.A09(MRw.A01(), MRw.A00(), MRw.A00());
    }
}
