package X;

import com.facebook.payments.auth.dynamicdescriptor.params.DynamicDescriptorParams;

/* loaded from: E4u.class */
public final class E4u extends F9s {
    @Override // X.F9s
    public DYe A04() {
        1pK r302 = this.A00;
        if (r302 == null) {
            DynamicDescriptorParams dynamicDescriptorParams = this.A01;
            r302 = new 1pK();
            F9s.A01(dynamicDescriptorParams, r302);
            this.A00 = r302;
        }
        return (DYe) r302;
    }
}
