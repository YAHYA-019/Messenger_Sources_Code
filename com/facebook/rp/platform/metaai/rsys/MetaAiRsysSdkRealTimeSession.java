package com.facebook.rp.platform.metaai.rsys;

import X.0DE;
import X.0DR;
import X.11T;
import X.2JQ;
import X.2aG;
import X.2aI;
import X.2aK;
import X.91G;
import X.9V7;
import X.9Vr;
import X.AJG;
import X.AQW;
import X.C01i;
import X.C03i;
import X.C0s8;
import X.C2a0;
import X.JOK;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.EnableAudioParameters;

/* loaded from: MetaAiRsysSdkRealTimeSession.class */
public final class MetaAiRsysSdkRealTimeSession {
    public final 9Vr A00;
    public final 91G A01;
    public final JOK A02;
    public final C01i A03;
    public final C01i A04;
    public final C01i A05;
    public final 0DE A06;
    public final 2aI A07;

    public MetaAiRsysSdkRealTimeSession(91G r302, JOK jok, 0DE r304) {
        11T.A0F(r302, 2);
        this.A02 = jok;
        this.A01 = r302;
        this.A06 = r304;
        this.A07 = 2aG.A02(new C2a0(null).plus(r304));
        this.A00 = new 9Vr(jok, r304);
        C03i c03i = C03i.A04;
        this.A05 = AQW.A00(this, c03i, 49);
        this.A03 = AQW.A00(this, c03i, 47);
        this.A04 = AQW.A00(this, c03i, 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A00(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A00(X.0DR):java.lang.Object");
    }

    public void A01(boolean z) {
        9V7 r0 = (9V7) this.A05.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (r0.A01) {
            r0.A00 = valueOf;
            if (valueOf != null) {
                r0.A02.Cvx(valueOf);
            }
        }
        2aK.A03((Integer) null, (0DE) null, new AJG(this, (0DR) null, 6, z), this.A07, 3);
    }

    public void A02(boolean z) {
        EnableAudioParameters enableAudioParameters = new EnableAudioParameters(null, 1, z);
        JOK jok = this.A02;
        2JQ r0 = AudioApi.CONVERTER;
        11T.A0B(r0);
        AudioApi audioApi = (AudioApi) jok.AX0(r0);
        if (audioApi != null) {
            audioApi.enableAudio(C0s8.A10(enableAudioParameters));
        }
    }
}
