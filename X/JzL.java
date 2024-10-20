package X;

import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: JzL.class */
public final class JzL extends L2s {
    public final JsonSerializer A00;
    public final JsonSerializer A01;
    public final Class A02;
    public final Class A03;

    public JzL(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, L2s l2s, Class cls, Class cls2) {
        super(l2s);
        this.A02 = cls;
        this.A00 = jsonSerializer;
        this.A03 = cls2;
        this.A01 = jsonSerializer2;
    }
}
