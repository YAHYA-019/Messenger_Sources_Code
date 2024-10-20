package com.facebook.messaging.inboxsubtabs.plugins.subtabs.itemviewbinder;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Hb;
import X.1Iw;
import X.1SG;
import X.1Wl;
import X.2S4;
import X.2SO;
import X.2Wj;
import X.2Wm;
import X.2yD;
import X.3wJ;
import X.4YT;
import X.4aK;
import X.AnonymousClass001;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C0s8;
import X.C2iw;
import X.C2xn;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import java.util.List;
import java.util.Map;

/* loaded from: InboxSubtabsItemViewBinderImplementation.class */
public final class InboxSubtabsItemViewBinderImplementation {
    public 1Hb A00;
    public 3wJ A01;
    public final Context A02;
    public final 2S4 A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Iw A0E;
    public final C2iw A0F;
    public final C01i A0G;

    /* JADX WARN: Type inference failed for: r0v41, types: [X.2iw, java.lang.Object] */
    public InboxSubtabsItemViewBinderImplementation(2S4 r302, 1Iw r303) {
        11T.A0F(r303, 1);
        11T.A0F(r302, 2);
        this.A0E = r303;
        this.A03 = r302;
        Context context = r303.A0D;
        11T.A0A(context);
        this.A02 = context;
        this.A08 = 1Bq.A00(67264);
        this.A09 = 1Bq.A00(67265);
        this.A0C = 1Bq.A00(67266);
        this.A0A = 1Bq.A00(68669);
        this.A04 = 1Bq.A00(83479);
        this.A0B = 1Bq.A00(16385);
        this.A05 = 1Bu.A00(66416);
        this.A07 = 1Bq.A00(67267);
        this.A0D = 1Bu.A00(68383);
        this.A06 = 1Bq.A00(83482);
        this.A00 = 1Hb.A02;
        this.A0F = new Object();
        this.A0G = C01g.A01(new C2xn(this, 16));
    }

    public static final List A00(InboxSubtabsItemViewBinderImplementation inboxSubtabsItemViewBinderImplementation) {
        boolean z;
        1Hb[] r303;
        1Hb r302;
        1Hb r3022;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (1Wl.A01((1Wl) inboxSubtabsItemViewBinderImplementation.A0A.A00.get()).AZk(36321795394388768L)) {
            boolean z6 = true;
            boolean z7 = false;
            z = 2;
            if (((2yD) inboxSubtabsItemViewBinderImplementation.A0B.A00.get()).AZk(36324063135681945L)) {
                r303 = new 1Hb[3];
                r3022 = 1Hb.A02;
                z5 = z6;
                z4 = z7;
                r303[z4 ? 1 : 0] = r3022;
                r303[z5 ? 1 : 0] = 1Hb.A06;
                r303[z ? 1 : 0] = 1Hb.A0B;
            } else {
                r303 = new 1Hb[2];
                r302 = 1Hb.A02;
                z3 = z6;
                z2 = z7;
                r303[z2 ? 1 : 0] = r302;
                r303[z3 ? 1 : 0] = 1Hb.A06;
            }
        } else {
            boolean z8 = 2;
            boolean z9 = true;
            z = 3;
            if (1Br.A07(inboxSubtabsItemViewBinderImplementation.A0B).AZk(36324063135681945L)) {
                r303 = new 1Hb[4];
                r303[0] = 1Hb.A02;
                r3022 = 1Hb.A09;
                z5 = z8;
                z4 = z9;
                r303[z4 ? 1 : 0] = r3022;
                r303[z5 ? 1 : 0] = 1Hb.A06;
                r303[z ? 1 : 0] = 1Hb.A0B;
            } else {
                r303 = new 1Hb[3];
                r303[0] = 1Hb.A02;
                r302 = 1Hb.A09;
                z3 = z8;
                z2 = z9;
                r303[z2 ? 1 : 0] = r302;
                r303[z3 ? 1 : 0] = 1Hb.A06;
            }
        }
        return C0s8.A14(r303);
    }

    public static final void A01(2SO r301, InboxSubtabsItemViewBinderImplementation inboxSubtabsItemViewBinderImplementation, 1Hb r303) {
        int i;
        long currentTimeMillis;
        C00i c00i = inboxSubtabsItemViewBinderImplementation.A0C.A00;
        ((1SG) c00i.get()).A0R("thread_type_filter_changed");
        2Wm r0 = (2Wm) c00i.get();
        11T.A0F(r303, 0);
        1Hb r02 = 1Hb.A06;
        if (r303 == r02 || r303 == 1Hb.A09 || r303 == 1Hb.A02) {
            r0.A0E(283647363, 0);
            r0.A0G(1SG.A02(r0).currentMonotonicTimestamp());
            r0.A0Z("filter", r303.toString());
            if (r303 == 1Hb.A02) {
                r0.A0c("thread_list_rendered", true);
            } else {
                String str = "thread_list";
                if (r303 == 1Hb.A09) {
                    i = 1;
                    currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                } else if (r303 == r02) {
                    r0.A0T(str, ActionId.ACTION_BAR_COMPLETE, 0L);
                    boolean A1V = AnonymousClass001.A1V(((2Wj) 1Br.A0B(r0.A04)).A01.getValue());
                    r0.A0d("selective_sync_remediation_enabled", A1V);
                    if (A1V) {
                        r0.A0c(4YT.A00(76), false);
                    }
                    if (1Wl.A00(r0.A02.A00).AZk(36321795394323231L)) {
                        i = 122;
                        currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                        str = "chats_you_should_join_list";
                    }
                }
                r0.A0T(str, i, currentTimeMillis);
            }
            r0.A00 = r303;
            r0.A01 = false;
        }
        if (r303 == r02) {
            C00i c00i2 = inboxSubtabsItemViewBinderImplementation.A0A.A00;
            1Wl.A00(c00i2).Ba9(36321795395633958L);
            1Wl.A00(c00i2).Ba9(36321795396027178L);
        }
        r301.A00(r303);
        4aK.A00((4aK) 1Br.A0B(inboxSubtabsItemViewBinderImplementation.A08), r303, (Map) null, 1);
    }
}
