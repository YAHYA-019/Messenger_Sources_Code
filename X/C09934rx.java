package X;

import org.json.JSONObject;

/* renamed from: X.4rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rx.class */
public final class C09934rx implements InterfaceC09944ry {
    public long A01;
    public long A02;
    public long A06;
    public long A08;
    public long A07 = 0;
    public long A00 = 0;
    public long A09 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A03 = 0;

    public C09934rx() {
        long j = -1;
        this.A08 = j;
        this.A06 = j;
        this.A02 = j;
        this.A01 = j;
    }

    @Override // X.InterfaceC09944ry
    public JSONObject D4Q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("measurement_count", this.A07);
        jSONObject.put("avg_available_space_bytes", this.A00);
        jSONObject.put("min_available_space_bytes", this.A08);
        jSONObject.put("max_available_space_bytes", this.A06);
        jSONObject.put("first_measurement_timestamp", this.A02);
        jSONObject.put("first_measurement_bytes", this.A01);
        jSONObject.put("last_measurement_bytes", this.A09);
        jSONObject.put("less_than_200mib_count", this.A04);
        jSONObject.put("less_than_400mib_count", this.A05);
        jSONObject.put("less_than_1024mib_count", this.A03);
        return jSONObject;
    }
}
