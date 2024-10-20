package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.ui.DefaultIdCaptureUi;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;

/* loaded from: Gzc.class */
public abstract class Gzc extends JgR {
    public static final String __redex_internal_original_name = "DependencyLinkingFragment";
    public QoQ A00;
    public JLP A01;
    public IdCaptureLogger A02;
    public DefaultIdCaptureUi A03;
    public boolean A04;
    public Bundle A05;

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        if (context instanceof MQa) {
            IdCaptureBaseActivity idCaptureBaseActivity = (IdCaptureBaseActivity) ((MQa) context);
            idCaptureBaseActivity.A2c();
            this.A03 = idCaptureBaseActivity.A08;
            this.A02 = idCaptureBaseActivity.A2d();
            this.A01 = idCaptureBaseActivity.A02;
            this.A05 = idCaptureBaseActivity.A2c().A03;
            QoQ A00 = idCaptureBaseActivity.A2c().A00();
            11T.A0A(A00);
            this.A00 = A00;
            this.A04 = idCaptureBaseActivity.A2c().A0H;
            11T.A0A(idCaptureBaseActivity.A2c().A03());
        }
    }
}
