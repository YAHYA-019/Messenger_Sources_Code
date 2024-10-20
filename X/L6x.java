package X;

import java.util.regex.Pattern;

/* loaded from: L6x.class */
public abstract class L6x {
    public static final Pattern A00 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A01 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        Object obj;
        switch (str.hashCode()) {
            case -1364013995:
                obj = "center";
                break;
            case -1074341483:
                obj = "middle";
                break;
            case 100571:
                if (str.equals("end")) {
                    return 2;
                }
                5My.A04("WebvttCueParser", 0Pz.A0W("Invalid anchor value: ", str));
                return (-1) << (-1);
            case 109757538:
                if (str.equals("start")) {
                    return 0;
                }
                5My.A04("WebvttCueParser", 0Pz.A0W("Invalid anchor value: ", str));
                return (-1) << (-1);
            default:
                5My.A04("WebvttCueParser", 0Pz.A0W("Invalid anchor value: ", str));
                return (-1) << (-1);
        }
        if (str.equals(obj)) {
            return 1;
        }
        5My.A04("WebvttCueParser", 0Pz.A0W("Invalid anchor value: ", str));
        return (-1) << (-1);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0024. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(android.text.SpannableStringBuilder r301, X.L0M r302, java.util.List r303, java.util.List r304) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L6x.A01(android.text.SpannableStringBuilder, X.L0M, java.util.List, java.util.List):void");
    }
}
