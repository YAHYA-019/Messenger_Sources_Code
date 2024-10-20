package X;

import org.json.JSONObject;

/* loaded from: Igp.class */
public final class Igp implements InterfaceC09944ry {
    public final long A00;
    public final long A01;
    public final long A02;

    public Igp(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    @Override // X.InterfaceC09944ry
    public JSONObject D4Q() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("available_space", this.A00);
        A12.put("free_space", this.A01);
        A12.put("total_space", this.A02);
        return A12;
    }
}
