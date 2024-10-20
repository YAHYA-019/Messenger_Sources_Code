package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.foa.session.FbMetaSessionImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: ExC.class */
public final class ExC {
    public GLd A00;
    public final Context A01;
    public final FbMetaSessionImpl A02;
    public final Etd A03;
    public final boolean A04;

    public ExC(Context context, FbMetaSessionImpl fbMetaSessionImpl, boolean z) {
        this.A01 = context;
        this.A02 = fbMetaSessionImpl;
        this.A04 = z;
        Etd etd = (Etd) 1Lm.A06(fbMetaSessionImpl.A00, 99765);
        11T.A0A(etd);
        this.A03 = etd;
    }

    public final Fragment A00() {
        Object obj = this.A00;
        if (obj != null) {
            return (Fragment) obj;
        }
        throw AnonymousClass001.A0N("Not attached to a fragment!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v3, types: [X.Ego, java.lang.Object] */
    public final void A01(Function1 function1) {
        Ego ego;
        Integer num = null;
        if (function1 != 0) {
            ?? obj = new Object();
            obj.A00 = null;
            function1.invoke(obj);
            ego = obj;
        } else {
            ego = null;
        }
        GLd gLd = this.A00;
        if (gLd == null) {
            throw AnonymousClass001.A0N("Must be attached to a fragment to pop!");
        }
        if (ego != false) {
            num = ego.A00;
        }
        gLd.CXk(new EIo(num));
    }
}
