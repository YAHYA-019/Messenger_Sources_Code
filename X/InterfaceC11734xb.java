package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.Proxy;
import java.util.HashSet;

/* renamed from: X.4xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xb.class */
public interface InterfaceC11734xb {
    public static final C11794xh A00;
    public static final 5DI A01;

    static {
        C11784xg c11784xg = new C11784xg();
        c11784xg.A01(0S2.A00);
        c11784xg.A00(0S2.A0C);
        A00 = new C11794xh(c11784xg);
        HashSet A0v = AnonymousClass001.A0v();
        A01 = new 5DI((String) null, Proxy.Type.DIRECT, 4YV.A0z(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0v, A0v), 0);
    }

    C11794xh Cay();
}
