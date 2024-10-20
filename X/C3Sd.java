package X;

import com.facebook.litho.BaseMountingView;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.3Sd, reason: invalid class name */
/* loaded from: 3Sd.class */
public final class C3Sd {
    public static final C3Sd A00 = new Object();

    public static final void A00(C3Sd c3Sd, C3RL c3rl, StringBuilder sb, int i) {
        boolean z;
        C1sr c1sr = null;
        25R r307 = null;
        sb.append(c3rl.A02().A0a());
        sb.append('{');
        BaseMountingView A01 = c3rl.A01();
        if (c3rl.A01 == 0) {
            r307 = c3rl.A06;
            z = true;
            c1sr = r307.A01();
        } else {
            z = false;
        }
        sb.append((A01 == null || A01.getVisibility() != 0) ? "H" : "V");
        if (z) {
            29K r0 = c1sr.A0N;
            if (r0 != null && r0.A0I != null) {
                sb.append(" [clickable]");
            }
            sb.append(" ");
            11T.A0F(r307, 0);
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r307.A02.A0K;
            float[] fArr = yogaNodeJNIBase.arr;
            sb.append(fArr != null ? fArr[2] : 0.0f);
            sb.append("x");
            float[] fArr2 = yogaNodeJNIBase.arr;
            sb.append(fArr2 != null ? fArr2[1] : 0.0f);
        }
        sb.append('}');
        for (C3RL c3rl2 : c3rl.A03()) {
            sb.append("\n");
            if (i >= 0) {
                while (true) {
                    sb.append("  ");
                    int i2 = i2 != i ? i2 + 1 : 0;
                }
            }
            A00(c3Sd, c3rl2, sb, i + 1);
        }
    }
}
