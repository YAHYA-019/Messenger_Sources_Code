package X;

import com.facebook.wearable.datax.LocalChannel;
import java.io.IOException;

/* loaded from: Iui.class */
public final /* synthetic */ class Iui implements Runnable {
    public static final String __redex_internal_original_name = "LinkSetup$$ExternalSyntheticLambda0";
    public final /* synthetic */ IE6 A00;

    @Override // java.lang.Runnable
    public final void run() {
        IE6 ie6 = this.A00;
        0fH.A0k("LinkSetup", "Encrypt link timed out!");
        ie6.A01 = null;
        int i = ie6.A00;
        if (i >= 1) {
            ie6.A0G.invoke(new IOException("Timed out attempting to encrypt links!"));
            return;
        }
        int i2 = i + 1;
        ie6.A00 = i2;
        0fH.A0k("LinkSetup", 0Pz.A0T("Retrying with new channel! #", i2));
        LocalChannel localChannel = ie6.A02;
        11T.A0F(localChannel, 0);
        try {
            localChannel.close();
        } catch (Throwable unused) {
        }
        LocalChannel localChannel2 = new LocalChannel(ie6.A09, 5);
        localChannel2.onReceived = new J8M(ie6, 5);
        localChannel2.onError = new JBV(ie6, 43);
        localChannel2.onClosed = J9h.A00;
        ie6.A02 = localChannel2;
        IE6.A02(ie6, new J9o(ie6, 32));
    }
}
