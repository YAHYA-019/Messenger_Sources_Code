package com.facebook.mig.scheme.schemes;

import X.C1p8;
import X.C2pq;
import X.MLS;
import com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme;

/* loaded from: ProtanopiaColorScheme.class */
public final class ProtanopiaColorScheme extends DelegatingMigColorScheme {
    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AVS() {
        return -7697518;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B6L() {
        return MLS.A02;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B86() {
        return -4541222;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B87() {
        return -12107537;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BIc() {
        return 2132607578;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Chx(C1p8 c1p8) {
        if (c1p8 instanceof C2pq) {
            int ordinal = ((C2pq) c1p8).ordinal();
            if (ordinal == 2) {
                return -7697518;
            }
            if (ordinal == 3) {
                return MLS.A02;
            }
            if (ordinal == 4) {
                return -4541222;
            }
            if (ordinal == 5) {
                return -12107537;
            }
        }
        return super.Chx(c1p8);
    }
}
