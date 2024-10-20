package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.17u, reason: invalid class name */
/* loaded from: 17u.class */
public final class C17u {
    public final C16q A00;
    public final C16v A01;
    public final 0jK A02;
    public final C0jG A03;
    public final java.util.Map A04 = AnonymousClass001.A0u();
    public final RealtimeSinceBootClock A05;

    public C17u(RealtimeSinceBootClock realtimeSinceBootClock, C16q c16q, C16v c16v, 0jK r305, C0jG c0jG) {
        this.A02 = r305;
        this.A03 = c0jG;
        this.A00 = c16q;
        this.A01 = c16v;
        this.A05 = realtimeSinceBootClock;
    }

    public static void A00(C0kl c0kl, C17u c17u) {
        boolean z;
        int i;
        C18v c18v = c0kl.A04;
        int i2 = c0kl.A01;
        18Q r0 = c0kl.A03;
        String name = c18v.name();
        Integer valueOf = Integer.valueOf(i2);
        0fH.A0e(name, valueOf, "MqttOperationManager", "operation/timeout; name=%s, id=%d");
        java.util.Map map = c17u.A04;
        synchronized (map) {
            if (map.get(valueOf) == c0kl) {
                map.remove(valueOf);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            int i3 = i2;
            if (c0kl instanceof C1Al) {
                C1Al c1Al = (C1Al) c0kl;
                i3 = c1Al.A00;
                i = c1Al.A01;
            } else {
                i = 0;
            }
            c17u.A00.A0G(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, c0kl.A05, null, 1, i2, i3, i, r0.A0a);
        } else {
            0fH.A17("MqttOperationManager", "operation/timeout/duplicate; id=%d, operation=%s, client=%s", new Object[]{valueOf, name, r0});
        }
        c0kl.A01();
        0fH.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, c0kl, "MqttOperationManager", "operation/%s; operation=%s");
        boolean equals = c18v.equals(C18v.PINGRESP);
        if (equals || c18v.equals(C18v.PUBACK)) {
            0fH.A0h(r0, "MqttOperationManager", "connection/disconnect/request_timeout; client=%s");
            TimeoutException timeoutException = new TimeoutException();
            C18a c18a = equals ? C18a.PING : C18a.PUBLISH;
            synchronized (r0) {
                18Q.A01(r0, c18a, C18e.A09, timeoutException);
            }
        }
    }

    public C0kl A01(18Q r302, 18X r303, C18v c18v, String str, int i, int i2) {
        C0kl c0kl;
        final C0kl c0kl2 = new C0kl(r302, c18v, str, i, SystemClock.elapsedRealtime());
        java.util.Map map = this.A04;
        synchronized (map) {
            c0kl = (C0kl) map.put(Integer.valueOf(c0kl2.A01), c0kl2);
        }
        if (c0kl != null) {
            c0kl.A01();
            0fH.A14("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", new Object[]{Integer.valueOf(c0kl.A01), c0kl.A04.name()});
        }
        C0mb schedule = this.A03.schedule(new Runnable() { // from class: X.17s
            public static final String __redex_internal_original_name = "MqttOperationManager$2";

            @Override // java.lang.Runnable
            public void run() {
                C17u.A00(c0kl2, this);
            }
        }, TimeUnit.SECONDS, i2);
        16Q.A01(AnonymousClass001.A1U(c0kl2.A06));
        c0kl2.A06 = schedule;
        r303.getClass();
        16Q.A01(AnonymousClass001.A1U(c0kl2.A07));
        c0kl2.A07 = r303;
        0fH.A0a(Integer.valueOf(i), c18v.name(), Integer.valueOf(i2), "MqttOperationManager", "operation/add; id=%d, name=%s, timeoutSec=%d");
        return c0kl2;
    }

    public C0kl A02(18Q r302, C18v c18v, String str, int i, int i2) {
        C0kl c0kl;
        final C0kl c0kl2 = new C0kl(r302, c18v, str, i, SystemClock.elapsedRealtime());
        java.util.Map map = this.A04;
        synchronized (map) {
            c0kl = (C0kl) map.put(Integer.valueOf(c0kl2.A01), c0kl2);
        }
        if (c0kl != null) {
            c0kl.A01();
            0fH.A14("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", new Object[]{Integer.valueOf(c0kl.A01), c0kl.A04.name()});
        }
        C0mb schedule = this.A03.schedule(new Runnable() { // from class: X.17r
            public static final String __redex_internal_original_name = "MqttOperationManager$1";

            @Override // java.lang.Runnable
            public void run() {
                C17u.A00(c0kl2, this);
            }
        }, TimeUnit.SECONDS, i2);
        16Q.A01(AnonymousClass001.A1U(c0kl2.A06));
        c0kl2.A06 = schedule;
        0fH.A0a(Integer.valueOf(i), c18v.name(), Integer.valueOf(i2), "MqttOperationManager", "operation/add; id=%d, name=%s, timeoutSec=%d");
        return c0kl2;
    }
}
