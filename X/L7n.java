package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: L7n.class */
public final class L7n {
    public static final java.util.Map A07 = AbH.A06();
    public static final String[] A08 = {"key", "value"};
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Object A02;
    public final List A03;
    public final Uri A04;
    public final Runnable A05;
    public volatile java.util.Map A06;

    public L7n(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        JV0 jv0 = new JV0(this);
        this.A01 = jv0;
        this.A02 = AnonymousClass001.A0R();
        this.A03 = AnonymousClass001.A0s();
        contentResolver.getClass();
        this.A00 = contentResolver;
        this.A04 = uri;
        this.A05 = runnable;
        contentResolver.registerContentObserver(uri, false, jv0);
    }

    public static final /* synthetic */ java.util.Map A00(L7n l7n) {
        java.util.Map map;
        Cursor A01 = 0L0.A01(l7n.A00, l7n.A04, (String) null, (String) null, A08, (String[]) null, 919598255);
        if (A01 == null) {
            return Collections.emptyMap();
        }
        try {
            int count = A01.getCount();
            if (count == 0) {
                map = Collections.emptyMap();
            } else {
                if (count <= 256) {
                    new 0QO(count);
                } else {
                    new HashMap(count, 1.0f);
                }
                while (A01.moveToNext()) {
                    map.put(A01.getString(0), A01.getString(1));
                }
            }
            A01.close();
            return map;
        } catch (Throwable th) {
            A01.close();
            throw th;
        }
    }
}
