package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.5z8, reason: invalid class name */
/* loaded from: 5z8.class */
public final class C5z8 implements 2lU {
    public final Integer A00;
    public final Object A01;

    public C5z8(Integer num, Object obj) {
        this.A00 = num;
        this.A01 = obj;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ACCESSIBILITY_HEADING";
            case 1:
                return "ACCESSIBILITY_ROLE";
            case 2:
                return "ACCESSIBILITY_ROLE_DESCRIPTION";
            case 3:
                return "CONTENT_DESCRIPTION";
            case 4:
                return "FOCUS_ORDER";
            case 5:
                return "IMPORTANT_FOR_ACCESSIBILITY";
            case 6:
                return "ON_INITIALIZE_ACCESSIBILITY_EVENT";
            case 7:
                return "ON_INITIALIZE_ACCESSIBILITY_NODE_INFO";
            default:
                return "ON_POPULATE_ACCESSIBILITY_EVENT";
        }
    }

    public void A8l(C1ti c1ti, 1Iw r303) {
        11T.A0F(c1ti, 1);
        switch (this.A00.intValue()) {
            case 0:
                Object obj = this.A01;
                11T.A0I(obj, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj).booleanValue();
                29K A02 = C1ti.A02(c1ti);
                int i = 2;
                if (booleanValue) {
                    i = 1;
                }
                A02.A09 = i;
                return;
            case 1:
                Object obj2 = this.A01;
                11T.A0I(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                29K A022 = C1ti.A02(c1ti);
                A022.A0F |= 4194304;
                A022.A0c = str;
                return;
            case 2:
                Object obj3 = this.A01;
                11T.A0I(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                CharSequence charSequence = (CharSequence) obj3;
                29K A023 = C1ti.A02(c1ti);
                A023.A0F |= 16777216;
                A023.A0Z = charSequence;
                return;
            case 3:
                Object obj4 = this.A01;
                11T.A0I(obj4, "null cannot be cast to non-null type kotlin.CharSequence");
                CharSequence charSequence2 = (CharSequence) obj4;
                29K A024 = C1ti.A02(c1ti);
                A024.A0F |= 1;
                A024.A0a = charSequence2;
                return;
            case 4:
                11T.A0I(this.A01, "null cannot be cast to non-null type com.facebook.litho.FocusOrderModel");
                11T.A0F((Object) null, 0);
                throw 0Q8.createAndThrow();
            case 5:
                Object obj5 = this.A01;
                11T.A0I(obj5, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Number) obj5).intValue();
                2cS A01 = C1ti.A01(c1ti);
                A01.A04 |= 1;
                A01.A02 = intValue;
                return;
            case 6:
                Object obj6 = this.A01;
                11T.A0I(obj6, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnInitializeAccessibilityEventEvent, kotlin.Unit>");
                C0B7.A04(obj6, 1);
                3vS r0 = new 3vS((Function1) obj6, (Object[]) null, -1);
                29K A025 = C1ti.A02(c1ti);
                A025.A0F |= 128;
                A025.A0N = r0;
                return;
            case 7:
                Object obj7 = this.A01;
                11T.A0I(obj7, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnInitializeAccessibilityNodeInfoEvent, kotlin.Unit>");
                C0B7.A04(obj7, 1);
                3vS r02 = new 3vS((Function1) obj7, (Object[]) null, -1);
                29K A026 = C1ti.A02(c1ti);
                A026.A0F |= 256;
                A026.A0O = r02;
                return;
            default:
                Object obj8 = this.A01;
                11T.A0I(obj8, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnPopulateAccessibilityEventEvent, kotlin.Unit>");
                C0B7.A04(obj8, 1);
                3vS r03 = new 3vS((Function1) obj8, (Object[]) null, -1);
                29K A027 = C1ti.A02(c1ti);
                A027.A0F |= 512;
                A027.A0Q = r03;
                return;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5z8)) {
                return false;
            }
            C5z8 c5z8 = (C5z8) obj;
            if (this.A00 != c5z8.A00 || !11T.A0O(this.A01, c5z8.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A00;
        return C3o5.A05(num, A00(num)) + AnonymousClass001.A02(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AccessibilityStyleItem(field=");
        A0k.append(A00(this.A00));
        A0k.append(", value=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
