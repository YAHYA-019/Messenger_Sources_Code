package X;

import com.google.common.collect.ImmutableMap;
import java.util.regex.Pattern;

/* renamed from: X.446, reason: invalid class name */
/* loaded from: 446.class */
public final class AnonymousClass446 {
    public final C00241ai A00 = (C00241ai) 1Bi.A03(83592);

    public static Pattern A00(AnonymousClass446 anonymousClass446, String str) {
        return Pattern.compile(0Pz.A0j(Pattern.quote(anonymousClass446.A00.A01().AoA().toString()), "/(me|\\d+)", Pattern.quote(0Pz.A0W("/", str))));
    }

    public static void A01(InterfaceC00281am interfaceC00281am, ImmutableMap.Builder builder) {
        builder.put(interfaceC00281am.AX6().appendEncodedPath("method/logging.clientevent").build().toString(), "log");
        builder.put(interfaceC00281am.AX6().toString(), "api");
        builder.put(interfaceC00281am.AoA().toString(), "graph");
    }
}
