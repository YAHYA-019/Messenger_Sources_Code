package X;

import android.util.LruCache;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.71d, reason: invalid class name */
/* loaded from: 71d.class */
public final class C71d implements C71b {
    public final LruCache A00;
    public final FbUserSession A01;

    public C71d(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A00 = new LruCache(128);
    }

    @Override // X.C71b
    public String AUl(C2o9 c2o9, Integer num, String str, String str2) {
        11T.A0F(c2o9, 1);
        if (c2o9 == C2o9.A07 && str2 != null) {
            LruCache lruCache = this.A00;
            String str3 = (String) lruCache.get(str2);
            if (str3 != null) {
                return str3;
            }
            lruCache.put(str2, str);
        }
        return str;
    }
}
