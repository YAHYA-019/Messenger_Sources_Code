package X;

import android.content.Context;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: Fqs.class */
public final class Fqs implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        if (obj3 == null) {
            throw AnonymousClass001.A0T("Missing text layout context!");
        }
        rCTextView.A05((EqR) obj3);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((RCTextView) obj).A04();
    }
}
