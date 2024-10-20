package com.facebook.mig.scheme.schemes;

import X.C1p8;
import X.C2pq;
import X.MLS;
import com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme;

/* loaded from: DeuteranopiaColorScheme.class */
public final class DeuteranopiaColorScheme extends DelegatingMigColorScheme {
    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AVS() {
        return -8226920;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B6L() {
        return MLS.A01;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B86() {
        return -4408107;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B87() {
        return -11710987;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BIc() {
        return 2132607577;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Chx(C1p8 c1p8) {
        if (c1p8 instanceof C2pq) {
            int ordinal = ((C2pq) c1p8).ordinal();
            if (ordinal == 2) {
                return -8226920;
            }
            if (ordinal == 3) {
                return MLS.A01;
            }
            if (ordinal == 4) {
                return -4408107;
            }
            if (ordinal == 5) {
                return -11710987;
            }
        }
        return super.Chx(c1p8);
    }
}
