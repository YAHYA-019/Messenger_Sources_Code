package com.facebook.spectrum.facebook;

import X.0fH;
import X.11T;
import X.1BK;
import X.1BQ;
import X.2Jy;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.C00i;
import X.C0dr;
import X.C1kw;
import X.C2J3;
import X.GYa;
import X.H9w;
import X.Hti;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.spectrum.SpectrumException;
import com.facebook.spectrum.SpectrumResult;
import com.facebook.spectrum.image.ImageSize;
import com.facebook.spectrum.image.ImageSpecification;
import com.facebook.spectrum.options.Options;
import com.facebook.spectrum.requirements.EncodeRequirement;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: FacebookSpectrumLogger.class */
public class FacebookSpectrumLogger {
    public final C00i A01 = AbH.A0P();
    public final C00i A00 = 1BQ.A02(84488);

    public Object A00(Options options, Object obj) {
        int i;
        if (!(obj instanceof CallerContext)) {
            throw AnonymousClass001.A0L(String.format(null, "unexpected caller context object %s of class %s", String.valueOf(obj), String.valueOf(obj.getClass())));
        }
        CallerContext callerContext = (CallerContext) obj;
        String str = callerContext.A03;
        String str2 = callerContext.A02;
        if (str2 == null) {
            str2 = "unknown";
        }
        Hti hti = new Hti((C0dr) this.A00.get(), str, str2);
        EncodeRequirement encodeRequirement = options.encodeRequirement;
        if (encodeRequirement == null || (i = encodeRequirement.quality) == 0) {
            hti.A01(H9w.A02);
        } else {
            hti.A01(H9w.A02);
            hti.A01.A0B("transcoder_quality", i);
        }
        ImmutableMap of = ImmutableMap.of((Object) "TranscodeOptions", (Object) String.valueOf(options));
        11T.A0F(of, 0);
        Map map = hti.A03;
        map.putAll(of);
        hti.A01.A09(map, "transcoder_extra");
        return hti;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.GYa, X.2J3] */
    public void A01(SpectrumResult spectrumResult, Object obj) {
        Hti hti = (Hti) obj;
        hti.A00();
        if (spectrumResult != null) {
            boolean A1N = AnonymousClass001.A1N(AnonymousClass001.A1T(spectrumResult.ruleName) ? 1 : 0);
            2Jy r0 = hti.A01;
            r0.A0F("transcoder_success", A1N);
            ImageSpecification imageSpecification = spectrumResult.inputImageSpecification;
            if (imageSpecification != null) {
                ImageSize imageSize = imageSpecification.size;
                int i = imageSize.width;
                int i2 = imageSize.height;
                r0.A0B("input_width", i);
                r0.A0B("input_height", i2);
                String str = imageSpecification.format.identifier;
                if (str != null) {
                    r0.A0D("input_type", AbJ.A1A(str));
                }
            }
            r0.A0C("input_length", spectrumResult.totalBytesRead);
            ImageSpecification imageSpecification2 = spectrumResult.outputImageSpecification;
            if (imageSpecification2 != null) {
                ImageSize imageSize2 = imageSpecification2.size;
                int i3 = imageSize2.width;
                int i4 = imageSize2.height;
                r0.A0B("output_width", i3);
                r0.A0B("output_height", i4);
                String str2 = imageSpecification2.format.identifier;
                if (str2 != null) {
                    r0.A0D("output_type", AbJ.A1A(str2));
                }
            }
            r0.A0C("output_length", spectrumResult.totalBytesWritten);
            ImmutableMap of = ImmutableMap.of((Object) "TranscodeRule", (Object) String.valueOf(spectrumResult.ruleName));
            11T.A0F(of, 0);
            Map map = hti.A03;
            map.putAll(of);
            r0.A09(map, "transcoder_extra");
        }
        C1kw A06 = 1BK.A06(this.A01);
        if (GYa.A00 == null) {
            synchronized (GYa.class) {
                if (GYa.A00 == null) {
                    GYa.A00 = new C2J3(A06);
                }
            }
        }
        GYa gYa = GYa.A00;
        2Jy r02 = hti.A01;
        gYa.A03(r02);
        if (0fH.A01.BTv(3)) {
            0fH.A0A(FacebookSpectrumLogger.class, 2Jy.A01(r02));
        }
    }

    public void A02(Exception exc, Object obj) {
        Hti hti = (Hti) obj;
        if (!(exc instanceof SpectrumException)) {
            hti.A02(exc);
            return;
        }
        SpectrumException spectrumException = (SpectrumException) exc;
        String str = spectrumException.name;
        String message = spectrumException.getMessage();
        String str2 = spectrumException.location;
        if (str != null) {
            hti.A01.A0D("transcoder_exception", str);
        }
        if (message != null) {
            hti.A01.A0D("transcoder_exception_message", message);
        }
        if (str2 != null) {
            hti.A01.A0D("transcoder_exception_location", str2);
        }
    }
}
