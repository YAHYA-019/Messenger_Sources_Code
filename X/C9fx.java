package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.9fx, reason: invalid class name */
/* loaded from: 9fx.class */
public final class C9fx {
    public 1BY A00;
    public final FbUserSession A01;
    public final 9V5 A02;
    public final CEJ A03 = (CEJ) 1Bn.A0E((Context) null, (1BY) null, 68639);
    public final 9KM A04;

    public C9fx(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A01 = fbUserSession;
        this.A02 = (9V5) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67522);
        this.A04 = (9KM) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67733);
    }

    public static boolean A00(C9fx c9fx, String str, String str2) {
        boolean z;
        HashMap hashMap;
        boolean containsKey;
        ImmutableList copyOf;
        synchronized (c9fx) {
            z = false;
            if (!1JF.A0A(str)) {
                if (!1JF.A0A(str)) {
                    str = str.trim().toLowerCase(Locale.getDefault());
                }
                9KM r0 = c9fx.A04;
                synchronized (r0) {
                    hashMap = r0.A00;
                    containsKey = hashMap.containsKey(str);
                }
                if (containsKey) {
                    synchronized (r0) {
                        copyOf = hashMap.containsKey(str) ? ImmutableList.copyOf((Collection) hashMap.get(str)) : ImmutableList.of();
                    }
                    if (copyOf != null && copyOf.contains(str2)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }
}
