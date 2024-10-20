package X;

import com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: Lyb.class */
public final class Lyb extends HashMap {
    public final int A00;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Integer] */
    public Lyb(int i) {
        String l8o;
        int i2;
        int i3;
        HashSet A00;
        this.A00 = i;
        switch (i) {
            case 0:
                put(09V.A00(72), 2000);
                put(09V.A00(62), 2000);
                l8o = 09V.A00(98);
                A00 = Integer.valueOf(ProcessErrorMonitorANRDetector.START_DELAY_MS);
                put(l8o, A00);
                return;
            case 1:
                l8o = 09V.A00(98);
                A00 = Long.valueOf(LocationComponentOptions.STALE_STATE_DELAY_MS);
                put(l8o, A00);
                return;
            case 2:
                i2 = 1440;
                i3 = 1080;
                put(new L8O("Huawei", "HUAWEI GRA-CL00"), L64.A00(new IBB(1440, 1080)));
                A01("HUAWEI GRA-CL10", this);
                A01("HUAWEI GRA-L09", this);
                A01("HUAWEI GRA-TL00", this);
                A01("HUAWEI GRA-UL00", this);
                A01("HUAWEI GRA-UL10", this);
                A01("HUAWEI MT7-CL00", this);
                A01("HUAWEI MT7-J1", this);
                A01("HUAWEI MT7-L09", this);
                A01("HUAWEI MT7-TL00", this);
                A01("HUAWEI MT7-TL10", this);
                l8o = new L8O("Huawei", "HUAWEI MT7-UL00");
                A00 = L64.A00(new IBB(i2, i3));
                put(l8o, A00);
                return;
            case 3:
                l8o = new L8O("Amazon", "SD4930UR");
                i2 = 2592;
                i3 = 1944;
                A00 = L64.A00(new IBB(i2, i3));
                put(l8o, A00);
                return;
            default:
                put("Georgia-Italic", A00("Georgia-BoldItalic", A00("Georgia-Bold", A00("Georgia", A00("Helvetica-Oblique", A00("Helvetica-LightOblique", A00("Helvetica-Light", A00("Helvetica-BoldOblique", A00("Helvetica-Bold", A00("Helvetica", A00("HelveticaNeue-ThinItalic", A00("HelveticaNeue-Thin", A00("HelveticaNeue-UltraLightItalic", A00("HelveticaNeue-UltraLight", A00("HelveticaNeue-MediumItalic", A00("HelveticaNeue-Medium", A00("HelveticaNeue-LightItalic", A00("HelveticaNeue-Light", A00("HelveticaNeue-Italic", A00("HelveticaNeue-CondensedBold", A00("HelveticaNeue-CondensedBlack", A00("HelveticaNeue-BoldItalic", A00("HelveticaNeue-Bold", A00("HelveticaNeue", new Object(), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this), this));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.KXI, java.lang.Object] */
    public static KXI A00(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return new Object();
    }

    public static void A01(String str, AbstractMap abstractMap) {
        abstractMap.put(new L8O("Huawei", str), L64.A00(new IBB(1440, 1080)));
    }
}
