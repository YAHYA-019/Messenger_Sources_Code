package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.OnPickerItemSelectedListener;

/* loaded from: Ivc.class */
public final class Ivc implements Runnable {
    public static final String __redex_internal_original_name = "UIControlServiceCommonDelegate$8";
    public final /* synthetic */ OnPickerItemSelectedListener A00;
    public final /* synthetic */ IPF A01;

    public Ivc(OnPickerItemSelectedListener onPickerItemSelectedListener, IPF ipf) {
        this.A01 = ipf;
        this.A00 = onPickerItemSelectedListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        IPF ipf = this.A01;
        ipf.A01.CBh(this.A00, ipf.A05);
    }
}
