package com.facebook.messaging.magicwords.plugins.consumption.composertextwatcher2;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2S4;
import X.3Lh;
import X.4YU;
import X.6Qb;
import X.6fA;
import android.content.Context;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: MagicWordsTextWatcher2.class */
public final class MagicWordsTextWatcher2 {
    public int A00;
    public 3Lh A01;
    public Integer A02;
    public String A03;
    public final 2S4 A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 6Qb A08;
    public final Context A09;

    public MagicWordsTextWatcher2(Context context, 2S4 r303, 6Qb r304) {
        1BL.A1H(r304, r303, context);
        this.A08 = r304;
        this.A04 = r303;
        this.A09 = context;
        this.A05 = 1Bu.A00(68554);
        this.A06 = 1Bq.A00(66467);
        this.A07 = 1Bq.A00(67770);
        this.A00 = -1;
    }

    public static final boolean A00(MagicWordsTextWatcher2 magicWordsTextWatcher2) {
        Capabilities capabilities;
        6fA r0 = magicWordsTextWatcher2.A08.A00.A0H;
        if (r0 == null || (capabilities = r0.A05) == null) {
            return false;
        }
        return 4YU.A1Y(capabilities, 80);
    }
}
