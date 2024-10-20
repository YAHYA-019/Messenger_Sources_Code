package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import java.net.Proxy;
import java.util.HashSet;

/* renamed from: X.4xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xe.class */
public final class C11764xe implements InterfaceC11734xb {
    public static 5DI A00(String str) {
        String property = System.getProperty(0Pz.A0W(str, "Host"));
        String property2 = System.getProperty(0Pz.A0W(str, "Port"));
        if (property2 == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(property2);
            if (parseInt <= 0 || parseInt > ((char) (-1))) {
                return null;
            }
            HashSet A0v = AnonymousClass001.A0v();
            return new 5DI(property, str.equalsIgnoreCase("socksProxy") ? Proxy.Type.SOCKS : Proxy.Type.HTTP, 4YV.A0z(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0v, A0v), parseInt);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC11734xb
    public C11794xh Cay() {
        C11784xg c11784xg;
        5DI A00 = A00("http.proxy");
        5DI A002 = A00("https.proxy");
        5DI A003 = A00("socksProxy");
        ImmutableList copyOf = ImmutableList.copyOf(System.getProperty("http.nonProxyHosts", "").trim().split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
        if (A00 != null || A002 != null) {
            c11784xg = new C11784xg();
            Integer num = 0S2.A0C;
            c11784xg.A01(num);
            c11784xg.A00(num);
            c11784xg.A01 = A002;
            c11784xg.A00 = A00;
        } else {
            if (A003 == null) {
                return null;
            }
            c11784xg = new C11784xg();
            Integer num2 = 0S2.A0C;
            c11784xg.A01(num2);
            c11784xg.A00(num2);
            c11784xg.A01 = A003;
            c11784xg.A00 = A003;
        }
        c11784xg.A02 = copyOf;
        C1pq.A08("nonProxyHosts", copyOf);
        return new C11794xh(c11784xg);
    }
}
