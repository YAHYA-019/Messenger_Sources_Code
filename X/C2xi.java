package X;

import android.animation.StateListAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2xi, reason: invalid class name */
/* loaded from: 2xi.class */
public final class C2xi implements 2lU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C2xi(Integer num, Object obj, int i) {
        this.A00 = i;
        this.A01 = num;
        this.A02 = obj;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CLICKABLE";
            case 2:
                return "CLIP_CHILDREN";
            case 3:
                return "CLIP_TO_OUTLINE";
            case 4:
                return "DUPLICATE_CHILDREN_STATES";
            case 5:
                return "DUPLICATE_PARENT_STATE";
            case 6:
                return "FOCUSABLE";
            case 7:
                return "FOREGROUND";
            case 8:
                return "ON_CLICK";
            case 9:
                return "ON_FOCUS_CHANGED";
            case 10:
                return "ON_INTERCEPT_TOUCH";
            case 11:
                return "ON_LONG_CLICK";
            case 12:
                return "ON_TOUCH";
            case 13:
                return "OUTLINE_PROVIDER";
            case 14:
                return "SELECTED";
            case 15:
                return "STATE_LIST_ANIMATOR";
            case 16:
                return "TEST_KEY";
            case 17:
                return "TRANSITION_NAME";
            case 18:
                return "WRAP_IN_VIEW";
            case 19:
                return "VIEW_ID";
            case 20:
                return "VIEW_TAG";
            case 21:
                return "VIEW_TAGS";
            case 22:
                return "ENABLED";
            case 23:
                return "KEYBOARD_NAVIGATION_CLUSTER";
            case 24:
                return "ADD_TOUCH_EXCLUSION_ZONE";
            case 25:
                return "TOOLTIP_TEXT";
            case 26:
                return "LAYER_TYPE";
            default:
                return "BACKGROUND";
        }
    }

    public void A8l(C1ti c1ti, 1Iw r303) {
        if (this.A00 == 0) {
            11T.A0F(c1ti, 1);
            switch (((Number) this.A01).intValue()) {
                case 0:
                    Object obj = this.A02;
                    if (obj != null) {
                        C1ro c1ro = (C1ro) obj;
                        11T.A0F(c1ro, 0);
                        C1tk A00 = C1ti.A00(c1ti);
                        A00.A0I |= 8192;
                        A00.A0R = c1ro;
                        return;
                    }
                    return;
                case 1:
                    C6ni c6ni = (C6ni) this.A02;
                    2cS A01 = C1ti.A01(c1ti);
                    if (c6ni != null) {
                        A01.A04 |= 8192;
                        A01.A08 = c6ni;
                        return;
                    }
                    return;
                case 2:
                    Object obj2 = this.A02;
                    11T.A0I(obj2, "null cannot be cast to non-null type com.facebook.yoga.YogaDirection");
                    int A002 = AnonymousClass254.A00((AnonymousClass255) obj2);
                    C1tk A003 = C1ti.A00(c1ti);
                    A003.A0I |= RequestDefragmentingOutputStream.BODY_BUFFER_SIZE;
                    A003.A0Q = new C1tr(A002);
                    return;
                case 3:
                    Object obj3 = this.A02;
                    if (obj3 != null) {
                        c1ti.A0N((C26z) obj3);
                        return;
                    }
                    return;
                case 4:
                    Object obj4 = this.A02;
                    if (obj4 != null) {
                        2dP r0 = (2dP) obj4;
                        11T.A0F(r0, 0);
                        C1tk A004 = C1ti.A00(c1ti);
                        A004.A0I |= 1048576;
                        A004.A0T = r0;
                        return;
                    }
                    return;
                case 5:
                    Object obj5 = this.A02;
                    if (obj5 != null) {
                        boolean A1V = AnonymousClass001.A1V(obj5);
                        C1tk A005 = C1ti.A00(c1ti);
                        A005.A0I |= 268435456;
                        A005.A0V = A1V;
                        return;
                    }
                    return;
                case 6:
                    Object obj6 = this.A02;
                    if (obj6 != null) {
                        c1ti.A0U(AnonymousClass001.A1V(obj6));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        11T.A0F(c1ti, 1);
        3vS r308 = null;
        switch (((Number) this.A01).intValue()) {
            case 0:
                c1ti.A0J((Drawable) this.A02);
                return;
            case 1:
                Object obj7 = this.A02;
                11T.A0I(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj7).booleanValue();
                29K A02 = C1ti.A02(c1ti);
                int i = 2;
                if (booleanValue) {
                    i = 1;
                }
                A02.A0A = i;
                return;
            case 2:
                Object obj8 = this.A02;
                11T.A0I(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                29K A022 = C1ti.A02(c1ti);
                A022.A0F |= 8388608;
                A022.A0f = booleanValue2;
                return;
            case 3:
                Object obj9 = this.A02;
                11T.A0I(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                29K A023 = C1ti.A02(c1ti);
                A023.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
                A023.A0g = booleanValue3;
                return;
            case 4:
                Object obj10 = this.A02;
                11T.A0I(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                boolean A1V2 = AnonymousClass001.A1V(obj10);
                2cS A012 = C1ti.A01(c1ti);
                A012.A04 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
                A012.A0L = A1V2;
                return;
            case 5:
                Object obj11 = this.A02;
                11T.A0I(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                2cS A013 = C1ti.A01(c1ti);
                A013.A04 |= 2;
                A013.A0M = booleanValue4;
                return;
            case 6:
                Object obj12 = this.A02;
                11T.A0I(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                29K A024 = C1ti.A02(c1ti);
                int i2 = 2;
                if (booleanValue5) {
                    i2 = 1;
                }
                A024.A0C = i2;
                return;
            case 7:
                Drawable drawable = (Drawable) this.A02;
                2cS A014 = C1ti.A01(c1ti);
                A014.A04 |= 4;
                A014.A07 = drawable;
                return;
            case 8:
                Object obj13 = this.A02;
                if (obj13 != null) {
                    C0B7.A04(obj13, 1);
                    r308 = new 3vS((Function1) obj13, (Object[]) null, -1);
                }
                c1ti.A0M(r308);
                return;
            case 9:
                Object obj14 = this.A02;
                if (obj14 != null) {
                    C0B7.A04(obj14, 1);
                    r308 = new 3vS((Function1) obj14, (Object[]) null, -1);
                }
                29K A025 = C1ti.A02(c1ti);
                A025.A0F |= 131072;
                A025.A0K = r308;
                return;
            case 10:
                Object obj15 = this.A02;
                if (obj15 != null) {
                    C0B7.A04(obj15, 1);
                    r308 = new 3vS((Function1) obj15, (Object[]) null, -1);
                }
                29K A026 = C1ti.A02(c1ti);
                A026.A0F |= 262144;
                A026.A0L = r308;
                return;
            case 11:
                Object obj16 = this.A02;
                if (obj16 != null) {
                    C0B7.A04(obj16, 1);
                    r308 = new 3vS((Function1) obj16, (Object[]) null, -1);
                }
                29K A027 = C1ti.A02(c1ti);
                A027.A0F |= 16;
                A027.A0M = r308;
                return;
            case 12:
                Object obj17 = this.A02;
                if (obj17 != null) {
                    C0B7.A04(obj17, 1);
                    r308 = new 3vS((Function1) obj17, (Object[]) null, -1);
                }
                29K A028 = C1ti.A02(c1ti);
                A028.A0F |= 32;
                A028.A0X = r308;
                return;
            case 13:
                c1ti.A0K((ViewOutlineProvider) this.A02);
                return;
            case 14:
                Object obj18 = this.A02;
                11T.A0I(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue6 = ((Boolean) obj18).booleanValue();
                29K A029 = C1ti.A02(c1ti);
                int i3 = 2;
                if (booleanValue6) {
                    i3 = 1;
                }
                A029.A0E = i3;
                return;
            case 15:
                StateListAnimator stateListAnimator = (StateListAnimator) this.A02;
                2cS A015 = C1ti.A01(c1ti);
                A015.A04 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                A015.A05 = stateListAnimator;
                return;
            case 16:
                String str = (String) this.A02;
                c1ti.A02 |= 2;
                c1ti.A09 = str;
                return;
            case 17:
                C1ti.A02(c1ti).A0e = (String) this.A02;
                return;
            case 18:
                c1ti.A0A = true;
                return;
            case 19:
                Object obj19 = this.A02;
                11T.A0I(obj19, AnonymousClass000.A00(0));
                int A03 = AnonymousClass001.A03(obj19);
                29K A0210 = C1ti.A02(c1ti);
                A0210.A0F |= 1073741824;
                A0210.A08 = A03;
                return;
            case 20:
                Object obj20 = this.A02;
                29K A0211 = C1ti.A02(c1ti);
                A0211.A0F |= 2;
                A0211.A0b = obj20;
                return;
            case 21:
                Object obj21 = this.A02;
                11T.A0I(obj21, "null cannot be cast to non-null type android.util.SparseArray<kotlin.Any>");
                SparseArray sparseArray = (SparseArray) obj21;
                29K A0212 = C1ti.A02(c1ti);
                A0212.A0F |= 4;
                SparseArray sparseArray2 = A0212.A0G;
                if (sparseArray2 != null) {
                    sparseArray = AnonymousClass675.A00(sparseArray2, sparseArray);
                }
                A0212.A0G = sparseArray;
                return;
            case 22:
                Object obj22 = this.A02;
                11T.A0I(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue7 = ((Boolean) obj22).booleanValue();
                29K A0213 = C1ti.A02(c1ti);
                int i4 = 2;
                if (booleanValue7) {
                    i4 = 1;
                }
                A0213.A0B = i4;
                return;
            case 23:
                Object obj23 = this.A02;
                11T.A0I(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                boolean A1V3 = AnonymousClass001.A1V(obj23);
                29K A0214 = C1ti.A02(c1ti);
                int i5 = 2;
                if (A1V3) {
                    i5 = 1;
                }
                A0214.A0D = i5;
                return;
            case 24:
                Object obj24 = this.A02;
                11T.A0I(obj24, "null cannot be cast to non-null type kotlin.Function1<android.graphics.Rect, android.graphics.Rect>");
                C0B7.A04(obj24, 1);
                11T.A0F(obj24, 0);
                2cS A016 = C1ti.A01(c1ti);
                List list = A016.A0J;
                if (list == null) {
                    list = AnonymousClass001.A0s();
                    A016.A0J = list;
                }
                list.add(obj24);
                return;
            case 25:
                String str2 = (String) this.A02;
                29K A0215 = C1ti.A02(c1ti);
                A0215.A0F |= 8589934592L;
                A0215.A0d = str2;
                return;
            case 26:
                Object obj25 = this.A02;
                11T.A0I(obj25, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, android.graphics.Paint?>");
                03Y r02 = (03Y) obj25;
                int A032 = AnonymousClass001.A03(r02.first);
                Paint paint = (Paint) r02.second;
                2cS A017 = C1ti.A01(c1ti);
                A017.A03 = A032;
                A017.A06 = paint;
                return;
            default:
                return;
        }
    }

    public boolean equals(Object obj) {
        if (1 - this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2xi)) {
            return false;
        }
        C2xi c2xi = (C2xi) obj;
        return c2xi.A00 == 1 && this.A01 == c2xi.A01 && 11T.A0O(this.A02, c2xi.A02);
    }

    public int hashCode() {
        if (1 - this.A00 != 0) {
            return super.hashCode();
        }
        Integer num = (Integer) this.A01;
        int hashCode = (A00(num).hashCode() + num.intValue()) * 31;
        Object obj = this.A02;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectStyleItem(field=");
        Integer num = (Integer) this.A01;
        sb.append(num != null ? A00(num) : "null");
        sb.append(", value=");
        return AnonymousClass002.A0K(this.A02, sb);
    }
}
