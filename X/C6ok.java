package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.6ok, reason: invalid class name */
/* loaded from: 6ok.class */
public abstract class C6ok {
    public static final TextUtils.TruncateAt[] A01 = TextUtils.TruncateAt.values();
    public static final 2KG A00 = 2KG.A07;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r0 != 8388613) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.2KG A00(int r301, int r302) {
        /*
            r0 = r301
            switch(r0) {
                case 0: goto L30;
                case 1: goto L30;
                case 2: goto L5d;
                case 3: goto L61;
                case 4: goto L75;
                case 5: goto L69;
                case 6: goto L65;
                default: goto L2c;
            }
        L2c:
            X.2KG r0 = X.C6ok.A00
            return r0
        L30:
            r0 = r302
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r1
            r302 = r0
            r0 = 1
            r301 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L75
            r0 = 3
            r301 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L71
            r0 = 5
            r301 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L6d
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r301 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L69
            r0 = 8388613(0x800005, float:1.175495E-38)
            r301 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L65
            goto L2c
        L5d:
            X.2KG r0 = X.2KG.A07
            return r0
        L61:
            X.2KG r0 = X.2KG.A06
            return r0
        L65:
            X.2KG r0 = X.2KG.A02
            return r0
        L69:
            X.2KG r0 = X.2KG.A03
            return r0
        L6d:
            X.2KG r0 = X.2KG.A05
            return r0
        L71:
            X.2KG r0 = X.2KG.A04
            return r0
        L75:
            X.2KG r0 = X.2KG.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ok.A00(int, int):X.2KG");
    }

    public static void A01(TypedArray typedArray, 66W r302, 66W r303, 66W r304, 66W r305, 66W r306, 66W r307, 66W r308, 66W r309, 66W r310, 66W r311, 66W r312, 66W r313, 66W r314, 66W r315, 66W r316, 66W r317, 66W r318, 66W r319, 66W r320, 66W r321, 66W r322, 66W r323, 66W r324, 66W r325, 66W r326, 66W r327, 66W r328) {
        int i;
        2K4 valueOf;
        66W r339;
        int indexCount = typedArray.getIndexCount();
        int i2 = 1;
        String str = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            if (i3 >= indexCount) {
                break;
            }
            int index = typedArray.getIndex(i3);
            if (index == 9) {
                valueOf = typedArray.getString(index);
                r339 = r313;
            } else if (index == 2) {
                valueOf = typedArray.getColorStateList(index);
                r339 = r314;
            } else if (index == 0) {
                valueOf = Integer.valueOf(typedArray.getDimensionPixelSize(index, 0));
                r339 = r317;
            } else {
                if (index == 5) {
                    int integer = typedArray.getInteger(index, 0);
                    if (integer > 0) {
                        r302.A00 = A01[integer - 1];
                    }
                } else if (index == 25) {
                    i2 = typedArray.getInt(index, -1);
                    r318.A00 = A00(i2, i4);
                } else if (index == 6) {
                    i4 = typedArray.getInt(index, -1);
                    r318.A00 = A00(i2, i4);
                    int i5 = i4 & ActionId.MISSED_EVENT;
                    valueOf = i5 != 16 ? i5 != 48 ? i5 != 80 ? 2KZ.A0q : 2K4.A02 : 2K4.A04 : 2K4.A03;
                    r339 = r327;
                } else if (index == 15) {
                    r304.A00 = Boolean.valueOf(typedArray.getBoolean(index, false));
                } else if (index == 11) {
                    valueOf = Integer.valueOf(typedArray.getInteger(index, -1));
                    r339 = r306;
                } else if (index == 10) {
                    valueOf = Integer.valueOf(typedArray.getInteger(index, -1));
                    r339 = r307;
                } else if (index == 14) {
                    valueOf = Boolean.valueOf(typedArray.getBoolean(index, false));
                    r339 = r312;
                } else if (index == 4) {
                    valueOf = Integer.valueOf(typedArray.getColor(index, 0));
                    r339 = r315;
                } else if (index == 3) {
                    valueOf = Integer.valueOf(typedArray.getColor(index, 0));
                    r339 = r316;
                } else if (index == 1) {
                    r322.A00 = Integer.valueOf(typedArray.getInteger(index, 0));
                } else if (index == 20) {
                    r303.A00 = Float.valueOf(typedArray.getDimensionPixelOffset(index, 0));
                } else if (index == 21) {
                    r305.A00 = Float.valueOf(typedArray.getFloat(index, 0.0f));
                } else if (index == 17) {
                    valueOf = Float.valueOf(typedArray.getFloat(index, 0.0f));
                    r339 = r324;
                } else if (index == 18) {
                    valueOf = Float.valueOf(typedArray.getFloat(index, 0.0f));
                    r339 = r325;
                } else if (index == 19) {
                    valueOf = Float.valueOf(typedArray.getFloat(index, 0.0f));
                    r339 = r323;
                } else if (index == 16) {
                    valueOf = Integer.valueOf(typedArray.getColor(index, 0));
                    r339 = r326;
                } else if (index == 13) {
                    valueOf = Integer.valueOf(typedArray.getInteger(index, -1));
                    r339 = r308;
                } else if (index == 12) {
                    valueOf = Integer.valueOf(typedArray.getInteger(index, -1));
                    r339 = r309;
                } else if (index == 8) {
                    valueOf = Integer.valueOf(typedArray.getDimensionPixelSize(index, 0));
                    r339 = r310;
                } else if (index == 7) {
                    float f = 0.0f / 0.0f;
                    valueOf = Integer.valueOf(typedArray.getDimensionPixelSize(index, (-1) >>> 1));
                    r339 = r311;
                } else if (index == 24) {
                    str = typedArray.getString(index);
                } else if (index == 26) {
                    valueOf = Integer.valueOf(typedArray.getInt(index, 0));
                    r339 = r319;
                } else if (index == 27) {
                    valueOf = Integer.valueOf(typedArray.getInt(index, 0));
                    r339 = r320;
                } else if (index == 28) {
                    valueOf = Integer.valueOf(typedArray.getInt(index, 0));
                    r339 = r321;
                }
                i3++;
            }
            r339.A00 = valueOf;
            i3++;
        }
        if (str != null) {
            Number number = (Number) r322.A00;
            if (number != null) {
                i = number.intValue();
            }
            r328.A00 = Typeface.create(str, i);
        }
    }

    public static void A02(1Iw r301, 66W r302, 66W r303, 66W r304, 66W r305, 66W r306, 66W r307, 66W r308, 66W r309, 66W r310, 66W r311, 66W r312, 66W r313, 66W r314, 66W r315, 66W r316, 66W r317, 66W r318, 66W r319, 66W r320, 66W r321, 66W r322, 66W r323, 66W r324, 66W r325, 66W r326, 66W r327, 66W r328) {
        Resources.Theme theme = r301.A0D.getTheme();
        TypedArray A02 = r301.A02(0, C53r.A05);
        int resourceId = A02.getResourceId(0, -1);
        A02.recycle();
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(resourceId, C53r.A04);
            A01(obtainStyledAttributes, r302, r303, r304, r305, r306, r307, r308, r309, r310, r311, r312, r313, r314, r315, r316, r317, r318, r319, r320, r321, r322, r323, r324, r325, r326, r327, r328);
            obtainStyledAttributes.recycle();
        }
        TypedArray A022 = r301.A02(0, C53r.A04);
        A01(A022, r302, r303, r304, r305, r306, r307, r308, r309, r310, r311, r312, r313, r314, r315, r316, r317, r318, r319, r320, r321, r322, r323, r324, r325, r326, r327, r328);
        A022.recycle();
    }
}
