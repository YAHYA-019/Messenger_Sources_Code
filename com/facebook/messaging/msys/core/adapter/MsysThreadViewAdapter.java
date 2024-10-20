package com.facebook.messaging.msys.core.adapter;

import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Lo;
import X.1MV;
import X.2Iq;
import X.C00i;
import X.C07764kq;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashMap;
import java.util.Map;

/* loaded from: MsysThreadViewAdapter.class */
public final class MsysThreadViewAdapter {
    public 1BY A00;
    public final C00i A03;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0D;
    public final C00i A0F;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A0H = new 1BV((1BY) null, 16671);
    public final C00i A08 = new 1BQ(16680);
    public final C00i A01 = new 1BQ(16960);
    public final C00i A0E = new 1BQ(66213);
    public final C00i A04 = new 1BQ(85048);
    public final C00i A0G = new 1BQ(85046);
    public final C00i A06 = new 1BQ(85050);
    public final C00i A05 = new 1BV((1BY) null, 67566);
    public final C00i A0C = new 1BQ(66584);
    public final C00i A02 = new 1BQ(16448);
    public final C00i A07 = new 1BQ(16385);
    public final Map A0L = new HashMap();
    public final Map A0K = new HashMap();

    public MsysThreadViewAdapter(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A03 = new 1MV(fbUserSession, (1BY) null, 84153);
        this.A0I = new 1MV(fbUserSession, (1BY) null, 49763);
        this.A0J = new 1MV(fbUserSession, (1BY) null, 16888);
        this.A0D = new 1MV(fbUserSession, (1BY) null, 49840);
        this.A0F = new 1MV(fbUserSession, (1BY) null, 16886);
        this.A0B = new 1MV(fbUserSession, (1BY) null, 17061);
        this.A0A = new 1MV(fbUserSession, (1BY) null, 49711);
        this.A09 = new 1MV(fbUserSession, (1BY) null, 68921);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x016e, code lost:
    
        if (X.1Ux.A00((X.1Ux) r301.A0C.get()).AZk(36318698721653675L) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0245, code lost:
    
        if (r0 == X.C1yg.MARKETPLACE) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x032d, code lost:
    
        if (X.1Ux.A00((X.1Ux) r0.get()).AZk(36323607871834929L) != false) goto L48;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1FX, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.SettableFuture A00(com.facebook.messaging.model.threadkey.ThreadKey r302, X.1UV r303) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.core.adapter.MsysThreadViewAdapter.A00(com.facebook.messaging.model.threadkey.ThreadKey, X.1UV):com.google.common.util.concurrent.SettableFuture");
    }

    public void A01(ThreadKey threadKey) {
        C07764kq c07764kq;
        synchronized (this) {
            Map map = this.A0L;
            synchronized (map) {
                this.A0K.remove(threadKey);
                c07764kq = (C07764kq) map.remove(threadKey);
            }
            if (c07764kq != null) {
                2Iq r0 = (2Iq) this.A01.get();
                StringBuilder sb = new StringBuilder();
                sb.append("msys_thread_unregister:");
                sb.append(threadKey.A06);
                r0.A01(sb.toString());
                c07764kq.D5r();
            }
        }
    }
}
