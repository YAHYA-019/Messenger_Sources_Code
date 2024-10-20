package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.presence.plugins.inboxperf.perflogging.PresencePerfLoggingImplementation;
import com.facebook.presence.requeststream.PresenceAmendmentAdditionalContacts;
import com.facebook.realtime.requeststream.streamref.NativeStream;
import com.facebook.user.model.User;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mB.class */
public final class C08214mB implements 1Y5, 1Xa {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final 1BP A0A = FbInjector.A00;
    public final 1Br A06 = 1Bq.A00(115562);
    public final 1Br A07 = 1Bq.A00(66115);
    public final 1Br A03 = 1Bq.A00(65837);
    public final 1Br A05 = 1Bq.A00(66302);
    public final 1YI A09 = 1YI.A00(FbInjector.A03);
    public final 1Br A08 = 1Bu.A00(68740);
    public final 1Br A04 = 1Bq.A00(16385);

    private final boolean A00(FbUserSession fbUserSession, 1Yn r303, 3El r304) {
        if (((C0t9) ((9PN) 1Br.A0B(this.A08)).A00.getValue()).A44) {
            if (this.A01) {
                return true;
            }
            this.A01 = true;
        }
        0fH.A0g(r304.name(), "PresenceRequestStreamTransport", "initiatePresenceRequest(pollingMode=%s)");
        1YI r0 = this.A09;
        1YN r02 = r0.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r03 = r02.A02;
        String A00 = 1BJ.A00(1175);
        String A002 = 1BJ.A00(1940);
        r03.A08(A00, A002, "markRSTransportInitStart", andIncrement);
        try {
            if (1YN.A00(r02)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r03.A0A("com.facebook.messaging.presence.plugins.inboxperf.perflogging.PresencePerfLoggingImplementation", "messaging.presence.inboxperf.perflogging.PresencePerfLoggingImplementation", A00, andIncrement2, A002, 1BJ.A00(1161), "markRSTransportInitStart");
                    try {
                        PresencePerfLoggingImplementation presencePerfLoggingImplementation = r02.A00;
                        1X2 r04 = (1X2) 1Lm.A05(presencePerfLoggingImplementation.A00, 1Fw.A04(PresencePerfLoggingImplementation.A00(presencePerfLoggingImplementation)), 66278);
                        synchronized (r04) {
                            1X2.A02(r04, "rs_transport_init_start", "rs_transport_init_start");
                        }
                        r03.A09("messaging.presence.inboxperf.perflogging.PresencePerfLoggingImplementation", A002, "markRSTransportInitStart", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r03.A04((Exception) null, "messaging.presence.inboxperf.perflogging.PresencePerfLoggingImplementation", A002, "markRSTransportInitStart", andIncrement2);
                    throw th;
                }
            }
            r03.A02((Exception) null, A002, "markRSTransportInitStart", andIncrement);
            if (((C1Y1) 1Br.A0B(this.A07)).A00() == 0S2.A0C) {
                5Cq r05 = (5Cq) 1Br.A0B(this.A05);
                if (1Br.A0B(r05.A00) != C0et.A0C && r05.A03 && !this.A00) {
                    1Bi.A03(66195);
                    this.A00 = true;
                }
            }
            C00i c00i = this.A04.A00;
            if (!1BK.A0M(c00i).AZk(36315580575524029L)) {
                r0.A05();
                boolean A01 = A01(fbUserSession, r303, r304, this);
                this.A01 = false;
                return A01;
            }
            0fH.A0l("PresenceRequestStreamTransport", "Scheduling presence initialization after cold start...");
            1QB r06 = (1QB) 1Bn.A0A(65841);
            1Qc r07 = (1Qc) 1Br.A0B(this.A03);
            r06.A02(new 3iN(fbUserSession, r303, r304, this));
            r06.A04("InitializeRequestStream");
            r06.A03 = "Other";
            r06.A03(2yD.A02(1BK.A0M(c00i), 36878530529002347L));
            r07.A03(r06.A01(), "KeepExisting");
            return true;
        } catch (Throwable th2) {
            r03.A02((Exception) null, A002, "markRSTransportInitStart", andIncrement);
            throw th2;
        }
    }

    public static final boolean A01(FbUserSession fbUserSession, 1Yn r302, 3El r303, C08214mB c08214mB) {
        boolean A01;
        try {
            0fH.A0h(r303.name(), "PresenceRequestStreamTransport", "initializePresenceRSManager(pollingMode=%s)");
            if (((C1Y1) 1Br.A0B(c08214mB.A07)).A00() != 0S2.A0C) {
                C3T4 c3t4 = (C3T4) 1Br.A0B(c08214mB.A06);
                11T.A0D(r302);
                synchronized (c3t4) {
                    try {
                        11T.A0G(fbUserSession, 0, r302);
                        A01 = C3T4.A01(fbUserSession, r302, r303, c3t4, false);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                boolean z = A01;
                c08214mB.A02 = true;
                return A01;
            }
            C3T4 c3t42 = (C3T4) 1Br.A0B(c08214mB.A06);
            11T.A0D(r302);
            synchronized (c3t42) {
                try {
                    11T.A0F(fbUserSession, 0);
                    11T.A0F(r302, 2);
                    A01 = C3T4.A01(fbUserSession, r302, r303, c3t42, true);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            boolean z2 = A01;
            c08214mB.A02 = true;
            return A01;
        } catch (2LD e) {
            0fH.A0r("PresenceRequestStreamTransport", "/maybeCreatePresenceRequestStream error", e);
            return false;
        }
    }

    public boolean AEA() {
        boolean z;
        synchronized (this) {
            if (this.A02) {
                C3T4 c3t4 = (C3T4) 1Br.A0B(this.A06);
                synchronized (c3t4) {
                    if (((5Cq) 1Br.A0B(c3t4.A05)).A00()) {
                        C3T4.A00(3El.A01, c3t4);
                        z = true;
                    } else {
                        z = c3t4.A02();
                    }
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean BPV(1Yn r302) {
        boolean A00;
        synchronized (this) {
            A00 = A00(1Fw.A06(1Bn.A0A(16428)), r302, 3El.A02);
        }
        return A00;
    }

    public boolean BPW(1Yn r302) {
        boolean A00;
        synchronized (this) {
            A00 = A00(1Fw.A06(1Bn.A0A(16428)), r302, 3El.A01);
        }
        return A00;
    }

    public boolean BT4() {
        boolean z;
        synchronized (this) {
            if (this.A02) {
                C3T4 c3t4 = (C3T4) 1Br.A0B(this.A06);
                synchronized (c3t4) {
                    z = AnonymousClass001.A1T(c3t4.A02);
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    public void Ch6(String str, List list) {
        synchronized (this) {
            if (this.A02) {
                C3T4 c3t4 = (C3T4) 1Br.A0B(this.A06);
                11T.A0D(list);
                11T.A0D(str);
                synchronized (c3t4) {
                    try {
                        if (c3t4.A02 == null) {
                            0fH.A0j(1BJ.A00(ActionId.BEGIN_START_ACTIVITY), "Skipping amendStream for additional contacts since stream is not initialized...");
                        } else {
                            ArrayList A0s = AnonymousClass001.A0s();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                A0s.add(String.valueOf(AnonymousClass001.A05(it.next())));
                            }
                            PresenceAmendmentAdditionalContacts presenceAmendmentAdditionalContacts = new PresenceAmendmentAdditionalContacts(str, A0s);
                            0fH.A0j(1BJ.A00(ActionId.BEGIN_START_ACTIVITY), "amendStream with additionalContacts");
                            ExecutorService executorService = (ExecutorService) 1Bn.A0A(16455);
                            if (c3t4.A07) {
                                NativeStream nativeStream = c3t4.A02;
                                11T.A0D(nativeStream);
                                byte[] A0b = AnonymousClass243.A00().A0b(presenceAmendmentAdditionalContacts);
                                11T.A0A(A0b);
                                ListenableFuture nativeAmendWithAck = nativeStream.nativeAmendWithAck(A0b, null);
                                final int i = 4;
                                1Kd.A0F(new 1K9(i) { // from class: X.31w
                                    public final int A00;

                                    {
                                        this.A00 = i;
                                    }

                                    public void onFailure(Throwable th) {
                                        switch (this.A00) {
                                            case 2:
                                                0fH.A0k(4tA.A03, "Failed to fetch custom font.");
                                                return;
                                            case 4:
                                                11T.A0F(th, 0);
                                                0fH.A0r("PresenceRequestStreamManager", "amendAck Exception", th);
                                                return;
                                            default:
                                                return;
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                                        switch (this.A00) {
                                            case 1:
                                                7KN.A01 = (User) obj;
                                                return;
                                            case 2:
                                                if (obj == null) {
                                                    0fH.A0k(4tA.A03, "Fetched custom font successfully but was null.");
                                                    return;
                                                }
                                                return;
                                            case 3:
                                            default:
                                                return;
                                            case 4:
                                                0fH.A0g(String.valueOf(obj), "PresenceRequestStreamManager", "amendAck Result: %s");
                                                return;
                                        }
                                    }
                                }, nativeAmendWithAck, executorService);
                            } else {
                                NativeStream nativeStream2 = c3t4.A02;
                                11T.A0D(nativeStream2);
                                byte[] A0b2 = AnonymousClass243.A00().A0b(presenceAmendmentAdditionalContacts);
                                11T.A0A(A0b2);
                                nativeStream2.amend(A0b2);
                            }
                        }
                    } catch (2LD e) {
                        0fH.A0r(1BJ.A00(ActionId.BEGIN_START_ACTIVITY), "[presence_bladerunner] Error amending stream.", e);
                    }
                }
            }
        }
    }

    public boolean Cxi() {
        return false;
    }

    public boolean isConnectedOrConnecting() {
        boolean z;
        synchronized (this) {
            if (this.A02) {
                C3T4 c3t4 = (C3T4) 1Br.A0B(this.A06);
                synchronized (c3t4) {
                    int i = c3t4.A00;
                    z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    public void onAppActive() {
        synchronized (this) {
        }
    }

    public void onAppPaused() {
    }

    public void onAppStopped() {
        synchronized (this) {
            0fH.A0g(Boolean.valueOf(this.A02 ? ((C3T4) 1Br.A0B(this.A06)).A02() : false), "PresenceRequestStreamTransport", "App has stopped: Cancelled presence stream. Result = %b");
        }
    }

    public void onDeviceActive() {
    }

    public void onDeviceStopped() {
    }
}
