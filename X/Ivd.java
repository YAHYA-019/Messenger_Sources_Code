package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;

/* loaded from: Ivd.class */
public final class Ivd implements Runnable {
    public static final String __redex_internal_original_name = "UIControlServiceCommonDelegate$9";
    public final /* synthetic */ PickerConfiguration A00;
    public final /* synthetic */ IPF A01;

    public Ivd(PickerConfiguration pickerConfiguration, IPF ipf) {
        this.A01 = ipf;
        this.A00 = pickerConfiguration;
    }

    @Override // java.lang.Runnable
    public void run() {
        IPF ipf = this.A01;
        ipf.A01.CBc(this.A00, ipf.A05);
    }
}
