package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.563, reason: invalid class name */
/* loaded from: 563.class */
public final class AnonymousClass563 implements AnonymousClass544 {
    public final AXc A00;
    public final ImmutableList A01;
    public final long A02;
    public final MigColorScheme A03;

    public AnonymousClass563(AXc aXc, MigColorScheme migColorScheme, ImmutableList immutableList, long j) {
        11T.A0F(immutableList, 2);
        this.A02 = j;
        this.A01 = immutableList;
        this.A03 = migColorScheme;
        this.A00 = aXc;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        11T.A0F(anonymousClass544, 0);
        boolean z = false;
        if (!(anonymousClass544 instanceof AnonymousClass563)) {
            return false;
        }
        if (this.A02 == ((AnonymousClass563) anonymousClass544).A02) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A02;
    }
}
