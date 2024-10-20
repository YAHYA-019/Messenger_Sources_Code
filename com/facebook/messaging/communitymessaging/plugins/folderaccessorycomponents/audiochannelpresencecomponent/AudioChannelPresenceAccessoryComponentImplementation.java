package com.facebook.messaging.communitymessaging.plugins.folderaccessorycomponents.audiochannelpresencecomponent;

import X.11T;
import X.1Iw;
import X.4MW;
import X.5Au;
import X.C1821Atu;
import X.C1rs;
import X.C8ix;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.BitSet;

/* loaded from: AudioChannelPresenceAccessoryComponentImplementation.class */
public final class AudioChannelPresenceAccessoryComponentImplementation {
    public final MigColorScheme A00;

    public AudioChannelPresenceAccessoryComponentImplementation(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    public final C8ix A00(1Iw r302, HeterogeneousMap heterogeneousMap) {
        if (heterogeneousMap.A00(4MW.A01) == null) {
            return null;
        }
        C1821Atu c1821Atu = new C1821Atu(r302, new C8ix());
        5Au r0 = new 5Au(this.A00);
        C8ix c8ix = c1821Atu.A01;
        c8ix.A00 = r0;
        BitSet bitSet = c1821Atu.A02;
        bitSet.set(0);
        C1rs.A01(bitSet, c1821Atu.A03);
        c1821Atu.A0J();
        return c8ix;
    }
}
