package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.75x, reason: invalid class name */
/* loaded from: 75x.class */
public final class C75x {
    public Context A00;
    public FbUserSession A01;
    public ThreadKey A02;
    public HashSet A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.75x, java.lang.Object] */
    public static final 6xM A00(Function1 function1, boolean z) {
        ?? obj = new Object();
        if (!z) {
            return (6xM) function1.invoke(obj);
        }
        HashSet A0w = AnonymousClass001.A0w(new Class[]{7D3.class, C5Sk.class});
        obj.A03 = A0w;
        return 4YU.A0c((Object) obj, A0w, function1);
    }
}
