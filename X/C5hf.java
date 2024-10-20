package X;

import com.facebook.acra.constants.ActionId;
import com.google.common.base.Optional;
import java.util.HashMap;

/* renamed from: X.5hf, reason: invalid class name */
/* loaded from: 5hf.class */
public abstract class C5hf {
    public static final HashMap A00(C5he c5he) {
        HashMap hashMap = new HashMap();
        hashMap.put("qt_locale", c5he.A03);
        hashMap.put("qt_user_id", c5he.A04);
        Optional optional = c5he.A01;
        if (optional.isPresent()) {
            Object obj = optional.get();
            11T.A0A(obj);
            hashMap.put(DKB.A00(ActionId.APP_WILL_ENTER_FOREGROUND), obj);
        }
        return hashMap;
    }
}
