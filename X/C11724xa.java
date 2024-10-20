package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.Proxy;
import java.util.HashSet;
import org.apache.http.HttpHost;

/* renamed from: X.4xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xa.class */
public final class C11724xa implements InterfaceC11734xb {
    public final 2A1 A00 = (2A1) 1Bi.A03(84630);

    @Override // X.InterfaceC11734xb
    public C11794xh Cay() {
        HttpHost A01 = this.A00.A01();
        if (A01 == null) {
            return null;
        }
        HashSet A0v = AnonymousClass001.A0v();
        5DI r0 = new 5DI(A01.getHostName(), Proxy.Type.HTTP, 4YV.A0z(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0v, A0v), A01.getPort());
        C11784xg c11784xg = new C11784xg();
        c11784xg.A01(0S2.A01);
        c11784xg.A00(0S2.A0C);
        c11784xg.A01 = r0;
        c11784xg.A00 = r0;
        return new C11794xh(c11784xg);
    }
}
