package X;

import android.app.Application;
import android.content.Context;
import com.facebook.foa.session.FbMetaSessionImpl;

/* loaded from: En0.class */
public final class En0 {
    public final Application A00;
    public final Context A01;
    public final FbMetaSessionImpl A02;

    public En0(Application application, Context context, FbMetaSessionImpl fbMetaSessionImpl) {
        1BL.A1H(application, fbMetaSessionImpl, context);
        this.A00 = application;
        this.A02 = fbMetaSessionImpl;
        this.A01 = context;
    }
}
