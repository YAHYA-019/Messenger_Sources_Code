package X;

import android.content.Context;
import com.facebook.fbservice.service.ServiceException;

/* loaded from: C00.class */
public abstract class C00 {
    public final Context A00;

    public C00(Context context) {
        this.A00 = context;
    }

    public abstract boolean A00(ServiceException serviceException, int i);
}
