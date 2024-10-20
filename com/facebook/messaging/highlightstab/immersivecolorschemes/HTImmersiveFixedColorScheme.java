package com.facebook.messaging.highlightstab.immersivecolorschemes;

import X.11T;
import X.2dJ;
import X.C1p8;
import X.C1u7;
import X.C1ut;
import android.graphics.Color;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme;

/* loaded from: HTImmersiveFixedColorScheme.class */
public final class HTImmersiveFixedColorScheme extends DelegatingMigColorScheme implements HTImmersiveColorScheme {
    public final MigColorScheme A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTImmersiveFixedColorScheme(MigColorScheme migColorScheme) {
        super(migColorScheme);
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    @Override // com.facebook.mig.scheme.schemes.delegating.DelegatingMigColorScheme, com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Chx(C1p8 c1p8) {
        11T.A0F(c1p8, 0);
        boolean z = true;
        if (c1p8 != C1u7.A06 && c1p8 != 2dJ.A02) {
            z = false;
        }
        int i = -1;
        if (!z && c1p8 != C1u7.A08 && c1p8 != C1u7.A0A && c1p8 != C1u7.A0C) {
            if (c1p8 != C1ut.A08) {
                return super.A00.Chx(c1p8);
            }
            i = Color.parseColor("#66FFFFFF");
        }
        return i;
    }
}
