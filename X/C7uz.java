package X;

import com.facebook.fblibraries.fblogin.SsoSource;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* renamed from: X.7uz, reason: invalid class name */
/* loaded from: 7uz.class */
public final class C7uz implements 2LK {
    public SsoSource A00;

    public java.util.Map Agf() {
        HashMap hashMap;
        synchronized (this) {
            ImmutableMap.Builder A0c = 1BK.A0c();
            SsoSource ssoSource = this.A00;
            A0c.put("LatestSsoSource", ssoSource == null ? "" : ssoSource.toString());
            hashMap = new HashMap(A0c.build());
        }
        return hashMap;
    }
}
