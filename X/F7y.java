package X;

import android.R;
import java.util.concurrent.TimeUnit;

/* loaded from: F7y.class */
public final class F7y {
    public final C03b A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public F7y(C03b c03b, boolean z) {
        StringBuilder A0k;
        String str;
        String A0k2;
        StringBuilder A0n;
        String str2;
        this.A00 = c03b;
        this.A03 = z;
        switch (c03b.getMarkerId()) {
            case 1900577:
                String AWx = c03b.AWx(4YT.A00(339));
                if (AWx != null) {
                    int hashCode = AWx.hashCode();
                    if (hashCode != -1795279315) {
                        if (hashCode == 93085214 && AWx.equals("arltw")) {
                            A0k2 = "Watch Feed ARLTW TTRC";
                            break;
                        }
                    } else if (AWx.equals("arltw_related_videos")) {
                        A0k2 = "Warion Chaining TTRC";
                        break;
                    }
                }
                A0k2 = "Watch Feed TTRC";
                break;
            case 10223620:
                A0k = AnonymousClass001.A0k();
                A0k.append(A00(c03b));
                str = " Tail Load";
                A0k2 = AnonymousClass001.A0d(str, A0k);
                break;
            case 10223627:
                String AWx2 = c03b.AWx("topic");
                A0k = AnonymousClass001.A0k();
                A0k.append("Watch Topic ");
                A0k.append(AWx2);
                str = " TTRC";
                A0k2 = AnonymousClass001.A0d(str, A0k);
                break;
            case 10223633:
                A0k2 = "Warion Transition";
                break;
            case 10223634:
                A0k2 = 0Pz.A0k(A00(c03b), " Head Load (", c03b.AWx("fetch_reason"), ')');
                break;
            case R.raw.fallbackring:
                A0k = AnonymousClass001.A0k();
                A0k.append(A00(c03b));
                str = " Spinner";
                A0k2 = AnonymousClass001.A0d(str, A0k);
                break;
            default:
                A0k2 = 0Kv.A00(c03b.getMarkerId());
                break;
        }
        this.A02 = A0k2;
        if (A01()) {
            C03b c03b2 = this.A00;
            String str3 = null;
            long AyF = c03b2.AyF();
            AnonymousClass044 B3n = c03b2.B3n();
            if (B3n != null) {
                for (int i = 0; i < B3n.A01; i++) {
                    AyF = TimeUnit.NANOSECONDS.toMillis(B3n.A03[i]);
                    str3 = B3n.A06[i];
                    11T.A0F(str3, 3);
                }
                if (str3 != null) {
                    A0n = AnonymousClass001.A0k();
                    A0n.append("Last point: ");
                    A0n.append(str3);
                    A0n.append(' ');
                    A0n.append(EVG.A00(AyF));
                    str2 = A0n.toString();
                }
            }
            str2 = null;
        } else if (this.A03) {
            str2 = "Dropped";
        } else {
            C03b c03b3 = this.A00;
            if (c03b3.getMarkerId() == 10223634) {
                c03b3.AWx("fetch_reason");
            }
            int AiX = c03b3.AiX();
            A0n = AnonymousClass001.A0n(AiX <= 500 ? "Fluid" : AiX <= 1000 ? "Responsive" : AiX <= 2000 ? "Contingent" : AiX <= 3000 ? "Slow" : "Outlier");
            A0n.append(" (");
            A0n.append(0Fx.A00(c03b3.AVI()));
            A0n.append(')');
            str2 = A0n.toString();
        }
        this.A01 = str2;
    }

    public static final String A00(C03b c03b) {
        String str;
        StringBuilder A0k;
        boolean A0O = 11T.A0O(c03b.AWx("is_warion"), "true");
        String AWx = c03b.AWx(4YT.A00(174));
        String AWx2 = c03b.AWx("player_suborigin");
        if (A0O) {
            A0k = AnonymousClass001.A0k();
            str = "Warion ";
        } else {
            if (11T.A0O(AWx, "video_home") && 11T.A0O(AWx2, "feed")) {
                return "Watch Feed";
            }
            boolean z = true;
            if (AWx2 == null || !11T.A0P("topic", 1, AWx2)) {
                z = false;
            }
            str = "Watch ";
            if (z) {
                A0k = AnonymousClass001.A0n(str);
                return AnonymousClass001.A0d(AWx2, A0k);
            }
            A0k = AnonymousClass001.A0k();
        }
        A0k.append(str);
        A0k.append(AWx);
        A0k.append(':');
        return AnonymousClass001.A0d(AWx2, A0k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r301.A00.AiY() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L25
            r0 = r301
            X.03b r0 = r0.A00
            r303 = r0
            r0 = r303
            long r0 = r0.AiY()
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 1
            r302 = r0
            r0 = r308
            if (r0 == 0) goto L29
        L25:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L29:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F7y.A01():boolean");
    }
}
