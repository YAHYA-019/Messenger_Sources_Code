package X;

import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.76f, reason: invalid class name */
/* loaded from: 76f.class */
public final class C76f {
    public Fragment A00;
    public 06Z A01;
    public FbUserSession A02;
    public ThreadKey A03;
    public HashSet A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.76f] */
    public static final 6xM A00(Function1 function1, boolean z) {
        ?? obj = new Object();
        if (!z) {
            return (6xM) function1.invoke(obj);
        }
        HashSet A0w = AnonymousClass001.A0w(new Class[]{7D3.class, C5Sk.class});
        obj.A04 = A0w;
        return 4YU.A0c((Object) obj, A0w, function1);
    }
}