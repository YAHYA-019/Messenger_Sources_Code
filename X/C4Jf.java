package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.4Jf, reason: invalid class name */
/* loaded from: 4Jf.class */
public final class C4Jf extends C4Jd {
    public final ConnectivityManager A00;
    public final C4Jg A01;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.4Jg] */
    public C4Jf(Context context, C4Ii c4Ii) {
        super(context, c4Ii);
        Object systemService = super.A01.getSystemService("connectivity");
        11T.A0I(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
        this.A01 = new ConnectivityManager.NetworkCallback() { // from class: X.4Jg
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                11T.A0F(networkCapabilities, 1);
                4IS.A00().A02(C4Ug.A00, AnonymousClass001.A0Z(networkCapabilities, "Network capabilities changed: ", AnonymousClass001.A0k()));
                C4Jf c4Jf = C4Jf.this;
                c4Jf.A03(C4Ug.A00(c4Jf.A00));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                4IS.A00().A02(C4Ug.A00, "Network connection lost");
                C4Jf c4Jf = C4Jf.this;
                c4Jf.A03(C4Ug.A00(c4Jf.A00));
            }
        };
    }
}
