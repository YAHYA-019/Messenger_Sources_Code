package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4sl.class */
public abstract class AbstractC10164sl {
    public static final String[] A00 = {"cache", "files", "databases"};

    public static final String A00(int i, String str) {
        11T.A0F(str, 1);
        String A02 = A02(str);
        boolean z = false;
        if (A02.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        if (i == -1) {
            String[] strArr = A00;
            int i2 = 0;
            while (!A02.equals(strArr[i2])) {
                i2++;
                if (i2 >= 3) {
                    String str2 = File.separator;
                    String A0W = 0Pz.A0W(A02, str2);
                    11T.A0F("__i_know_what_i_am_doing__", 1);
                    if (A02.endsWith("__i_know_what_i_am_doing__")) {
                        String A022 = A02(0CV.A0W(A02, "__i_know_what_i_am_doing__", ""));
                        if (A022.length() == 0) {
                            return null;
                        }
                        A0W = 0Pz.A0W(A022, str2);
                    }
                    return A0W;
                }
            }
            return null;
        }
        String str3 = File.separator;
        11T.A0B(str3);
        String[] strArr2 = (String[]) new C04t(str3).A03(A02, 0).toArray(new String[0]);
        int length = strArr2.length;
        ArrayList arrayList = new ArrayList(length);
        int i3 = 1;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                break;
            }
            String str4 = strArr2[i4];
            int length2 = str4.length() - 1;
            int i5 = 0;
            boolean z2 = false;
            while (i5 <= length2) {
                int i6 = length2;
                if (!z2) {
                    i6 = i5;
                }
                int A002 = 11T.A00(str4.charAt(i6), 32);
                boolean z3 = false;
                if (A002 <= 0) {
                    z3 = true;
                }
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length2--;
                } else if (z3) {
                    i5++;
                } else {
                    z2 = true;
                }
            }
            String obj = str4.subSequence(i5, length2 + 1).toString();
            if (obj.length() != 0) {
                arrayList.add(obj);
            }
            i3 = i4 + 1;
        }
        String str5 = strArr2[0];
        int length3 = str5.length() - 1;
        int i7 = 0;
        boolean z4 = false;
        while (i7 <= length3) {
            int i8 = length3;
            if (!z4) {
                i8 = i7;
            }
            int A003 = 11T.A00(str5.charAt(i8), 32);
            boolean z5 = false;
            if (A003 <= 0) {
                z5 = true;
            }
            if (z4) {
                if (!z5) {
                    break;
                }
                length3--;
            } else if (z5) {
                i7++;
            } else {
                z4 = true;
            }
        }
        return 1N0.A00(str5.subSequence(i7, length3 + 1).toString(), arrayList, i);
    }

    public static final String A01(String str) {
        11T.A0F(str, 0);
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = 11T.A00(str.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
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
        String obj = str.subSequence(i, length + 1).toString();
        if (obj == null || obj.length() == 0) {
            obj = "always";
        }
        return obj;
    }

    public static final String A02(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A002 = 11T.A00(str.charAt(i2), 32);
            boolean z2 = false;
            if (A002 <= 0) {
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
        String A003 = new C04t("/+$").A00(new C04t("^/+").A00(str.subSequence(i, length + 1).toString(), ""), "");
        int length2 = A003.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length2) {
            int i4 = length2;
            if (!z3) {
                i4 = i3;
            }
            int A004 = 11T.A00(A003.charAt(i4), 32);
            boolean z4 = false;
            if (A004 <= 0) {
                z4 = true;
            }
            if (z3) {
                if (!z4) {
                    break;
                }
                length2--;
            } else if (z4) {
                i3++;
            } else {
                z3 = true;
            }
        }
        return A003.subSequence(i3, length2 + 1).toString();
    }

    public static final java.util.Map A03(String str, int i) {
        HashMap A0G;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                int i3 = length;
                if (!z) {
                    i3 = i2;
                }
                int A002 = 11T.A00(str.charAt(i3), 32);
                boolean z2 = false;
                if (A002 <= 0) {
                    z2 = true;
                }
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            String obj = str.subSequence(i2, length + 1).toString();
            if (obj != null && obj.length() != 0) {
                A0G = new HashMap();
                String[] strArr = (String[]) new C04t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(str, 0).toArray(new String[0]);
                int length2 = strArr.length;
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= length2) {
                        break;
                    }
                    String[] strArr2 = (String[]) new C04t(":").A03(strArr[i5], 0).toArray(new String[0]);
                    int length3 = strArr2.length;
                    if (length3 != 0 && length3 <= 2) {
                        String str2 = strArr2[0];
                        int length4 = str2.length() - 1;
                        int i6 = 0;
                        boolean z3 = false;
                        while (i6 <= length4) {
                            int i7 = length4;
                            if (!z3) {
                                i7 = i6;
                            }
                            int A003 = 11T.A00(str2.charAt(i7), 32);
                            boolean z4 = false;
                            if (A003 <= 0) {
                                z4 = true;
                            }
                            if (z3) {
                                if (!z4) {
                                    break;
                                }
                                length4--;
                            } else if (z4) {
                                i6++;
                            } else {
                                z3 = true;
                            }
                        }
                        String A004 = A00(i, str2.subSequence(i6, length4 + 1).toString());
                        if (A004 != null) {
                            A0G.put(A004, A01(length3 > 1 ? strArr2[1] : "always"));
                        }
                    }
                    i4 = i5 + 1;
                }
                return A0G;
            }
        }
        A0G = 04R.A0G();
        return A0G;
    }
}
