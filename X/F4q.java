package X;

import android.content.ContentResolver;
import android.content.Context;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.fblibraries.fblogin.SsoSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: F4q.class */
public final class F4q {
    public final ContentResolver A00;
    public final List A01;

    public F4q(ContentResolver contentResolver, List list) {
        this.A00 = contentResolver;
        this.A01 = list;
    }

    public static FirstPartySsoSessionInfo A00(Context context, F4q f4q) {
        FirstPartySsoSessionInfo firstPartySsoSessionInfo;
        Iterator it = f4q.A01.iterator();
        while (it.hasNext()) {
            ArrayList A02 = C4DT.A02(f4q.A00, context, new SsoSource(0, AnonymousClass001.A0i(it)));
            if (!A02.isEmpty() && (firstPartySsoSessionInfo = (FirstPartySsoSessionInfo) A02.get(0)) != null) {
                return firstPartySsoSessionInfo;
            }
        }
        return null;
    }
}
