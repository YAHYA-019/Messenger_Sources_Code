package com.facebook.messaging.friendsinboxunit.plugins.closeconnectionsloader.implementation;

import X.04S;
import X.0QO;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1ED;
import X.1JU;
import X.1Kd;
import X.1Lm;
import X.1Wc;
import X.1X2;
import X.2T5;
import X.2TI;
import X.2TJ;
import X.2TX;
import X.2Te;
import X.2Tn;
import X.2xR;
import X.C00i;
import X.C04r;
import X.C1A3;
import X.C1F6;
import X.C2xd;
import X.C2xf;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: CloseConnectionsInboxUnitLoaderImplementation.class */
public final class CloseConnectionsInboxUnitLoaderImplementation {
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 2TX A08;
    public final 2TJ A09;
    public final 2Te A0A;
    public final boolean A0B;

    public CloseConnectionsInboxUnitLoaderImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A03 = 1Lm.A00(context, fbUserSession, 17028);
        this.A01 = 1Bq.A00(66542);
        this.A02 = 1Bu.A00(65819);
        this.A06 = 1Bq.A00(65723);
        this.A05 = 1Lm.A00(context, fbUserSession, 66278);
        this.A07 = 1Bq.A00(66439);
        1Br A00 = 1Bu.A00(66725);
        this.A04 = A00;
        this.A0B = ((2TI) A00.A00.get()).A03();
        this.A09 = ((C2xd) 1Bn.A0A(1123)).A0G(context, fbUserSession);
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 1124);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.A00.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            2TX r0 = new 2TX(context, fbUserSession, new 1De(c1f6, new int[0]));
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A08 = r0;
            1Bn.A0A(66512);
            this.A0A = new 2Te(context, fbUserSession);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [X.0QO, X.04r, java.util.Map] */
    public static final void A00(2T5 r301, CloseConnectionsInboxUnitLoaderImplementation closeConnectionsInboxUnitLoaderImplementation, ImmutableList immutableList, boolean z) {
        User user;
        synchronized (closeConnectionsInboxUnitLoaderImplementation) {
            if (!z) {
                C00i c00i = closeConnectionsInboxUnitLoaderImplementation.A05.A00;
                1X2 r307 = (1X2) c00i.get();
                synchronized (r307) {
                    try {
                        1X2.A02(r307, "close_connection_contact_load_end", "close_connection_contact_load_end");
                    } catch (Throwable th) {
                        1X2 r0 = r307;
                        throw th;
                    }
                }
                r307 = (1X2) c00i.get();
                synchronized (r307) {
                    1X2.A02(r307, "cc_process_result_start", "cc_process_result_start");
                }
                ((1Wc) closeConnectionsInboxUnitLoaderImplementation.A07.A00.get()).A0K("inbox_tray/process_cc/start");
            }
            if (immutableList != null) {
                ?? r02 = new 0QO(0);
                ArrayList arrayList = new ArrayList(C1A3.A1D(immutableList, 10));
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof User) {
                        user = (User) next;
                    } else {
                        11T.A0I(next, "null cannot be cast to non-null type com.facebook.presence.api.model.RichStatusWithUserInfo");
                        user = (User) ((C2xf) next).A02;
                    }
                    r02.put(user.A13, next);
                    arrayList.add(04S.A00);
                }
                0fH.A0g(Boolean.valueOf(z), "CloseConnectionsInboxUnitLoaderImplementation", "rankByCloseConnectionScore start, isNotes=%s");
                final ImmutableList copyOf = ImmutableList.copyOf((Collection) r02.keySet());
                11T.A0A(copyOf);
                final 2Tn r03 = (2Tn) closeConnectionsInboxUnitLoaderImplementation.A03.A00.get();
                1ED r04 = (1ED) r03.A01.get();
                final int i = 1;
                ListenableFuture D3C = r04.D3C(new Callable(copyOf, r03, i) { // from class: X.3is
                    public final int A00;
                    public final Object A01;
                    public final Object A02;

                    {
                        this.A00 = i;
                        this.A01 = r03;
                        this.A02 = copyOf;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:75:0x02a5, code lost:
                    
                        if (r0.equals(r0) == false) goto L61;
                     */
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x0193  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x01b8  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x02f8  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0303  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public /* bridge */ /* synthetic */ java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 992
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C3is.call():java.lang.Object");
                    }
                });
                11T.A0A(D3C);
                1Kd.A0F(new 2xR((C04r) r02, r301, closeConnectionsInboxUnitLoaderImplementation, z), D3C, 1JU.A01);
            }
        }
    }
}
