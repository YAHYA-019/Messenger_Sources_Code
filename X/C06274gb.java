package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;

/* renamed from: X.4gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gb.class */
public final class C06274gb {
    public Huo A00;

    public final Huo A00() {
        Huo huo;
        synchronized (this) {
            huo = this.A00;
        }
        return huo;
    }

    public final Huo A01() {
        Huo huo;
        synchronized (this) {
            Context A00 = FbInjector.A00();
            11T.A0A(A00);
            String str = null;
            if (!AbstractC06294ge.A00(A00)) {
                0fH.A0n("HeraMessengerPluginManager", 0Pz.A1A("Hera is not enabled isReleaseBuild:", " mobileConfigEnabled:", false, false));
                if (this.A00 != null) {
                    0fH.A0n("HeraMessengerPluginManager", "Release existing Hera plugin");
                    Huo huo2 = this.A00;
                    if (huo2 != null) {
                        huo2.A02();
                    }
                    this.A00 = null;
                }
                return null;
            }
            1G1 A04 = ((1Fv) 1Bi.A03(66351)).A04();
            if (11T.A0O(A04, FbUserSession.A01)) {
                0fH.A0l("HeraMessengerPluginManager", "No logged in user");
                return null;
            }
            Huo huo3 = this.A00;
            if (huo3 != null) {
                Hz5 hz5 = huo3.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement = atomicInteger.getAndIncrement();
                1YC r0 = hz5.A03;
                String A002 = GOm.A00(59);
                String A003 = GOm.A00(70);
                r0.A08(A002, A003, "getFbUserSession", andIncrement);
                Exception e = null;
                try {
                    int i = hz5.A00;
                    if (i == -1) {
                        i = Hz5.A00(hz5) ? 1 : 0;
                        hz5.A00 = i;
                    }
                    ArrayList A0t = AnonymousClass001.A0t(i);
                    if (Hz5.A00(hz5)) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        String A004 = GOm.A00(58);
                        String A005 = GOm.A00(71);
                        r0.A0A(A004, A005, A002, andIncrement2, A003, GOm.A00(57), "getFbUserSession");
                        try {
                            try {
                                A0t.add(hz5.A01.A00);
                                r0.A09(A005, A003, "getFbUserSession", andIncrement2);
                            } catch (Throwable th) {
                                r0.A04(e, A005, A003, "getFbUserSession", andIncrement2);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            throw e;
                        }
                    }
                    while (true) {
                        int size = A0t.size();
                        int i2 = hz5.A00;
                        if (i2 == -1) {
                            i2 = Hz5.A00(hz5) ? 1 : 0;
                            hz5.A00 = i2;
                        }
                        if (size >= i2) {
                            break;
                        }
                        A0t.add(null);
                    }
                    r0.A02((Exception) null, A003, "getFbUserSession", andIncrement);
                    1G1 r02 = (FbUserSession) 0QD.A0E(A0t);
                    if (r02 != null) {
                        str = r02.A02;
                    }
                    if (11T.A0O(str, A04.A02)) {
                        0fH.A0j("HeraMessengerPluginManager", "Plugin is already loaded or loading in progress.");
                        huo = this.A00;
                        return huo;
                    }
                } catch (Throwable th2) {
                    r0.A02(e, A003, "getFbUserSession", andIncrement);
                    throw th2;
                }
            }
            0fH.A0l("HeraMessengerPluginManager", "Loading Hera plugin");
            if (this.A00 != null) {
                0fH.A0l("HeraMessengerPluginManager", "Hera plugin already loaded, release old Hera plugin first");
                Huo huo4 = this.A00;
                if (huo4 != null) {
                    huo4.A02();
                }
            } else {
                this.A00 = new Huo((HPc) C1Y6.A00(FbInjector.A00(), "com_facebook_messaging_wearable_plugins_interfaces_hera_HeraMessengerPluginInterfaceSpec", "All", AnonymousClass001.A1Z()));
            }
            Huo huo5 = this.A00;
            if (huo5 != null) {
                Hz5 hz52 = huo5.A00.A00;
                AtomicInteger atomicInteger2 = C1Y6.A04;
                int andIncrement3 = atomicInteger2.getAndIncrement();
                1YC r03 = hz52.A03;
                String A006 = GOm.A00(59);
                String A007 = GOm.A00(70);
                r03.A08(A006, A007, "initialize", andIncrement3);
                try {
                    int i3 = hz52.A00;
                    if (i3 == -1) {
                        i3 = Hz5.A00(hz52) ? 1 : 0;
                        hz52.A00 = i3;
                    }
                    ArrayList A0t2 = AnonymousClass001.A0t(i3);
                    if (Hz5.A00(hz52)) {
                        int andIncrement4 = atomicInteger2.getAndIncrement();
                        String A008 = GOm.A00(58);
                        String A009 = GOm.A00(71);
                        try {
                            r03.A0A(A008, A009, A006, andIncrement4, A007, GOm.A00(57), "initialize");
                            try {
                                HeraMessengerPluginImplementation heraMessengerPluginImplementation = hz52.A01;
                                11T.A0F(A04, 0);
                                C2aj A03 = 2aK.A03((Integer) null, 2Zo.A00(), new AJX(A04, heraMessengerPluginImplementation, (0DR) null, 7), heraMessengerPluginImplementation.A0U, 2);
                                CompletableFuture completableFuture = new CompletableFuture();
                                completableFuture.handle((BiFunction) new J5d(A03));
                                A03.BQH(new GBo(completableFuture, 34));
                                A0t2.add(completableFuture);
                                r03.A09(A009, A007, "initialize", andIncrement4);
                            } catch (Exception e3) {
                                throw e3;
                            }
                        } catch (Throwable th3) {
                            r03.A04((Exception) null, A009, A007, "initialize", andIncrement4);
                            throw th3;
                        }
                    }
                    while (true) {
                        int size2 = A0t2.size();
                        int i4 = hz52.A00;
                        if (i4 == -1) {
                            i4 = Hz5.A00(hz52) ? 1 : 0;
                            hz52.A00 = i4;
                        }
                        if (size2 >= i4) {
                            break;
                        }
                        A0t2.add(null);
                    }
                    r03.A02((Exception) null, A007, "initialize", andIncrement3);
                } catch (Throwable th4) {
                    r03.A02((Exception) null, A007, "initialize", andIncrement3);
                    throw th4;
                }
            }
            huo = this.A00;
            return huo;
        }
    }
}
