package X;

import java.util.HashMap;

/* loaded from: J7O.class */
public final class J7O extends HashMap {
    public final /* synthetic */ C2369Gb6 this$2;

    public J7O(C2369Gb6 c2369Gb6) {
        this.this$2 = c2369Gb6;
        long nanoTime = System.nanoTime();
        JlT jlT = c2369Gb6.A01;
        put("duration", String.valueOf(nanoTime - jlT.A02.A03));
        String str = jlT.A03;
        put("surface", str == null ? "unknown" : str);
    }
}
