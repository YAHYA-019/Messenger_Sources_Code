package com.facebook.messaging.reactions.plugins.reactions.reactionsreactorsv1datahandler;

import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Mv;
import X.4YV;
import X.7zM;
import X.7zR;
import X.HgE;
import X.JD4;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: ReactionsReactorsV1DataHandlerImplementation.class */
public final class ReactionsReactorsV1DataHandlerImplementation {
    public ThreadCustomization A00;
    public ImmutableList A01;
    public ImmutableMap A02;
    public 1Mv A03;
    public final Context A04;
    public final 1Br A05;
    public final 1Br A06;
    public final ThreadSummary A07;
    public final HgE A08;
    public final JD4 A09;
    public final String A0A;
    public final boolean A0B;

    public ReactionsReactorsV1DataHandlerImplementation(Context context, ThreadCustomization threadCustomization, ThreadSummary threadSummary, HgE hgE, JD4 jd4, String str, boolean z) {
        7zR.A1N(context, hgE);
        4YV.A1M(str, 5, jd4);
        this.A04 = context;
        this.A07 = threadSummary;
        this.A08 = hgE;
        this.A00 = threadCustomization;
        this.A0A = str;
        this.A0B = z;
        this.A09 = jd4;
        this.A06 = 7zM.A0e(context);
        this.A05 = 1Bq.A00(66481);
        this.A01 = 1BK.A0b();
        this.A03 = new ArrayListMultimap();
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        11T.A0A(immutableMap);
        this.A02 = immutableMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01d7, code lost:
    
        if (r315 != null) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v64, types: [X.HGA, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.reactions.plugins.reactions.reactionsreactorsv1datahandler.ReactionsReactorsV1DataHandlerImplementation r301) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.plugins.reactions.reactionsreactorsv1datahandler.ReactionsReactorsV1DataHandlerImplementation.A00(com.facebook.messaging.reactions.plugins.reactions.reactionsreactorsv1datahandler.ReactionsReactorsV1DataHandlerImplementation):void");
    }
}
