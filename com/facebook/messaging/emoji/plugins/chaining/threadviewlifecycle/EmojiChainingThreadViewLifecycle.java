package com.facebook.messaging.emoji.plugins.chaining.threadviewlifecycle;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2S4;
import X.6Fy;
import X.6G3;
import X.7zT;
import X.AQb;
import X.AnonymousClass622;
import X.AnonymousClass624;
import X.C01g;
import X.C01i;
import X.C1q8;
import X.C6G1;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.ListIterator;

/* loaded from: EmojiChainingThreadViewLifecycle.class */
public final class EmojiChainingThreadViewLifecycle {
    public boolean A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 2S4 A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 6G3 A06;
    public final C6G1 A07;
    public final 6Fy A08;
    public final C01i A09;

    public EmojiChainingThreadViewLifecycle(Context context, FbUserSession fbUserSession, 2S4 r304, 6G3 r305, C6G1 c6g1, 6Fy r307) {
        7zT.A1W(context, fbUserSession, r305, r307);
        1BL.A1G(c6g1, r304);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A06 = r305;
        this.A08 = r307;
        this.A07 = c6g1;
        this.A03 = r304;
        this.A09 = C01g.A01(AQb.A00(this, 34));
        this.A05 = 1Bq.A00(16822);
        this.A04 = 1Bu.A00(114753);
    }

    public static final int A00(ImmutableList immutableList) {
        ListIterator listIterator = immutableList.listIterator(immutableList.size());
        while (listIterator.hasPrevious()) {
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) listIterator.previous();
            11T.A0D(anonymousClass624);
            11T.A0F(anonymousClass624, 0);
            if (anonymousClass624 instanceof AnonymousClass622) {
                AnonymousClass622 anonymousClass622 = (AnonymousClass622) anonymousClass624;
                if (anonymousClass622.A00() == C1q8.A0N || anonymousClass622.A00() == C1q8.A0M) {
                    return listIterator.nextIndex();
                }
            }
        }
        return -1;
    }
}
