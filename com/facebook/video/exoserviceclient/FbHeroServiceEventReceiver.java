package com.facebook.video.exoserviceclient;

import X.0Q8;
import X.0fH;
import X.11T;
import X.5NM;
import X.6Cx;
import X.6Cy;
import X.6Cz;
import X.6De;
import X.6Dq;
import X.6Q0;
import X.6Q2;
import X.6Vh;
import X.6bL;
import X.6bM;
import X.6pR;
import X.7vA;
import X.7vB;
import X.7vC;
import X.7vE;
import X.AnonymousClass001;
import X.C2j0;
import X.H1D;
import X.H1F;
import X.H1G;
import X.IR8;
import X.Jvx;
import X.Jw0;
import X.Jw1;
import X.Jw2;
import X.Jw4;
import X.LVl;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.facebook.video.events.VideoCacheStatus;

/* loaded from: FbHeroServiceEventReceiver.class */
public final class FbHeroServiceEventReceiver extends ResultReceiver implements 5NM {
    public final C2j0 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FbHeroServiceEventReceiver(C2j0 c2j0) {
        super(null);
        11T.A0F(c2j0, 1);
        this.A00 = c2j0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0029. Please report as an issue. */
    public void AR4(6Cy r302, int i) {
        Object obj;
        C2j0 c2j0;
        7vC r309;
        6Cz r0 = r302.mEventType;
        0fH.A0g(r0.name(), "FbHeroServiceEventReceiver", "eventCallback(%s)");
        switch (r0.ordinal()) {
            case 0:
                obj = new LVl((Jw2) r302);
                this.A00.A01(obj);
                return;
            case 1:
                6Q0 r02 = (6Q0) r302;
                11T.A09(r02.videoId);
                11T.A09(r02.renderMode);
                obj = new 6Q2(new VideoCacheStatus(r02.steamType, r02.ready));
                this.A00.A01(obj);
                return;
            case 2:
                obj = new IR8((H1G) r302);
                this.A00.A01(obj);
                return;
            case 4:
                obj = new 6Dq((6De) r302);
                this.A00.A01(obj);
                return;
            case 11:
                6Cx r03 = (6Cx) r302;
                11T.A09(r03.videoId);
                11T.A09(r03.streamType);
                obj = new Object();
                this.A00.A01(obj);
                return;
            case 16:
                11T.A09(((Jw4) r302).videoId);
                obj = new Object();
                this.A00.A01(obj);
                return;
            case 17:
                obj = new 7vA((H1F) r302);
                this.A00.A01(obj);
                return;
            case 18:
                obj = new 7vE((Jw0) r302);
                this.A00.A01(obj);
                return;
            case 20:
                throw AnonymousClass001.A0Q("videoId");
            case 24:
                Jvx jvx = (Jvx) r302;
                if ("STREAM_INFO".equals(jvx.severity)) {
                    c2j0 = this.A00;
                    r309 = new 7vE(jvx);
                    c2j0.A01(r309);
                    return;
                }
                return;
            case 25:
                11T.A0F((Object) null, 1);
                throw 0Q8.createAndThrow();
            case 26:
                c2j0 = this.A00;
                r309 = new 7vB((H1D) r302);
                c2j0.A01(r309);
                return;
            case 27:
                c2j0 = this.A00;
                r309 = new 7vC((Jw1) r302);
                c2j0.A01(r309);
                return;
            case 33:
                obj = new 6bM((6bL) r302);
                this.A00.A01(obj);
                return;
            case 34:
                obj = new 6pR((6Vh) r302);
                this.A00.A01(obj);
                return;
            default:
                return;
        }
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        11T.A0F(bundle, 1);
        bundle.setClassLoader(6Cy.class.getClassLoader());
        6Cy r0 = (6Cy) bundle.getSerializable("ServiceEvent");
        if (r0 == null) {
            0fH.A0j("FbHeroServiceEventReceiver", "eventCallback() for null event");
        } else {
            AR4(r0, r0.mEventType.mValue);
        }
    }
}
