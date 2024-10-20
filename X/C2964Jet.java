package X;

import android.os.Bundle;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.Jet, reason: case insensitive filesystem */
/* loaded from: Jet.class */
public final class C2964Jet extends 0TD {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public C2964Jet(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public AccessibilityNodeInfoCompat A00(int i) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        AccessibilityNodeInfoCompat A07 = AndroidComposeViewAccessibilityDelegateCompat.A07(androidComposeViewAccessibilityDelegateCompat, i);
        if (androidComposeViewAccessibilityDelegateCompat.A0G && i == androidComposeViewAccessibilityDelegateCompat.A01) {
            androidComposeViewAccessibilityDelegateCompat.A0B = A07;
        }
        return A07;
    }

    public AccessibilityNodeInfoCompat A01(int i) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        KTa kTa = AndroidComposeViewAccessibilityDelegateCompat.A0X;
        return A00(androidComposeViewAccessibilityDelegateCompat.A01);
    }

    public void A02(Bundle bundle, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, int i) {
        AndroidComposeViewAccessibilityDelegateCompat.A0C(bundle, this.A00, accessibilityNodeInfoCompat, str, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x062b, code lost:
    
        if (r303 != 16908345) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x062e, code lost:
    
        r333 = false;
        r334 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0642, code lost:
    
        if (r303 == 16908347) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x065c, code lost:
    
        r335 = false;
        r312 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0674, code lost:
    
        if (r303 == 16908346) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0677, code lost:
    
        r312 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0682, code lost:
    
        if (r333 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0687, code lost:
    
        if (r334 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x068c, code lost:
    
        if (r307 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x068f, code lost:
    
        r336 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0694, code lost:
    
        if (r332 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x069c, code lost:
    
        if (r335 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x06a1, code lost:
    
        if (r312 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x06a6, code lost:
    
        if (r307 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x06a9, code lost:
    
        r337 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x06ae, code lost:
    
        if (r332 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0790, code lost:
    
        r0 = r0.A04;
        r0 = r0.A0T.A06;
        r0 = r0.B1N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x07ac, code lost:
    
        if (r0 == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x07af, code lost:
    
        r306 = r0.BZ3(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x07bc, code lost:
    
        r0 = X.KvJ.A00(r306.A02 - r306.A01, r306.A00 - r306.A03);
        r306 = r0.A05;
        r0 = X.AnonymousClass001.A0s();
        r0 = X.L5h.A00(r306, X.KdT.A07);
        r323 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0811, code lost:
    
        if (r0 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0814, code lost:
    
        r0 = (kotlin.jvm.functions.Function1) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0820, code lost:
    
        if (r0 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x082e, code lost:
    
        if (X.7zR.A1a(r0, r0) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0831, code lost:
    
        r323 = (java.lang.Number) r0.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x083c, code lost:
    
        r0 = X.L5h.A00(r306, X.KdT.A0I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x084c, code lost:
    
        if (r0 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x084f, code lost:
    
        r0 = (X.Kpf) X.L5h.A02(r306, X.KdW.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0868, code lost:
    
        if (r0 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x086d, code lost:
    
        if (r336 == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0872, code lost:
    
        if (r323 == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0875, code lost:
    
        r330 = r323.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x087e, code lost:
    
        if (r333 != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0883, code lost:
    
        if (r332 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0894, code lost:
    
        if (r0.A02 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0897, code lost:
    
        r330 = -r330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x08ac, code lost:
    
        if (r0.A0D != X.KMW.A02) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x08b1, code lost:
    
        if (r333 != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x08b6, code lost:
    
        if (r334 == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x08b9, code lost:
    
        r330 = -r330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x08c9, code lost:
    
        if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r0, r330) == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x08cc, code lost:
    
        r311 = X.KdT.A0D;
        r0 = r306.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x08e5, code lost:
    
        if (r0.containsKey(r311) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x08fa, code lost:
    
        if (r0.containsKey(X.KdT.A0E) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x08fd, code lost:
    
        r0 = (kotlin.jvm.functions.Function2) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0909, code lost:
    
        if (r0 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x090c, code lost:
    
        r305 = r0.invoke(java.lang.Float.valueOf(r330), java.lang.Float.valueOf(0.0f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x096f, code lost:
    
        if (r330 <= 0.0f) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0972, code lost:
    
        r311 = X.KdT.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0886, code lost:
    
        r330 = -r330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0929, code lost:
    
        r330 = X.LCr.A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x097a, code lost:
    
        r0 = (X.Kpf) X.L5h.A02(r306, X.KdW.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x098d, code lost:
    
        if (r0 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0992, code lost:
    
        if (r337 == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0997, code lost:
    
        if (r323 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x099a, code lost:
    
        r330 = r323.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x09a3, code lost:
    
        if (r335 != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x09a8, code lost:
    
        if (r332 == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x09b9, code lost:
    
        if (r0.A02 == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x09bc, code lost:
    
        r330 = -r330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x09cc, code lost:
    
        if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r0, r330) == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x09cf, code lost:
    
        r311 = X.KdT.A0F;
        r0 = r306.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x09e8, code lost:
    
        if (r0.containsKey(r311) != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x09fd, code lost:
    
        if (r0.containsKey(X.KdT.A0C) != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0a00, code lost:
    
        r0 = (kotlin.jvm.functions.Function2) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0a0c, code lost:
    
        if (r0 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0a0f, code lost:
    
        r305 = r0.invoke(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(r330));
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0a3e, code lost:
    
        if (r330 <= 0.0f) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0a41, code lost:
    
        r311 = X.KdT.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x09ab, code lost:
    
        r330 = -r330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0a2c, code lost:
    
        r330 = X.LCr.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0933, code lost:
    
        r306 = new X.L5L(0.0f, 0.0f, X.JQz.A02(r0.BB7()), X.JR0.A0I(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x06b1, code lost:
    
        r337 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x06b6, code lost:
    
        if (r307 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x06bb, code lost:
    
        if (r332 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x06be, code lost:
    
        r0 = r0.A05;
        r0 = (X.L4E) X.L5h.A02(r0, X.KdW.A0J);
        r0 = X.L5h.A00(r0, X.KdT.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06e6, code lost:
    
        if (r0 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06eb, code lost:
    
        if (r0 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x06ee, code lost:
    
        r0 = (X.AnonymousClass175) r0.A02;
        r0 = r0.A00;
        r329 = r0.A01;
        r330 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0713, code lost:
    
        if (r0 >= r329) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0716, code lost:
    
        r330 = r329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0723, code lost:
    
        if (r329 <= r0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0726, code lost:
    
        r329 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x072a, code lost:
    
        r0 = r0.A01;
        r0 = r330 - r329;
        r312 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0743, code lost:
    
        if (r0 <= 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0746, code lost:
    
        r312 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x074c, code lost:
    
        r330 = r0 / r312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x075a, code lost:
    
        if (r332 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x075d, code lost:
    
        r330 = -r330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0762, code lost:
    
        r0 = (kotlin.jvm.functions.Function1) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x076e, code lost:
    
        if (r0 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0771, code lost:
    
        r305 = r0.invoke(java.lang.Float.valueOf(r0.A00 + r330));
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0697, code lost:
    
        r336 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0645, code lost:
    
        r334 = false;
        r335 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0659, code lost:
    
        if (r303 == 16908344) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0614, code lost:
    
        if (r303 != 8192) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0fb8, code lost:
    
        if (r309 != false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0fd1, code lost:
    
        if (r309 != false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0fe5, code lost:
    
        if (r309 != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0b6f, code lost:
    
        if (r0.isTouchExplorationEnabled() == false) goto L282;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00bd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0131. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0151. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0ee2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0fe3  */
    /* JADX WARN: Removed duplicated region for block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v637, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v645, types: [java.lang.Boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(int r302, int r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 4092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2964Jet.A03(int, int, android.os.Bundle):boolean");
    }
}
