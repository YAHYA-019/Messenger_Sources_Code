package X;

import android.content.Context;

/* renamed from: X.098, reason: invalid class name */
/* loaded from: 098.class */
public final class AnonymousClass098 extends AnonymousClass099 {
    public final AnonymousClass097 A00;

    public AnonymousClass098(Context context, C01s c01s, AnonymousClass094 anonymousClass094, AnonymousClass097 anonymousClass097, C08p c08p, Integer num) {
        super(context, c01s, anonymousClass094, c08p, num);
        this.A00 = anonymousClass097;
        C09D A00 = this.A05.A00(this.A03, 0Pz.A0W("rti.mqtt.", "mqtt_last_host"));
        if (System.currentTimeMillis() - A00.getLong("zero_rating_last_host_timestamp", 0L) < 86400000) {
            this.A07 = A00.getString("zero_rating_last_host", "");
        }
    }

    @Override // X.AnonymousClass099
    public String A00() {
        return "com.facebook.rti.mqtt.ACTION_ZR_SWITCH";
    }

    @Override // X.AnonymousClass099
    public String A01() {
        return "ZeroRatingConnectionConfigOverrides";
    }

    @Override // X.AnonymousClass099
    public void A05(String str, String str2) {
        AnonymousClass094 anonymousClass094;
        if (str == null || (anonymousClass094 = this.A05) == null) {
            return;
        }
        0Mi AP6 = anonymousClass094.A00(this.A03, 0Pz.A0W("rti.mqtt.", "mqtt_last_host")).AP6();
        AP6.CaM("zero_rating_last_host", str);
        AP6.CaI("zero_rating_last_host_timestamp", System.currentTimeMillis());
        AP6.AGo("ZeroRatingConnectionConfigOverrides", "Failed to save endpoints to preferences");
    }

    public Integer BAX() {
        return null;
    }
}
