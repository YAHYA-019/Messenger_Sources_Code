package X;

import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.user.model.UserKey;
import java.util.Iterator;

/* renamed from: X.9lf, reason: invalid class name */
/* loaded from: 9lf.class */
public final class C9lf {
    public static final C9lf A00 = new Object();

    public static final MontageBucketPreview A00(C9yk c9yk, UserKey userKey) {
        Object obj;
        11T.A0H(userKey, c9yk);
        Iterator it = c9yk.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (userKey.equals(((MontageBucketPreview) obj).A06)) {
                break;
            }
        }
        return (MontageBucketPreview) obj;
    }

    public static final C2fd A01(1XZ r301, UserKey userKey) {
        11T.A0F(r301, 0);
        return r301.BX3(userKey) ? C2fd.A01 : r301.DAK(userKey, 60) ? C2fd.A0a : C2fd.A0T;
    }
}
