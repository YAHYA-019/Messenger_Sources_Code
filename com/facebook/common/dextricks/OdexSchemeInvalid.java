package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;

/* loaded from: OdexSchemeInvalid.class */
public final class OdexSchemeInvalid extends OdexScheme {
    public final long mStatus;

    public OdexSchemeInvalid(long j) {
        super(2, new String[0]);
        this.mStatus = j;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        throw AnonymousClass001.A0q(0Pz.A0W("invalid state: ", Long.toHexString(this.mStatus)));
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeInvalid";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        throw AnonymousClass001.A0q(0Pz.A0W("invalid state: ", Long.toHexString(this.mStatus)));
    }
}
