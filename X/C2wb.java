package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.2wb, reason: invalid class name */
/* loaded from: 2wb.class */
public final class C2wb {
    public final 1Br A01 = 1Bq.A00(16385);
    public final 1Br A00 = 1Bq.A00(16511);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.util.List] */
    public static final C2wd A00(C2wb c2wb, String str) {
        C0ty c0ty;
        C2wd c2wd;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A00 = 11T.A00(str.charAt(i2), 32);
            boolean z2 = false;
            if (A00 <= 0) {
                z2 = true;
            }
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() != 0) {
            List A03 = new C04t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(str, 0);
            if (!A03.isEmpty()) {
                ListIterator listIterator = A03.listIterator(A03.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        c0ty = 0QD.A0Y(A03, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            c0ty = C0ty.A00;
            String[] strArr = (String[]) c0ty.toArray(new String[0]);
            int length2 = strArr.length;
            c2wd = new C2wd(length2);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= length2) {
                    break;
                }
                String str2 = strArr[i4];
                int length3 = str2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length3) {
                    int i6 = length3;
                    if (!z3) {
                        i6 = i5;
                    }
                    int A002 = 11T.A00(str2.charAt(i6), 32);
                    boolean z4 = false;
                    if (A002 <= 0) {
                        z4 = true;
                    }
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length3--;
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                String obj = str2.subSequence(i5, length3 + 1).toString();
                if (obj.length() != 0) {
                    try {
                        c2wd.A00.A09(Integer.parseInt(obj), c2wd);
                    } catch (NumberFormatException e) {
                        ((C01s) c2wb.A00.A00.get()).softReport("SiblingSessionLogger", 0Pz.A0W("Parse error for QPL id: ", obj), e);
                    }
                }
                i3 = i4 + 1;
            }
        } else {
            c2wd = new C2wd();
        }
        return c2wd;
    }
}
