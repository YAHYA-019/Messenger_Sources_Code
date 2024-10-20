package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.payments.auth.dynamicdescriptor.params.DynamicDescriptorParams;

/* loaded from: F9s.class */
public abstract class F9s {
    public DYe A00;
    public final DynamicDescriptorParams A01;
    public final String A02;

    public F9s(DynamicDescriptorParams dynamicDescriptorParams, String str) {
        this.A01 = dynamicDescriptorParams;
        this.A02 = str;
    }

    public static void A01(Parcelable parcelable, Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("Params_Key", parcelable);
        fragment.setArguments(bundle);
    }

    public int A02() {
        int i;
        if (this instanceof E4v) {
            i = 2131955486;
        } else {
            if (this instanceof E4u) {
                return 2131955485;
            }
            if (!(this instanceof E4w)) {
                return 2131955488;
            }
            i = 2131955487;
            if (((F6A) DKH.A0j(((E4w) this).A00)).A01) {
                return 2131955484;
            }
        }
        return i;
    }

    public View.OnClickListener A03() {
        if (this instanceof E4v) {
            E4v e4v = (E4v) this;
            return FXs.A00(1Fw.A05(e4v.A01), e4v, 33);
        }
        if (this instanceof E4u) {
            return FXq.A00(this, 11);
        }
        if (!(this instanceof E4w)) {
            return FXq.A00(this, 10);
        }
        E4w e4w = (E4w) this;
        return FXs.A00(DKH.A0j(e4w.A00), e4w, 32);
    }

    public DYe A04() {
        if (!(this instanceof E4v)) {
            1pK r305 = this.A00;
            if (r305 == null) {
                DynamicDescriptorParams dynamicDescriptorParams = this.A01;
                r305 = new 1pK();
                A01(dynamicDescriptorParams, r305);
                this.A00 = r305;
            }
            return r305;
        }
        E4v e4v = (E4v) this;
        1pK r304 = ((F9s) e4v).A00;
        if (r304 == null) {
            DynamicDescriptorParams dynamicDescriptorParams2 = ((F9s) e4v).A01;
            r304 = new 1pK();
            A01(dynamicDescriptorParams2, r304);
            ((F9s) e4v).A00 = r304;
        }
        ((E4t) r304).A00 = e4v.A00;
        return r304;
    }
}
