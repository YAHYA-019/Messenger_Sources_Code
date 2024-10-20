package X;

/* renamed from: X.760, reason: invalid class name */
/* loaded from: 760.class */
public final class AnonymousClass760 {
    public final 06Z A00;

    public AnonymousClass760(06Z r302) {
        this.A00 = r302;
    }

    public 6Nz A00() {
        6Nz A0b = this.A00.A0b("extension_container_fragment");
        if (A0b == null || !A0b.A1V()) {
            return null;
        }
        return A0b;
    }

    public void A01(final AXn aXn) {
        final 6Nz A00 = A00();
        if (A00 != null) {
            A00.A1X(new AXn(aXn, A00, this) { // from class: X.9v5
                public final AXn A00;
                public final 6Nz A01;
                public final /* synthetic */ AnonymousClass760 A02;

                {
                    this.A02 = this;
                    this.A01 = A00;
                    this.A00 = aXn;
                }

                @Override // X.AXn
                public void onSuccess() {
                    06Z r0 = this.A02.A00;
                    if (!r0.A0B) {
                        C06c A0G = 7zL.A0G(r0);
                        A0G.A0I(this.A01);
                        A0G.A05();
                    }
                    AXn aXn2 = this.A00;
                    if (aXn2 != null) {
                        aXn2.onSuccess();
                    }
                }
            });
        } else if (aXn != null) {
            aXn.onSuccess();
        }
    }
}
