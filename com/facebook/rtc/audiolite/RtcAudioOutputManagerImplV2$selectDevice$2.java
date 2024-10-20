package com.facebook.rtc.audiolite;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.7zS;
import X.AnonymousClass001;
import X.C2s7;
import X.Gyl;
import X.HBP;
import X.IH9;
import X.If6;
import X.J5Y;
import X.J9v;
import X.JLv;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* loaded from: RtcAudioOutputManagerImplV2$selectDevice$2.class */
public final class RtcAudioOutputManagerImplV2$selectDevice$2 extends 0DO implements Function2 {
    public final /* synthetic */ AudioDeviceInfo $deviceInfo;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Gyl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcAudioOutputManagerImplV2$selectDevice$2(AudioDeviceInfo audioDeviceInfo, Gyl gyl, 0DR r304) {
        super(2, r304);
        this.this$0 = gyl;
        this.$deviceInfo = audioDeviceInfo;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new RtcAudioOutputManagerImplV2$selectDevice$2(this.$deviceInfo, this.this$0, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        HBP A01;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        boolean z = false;
        try {
            if (i == 0) {
                0Dt.A00(obj);
                Gyl gyl = this.this$0;
                AudioDeviceInfo audioDeviceInfo = this.$deviceInfo;
                this.L$0 = gyl;
                this.L$1 = audioDeviceInfo;
                this.label = 1;
                C2s7 A15 = 7zS.A15(this, 1);
                AudioManager.OnCommunicationDeviceChangedListener ih9 = new IH9(audioDeviceInfo, gyl, A15);
                AudioManager audioManager = ((If6) gyl).A02;
                AudioManager.OnCommunicationDeviceChangedListener onCommunicationDeviceChangedListener = ih9;
                audioManager.addOnCommunicationDeviceChangedListener(J5Y.A00, onCommunicationDeviceChangedListener);
                if (!audioManager.setCommunicationDevice(audioDeviceInfo)) {
                    audioManager.removeOnCommunicationDeviceChangedListener(onCommunicationDeviceChangedListener);
                    A15.resumeWith(false);
                }
                A15.BQE(new J9v(ih9, gyl));
                obj = A15.A0C();
                if (obj == r0) {
                    return r0;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
            }
            z = ((Boolean) obj).booleanValue();
        } catch (CancellationException unused) {
            Gyl gyl2 = this.this$0;
            JLv jLv = ((If6) gyl2).A05;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("selectDevice: change to ");
            A01 = gyl2.A01(this.$deviceInfo);
            A0k.append(A01);
            jLv.ALc("RtcAudioOutputManagerImplV2", AnonymousClass001.A0d(" cancelled. Clearing communication device", A0k), new Object[0]);
            ((If6) this.this$0).A02.clearCommunicationDevice();
        }
        return Boolean.valueOf(z);
    }
}
