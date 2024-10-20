package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Lqu.class */
public final class Lqu implements Runnable {
    public static final String __redex_internal_original_name = "UserMqttConnection$5";
    public final /* synthetic */ long A00;
    public final /* synthetic */ L3P A01;
    public final /* synthetic */ C16h A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public Lqu(L3P l3p, C16h c16h, String str, byte[] bArr, long j) {
        this.A01 = l3p;
        this.A03 = str;
        this.A04 = bArr;
        this.A00 = j;
        this.A02 = c16h;
    }

    @Override // java.lang.Runnable
    public void run() {
        L3P l3p = this.A01;
        ROS ros = l3p.A0H;
        String str = l3p.A0N;
        String str2 = this.A03;
        byte[] bArr = this.A04;
        long j = this.A00;
        boolean z = false;
        try {
            if (str2.startsWith((String) 09V.A00.get(ActionId.VIDEO_PLAYING))) {
                try {
                    ros.A00.A0A(null, 0S2.A01, str2, bArr);
                } catch (0Mb unused) {
                }
                z = true;
            } else {
                Khc khc = ros.A01;
                Intent A0A = 4YU.A0A("com.facebook.multiusermqtt.ACTION_MQTT_PUBLISH_ARRIVED");
                Bundle A05 = 1BK.A05();
                A05.putString("user_id", str);
                A05.putString("topic_name", str2);
                A05.putByteArray("payload", bArr);
                A05.putLong(1BJ.A00(218), j);
                A0A.putExtras(A05);
                khc.A01.CkS(A0A);
                if (j > 0) {
                    ((C1Ar) ros.A02.A05(C1Ar.class)).A04(16F.A02, JQx.A0O(j));
                    ros.A06.A0B(str2, JQx.A0O(j));
                }
                Set set = ros.A03;
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    it.next();
                    try {
                        throw AnonymousClass001.A0Q("onMessage");
                    } catch (Throwable unused2) {
                        throw AnonymousClass001.A0Q("getHandlerName");
                    }
                } else if (0 == set.size()) {
                    z = true;
                }
            }
        } catch (Throwable th) {
            0fH.A0P(ROS.class, "Error in onPublishArrived", th, new Object[0]);
        }
        0fH.A0d(Boolean.valueOf(z), str2, "UserMqttConnection", "onPublishArrived: %b %s");
        if (z && str2.startsWith("/graphql")) {
            java.util.Map map = l3p.A0B.A00;
            0fH.A0c(map.get(str2), str2, Integer.valueOf(map.size()), "MqttClientGqlsTopicsTracker", "onPublishArrived to maybePublishDelivered: %s %s %d");
        }
        this.A02.A00();
    }
}
