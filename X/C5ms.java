package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.5ms, reason: invalid class name */
/* loaded from: 5ms.class */
public final class C5ms implements C5mp {
    public static final ImmutableMap A00;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put("369239263222822", "1414612202018851");
        builder.put("369239343222814", "1414612185352186");
        builder.put("369239383222810", "1414612162018855");
        A00 = builder.build();
    }

    @Override // X.C5mp
    public C5fv CZN(C5j5 c5j5, Capabilities capabilities, C5fv c5fv) {
        11T.A0F(c5fv, 0);
        if (c5fv instanceof 5gP) {
            5gP r0 = (5gP) c5fv;
            String str = (String) A00.get(r0.A01);
            if (str != null) {
                C5w5 c5w5 = new C5w5(r0);
                c5w5.A01 = str;
                c5fv = new 5gP(c5w5);
            }
        }
        return c5fv;
    }
}
