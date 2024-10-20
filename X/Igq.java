package X;

import org.json.JSONObject;

/* loaded from: Igq.class */
public final class Igq implements InterfaceC09944ry {
    public final long A00;
    public final long A01;
    public final long A02;
    public final /* synthetic */ Igr A03;

    public Igq(Igr igr, long j, long j2, long j3) {
        this.A03 = igr;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }

    @Override // X.InterfaceC09944ry
    public JSONObject D4Q() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("code", this.A01);
        A12.put("data", this.A02);
        A12.put("cache", this.A00);
        return A12;
    }
}
