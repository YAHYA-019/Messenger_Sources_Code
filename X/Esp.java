package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.iabadscontext.DisclaimerText;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension;

/* loaded from: Esp.class */
public final class Esp {
    public final /* synthetic */ JgX A00;
    public final /* synthetic */ IABAdsContext A01;

    public Esp(JgX jgX, IABAdsContext iABAdsContext) {
        this.A00 = jgX;
        this.A01 = iABAdsContext;
    }

    public GIu A00(String str) {
        EEo fut;
        IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension;
        boolean equals = str.equals("1302814060304063");
        JgX jgX = this.A00;
        FragmentActivity activity = jgX.getActivity();
        if (equals) {
            IABAdsContext iABAdsContext = this.A01;
            DisclaimerText disclaimerText = null;
            if (iABAdsContext != null) {
                iABAdsMetaCheckoutPaymentsSDKDataExtension = iABAdsContext.A02;
                java.util.Map map = iABAdsContext.A0E;
                if (map != null) {
                    disclaimerText = (DisclaimerText) map.get(EOw.A05);
                }
            } else {
                iABAdsMetaCheckoutPaymentsSDKDataExtension = null;
            }
            fut = new EEo(activity, jgX, disclaimerText, iABAdsMetaCheckoutPaymentsSDKDataExtension);
        } else {
            fut = new Fut(activity, jgX);
        }
        return (GIu) fut;
    }
}
