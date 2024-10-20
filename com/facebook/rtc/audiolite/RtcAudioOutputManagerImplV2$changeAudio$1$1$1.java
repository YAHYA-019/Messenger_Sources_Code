package com.facebook.rtc.audiolite;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.AnonymousClass001;
import X.C44h;
import X.Gyl;
import X.HBP;
import X.HtL;
import X.I5D;
import X.If6;
import X.JLv;
import android.media.AudioDeviceInfo;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;

/* loaded from: RtcAudioOutputManagerImplV2$changeAudio$1$1$1.class */
public final class RtcAudioOutputManagerImplV2$changeAudio$1$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ AudioDeviceInfo $audioDevice;
    public final /* synthetic */ HBP $output;
    public Object L$0;
    public int label;
    public final /* synthetic */ Gyl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcAudioOutputManagerImplV2$changeAudio$1$1$1(AudioDeviceInfo audioDeviceInfo, Gyl gyl, HBP hbp, 0DR r305) {
        super(2, r305);
        this.this$0 = gyl;
        this.$audioDevice = audioDeviceInfo;
        this.$output = hbp;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new RtcAudioOutputManagerImplV2$changeAudio$1$1$1(this.$audioDevice, this.this$0, this.$output, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object A01;
        Object obj2;
        Object A00;
        HtL A012;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            A01 = this.this$0.A01(this.$audioDevice);
            obj2 = A01;
            Gyl gyl = this.this$0;
            AudioDeviceInfo audioDeviceInfo = this.$audioDevice;
            this.L$0 = obj2;
            this.label = 1;
            A00 = C44h.A00(this, new RtcAudioOutputManagerImplV2$selectDevice$2(audioDeviceInfo, gyl, null), TimeUnit.SECONDS.toMillis(30));
            obj = A00;
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            obj2 = this.L$0;
            0Dt.A00(obj);
        }
        if (AnonymousClass001.A1V(obj)) {
            ((If6) this.this$0).A05.ALc("RtcAudioOutputManagerImplV2", AnonymousClass001.A0Z(obj2, "changeAudio: done changing to ", AnonymousClass001.A0k()), new Object[0]);
            I5D i5d = ((If6) this.this$0).A03;
            if (i5d != null && (A012 = i5d.A01()) != null) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("change_audio: ");
                A012.A01(AnonymousClass001.A0a(this.$output, A0k));
            }
        } else {
            if (obj2 == HBP.A05) {
                this.this$0.A06 = false;
            } else if (obj2 == HBP.A02) {
                this.this$0.A05 = false;
            }
            JLv jLv = ((If6) this.this$0).A05;
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("changeAudio: timeout changing to ");
            A0k2.append(obj2);
            jLv.ALc("RtcAudioOutputManagerImplV2", AnonymousClass001.A0d(". Clearing communication device", A0k2), new Object[0]);
            ((If6) this.this$0).A02.clearCommunicationDevice();
        }
        return 04S.A00;
    }
}
