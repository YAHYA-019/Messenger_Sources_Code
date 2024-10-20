package com.facebook.messaging.montage.store.converter;

import X.1BK;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Du;
import X.1G1;
import X.1HU;
import X.1Hv;
import X.4YU;
import X.60V;
import X.AbN;
import X.BKZ;
import X.Bpz;
import X.C00i;
import X.C5b0;
import X.C5pv;
import X.C8H;
import X.CAl;
import X.H8S;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.MontageBucketInfo;
import com.google.common.collect.ImmutableList;

/* loaded from: MontageFBConverter.class */
public final class MontageFBConverter {
    public final FbUserSession A00;
    public final C00i A02 = 1BQ.A01();
    public final MontageMessageFBConverter A04 = (MontageMessageFBConverter) 1Bn.A0E(FbInjector.A00(), (1BY) null, 116037);
    public final Bpz A03 = (Bpz) 1Bn.A0E(FbInjector.A00(), (1BY) null, 85187);
    public final C00i A01 = 1BV.A00(85186);
    public final 60V A05 = (60V) 1Hv.A02(FbInjector.A00(), 66579);

    public MontageFBConverter(FbUserSession fbUserSession) {
        this.A00 = fbUserSession;
    }

    public Message A00(H8S h8s) {
        this.A01.get();
        FbUserSession fbUserSession = this.A00;
        h8s.getClass();
        h8s.A0E().getClass();
        return this.A04.A0H(fbUserSession, CAl.A00(fbUserSession, h8s.A0E()), h8s);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.1HU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r313v4, types: [X.1HU, java.lang.Object] */
    public MontageBucketInfo A01(C8H c8h) {
        ImmutableList of;
        String str;
        String A0m;
        1HU r313;
        ImmutableList build = ImmutableList.builder().build();
        C00i c00i = this.A01;
        c00i.get();
        FbUserSession fbUserSession = this.A00;
        BKZ bkz = c8h.A00;
        ThreadKey A00 = CAl.A00(fbUserSession, bkz);
        try {
            MontageMessageFBConverter montageMessageFBConverter = this.A04;
            ImmutableList immutableList = c8h.A01;
            ImmutableList.Builder A0h = 4YU.A0h();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                Message A0H = montageMessageFBConverter.A0H(fbUserSession, A00, (H8S) it.next());
                if (!montageMessageFBConverter.A02.A0G(A0H)) {
                    A0h.m11011add((Object) A0H);
                }
            }
            ImmutableList reverse = A0h.build().reverse();
            C5pv c5pv = new C5pv();
            c5pv.A00 = A00;
            c5pv.A01(reverse);
            c5pv.A03 = true;
            of = c5pv.A00().A01.reverse();
        } catch (Exception e) {
            1BK.A09(this.A02).softReport("com.facebook.messaging.montage.store.converter.MontageFBConverter", e.getMessage(), e);
            of = ImmutableList.of();
        }
        C5b0 c5b0 = new C5b0();
        c5b0.A01(this.A05.A0E(of));
        c00i.get();
        ?? obj = new Object();
        int A03 = bkz.A03();
        if (A03 != 0) {
            AbN.A1S(bkz, (1HU) obj, A03);
            ?? obj2 = new Object();
            int A04 = obj.A04();
            if (A04 != 0) {
                AbN.A1S((1HU) obj, (1HU) obj2, A04);
                r313 = obj2;
            } else {
                r313 = null;
            }
            r313.getClass();
            str = AbN.A0m(r313, r313.A04());
            str.getClass();
        } else {
            str = "";
        }
        if (str.equals(((1G1) fbUserSession).A02)) {
            AbN.A0m(bkz, bkz.A05()).getClass();
            A0m = AbN.A0m(bkz, bkz.A05());
        } else {
            AbN.A0m(bkz, bkz.A06()).getClass();
            A0m = AbN.A0m(bkz, bkz.A06());
        }
        c5b0.A01 = Long.parseLong(A0m);
        c5b0.A00 = AbN.A02(bkz, bkz.A04());
        c5b0.A00(build);
        return new MontageBucketInfo(c5b0);
    }
}
