package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.HashSet;

/* renamed from: X.4xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xd.class */
public final class C11754xd implements InterfaceC11734xb {
    public static 5DI A00(URI uri) {
        5DI r302 = null;
        try {
            Proxy proxy = null;
            for (Proxy proxy2 : ProxySelector.getDefault().select(uri)) {
                if (proxy == null || (proxy2.type() != Proxy.Type.SOCKS && (proxy2.address() instanceof InetSocketAddress))) {
                    proxy = proxy2;
                }
            }
            if (proxy != null && proxy.type() != Proxy.Type.DIRECT) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                HashSet A0v = AnonymousClass001.A0v();
                Proxy.Type type = proxy.type();
                r302 = new 5DI(inetSocketAddress.getHostName(), type, C1pq.A07(type, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0v, A0v), inetSocketAddress.getPort());
            }
            return r302;
        } catch (IllegalArgumentException e) {
            AnonymousClass047 ACu = ((AnonymousClass046) 1Bn.A0A(16669)).ACu("IllegalArgumentException", 817902509);
            ACu.Cmr(e);
            ACu.report();
            return null;
        }
    }

    @Override // X.InterfaceC11734xb
    public C11794xh Cay() {
        5DI A00 = A00(URI.create("http://facebook.com"));
        5DI A002 = A00(URI.create("http://facebook.com".replace("http://", "https://")));
        C11784xg c11784xg = new C11784xg();
        c11784xg.A01(0S2.A00);
        c11784xg.A00(0S2.A0C);
        c11784xg.A01 = A002;
        c11784xg.A00 = A00;
        return new C11794xh(c11784xg);
    }
}
