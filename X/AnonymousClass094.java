package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.094, reason: invalid class name */
/* loaded from: 094.class */
public final class AnonymousClass094 {
    public static final AnonymousClass094 A00 = new Object();
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public C09D A00(Context context, String str) {
        11T.A0F(context, 0);
        11T.A0F(str, 1);
        ConcurrentHashMap concurrentHashMap = A01;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            boolean z = false;
            if (str.startsWith("rti.mqtt.")) {
                Integer[] A002 = 0S2.A00(19);
                int length = A002.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    Integer num = A002[i2];
                    if (11T.A0O(09B.A00(num), 0CU.A0A("rti.mqtt.", str))) {
                        switch (num.intValue()) {
                            case 1:
                            case 2:
                            case 4:
                            case 5:
                            case 17:
                            case 18:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                    } else {
                        i = i2 + 1;
                    }
                }
            }
            09C r0 = new 09C(context, str, z);
            obj = concurrentHashMap.putIfAbsent(str, r0);
            if (obj == null) {
                obj = r0;
            }
        }
        return (C09D) obj;
    }
}
