package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.1Ak, reason: invalid class name */
/* loaded from: 1Ak.class */
public final class C1Ak extends AnonymousClass099 {
    @Override // X.AnonymousClass099
    public String A00() {
        return "com.facebook.rti.mqtt.ACTION_WORK_SWITCH";
    }

    @Override // X.AnonymousClass099
    public String A01() {
        return "WorkConnectionConfigOverrides";
    }

    @Override // X.AnonymousClass099
    public Set A02() {
        return Collections.unmodifiableSet(AnonymousClass001.A0w(new String[]{"facebook.com", "workplace.com"}));
    }

    @Override // X.AnonymousClass099
    public void A03() {
    }

    @Override // X.AnonymousClass099
    public void A05(String str, String str2) {
        0Mi AP6 = 0Pz.A01(this.A03, this.A05, "mqtt_last_host").AP6();
        if (str != null) {
            AP6.CaM("work_last_host", str);
        }
        if (str2 != null) {
            AP6.CaM("work_last_analytics_endpoint", str2);
        }
        AP6.AGo("WorkConnectionConfigOverrides", "Failed to save endpoints to preferences");
    }

    public Integer BAX() {
        return null;
    }
}
