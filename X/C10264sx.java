package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;

/* renamed from: X.4sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4sx.class */
public final class C10264sx {
    public C21h A00;
    public C21h A01;
    public final 1De A02;
    public final 1Br A04 = 1Bq.A00(66630);
    public final 1Br A03 = 1Bq.A00(16511);
    public final Executor A05 = (Executor) 1Bi.A03(16467);

    public C10264sx(1De r302) {
        this.A02 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.List] */
    public static final ThreadSummary A00(Long l, String str, String str2, int i, long j, long j2) {
        C0ty c0ty;
        ThreadKey A0H = i != 2 ? i != 5 ? i != 201 ? i != 15 ? i != 16 ? ThreadKey.A0H(j, j2) : ThreadKey.A01(j) : ThreadKey.A02(j) : ThreadKey.A0F(j, j2) : ThreadKey.A0A(j) : ThreadKey.A08(j);
        C1zm c1zm = new C1zm();
        c1zm.A03(A0H);
        c1zm.A20 = str;
        c1zm.A0g = 1F9.A0I;
        if (str2 != null) {
            List A03 = new C04t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(str2, 0);
            if (!A03.isEmpty()) {
                ListIterator listIterator = A03.listIterator(A03.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        c0ty = 0QD.A0Y(A03, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            c0ty = C0ty.A00;
            String[] strArr = (String[]) c0ty.toArray(new String[0]);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (String str3 : strArr) {
                try {
                    Uri A032 = C0A2.A03(str3);
                    if (A032 != null) {
                        builder.m11011add((Object) A032);
                    }
                } catch (SecurityException unused) {
                }
            }
            ImmutableList build = builder.build();
            11T.A0A(build);
            if (build.size() == 1) {
                c1zm.A0V = (Uri) build.get(0);
            } else if (build.size() > 1) {
                if (i == 16) {
                    c1zm.A1F = build;
                } else {
                    c1zm.A1K = build;
                }
            }
        }
        if (l != null) {
            c1zm.A1f = l;
        }
        return new ThreadSummary(c1zm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, com.facebook.messaging.search.data.model.MessageSearchMatchRangesModel] */
    public static final ImmutableList A01(C10264sx c10264sx, String str, String str2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (str != null && str2 != null) {
            try {
                int parseInt = Integer.parseInt(str2);
                int parseInt2 = Integer.parseInt(str);
                ?? obj = new Object();
                obj.A00 = parseInt;
                obj.A01 = parseInt2;
                builder.m11011add((Object) obj);
            } catch (NumberFormatException unused) {
                ((C01s) c10264sx.A03.A00.get()).D0v(GOm.A00(40), "matchOffset or offsetLength has number format exception error");
            }
        }
        ImmutableList build = builder.build();
        11T.A0A(build);
        return build;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.ImmutableList$Builder] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, com.facebook.messaging.search.data.model.MessageSearchMatchRangesModel] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.util.List] */
    public static final ImmutableList A02(String str) {
        C0ty c0ty;
        ?? builder = ImmutableList.builder();
        if (str != null) {
            if (str.length() != 0) {
                List A03 = new C04t("\\s+").A03(str, 0);
                if (!A03.isEmpty()) {
                    ListIterator listIterator = A03.listIterator(A03.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            c0ty = 0QD.A0Y(A03, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                c0ty = C0ty.A00;
                String[] strArr = (String[]) c0ty.toArray(new String[0]);
                for (int i = 0; i < strArr.length; i += 4) {
                    if (Integer.parseInt(strArr[i]) == 5) {
                        int parseInt = Integer.parseInt(strArr[i + 3]);
                        int parseInt2 = Integer.parseInt(strArr[i + 2]);
                        ?? obj = new Object();
                        obj.A00 = parseInt;
                        obj.A01 = parseInt2;
                        builder.m11011add(obj);
                    }
                }
            }
        }
        ImmutableList build = builder.build();
        11T.A0A(build);
        return build;
    }

    public static final void A03(FbUserSession fbUserSession, C10264sx c10264sx) {
        ((1Uj) 1Lo.A04((Context) null, fbUserSession, c10264sx.A02.A00, 16686)).A06(new CzS(c10264sx, 6));
    }

    public static final void A04(FbUserSession fbUserSession, C10264sx c10264sx, int i) {
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "AdvancedCrypto", "2971616476299527");
        11T.A0A(newPrivacyContextNative);
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A07(fbUserSession, c10264sx.A02.A00, 67629);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Cxw(i, 5, mailboxFeature, mailboxFutureImpl, newPrivacyContextNative))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new MailboxCallback() { // from class: X.7ve
            @Override // com.facebook.msys.mca.MailboxCallback
            public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                0fH.A0m("ClearMessageTable: ", "Search result tables has been cleared out");
            }
        });
    }

    public static final void A05(C10264sx c10264sx, int i) {
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A07(((1Fv) 1Bi.A03(66351)).A04(), c10264sx.A02.A00, 82465);
        C10444tf c10444tf = new MailboxCallback() { // from class: X.4tf
            @Override // com.facebook.msys.mca.MailboxCallback
            public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                0fH.A0m(GOm.A00(40), "EB messages loading in progress");
            }
        };
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new A0E(i, 1, mailboxFeature, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(c10444tf);
    }

    public static final boolean A06() {
        boolean z = false;
        if (((C1wi) 1Bi.A03(68885)).A00() == C1wj.A03) {
            z = true;
        }
        return z;
    }

    public final void A07(FbUserSession fbUserSession, ThreadSummary threadSummary, DFP dfp, String str, long j, boolean z) {
        ThreadKey threadKey = threadSummary.A0n;
        if (!threadKey.A0z()) {
            throw 1BK.A0g();
        }
        if (str.length() == 0) {
            dfp.Bq7(1BK.A0b());
            return;
        }
        String valueOf = String.valueOf(threadKey.A0s());
        long j2 = threadKey.A01;
        C4t1 c4t1 = (C4t1) 1Lo.A04((Context) null, fbUserSession, this.A02.A00, 82465);
        Long valueOf2 = Long.valueOf(j2);
        1Um AQV = c4t1.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new IbC(c4t1, mailboxFutureImpl, valueOf2, str, j, z))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(this.A05, new Ib1(dfp, this, threadSummary, valueOf, 2));
    }

