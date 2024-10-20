package X;

import android.content.Context;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.9iL, reason: invalid class name */
/* loaded from: 9iL.class */
public abstract class C9iL {
    public static final C7Us A00(Context context, String str) {
        03Y A02 = A02(context, str);
        return new C7Us((String) A02.first, 7zN.A0w(new C87v[]{new C87v(C6qi.A02), AnonymousClass001.A1V(A02.second) ? new C87v(C6qi.A03) : null}));
    }

    public static final 03Y A01(Context context, String str) {
        03Y A02 = A02(context, str);
        Object obj = A02.first;
        boolean A1V = AnonymousClass001.A1V(A02.second);
        String A0K = 6qM.A00().A00() != null ? 0Pz.A0K(context.getString(2131957798), '/') : null;
        String A022 = 60U.A02(context);
        C1790AsO c1790AsO = null;
        C1790AsO c1790AsO2 = A022 != null ? new C1790AsO(0S2.A0j, A022, ConstantsKt.CAMERA_ID_FRONT, 1) : null;
        if (A0K != null && A1V) {
            c1790AsO = new C1790AsO(0S2.A0u, A0K, ConstantsKt.CAMERA_ID_FRONT, 1);
        }
        return 1BK.A1G(obj, 7zN.A0w(new C1790AsO[]{c1790AsO2, c1790AsO}));
    }

    public static final 03Y A02(Context context, String str) {
        String A0K = 6qM.A00().A00() != null ? 0Pz.A0K(context.getString(2131957798), '/') : null;
        boolean z = false;
        if (A0K != null && 0CV.A0b(str, 0Pz.A0J(A0K, ' '), false)) {
            z = true;
            str = str.substring(A0K.length() + 1);
            11T.A0A(str);
        }
        return 7zP.A0y(str, z);
    }
}
