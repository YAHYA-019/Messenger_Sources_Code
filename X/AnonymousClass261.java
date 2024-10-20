package X;

import android.content.Context;
import com.facebook.advancedcryptotransport.ACTRegistrationDeviceIdProvider;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.messaging.lockbox.LockBoxStorageManager;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NotificationCenter;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.261, reason: invalid class name */
/* loaded from: 261.class */
public final class AnonymousClass261 {
    public static final AnonymousClass261 $redex_init_class = null;
    public 1Uc A00;
    public 1Uc A01;
    public 1Uc A02;
    public 1Uc A03;
    public 1Uc A04;
    public Set A05;
    public Context A06;
    public final int A07;
    public final C25z A08;
    public final C25r A09;
    public final AnonymousClass206 A0A;
    public final C25f A0B;
    public final AccountSession A0C;
    public final NotificationCenter A0E;
    public volatile boolean A0F = false;
    public volatile boolean A0G = false;
    public final RealtimeSinceBootClock A0D = RealtimeSinceBootClock.A00;

    static {
        C1z8.A00();
    }

    public AnonymousClass261(Context context, C25z c25z, C25r c25r, AnonymousClass206 anonymousClass206, C25f c25f, AccountSession accountSession, NotificationCenter notificationCenter, int i) {
        this.A0C = accountSession;
        this.A08 = c25z;
        this.A07 = i;
        this.A09 = c25r;
        this.A0A = anonymousClass206;
        this.A0E = notificationCenter;
        this.A0B = c25f;
        synchronized (AnonymousClass263.class) {
            if (AnonymousClass263.A00 == null) {
                01V r0 = new 01V(context);
                r0.A00 = 1;
                1Fi A00 = r0.A00().A00("AdvancedCryptoTransportPrefs");
                11T.A0A(A00);
                AnonymousClass263.A00 = A00;
            }
        }
        ACTRegistrationDeviceIdProvider.initialize(context);
        PlatformStorageProvider.initialize(context);
        LockBoxStorageManager.initialize(context);
        this.A06 = context;
    }

    public static Integer A00(String str) {
        if (str != null) {
            if (str.equals("Messenger")) {
                return 0S2.A01;
            }
            if (str.equals(7zK.A00(62))) {
                return 0S2.A0C;
            }
            if (str.equals("Facebook")) {
                return 0S2.A0N;
            }
            0fH.A17("AdvancedCryptoTransport", "unknown platform: %s", new Object[]{str});
        }
        return 0S2.A00;
    }

    public static String A01(String str, HashMap hashMap) {
        if (hashMap.get(str) != null) {
            return hashMap.get(str).toString();
        }
        return null;
    }

    public static void A02(AnonymousClass261 anonymousClass261, 2CB r302, SettableFuture settableFuture) {
        Integer num = r302.A00;
        if (num == 0S2.A0Y || (num == 0S2.A0j && r302.A01 == 0S2.A00)) {
            anonymousClass261.A0G = true;
        }
        settableFuture.set(r302);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public SettableFuture A03() {
        ?? obj = new Object();
        AnonymousClass206 anonymousClass206 = this.A0A;
        Cxe cxe = new Cxe(this, obj, 0);
        1Um AQV = anonymousClass206.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(cxe);
        if (!AQV.Cj2(new C3b5(mailboxFutureImpl, anonymousClass206, 11))) {
            mailboxFutureImpl.cancel(false);
        }
        return obj;
    }
}
