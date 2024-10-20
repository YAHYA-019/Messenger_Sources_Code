package X;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: Fow.class */
public final class Fow implements MKh {
    public static final Pattern A0H;
    public static final Pattern A0I;
    public static final Pattern A0J;
    public static final Pattern A0K;
    public static final ImmutableSet A0L;
    public static final ImmutableSet A0M;
    public static final ImmutableSet A0N;
    public static final ImmutableSet A0O;
    public static final ImmutableSet A0P;
    public int A00;
    public int A01;
    public int A02;
    public EM8 A03;
    public Exception A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final 1Br A0E = 1BK.A0D();
    public final 1Br A0F = 1BK.A0C();
    public final boolean A0G;

    static {
        Integer A0i = 7zN.A0i();
        A0K = Pattern.compile("\"is_transient\"[\\s]*:[\\s]*([truefalsTRUEFALS]+)\\W");
        A0H = Pattern.compile("\"code\"[\\s]*:[\\s]*(\\d+)\\W");
        A0I = Pattern.compile("\"error_code\"[\\s]*:[\\s]*(\\d+)\\W");
        A0J = Pattern.compile("\"error_subcode\"[\\s]*:[\\s]*(\\d+)\\W");
        A0L = ImmutableSet.A02(A0i, 2);
        A0M = ImmutableSet.A02(368, 3114018);
        A0P = ImmutableSet.A06(302, 307, 308, 408, 502, 503, 504);
        A0O = ImmutableSet.A04(A0i, 2, 1366043, 1366046);
        A0N = ImmutableSet.A06(1349124, 1366002, 1366035, 1366050, 1366064, 1367008, 1376025, 1399017, 1455003, 1607036, 1610002, 1610003, 1610007, 1462004);
    }

    public Fow(Throwable th, boolean z) {
        if (th != null) {
            A01((Exception) (th instanceof Exception ? th : AnonymousClass001.A0U(th)));
        }
        this.A0G = z;
    }

    public static final long A00(String str, Pattern pattern, int i) {
        String group;
        long j = -1;
        if (str == null) {
            return j;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find(i) && (group = matcher.group(1)) != null) {
            try {
                return Long.parseLong(group);
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x06dc, code lost:
    
        if (X.11T.A0P("Internal Server Error", 1, r0) == true) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0414, code lost:
    
        if (X.0CU.A0T(r0, "{\"debug_info\":{\"retriable\":false,\"type\":\"ParameterValidationError\",", false) != true) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(java.lang.Exception r302) {
        /*
            Method dump skipped, instructions count: 2546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fow.A01(java.lang.Exception):void");
    }

    @Override // X.MKh
    public int AkN() {
        return this.A00;
    }

    @Override // X.MKh
    public String AkR() {
        return this.A05;
    }

    @Override // X.MKh
    public String Aks() {
        Class<?> cls;
        Exception exc = this.A04;
        if (exc == null || (cls = exc.getClass()) == null) {
            return null;
        }
        return cls.getName();
    }

    @Override // X.MKh
    public int ApV() {
        return this.A02;
    }

    @Override // X.MKh
    public String Arm() {
        String A1A = 0Pz.A1A("Network:", ";Retry:", this.A0C, this.A0B);
        11T.A0A(A1A);
        return A1A;
    }

    @Override // X.MKh
    public String BGb() {
        if (this.A0G) {
            return 0G8.A01(this.A04);
        }
        return null;
    }
}
