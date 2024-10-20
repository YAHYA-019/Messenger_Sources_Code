package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.26w, reason: invalid class name */
/* loaded from: 26w.class */
public final class C26w {
    public final HashMap A00 = new HashMap(64);
    public final AtomicReference A01 = new AtomicReference();

    public JsonSerializer A00(24S r302) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.A00.get(new C43J(r302, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer A01(Class cls) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.A00.get(new C43J(cls, false));
        }
        return jsonSerializer;
    }
}
