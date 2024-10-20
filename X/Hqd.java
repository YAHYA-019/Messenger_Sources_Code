package X;

import android.view.View;
import java.util.HashMap;

/* loaded from: Hqd.class */
public final class Hqd {
    public float A00;
    public final View A01;
    public final H9q A02;
    public final HAP A03;
    public final HAQ A04;
    public final HAg A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Float A08;
    public final Integer A09;
    public final Integer A0A;
    public final HashMap A0B;
    public final java.util.Map A0C;
    public final boolean A0D;
    public final boolean A0E;

    public Hqd(View view, H9q h9q, HAP hap, HAQ haq, HAg hAg, Boolean bool, Boolean bool2, Float f, Integer num, Integer num2, HashMap hashMap, java.util.Map map, float f2, boolean z, boolean z2) {
        this.A03 = hap;
        this.A04 = haq;
        this.A08 = f;
        this.A01 = view;
        this.A0E = z2;
        this.A0A = num2;
        this.A09 = num;
        this.A0D = z;
        this.A00 = f2;
        this.A07 = bool2;
        this.A06 = bool;
        this.A0B = hashMap;
        this.A05 = hAg;
        this.A02 = h9q;
        this.A0C = map;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CaptureSettings(");
        HAQ haq = this.A04;
        if (haq != null) {
            stringBuffer.append(" focusMode:");
            stringBuffer.append(haq);
        }
        HAP hap = this.A03;
        if (hap != null) {
            stringBuffer.append(" flashMode:");
            stringBuffer.append(hap);
        }
        Float f = this.A08;
        if (f != null) {
            stringBuffer.append(" exposureCompensation:");
            stringBuffer.append(f);
        }
        Integer num = this.A0A;
        if (num != null) {
            stringBuffer.append(" targetPreviewFps:");
            stringBuffer.append(num);
        }
        Integer num2 = this.A09;
        if (num2 != null) {
            stringBuffer.append(" maxPreviewFps:");
            stringBuffer.append(num2);
        }
        stringBuffer.append(" preferStableFps:");
        stringBuffer.append(this.A0D);
        Boolean bool = this.A07;
        if (bool != null) {
            stringBuffer.append(" frameMetaDataEnabled:");
            stringBuffer.append(bool);
        }
        Boolean bool2 = this.A06;
        if (bool2 != null) {
            stringBuffer.append(" arCoreEnabled:");
            stringBuffer.append(bool2);
        }
        HAg hAg = this.A05;
        if (hAg != null) {
            stringBuffer.append(" whiteBalanceMode:");
            stringBuffer.append(hAg);
        }
        H9q h9q = this.A02;
        if (h9q != null) {
            stringBuffer.append(" antibandingMode:");
            stringBuffer.append(h9q);
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
