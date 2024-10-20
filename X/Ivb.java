package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* loaded from: Ivb.class */
public final class Ivb implements Runnable {
    public static final String __redex_internal_original_name = "UIControlServiceCommonDelegate$5";
    public final /* synthetic */ SliderConfiguration A00;
    public final /* synthetic */ IPF A01;

    public Ivb(SliderConfiguration sliderConfiguration, IPF ipf) {
        this.A01 = ipf;
        this.A00 = sliderConfiguration;
    }

    @Override // java.lang.Runnable
    public void run() {
        IPF ipf = this.A01;
        ipf.A03.CLs(this.A00, ipf.A05);
    }
}
