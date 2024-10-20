package com.facebook.video.heroplayer.service;

import X.5Ko;
import X.5L8;
import X.5NM;
import X.6Cy;
import X.6Cz;
import X.AnonymousClass001;
import X.C51f;
import X.Jw5;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ServiceEventCallbackImpl.class */
public class ServiceEventCallbackImpl implements VpsEventCallback {
    public String A00;
    public final 5L8 A01;
    public final 5Ko A02;
    public final AtomicReference A03;

    public ServiceEventCallbackImpl(5L8 r302, 5Ko r303, String str, AtomicReference atomicReference) {
        this.A03 = atomicReference;
        this.A02 = r303;
        this.A01 = r302;
        this.A00 = str == null ? "" : str;
        StringBuilder sb = new StringBuilder();
        sb.append("setting listener for event callback to: ");
        sb.append(atomicReference);
        C51f.A01("ServiceEventCallbackImpl", sb.toString(), new Object[0]);
    }

    public ServiceEventCallbackImpl(5L8 r302, 5Ko r303, AtomicReference atomicReference) {
        this.A03 = atomicReference;
        this.A02 = r303;
        this.A01 = r302;
        this.A00 = "";
        StringBuilder sb = new StringBuilder();
        sb.append("setting listener for event callback to: ");
        sb.append(atomicReference);
        C51f.A01("ServiceEventCallbackImpl", sb.toString(), new Object[0]);
    }

    @Override // com.facebook.exoplayer.monitor.VpsEventCallback
    public void ADT(6Cy r302) {
        5L8 r0;
        5NM r02 = (5NM) this.A03.get();
        6Cz r03 = r302.mEventType;
        5Ko r04 = this.A02;
        if (r04 != null) {
            if (r04.serviceEventLoggingDisabled && r03 != 6Cz.A0S) {
                return;
            }
            if (r03.ordinal() == 17 && !r04.logAbrDecisionEvent && ((r0 = this.A01) == null || !r0.BWZ())) {
                return;
            }
        }
        if (r02 != null) {
            r02.AR4(r302, r302.mEventType.mValue);
        } else {
            C51f.A01("ServiceEventCallbackImpl", "skipping log because listener is null", AnonymousClass001.A1Z());
        }
    }

    @Override // com.facebook.exoplayer.monitor.VpsEventCallback
    public void errorCallback(String str, String str2, String str3) {
        ADT(new Jw5(this.A00, str, str2, str3));
    }
}