    public final void A08(FbUserSession fbUserSession, DFO dfo, String str, long j) {
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04((Context) null, fbUserSession, this.A02.A00, 82465);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Iaz(mailboxFeature, mailboxFutureImpl, str, 1, j))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(this.A05, new Cxn(8, fbUserSession, this, dfo));
    }

    public final void A09(FbUserSession fbUserSession, Long l, String str, String str2, int i) {
        if (str.length() != 0) {
            PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "AdvancedCrypto", "2971616476299527");
            11T.A0A(newPrivacyContextNative);
            if (str2 != null && this.A01 != null) {
                A03(fbUserSession, this);
            }
            C00683ob c00683ob = (C00683ob) 1Lo.A04((Context) null, fbUserSession, this.A02.A00, 67629);
            1Um AQV = c00683ob.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            if (!AQV.Cj2(new A1a(mailboxFutureImpl, newPrivacyContextNative, c00683ob, l, str, str2, i))) {
                mailboxFutureImpl.cancel(false);
            }
            mailboxFutureImpl.addResultCallback(new Cxm(i, 1, fbUserSession, this));
        }
    }

    public final void A0A(InterfaceC10284sz interfaceC10284sz) {
        11T.A0F(interfaceC10284sz, 0);
        ((C4t1) 1Lm.A07(((1Fv) 1Bi.A03(66351)).A04(), this.A02.A00, 82465)).A00().addResultCallback(new CzS(interfaceC10284sz, 7));
    }
}
