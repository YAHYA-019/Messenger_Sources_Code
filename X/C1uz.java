package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.capability.plugins.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1uz, reason: invalid class name */
/* loaded from: 1uz.class */
public final class C1uz {
    public Capabilities A00;
    public final 1Br A02 = 1Bu.A00(66799);
    public final 1Br A01 = 1Bq.A00(66798);
    public final 1BP A04 = FbInjector.A00;
    public final Set A03 = 02H.A02(new Integer[]{0, 1});

    public static final C1v1 A00() {
        1G1 A04 = ((1Fv) 1Bi.A03(66351)).A04();
        if (A04.A07) {
            return null;
        }
        return (C1v1) 1Lo.A04((Context) null, A04, (1BY) null, 66226);
    }

    public static final Capabilities A01(Capabilities capabilities) {
        Parcelable.Creator creator = Capabilities.CREATOR;
        ImmutableList of = ImmutableList.of((Object) capabilities);
        11T.A0A(of);
        C1v9 A00 = 1M7.A00(of);
        A00.A02(capabilities);
        1vB r0 = ((1vA) C1Y6.A00(FbInjector.A03, "com_facebook_messaging_capability_plugins_interfaces_accountcapabilitycomputation_AccountCapabilityComputationSpec", "All", new Object[]{A00})).A00;
        int andIncrement = C1Y6.A04.getAndIncrement();
        1YC r02 = r0.A00;
        r02.A08("com.facebook.messaging.capability.plugins.interfaces.accountcapabilitycomputation.AccountCapabilityComputationSpec", "messaging.capability.accountcapabilitycomputation.AccountCapabilityComputationSpec", "compute", andIncrement);
        r02.A02((Exception) null, "messaging.capability.accountcapabilitycomputation.AccountCapabilityComputationSpec", "compute", andIncrement);
        return new Capabilities(A00.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [X.1v7] */
    public final boolean A02(int i) {
        Capabilities capabilities;
        String str;
        C1v1 A00;
        C1v1 A002;
        Throwable th;
        C00i c00i = this.A02.A00;
        c00i.get();
        C1v1 A003 = A00();
        if (A003 != null) {
            this.A00 = null;
            UserKey userKey = (UserKey) 1Bn.A0A(83436);
            if (userKey != null && (str = userKey.id) != null && str.length() != 0 && (((A00 = A00()) == null || A00.A00 == null) && (A002 = A00()) != null)) {
                Context context = FbInjector.A03;
                String str2 = userKey.id;
                11T.A0A(str2);
                C1v4 c1v4 = new C1v4((C1v2) C1Y6.A00(context, "com_facebook_messaging_capability_plugins_interfaces_accountcapabilities_AccountCapabilityStoreSpec", "All", new Object[]{Long.valueOf(Long.parseLong(str2))}));
                C1v3 c1v3 = c1v4.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement = atomicInteger.getAndIncrement();
                1YC r0 = c1v3.A07;
                String str3 = "init";
                r0.A08("com.facebook.messaging.capability.plugins.interfaces.accountcapabilities.AccountCapabilityStoreSpec", "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement);
                Exception e = null;
                try {
                    C1v3.A00(c1v3);
                    if (C1v3.A01(c1v3)) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        try {
                            r0.A0A("com.facebook.messaging.capability.plugins.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation", "messaging.capability.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation", "com.facebook.messaging.capability.plugins.interfaces.accountcapabilities.AccountCapabilityStoreSpec", andIncrement2, "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", "com.facebook.messaging.capability.plugins.accountcapability.AccountCapabilityKillSwitch", str3);
                            try {
                                MsysAccountCapabilitiesStoreImplementation msysAccountCapabilitiesStoreImplementation = c1v3.A00;
                                Context context2 = c1v3.A06;
                                long j = c1v3.A05;
                                11T.A0F(context2, 0);
                                msysAccountCapabilitiesStoreImplementation.A00 = j;
                                FbUserSession A02 = 1Fw.A02(context2, (1BY) null);
                                C21S.A00(msysAccountCapabilitiesStoreImplementation.A03, (1Uj) 1Lm.A05(context2, A02, 16686));
                                AnonymousClass388 anonymousClass388 = (AnonymousClass388) 1Lm.A05(context2, A02, 84167);
                                msysAccountCapabilitiesStoreImplementation.A01 = anonymousClass388;
                                if (anonymousClass388 == null) {
                                    11T.A0L("mailboxAccountInformation");
                                    throw 0Q8.createAndThrow();
                                }
                                C3b1 c3b1 = new MailboxCallback() { // from class: X.3b1
                                    @Override // com.facebook.msys.mca.MailboxCallback
                                    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                                        0fH.A0j(7zK.A00(207), AnonymousClass001.A0Z(obj, "computeAccountCapabilities fetch success = ", AnonymousClass001.A0k()));
                                    }
                                };
                                1Um A0O = 1BK.A0O(anonymousClass388, 0);
                                MailboxFutureImpl A0Q = 1BK.A0Q(A0O, c3b1);
                                1Um.A02(A0O, new C3aq(0, j, anonymousClass388, A0Q), A0Q, false);
                                r0.A09("messaging.capability.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation", "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement2);
                                r0.A02((Exception) null, "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement);
                            } catch (Exception e2) {
                                throw e2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r0.A04((Exception) null, "messaging.capability.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation", "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement2);
                            throw th;
                        }
                    } else {
                        r0.A02((Exception) null, "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement);
                    }
                    ?? r02 = new Object() { // from class: X.1v7
                    };
                    andIncrement = atomicInteger.getAndIncrement();
                    str3 = "observeCapabilities";
                    r0.A08("com.facebook.messaging.capability.plugins.interfaces.accountcapabilities.AccountCapabilityStoreSpec", "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement);
                    C1v3.A00(c1v3);
                    if (C1v3.A01(c1v3)) {
                        int andIncrement3 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.capability.plugins.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation", "messaging.capability.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation", "com.facebook.messaging.capability.plugins.interfaces.accountcapabilities.AccountCapabilityStoreSpec", andIncrement3, "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", "com.facebook.messaging.capability.plugins.accountcapability.AccountCapabilityKillSwitch", str3);
                        try {
                            try {
                                c1v3.A00.A00(r02);
                                r0.A09("messaging.capability.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation", "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement3);
                                r0.A02((Exception) null, "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement);
                            } catch (Throwable th3) {
                                th = th3;
                                r0.A04(e, "messaging.capability.accountcapability.msysaccountcapabilitiesstore.MsysAccountCapabilitiesStoreImplementation", "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement3);
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            throw e;
                        }
                    } else {
                        r0.A02((Exception) null, "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement);
                    }
                    A002.A00 = c1v4;
                } catch (Throwable th4) {
                    r0.A02(e, "messaging.capability.accountcapabilities.AccountCapabilityStoreSpec", str3, andIncrement);
                    throw th4;
                }
            }
            capabilities = A003.A02;
            if (capabilities == null || !this.A03.contains(Integer.valueOf(((C1v8) 1Br.A0B(this.A01)).A00())) || !1Br.A07(((C1v0) c00i.get()).A00).AZk(36316113151207159L)) {
                capabilities = A003.A01;
                if (capabilities == null) {
                    capabilities = A01(((C1v8) this.A01.A00.get()).A01());
                }
                A003.A01 = capabilities;
            }
            return capabilities.A00.get(i);
        }
        capabilities = this.A00;
        if (capabilities == null) {
            capabilities = A01(((C1v8) this.A01.A00.get()).A01());
        }
        this.A00 = capabilities;
        11T.A0I(capabilities, "null cannot be cast to non-null type com.facebook.xapp.messaging.capability.vector.Capabilities");
        return capabilities.A00.get(i);
    }
}
