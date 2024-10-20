package X;

import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.facebook.AutofillController$4;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: LuK.class */
public final class LuK implements C00l, C00m {
    public final int A00;
    public final Object A01;

    public LuK(LET let, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = let;
        } else {
            this.A01 = let;
        }
    }

    public LuK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        1CO r305;
        long j;
        Integer num;
        switch (this.A00) {
            case 0:
                r305 = ((C3243Jnf) this.A01).A0c.A04.A00;
                j = 36311839663328740L;
                break;
            case 1:
                LET let = (LET) this.A01;
                AbstractC3252Jnp abstractC3252Jnp = let.A04;
                num = null;
                if (abstractC3252Jnp != null) {
                    let.A0M((AutofillSharedJSBridgeProxy) null, abstractC3252Jnp);
                    return null;
                }
                return num;
            case 2:
                r305 = ((LET) this.A01).A0P.A04.A00;
                j = 36311839663525351L;
                break;
            case 3:
                r305 = ((LET) this.A01).A0P.A04.A00;
                j = 36311839668309520L;
                break;
            case 4:
                r305 = ((AutofillController$4) this.A01).A01.A0c.A04.A00;
                j = 36311839663132131L;
                break;
            case 5:
                Object obj = this.A01;
                return Kwm.A00("com.facebook.wearable.companion.connectivity.interfaces.data.CustomDeviceInfo", new LuM(obj, 7), M9W.A00, new SerialDescriptor[7zP.A1X(obj)]);
            default:
                LvT lvT = (LvT) this.A01;
                num = Integer.valueOf(KZ6.A00(lvT, lvT.A05));
                return num;
        }
        return 2yD.A01(r305, j);
    }
}
