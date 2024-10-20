package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.payments.auth.dynamicdescriptor.params.DynamicDescriptorParams;

/* loaded from: E4x.class */
public final class E4x extends F9s {
    public final C00i A00;

    public E4x(DynamicDescriptorParams dynamicDescriptorParams, String str) {
        super(dynamicDescriptorParams, str);
        this.A00 = 1BV.A00(98470);
    }

    public static void A00(E4x e4x) {
        FragmentActivity activity;
        DYe dYe = ((F9s) e4x).A00;
        if (dYe == null || (activity = dYe.getActivity()) == null) {
            return;
        }
        DynamicDescriptorParams dynamicDescriptorParams = e4x.A01;
        String str = e4x.A02;
        C2121Dea A03 = C2121Dea.A03(activity);
        A03.A06(2131955473);
        A03.A0A((CharSequence) null);
        DKS.A02(A03, e4x, 44, 2131955475);
        A03.A0D(FK6.A00(e4x, 43), 2131955474);
        new C2118DeW(activity, A03.A0I(), dynamicDescriptorParams, str).show();
    }
}
