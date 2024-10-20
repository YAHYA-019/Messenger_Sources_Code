package org.webrtc;

import X.J6J;
import X.J6K;
import X.J6W;
import X.JHR;
import java.util.Map;

/* loaded from: HardwareVideoDecoderFactory.class */
public class HardwareVideoDecoderFactory extends J6W {
    public static final String TAG = "HardwareVideoDecoderFactory";
    public static final JHR defaultAllowedPredicate = new J6J(0);

    public HardwareVideoDecoderFactory() {
        this(null);
    }

    public HardwareVideoDecoderFactory(EglBase$Context eglBase$Context) {
        this(eglBase$Context, null, null);
    }

    public HardwareVideoDecoderFactory(EglBase$Context eglBase$Context, JHR jhr) {
        this(eglBase$Context, jhr, null);
    }

    public HardwareVideoDecoderFactory(EglBase$Context eglBase$Context, JHR jhr, Map map) {
        super(eglBase$Context, getCombinedCodecAllowedPredicate(map, jhr), map);
    }

    public HardwareVideoDecoderFactory(EglBase$Context eglBase$Context, Map map) {
        this(eglBase$Context, null, map);
    }

    public static JHR getCombinedCodecAllowedPredicate(Map map, JHR jhr) {
        JHR jhr2 = defaultAllowedPredicate;
        JHR socAllowedPredicate = socAllowedPredicate(map);
        if (socAllowedPredicate != null) {
            jhr2 = new J6K(socAllowedPredicate, jhr2);
        }
        return jhr != null ? new J6K(jhr, jhr2) : jhr2;
    }

    public static JHR socAllowedPredicate(Map map) {
        J6J j6j = null;
        if (map != null) {
            Integer num = 1;
            if (num.equals(map.get("fb-enable-qcom-soc-targeting"))) {
                j6j = new J6J(1);
            }
        }
        return j6j;
    }

    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }
}
