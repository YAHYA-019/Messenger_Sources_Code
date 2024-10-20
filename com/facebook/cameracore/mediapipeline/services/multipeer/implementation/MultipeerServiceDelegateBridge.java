package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.11T;
import X.1Br;
import X.Hq1;
import X.HvW;
import X.IP7;
import X.JCl;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

/* loaded from: MultipeerServiceDelegateBridge.class */
public final class MultipeerServiceDelegateBridge {
    public JCl delegate;

    public final void sendBinaryMessage(String str, byte[] bArr, boolean z) {
        IP7 ip7 = this.delegate;
        if (ip7 != null) {
            IP7 ip72 = ip7;
            boolean booleanValue = Boolean.valueOf(z).booleanValue();
            11T.A0H(str, bArr);
            Hq1 hq1 = ip72.A02;
            if (hq1.A02 != null) {
                1Br.A0C(hq1.A06);
                VideoEffectCommunicationApi A00 = HvW.A00();
                if (A00 != null) {
                    A00.sendMultipeerBinaryMessage(str, bArr, booleanValue);
                }
            }
        }
    }

    public final void sendMessage(String str, String str2, boolean z) {
        IP7 ip7 = this.delegate;
        if (ip7 != null) {
            11T.A0H(str, str2);
            Hq1 hq1 = ip7.A02;
            if (hq1.A02 != null) {
                1Br.A0C(hq1.A06);
                VideoEffectCommunicationApi A00 = HvW.A00();
                if (A00 != null) {
                    A00.sendMultipeerMessage(str, str2, z);
                }
            }
        }
    }

    public final void setBinaryMessageTopicHandler(String str, Object obj) {
        IP7 ip7 = this.delegate;
        if (ip7 != null) {
            11T.A0H(str, obj);
            ip7.A00.put(str, obj);
        }
    }

    public final void setTopicHandler(String str, Object obj) {
        IP7 ip7 = this.delegate;
        if (ip7 != null) {
            11T.A0H(str, obj);
            ip7.A01.put(str, obj);
        }
    }
}
