package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.resources.ui.FbTextView;

/* renamed from: X.Dec, reason: case insensitive filesystem */
/* loaded from: Dec.class */
public final class C2123Dec extends DMV {
    public FbTextView A00;

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        View A0B = DKF.A0B(LayoutInflater.from(getContext()), 2132541693);
        this.A00 = DKC.A0e(A0B, 2131366717);
        FEx fEx = ((DMV) this).A00;
        fEx.A0C = A0B;
        fEx.A0R = false;
        setCancelable(false);
        super.onCreate(bundle);
    }
}
