package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.net.Proxy;
import java.util.HashSet;

/* renamed from: X.4xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xc.class */
public final class C11744xc implements InterfaceC11734xb {
    public final C00i A00;
    public final Context A01;

    public C11744xc() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A01 = context;
        this.A00 = new 1HH(context, 100170);
    }

    public static C11794xh A00(ConnectivityManager connectivityManager) {
        C11784xg c11784xg;
        ProxyInfo defaultProxy = connectivityManager.getDefaultProxy();
        if (defaultProxy == null) {
            return null;
        }
        Uri pacFileUrl = defaultProxy.getPacFileUrl();
        String host = defaultProxy.getHost();
        if (A01(pacFileUrl)) {
            c11784xg = new C11784xg();
            c11784xg.A01(0S2.A0C);
            c11784xg.A00(0S2.A01);
            pacFileUrl.getClass();
            c11784xg.A05 = pacFileUrl.toString();
        } else {
            if (host == null) {
                return InterfaceC11734xb.A00;
            }
            ImmutableList copyOf = ImmutableList.copyOf(defaultProxy.getExclusionList());
            HashSet hashSet = new HashSet();
            Proxy.Type type = Proxy.Type.HTTP;
            if (!hashSet.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                HashSet hashSet2 = new HashSet(hashSet);
                hashSet = hashSet2;
                hashSet2.add(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }
            5DI r0 = new 5DI(host, type, hashSet, defaultProxy.getPort());
            c11784xg = new C11784xg();
            c11784xg.A01(0S2.A0C);
            c11784xg.A00(0S2.A01);
            c11784xg.A01 = r0;
            c11784xg.A00 = r0;
            c11784xg.A02 = copyOf;
            C1pq.A08("nonProxyHosts", copyOf);
        }
        return new C11794xh(c11784xg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.1JF.A0B(r301.toString()) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(android.net.Uri r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            java.lang.String r0 = r0.toString()
            r302 = r0
            r0 = r302
            boolean r0 = X.1JF.A0B(r0)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11744xc.A01(android.net.Uri):boolean");
    }

    @Override // X.InterfaceC11734xb
    public C11794xh Cay() {
        return A00((ConnectivityManager) this.A00.get());
    }
}
