package X;

import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.XplatServiceDelegate;

/* renamed from: X.1li, reason: invalid class name */
/* loaded from: 1li.class */
public final class C1li {
    public ConnectionConfig A00;

    public int A00(MqttPublishListener mqttPublishListener, C1nm c1nm, String str, String str2, byte[] bArr) {
        11T.A0F(bArr, 1);
        11T.A0F(c1nm, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("xplat client publish to ");
        sb.append(str);
        sb.append(" with level ");
        sb.append(c1nm);
        sb.append(". client=");
        sb.append(XplatServiceDelegate.A08);
        0fH.A0j("MqttXplatService", sb.toString());
        return XplatServiceDelegate.A02.A00(mqttPublishListener, c1nm, str, str2, bArr);
    }
}
