package X;

import android.view.View;
import com.facebook.acra.util.StatFsUtil;

/* renamed from: X.2js, reason: invalid class name */
/* loaded from: 2js.class */
public final class C2js implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        11T.A0F(c29k, 0);
        29K r0 = c29k.A03;
        if (r0 == null || (r0.A0F & StatFsUtil.IN_MEGA_BYTE) == 0) {
            return 1.0f;
        }
        return r0.A00;
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        11T.A0F(obj, 0);
        if (obj instanceof View) {
            return ((View) obj).getAlpha();
        }
        throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Tried to get alpha of unsupported mount content: ", AnonymousClass001.A0k()));
    }

    @Override // X.C2jo
    public void ChS(Object obj) {
        11T.A0F(obj, 0);
        ClN(obj, 1.0f);
    }

    @Override // X.C2jo
    public void ClN(Object obj, float f) {
        11T.A0F(obj, 0);
        if (!(obj instanceof View)) {
            throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Setting alpha on unsupported mount content: ", AnonymousClass001.A0k()));
        }
        ((View) obj).setAlpha(f);
    }

    @Override // X.C2jo
    public String getName() {
        return "alpha";
    }
}
