package com.facebook.messaging.montage.omnistore;

import X.0S2;
import X.0WH;
import X.0fH;
import X.1BK;
import X.1BY;
import X.1Du;
import X.1G1;
import X.1Lo;
import X.2fE;
import X.4YT;
import X.6uX;
import X.7kF;
import X.9Yh;
import X.ACd;
import X.AbF;
import X.AbG;
import X.AbO;
import X.AnonymousClass001;
import X.BUS;
import X.BuZ;
import X.C00i;
import X.C2j0;
import X.C8H;
import X.CGU;
import X.CLy;
import X.CbD;
import X.H8S;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageOmnistoreDeltaHandler.class */
public final class MontageOmnistoreDeltaHandler {
    public boolean A00 = false;
    public final MontageOmnistoreCacheUpdater A01;
    public final 6uX A02;
    public final C00i A03;

    public MontageOmnistoreDeltaHandler(FbUserSession fbUserSession) {
        this.A01 = (MontageOmnistoreCacheUpdater) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 85182);
        this.A02 = (6uX) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 85200);
        this.A03 = AbF.A0A(fbUserSession, (1BY) null, 85189);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v249, types: [X.4dd, java.lang.Object] */
    public static void A00(MontageOmnistoreDeltaHandler montageOmnistoreDeltaHandler) {
        0fH.A0j("com.facebook.messaging.montage.omnistore.MontageOmnistoreDeltaHandler", "loading pending montage updates");
        try {
            C00i c00i = montageOmnistoreDeltaHandler.A03;
            CLy cLy = (CLy) c00i.get();
            C00i c00i2 = cLy.A01;
            if (1BK.A0U(c00i2).isMarkerOn(5505217)) {
                String A00 = 4YT.A00(420);
                if (CLy.A01(cLy)) {
                    1BK.A0U(c00i2).markerAnnotate(5505217, TraceFieldType.FailureReason, A00);
                    1BK.A0U(c00i2).markerEnd(5505217, (short) 4);
                    CLy.A00(cLy);
                    0fH.A0j("MontageOmnistoreDeltaTTILogger", "Omnistore loading has been canceled.");
                }
            } else {
                CLy.A00(cLy);
            }
            1BK.A0U(c00i2).markerStart(5505217);
            synchronized (cLy.A02) {
                try {
                    cLy.A00 = true;
                } catch (Throwable th) {
                    th = th;
                }
            }
            0fH.A0j("MontageOmnistoreDeltaTTILogger", "Omnistore loading start...");
            MontageOmnistoreCacheUpdater montageOmnistoreCacheUpdater = montageOmnistoreDeltaHandler.A01;
            synchronized (montageOmnistoreCacheUpdater) {
                try {
                    0WH r0 = new 0WH(0);
                    Iterator it = montageOmnistoreCacheUpdater.A00.iterator();
                    while (it.hasNext()) {
                        String A0i = AnonymousClass001.A0i(it);
                        6uX r02 = montageOmnistoreCacheUpdater.A0D;
                        Message A02 = r02.A02(A0i);
                        if (A02 != null) {
                            Set set = montageOmnistoreCacheUpdater.A02;
                            ThreadKey threadKey = A02.A0V;
                            threadKey.getClass();
                            set.add(1BK.A0w(threadKey));
                            BuZ A04 = r02.A04(threadKey.A04);
                            if (A04 != null) {
                                r0.add(A04.A03);
                            }
                        }
                        9Yh r03 = (9Yh) r02.A03.get();
                        r03.A01.writeLock().lock();
                        ACd aCd = r03.A00;
                        try {
                            Message A022 = r02.A02(A0i);
                            r02.A05.remove(A0i);
                            if (A022 != null) {
                                ThreadKey threadKey2 = A022.A0V;
                                threadKey2.getClass();
                                r02.A06(threadKey2.A04);
                            }
                            if (aCd != null) {
                                aCd.close();
                            }
                        } catch (Throwable th2) {
                            if (aCd != null) {
                                try {
                                    aCd.close();
                                } catch (Throwable th3) {
                                    7kF.A00(th2, th3);
                                }
                            }
                            throw th2;
                        }
                    }
                    C00i c00i3 = montageOmnistoreCacheUpdater.A09;
                    CLy cLy2 = (CLy) c00i3.get();
                    if (CLy.A01(cLy2)) {
                        1BK.A0U(cLy2.A01).markerPoint(5505217, "omni_db_load_start");
                    }
                    ImmutableList A03 = montageOmnistoreCacheUpdater.A0C.A03(0S2.A00, montageOmnistoreCacheUpdater.A02);
                    CLy cLy3 = (CLy) c00i3.get();
                    if (CLy.A01(cLy3)) {
                        1BK.A0U(cLy3.A01).markerPoint(5505217, "omni_db_load_end");
                    }
                    1Du it2 = A03.iterator();
                    while (it2.hasNext()) {
                        MontageOmnistoreCacheUpdater.A00(montageOmnistoreCacheUpdater, (C8H) it2.next());
                    }
                    if (!montageOmnistoreCacheUpdater.A02.isEmpty()) {
                        C2j0 c2j0 = (C2j0) montageOmnistoreCacheUpdater.A06.get();
                        ?? obj = new Object();
                        obj.A00 = "com.facebook.messaging.montage.omnistore.MontageOmnistoreCacheUpdater";
                        c2j0.A01(obj);
                    }
                    1G1 r04 = montageOmnistoreCacheUpdater.A04;
                    if (!r04.A07) {
                        String str = r04.A02;
                        HashSet A0v = AnonymousClass001.A0v();
                        1Du it3 = A03.iterator();
                        while (it3.hasNext()) {
                            ThreadKey A0D = AbO.A0D(BUS.A00((C8H) it3.next()), str);
                            if (((2fE) montageOmnistoreCacheUpdater.A05.get()).A06(A0D) != null) {
                                A0v.add(A0D);
                            }
                        }
                        Iterator it4 = r0.iterator();
                        while (it4.hasNext()) {
                            ThreadKey A0D2 = AbO.A0D(AbG.A0v(it4).id, str);
                            if (((2fE) montageOmnistoreCacheUpdater.A05.get()).A06(A0D2) != null) {
                                A0v.add(A0D2);
                            }
                        }
                        if (!A0v.isEmpty()) {
                            montageOmnistoreCacheUpdater.A0B.A0M((String) null, AnonymousClass001.A0Y(montageOmnistoreCacheUpdater), 1BK.A17(A0v));
                        }
                    }
                    Iterator it5 = montageOmnistoreCacheUpdater.A01.iterator();
                    while (it5.hasNext()) {
                        ((CbD) montageOmnistoreCacheUpdater.A0A.get()).A00((H8S) it5.next());
                    }
                    Iterator it6 = montageOmnistoreCacheUpdater.A00.iterator();
                    while (it6.hasNext()) {
                        ((CGU) ((CbD) montageOmnistoreCacheUpdater.A0A.get()).A05.get()).A00(AnonymousClass001.A0i(it6));
                    }
                    montageOmnistoreCacheUpdater.A02 = new 0WH(0);
                    montageOmnistoreCacheUpdater.A00 = new 0WH(0);
                    montageOmnistoreCacheUpdater.A01 = new 0WH(0);
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            }
            CLy cLy4 = (CLy) c00i.get();
            if (CLy.A01(cLy4)) {
                1BK.A0U(cLy4.A01).markerEnd(5505217, (short) 2);
                CLy.A00(cLy4);
                0fH.A0j("MontageOmnistoreDeltaTTILogger", "Omnistore data loaded with success.");
            }
        } catch (Throwable th5) {
            CLy cLy5 = (CLy) montageOmnistoreDeltaHandler.A03.get();
            String message = th5.getMessage();
            if (CLy.A01(cLy5)) {
                if (message != null) {
                    1BK.A0U(cLy5.A01).markerAnnotate(5505217, TraceFieldType.FailureReason, message);
                }
                1BK.A0U(cLy5.A01).markerEnd(5505217, (short) 3);
                CLy.A00(cLy5);
                0fH.A0g(message, "MontageOmnistoreDeltaTTILogger", "Omnistore loading failed. Error: %s");
            }
            0fH.A0w("com.facebook.messaging.montage.omnistore.MontageOmnistoreDeltaHandler", "Exception while pending montage updates", th5);
        }
    }
}
