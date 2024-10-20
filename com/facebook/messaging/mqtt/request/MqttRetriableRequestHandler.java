package com.facebook.messaging.mqtt.request;

import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Hv;
import X.7zL;
import X.7zP;
import X.C00i;
import X.C1oE;
import X.C54e;
import X.DC6;
import android.content.Context;
import com.facebook.common.network.FbNetworkManager;

/* loaded from: MqttRetriableRequestHandler.class */
public final class MqttRetriableRequestHandler {
    public Context A00;
    public 1BY A01;
    public final FbNetworkManager A02;
    public final C00i A03;
    public final C00i A04;
    public final Deserializer A05;
    public final DC6 A06;
    public final C1oE A07;
    public final C54e A08;

    public MqttRetriableRequestHandler(1BO r302) {
        Context A0J = 7zP.A0J();
        this.A00 = A0J;
        this.A07 = (C1oE) 1Hv.A02(A0J, 66156);
        C54e c54e = (C54e) 1Bi.A03(49489);
        this.A08 = c54e;
        this.A03 = 1BQ.A02(84488);
        this.A02 = (FbNetworkManager) 1Bi.A03(16687);
        this.A06 = (DC6) 1Bi.A03(84695);
        this.A04 = 1BQ.A01();
        this.A01 = 7zL.A0Q(r302);
        this.A05 = new Deserializer(c54e);
    }
}
