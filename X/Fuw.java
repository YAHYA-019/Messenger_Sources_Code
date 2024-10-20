package X;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.offsite.models.message.MessageHandler;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: Fuw.class */
public abstract class Fuw implements MessageHandler {
    public static final AtomicLong A09 = new AtomicLong(System.currentTimeMillis());
    public GIu A00;
    public String A01;
    public final EcE A02;
    public final Esp A03;
    public final C01i A04;
    public final FragmentActivity A05;
    public final Observer A06 = FZB.A00(this, 28);
    public final Observer A07 = FZB.A00(this, 29);
    public final C01i A08 = DKE.A17(this, 29);

    public Fuw(FragmentActivity fragmentActivity, EcE ecE, Esp esp, C01i c01i) {
        this.A05 = fragmentActivity;
        this.A02 = ecE;
        this.A04 = c01i;
        this.A03 = esp;
        this.A00 = esp.A00("742725890006429");
    }

    @Override // com.facebookpay.offsite.models.message.MessageHandler
    public ECPHandler getEcpHandler() {
        return (ECPHandler) this.A08.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x003f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d8  */
    @Override // com.facebookpay.offsite.models.message.MessageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleMessage(java.lang.String r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fuw.handleMessage(java.lang.String, java.lang.String):void");
    }
}
