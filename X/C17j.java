package X;

import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONException;

/* renamed from: X.17j, reason: invalid class name */
/* loaded from: 17j.class */
public final class C17j implements Runnable {
    public static final String __redex_internal_original_name = "FbnsConnectionManager$CallbackHandler$6";
    public final /* synthetic */ C0kv A00;
    public final /* synthetic */ C18z A01;

    public C17j(C0kv c0kv, C18z c18z) {
        this.A00 = c0kv;
        this.A01 = c18z;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        18Q r0;
        String str;
        C0kl c0kl;
        int i2;
        C0kv c0kv = this.A00;
        C17n c17n = c0kv.A02;
        if (c17n.A14 == c0kv.A00) {
            0Gp r306 = 0Go.A00;
            C18z c18z = this.A01;
            C18s c18s = c18z.A00;
            C18v c18v = c18s.A03;
            switch (c18v.ordinal()) {
                case 2:
                    if (c18s.A02 == 1) {
                        c17n.A0H();
                        break;
                    }
                    break;
                case 3:
                case 8:
                case 10:
                    i = ((C18u) c18z.A02).A00;
                    r306 = 0Gp.A02(Integer.valueOf(i));
                    break;
                case 11:
                    if (c17n.A13.A0Z) {
                        0fH.A0l(c17n.A0Y, "PINGREQ");
                    }
                    c17n.A0H();
                    if (c17n.A08.A00 && (r0 = c17n.A14) != null && AnonymousClass001.A1W(r0.A0d, C08t.CONNECTED)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - r0.A0a;
                        C16v c16v = c17n.A0E;
                        try {
                            str = C16t.A00(null, null, null, C16v.A00(c16v), (C1Ar) c16v.A05(C1Ar.class), C16v.A01(c16v, elapsedRealtime), null, null, false, true).toString();
                        } catch (JSONException unused) {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            0fH.A0i(str, c17n.A0Y, "send/health_stats; stats=%s");
                            try {
                                c17n.A0U("/mqtt_health_stats", 0S2.A00, str);
                                break;
                            } catch (0Mb unused2) {
                                break;
                            }
                        }
                    }
                    break;
                case 12:
                    if (c17n.A13.A0Z) {
                        0fH.A0l(c17n.A0Y, "PINGRESP");
                    }
                    i = -1;
                    r306 = 0Gp.A02(Integer.valueOf(i));
                    break;
            }
            boolean A06 = r306.A06();
            String str2 = c17n.A0Y;
            String name = c18v.name();
            if (A06) {
                0fH.A0f(name, r306.A05(), str2, "receive/%s; id=%d");
                C17u c17u = c17n.A0P;
                Number number = (Number) r306.A05();
                int intValue = number.intValue();
                java.util.Map map = c17u.A04;
                synchronized (map) {
                    c0kl = (C0kl) map.remove(number);
                }
                if (c0kl != null) {
                    0fH.A0d("complete", c0kl, "MqttOperationManager", "operation/%s; operation=%s");
                    c0kl.A00();
                    0fH.A0i(Long.valueOf(SystemClock.elapsedRealtime()), "MqttOperationManager", "Complete operation,  currentTime: %d");
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - c0kl.A02;
                    if (c0kl.A04.equals(C18v.PUBACK)) {
                        ((C1Ar) c17u.A01.A05(C1Ar.class)).A04(16F.A01, elapsedRealtime2);
                    }
                    int i3 = c0kl.A01;
                    if (c0kl instanceof C1Al) {
                        C1Al c1Al = (C1Al) c0kl;
                        i3 = c1Al.A00;
                        i2 = c1Al.A01;
                    } else {
                        i2 = 0;
                    }
                    c17u.A00.A0A(c0kl.A05, 1, intValue, i3, i2, elapsedRealtime2, c0kl.A03.A0a);
                } else {
                    0fH.A0g(number, "MqttOperationManager", "operation/complete/not_found; id=%d");
                }
                if (AnonymousClass001.A03(r306.A05()) == c17n.A00 && c17n.A15 != null) {
                    0fH.A0h(Integer.valueOf(c17n.A00), c17n.A0Y, "Attempting to stop preemptive reconnect %d");
                    18Q r02 = c17n.A15;
                    r02.A0N.execute(new 18J(r02));
                }
            } else {
                0fH.A0i(name, str2, "receive/%s");
            }
            c17n.A0N.C6y(c18z);
        }
    }
}
