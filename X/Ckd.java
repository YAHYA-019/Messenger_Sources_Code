package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import java.lang.ref.WeakReference;

/* loaded from: Ckd.class */
public final class Ckd implements C7yf {
    @Override // X.C7yf
    public 1pK AlC(Parcelable parcelable) {
        11T.A0I(parcelable, "null cannot be cast to non-null type com.facebook.messaging.rollcall.extension.CreatePromptExtensionParams");
        int i = C1577Alw.A03;
        Bundle A09 = AbN.A09(parcelable);
        A09.putParcelable("arg_prompt_extension_param", new OpaqueParcelable(parcelable));
        1pK r0 = new 1pK();
        r0.setArguments(A09);
        return r0;
    }

    @Override // X.C7yf
    public BP7 AlE() {
        return BP7.CREATE_PROMPT;
    }

    @Override // X.C7yf
    public /* synthetic */ 1pK AlF(Parcelable parcelable, WeakReference weakReference) {
        return null;
    }
}
