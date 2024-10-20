package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.IPF;
import X.Iot;
import X.Iva;
import X.Ivb;
import X.Ivc;
import X.Ivd;
import X.JER;
import X.S6o;
import X.S6p;
import X.SAZ;
import X.SAa;
import X.SCq;
import X.SEi;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: UIControlServiceDelegateWrapper.class */
public class UIControlServiceDelegateWrapper implements JER {
    public final IPF mCommonDelegate;
    public final String mEffectId;
    public NativeDataPromise mPromise;

    public UIControlServiceDelegateWrapper(String str, IPF ipf) {
        this.mEffectId = str;
        this.mCommonDelegate = ipf;
        ipf.A00.post(new Ivb(new SliderConfiguration(0, 0, null, null), ipf));
    }

    public void configurePicker(PickerConfiguration pickerConfiguration) {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new Ivd(pickerConfiguration, ipf));
    }

    public void configureSlider(SliderConfiguration sliderConfiguration) {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new Ivb(sliderConfiguration, ipf));
    }

    public void enterRawTextEditMode(String str, RawEditableTextListener rawEditableTextListener) {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new SCq(rawEditableTextListener, ipf, str));
    }

    public void enterTextEditMode(String str, boolean z, int i, int i2, NativeDataPromise nativeDataPromise) {
        this.mPromise = nativeDataPromise;
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new SEi(ipf, this, str, i, i2, z));
    }

    public void exitRawTextEditMode() {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new S6o(ipf));
    }

    public void hidePicker() {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new Iot(ipf));
    }

    public void hideSlider() {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new S6p(ipf));
    }

    public void onTextEditComplete(String str) {
        NativeDataPromise nativeDataPromise = this.mPromise;
        if (nativeDataPromise != null) {
            nativeDataPromise.setValue(new EditedText(str.trim()));
        }
    }

    public void setPickerSelectedIndex(int i) {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new Iva(ipf, i));
    }

    public void setSliderValue(float f) {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new SAa(ipf, f));
    }

    public void showPicker(OnPickerItemSelectedListener onPickerItemSelectedListener) {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new Ivc(onPickerItemSelectedListener, ipf));
    }

    public void showSlider(OnAdjustableValueChangedListener onAdjustableValueChangedListener) {
        IPF ipf = this.mCommonDelegate;
        ipf.A00.post(new SAZ(onAdjustableValueChangedListener, ipf));
    }
}
