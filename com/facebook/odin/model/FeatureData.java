package com.facebook.odin.model;

import X.03W;
import X.04R;
import X.0Pz;
import X.11T;
import X.5Yu;
import X.5ZL;
import X.5ZP;
import X.5ZR;
import X.5cI;
import X.C04v;
import X.C0ty;
import X.JQz;
import X.JR0;
import X.Lv3;
import X.Lv6;
import X.LvM;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/* loaded from: FeatureData.class */
public final class FeatureData extends C04v {
    public static final 5Yu[] A0E;
    public static final Companion Companion = new Object();
    public final double A00;
    public final long A01;
    public final Type A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final boolean A0D;

    /* loaded from: FeatureData$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return FeatureData$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.odin.model.FeatureData$Companion, java.lang.Object] */
    static {
        5Yu A00 = LvM.A00("com.facebook.odin.model.Type", Type.values());
        5ZP r0 = 5ZP.A00;
        5Yu r02 = new 5cI(r0);
        Lv6 lv6 = Lv6.A00;
        5Yu r03 = new 5cI(lv6);
        5ZL r04 = 5ZL.A01;
        5Yu r05 = new 5cI(r04);
        Lv3 lv3 = Lv3.A00;
        A0E = new 5Yu[]{null, A00, null, null, null, null, r02, r03, r05, new 5cI(lv3), new 5ZR(r04, r0), new 5ZR(r04, lv6), new 5ZR(r04, r04), new 5ZR(r04, lv3)};
    }

    public FeatureData() {
        Type type = Type.A06;
        C0ty c0ty = C0ty.A00;
        03W A0G = 04R.A0G();
        03W A0G2 = 04R.A0G();
        03W A0G3 = 04R.A0G();
        03W A0G4 = 04R.A0G();
        11T.A0F(c0ty, 7);
        11T.A0F(A0G, 11);
        11T.A0F(A0G2, 12);
        11T.A0F(A0G3, 13);
        11T.A0F(A0G4, 14);
        this.A03 = "";
        this.A02 = type;
        this.A01 = -1;
        this.A00 = -1.0d;
        this.A04 = null;
        this.A0D = false;
        this.A07 = c0ty;
        this.A06 = c0ty;
        this.A08 = c0ty;
        this.A05 = c0ty;
        this.A0B = A0G;
        this.A0A = A0G2;
        this.A0C = A0G3;
        this.A09 = A0G4;
    }

    public /* synthetic */ FeatureData(Type type, String str, String str2, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, double d, int i, long j, boolean z) {
        Type type2 = type;
        List list5 = list;
        String str3 = str2;
        List list6 = list4;
        List list7 = list3;
        List list8 = list2;
        Map map5 = map3;
        Map map6 = map2;
        Map map7 = map;
        Map map8 = map4;
        double d2 = d;
        long j2 = j;
        this.A03 = (i & 1) == 0 ? "" : str;
        this.A02 = (i & 2) == 0 ? Type.A06 : type2;
        this.A01 = (i & 4) == 0 ? -1 : j2;
        this.A00 = (i & 8) == 0 ? -1.0d : d2;
        this.A04 = (i & 16) == 0 ? null : str3;
        if ((i & 32) == 0) {
            this.A0D = false;
        } else {
            this.A0D = z;
        }
        this.A07 = (i & 64) == 0 ? C0ty.A00 : list5;
        this.A06 = (i & 128) == 0 ? C0ty.A00 : list8;
        this.A08 = (i & 256) == 0 ? C0ty.A00 : list7;
        this.A05 = (i & 512) == 0 ? C0ty.A00 : list6;
        this.A0B = (i & 1024) == 0 ? 04R.A0G() : map7;
        this.A0A = (i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0 ? 04R.A0G() : map6;
        this.A0C = (i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) == 0 ? 04R.A0G() : map5;
        this.A09 = (i & 8192) == 0 ? 04R.A0G() : map8;
    }

    private final String A00() {
        Object obj;
        String obj2;
        switch (this.A02.ordinal()) {
            case 0:
                obj2 = String.valueOf(this.A01);
                break;
            case 1:
                obj2 = new BigDecimal(String.valueOf(this.A00)).toPlainString();
                break;
            case 2:
                obj2 = this.A04;
                break;
            case 3:
                obj2 = String.valueOf(this.A0D);
                break;
            case 4:
                obj = this.A08;
                obj2 = obj.toString();
                break;
            case 5:
                obj = this.A07;
                obj2 = obj.toString();
                break;
            case 6:
                obj = this.A06;
                obj2 = obj.toString();
                break;
            case 7:
                obj = this.A05;
                obj2 = obj.toString();
                break;
            case 8:
                obj = this.A0C;
                obj2 = obj.toString();
                break;
            case 9:
                obj = this.A0B;
                obj2 = obj.toString();
                break;
            case 10:
                obj = this.A0A;
                obj2 = obj.toString();
                break;
            case 11:
                obj = this.A09;
                obj2 = obj.toString();
                break;
            default:
                obj2 = "Value type unsupported";
                break;
        }
        return String.valueOf(obj2);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!11T.A0O(JR0.A0m(obj), getClass())) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.odin.model.FeatureData");
            FeatureData featureData = (FeatureData) obj;
            if (11T.A0O(this.A03, featureData.A03) && this.A02 == featureData.A02 && 11T.A0O(A00(), featureData.A00())) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 0Pz.A0Y(this.A03, A00(), '=').hashCode();
    }

    public String toString() {
        return JQz.A0r("(id:", this.A03, ", value:", A00());
    }
}
