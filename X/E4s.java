package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.payments.auth.dynamicdescriptor.params.DynamicDescriptorParams;

/* loaded from: E4s.class */
public final class E4s extends DYe {
    public static final String __redex_internal_original_name = "DDAuthConfirmFragment";

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        DynamicDescriptorParams dynamicDescriptorParams;
        int A02 = 0FI.A02(441499347);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView == null) {
            i = -266109336;
        } else {
            TextView A06 = AbF.A06(onCreateView, 2131363538);
            if (A06 != null && (dynamicDescriptorParams = ((DYe) this).A00) != null) {
                A06.setText(dynamicDescriptorParams.A03);
            }
            i = 491581840;
        }
        0FI.A08(i, A02);
        return onCreateView;
    }
}
