package X;

import android.content.Context;
import com.facebook.auth.viewercontext.ViewerContext;

/* loaded from: Fz4.class */
public final class Fz4 implements Cloneable {
    public int A00;
    public ViewerContext A01;
    public E9t A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Fz4, java.lang.Object] */
    public static Fz4 create(Context context, E9t e9t) {
        ?? obj = new Object();
        obj.A02 = e9t;
        obj.A00 = e9t.A03;
        obj.A01 = e9t.A04;
        return obj;
    }
}
