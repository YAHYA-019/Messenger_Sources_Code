package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.livelocation.params.LiveLocationParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.lang.ref.WeakReference;

/* loaded from: Cka.class */
public final class Cka implements C7yf {
    @Override // X.C7yf
    public 1pK AlC(Parcelable parcelable) {
        return AlF(parcelable, null);
    }

    @Override // X.C7yf
    public BP7 AlE() {
        return BP7.A0F;
    }

    /* JADX WARN: Type inference failed for: r304v1, types: [androidx.fragment.app.Fragment, java.lang.Object, X.Gbq] */
    /* JADX WARN: Type inference failed for: r304v4, types: [X.Gbp, androidx.fragment.app.Fragment] */
    @Override // X.C7yf
    public 1pK AlF(Parcelable parcelable, WeakReference weakReference) {
        1pK r304;
        LiveLocationParams liveLocationParams = (LiveLocationParams) parcelable;
        if (liveLocationParams == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ThreadKey threadKey = liveLocationParams.A00;
        if (threadKey == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        boolean A0z = threadKey.A0z();
        String str = liveLocationParams.A01;
        if (A0z) {
            Bundle A00 = 0PK.A00(7zO.A1b(Property.SYMBOL_Z_ORDER_SOURCE, str, 1BK.A1G("thread_key", threadKey)));
            ?? c2387Gbp = new C2387Gbp();
            c2387Gbp.setArguments(A00);
            c2387Gbp.A07 = weakReference;
            r304 = c2387Gbp;
        } else {
            Bundle A0E = 7zR.A0E(threadKey);
            if (str != null) {
                A0E.putString(Property.SYMBOL_Z_ORDER_SOURCE, str);
            }
            ?? c2388Gbq = new C2388Gbq();
            c2388Gbq.setArguments(A0E);
            c2388Gbq.A0B = weakReference;
            11T.A0D((Object) c2388Gbq);
            r304 = c2388Gbq;
        }
        return r304;
    }
}
