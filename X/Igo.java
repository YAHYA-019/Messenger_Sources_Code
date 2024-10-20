package X;

import org.json.JSONObject;

/* loaded from: Igo.class */
public final class Igo implements InterfaceC09944ry {
    public java.util.Map A00;
    public final /* synthetic */ Igt A01;

    public Igo(Igt igt, java.util.Map map) {
        this.A01 = igt;
        this.A00 = map;
    }

    @Override // X.InterfaceC09944ry
    public JSONObject D4Q() {
        return new JSONObject(this.A00);
    }
}
