package X;

import android.os.ConditionVariable;

/* renamed from: X.0y3, reason: invalid class name */
/* loaded from: 0y3.class */
public abstract class C0y3 {
    public static final ConditionVariable A00 = new ConditionVariable(true);
    public static final java.util.Map A01 = AnonymousClass001.A0u();

    public static void A00() {
        String str;
        ConditionVariable conditionVariable = A00;
        boolean block = conditionVariable.block(-1);
        Object[] objArr = {Integer.valueOf(conditionVariable.hashCode())};
        if (block) {
            str = "Not blocking Provider (%s)";
        } else {
            0fH.A17("InitStatus", "Blocking Provider (%s)", objArr);
            conditionVariable.block();
            objArr = AnonymousClass001.A1a(conditionVariable.hashCode());
            str = "Unblocked Provider (%s)";
        }
        0fH.A17("InitStatus", str, objArr);
    }
}
