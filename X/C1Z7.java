package X;

import org.json.JSONObject;

/* renamed from: X.1Z7, reason: invalid class name */
/* loaded from: 1Z7.class */
public final class C1Z7 extends 1Yu implements C1Yv {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    public C1Z7(long j, long j2, long j3, boolean z, boolean z2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A03 = z;
        this.A04 = z2;
    }

    public static C1Z7 A00(JSONObject jSONObject) {
        1aM r0 = new 1aM();
        long optLong = jSONObject.optLong("max_size", 0L);
        long optLong2 = jSONObject.optLong("max_size_low_space_bytes", 0L);
        long optLong3 = jSONObject.optLong("max_size_very_low_space_bytes", 0L);
        if (optLong <= 0 && optLong2 <= 0 && optLong3 <= 0) {
            return null;
        }
        r0.A00 = optLong;
        r0.A01 = optLong2;
        r0.A02 = optLong3;
        r0.A03 = jSONObject.optBoolean("delete_only_on_init", false);
        r0.A04 = jSONObject.optBoolean("is_itemized", false);
        return r0.A00();
    }

    @Override // X.C1Yv
    public JSONObject D4Q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("max_size", this.A00);
        jSONObject.put("max_size_low_space_bytes", this.A01);
        jSONObject.put("max_size_very_low_space_bytes", this.A02);
        jSONObject.put("delete_only_on_init", this.A03);
        jSONObject.put("is_itemized", this.A04);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1Z7 c1z7 = (C1Z7) obj;
            if (this.A00 != c1z7.A00 || this.A01 != c1z7.A01 || this.A02 != c1z7.A02 || this.A03 != c1z7.A03) {
                return false;
            }
            if (this.A04 != c1z7.A04) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return ((AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A01, AnonymousClass002.A01(this.A00))) + (this.A03 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
