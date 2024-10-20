package com.facebook.mig.scheme.schemes;

import X.C1p8;
import X.C2pq;
import X.MLS;
import com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme;

/* loaded from: TritanopiaColorScheme.class */
public final class TritanopiaColorScheme extends DelegatingMigColorScheme {
    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AVS() {
        return -12546669;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B6L() {
        return MLS.A00;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B86() {
        return -4406590;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B87() {
        return -14888500;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BIc() {
        return 2132607579;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Chx(C1p8 c1p8) {
        if (c1p8 instanceof C2pq) {
            int ordinal = ((C2pq) c1p8).ordinal();
            if (ordinal == 2) {
                return -12546669;
            }
            if (ordinal == 3) {
                return MLS.A00;
            }
            if (ordinal == 4) {
                return -4406590;
            }
            if (ordinal == 5) {
                return -14888500;
            }
        }
        return super.Chx(c1p8);
    }
}
