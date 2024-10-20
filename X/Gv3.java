package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.user.model.UserKey;
import com.google.common.base.Objects;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: Gv3.class */
public final class Gv3 extends C5ni {
    public final int A00;
    public final Object A01;

    public Gv3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5ni
    public boolean A00(5Cz r302, UserKey userKey) {
        Function1 function1;
        switch (this.A00) {
            case 0:
                8GX r0 = (8GX) this.A01;
                FbUserSession fbUserSession = r0.A00;
                if (fbUserSession == null) {
                    7zL.A1C();
                    throw 0Q8.createAndThrow();
                }
                8GX.A03(fbUserSession, r0);
                return true;
            case 1:
                H5Q h5q = (H5Q) this.A01;
                MontageBucketPreview montageBucketPreview = h5q.A02;
                if (montageBucketPreview == null || !Objects.equal(userKey, montageBucketPreview.A06)) {
                    return true;
                }
                1GU r02 = h5q.A08;
                if (r02.BWu()) {
                    H5Q.A00(h5q);
                    return true;
                }
                r02.Ciz(new S8D(this));
                return true;
            default:
                ArrayList A0z = 7zO.A0z(r302, 1);
                C30d c30d = (C30d) this.A01;
                AnonymousClass207 anonymousClass207 = C30d.A0F;
                for (ThreadKey threadKey : c30d.A0D) {
                    boolean A00 = r302.A00(threadKey);
                    java.util.Map map = c30d.A0B;
                    Boolean bool = (Boolean) map.get(threadKey);
                    if (A00 != (bool != null ? bool.booleanValue() : false)) {
                        map.put(threadKey, Boolean.valueOf(A00));
                        A0z.add(threadKey);
                    }
                }
                if (!7zM.A1b(A0z) || (function1 = c30d.A00) == null) {
                    return true;
                }
                function1.invoke(A0z);
                return true;
        }
    }
}
