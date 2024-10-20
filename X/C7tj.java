package X;

import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.7tj, reason: invalid class name */
/* loaded from: 7tj.class */
public final class C7tj {
    public final 1Br A00 = 1Bq.A00(67196);
    public final 1Br A01 = 1Bq.A00(65723);

    /* JADX WARN: Multi-variable type inference failed */
    public static final MontageBucketPreview A00(6BY r301, User user) {
        MontageBucketPreview montageBucketPreview = null;
        if (r301 != null) {
            ImmutableList immutableList = r301.A00.A00;
            11T.A09(immutableList);
            Iterator it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (11T.A0O(user.A0k, ((MontageBucketPreview) next).A06)) {
                    montageBucketPreview = next;
                    break;
                }
            }
            montageBucketPreview = montageBucketPreview;
        }
        return montageBucketPreview;
    }
}
