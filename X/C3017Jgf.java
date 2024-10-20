package X;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;

/* renamed from: X.Jgf, reason: case insensitive filesystem */
/* loaded from: Jgf.class */
public final class C3017Jgf extends AbstractSavedStateViewModelFactory {
    public final ECPPaymentRequest A00;

    public C3017Jgf(C05s c05s, ECPPaymentRequest eCPPaymentRequest) {
        super(c05s, null);
        this.A00 = eCPPaymentRequest;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        11T.A0F(savedStateHandle, 2);
        if (cls.isAssignableFrom(C3029Jgs.class)) {
            return new C3029Jgs(savedStateHandle, this.A00);
        }
        throw AnonymousClass002.A0C(cls, "Unknown ViewModel class: ", AnonymousClass001.A0k());
    }
}
