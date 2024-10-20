package X;

import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.26v, reason: invalid class name */
/* loaded from: 26v.class */
public final class C26v extends 25R {
    public /* bridge */ /* synthetic */ C1sr A01() {
        C1sr c1sr = ((25R) this).A01;
        11T.A0I(c1sr, "null cannot be cast to non-null type com.facebook.litho.NestedTreeHolder");
        return c1sr;
    }

    public void A02() {
        super.A02();
        25R r0 = ((25R) this).A02.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public int BL7(int i) {
        if (i > 0) {
            throw AnonymousClass001.A0L("NestedTreeHolder Result has only one child");
        }
        25R r0 = ((25R) this).A02.A04;
        if (r0 == null) {
            return 0;
        }
        float[] fArr = ((YogaNodeJNIBase) r0.A02.A0K).arr;
        return (int) (fArr != null ? fArr[3] : 0.0f);
    }

    public int BLJ(int i) {
        if (i > 0) {
            throw AnonymousClass001.A0L("NestedTreeHolder Result has only one child");
        }
        25R r0 = ((25R) this).A02.A04;
        if (r0 == null) {
            return 0;
        }
        float[] fArr = ((YogaNodeJNIBase) r0.A02.A0K).arr;
        return (int) (fArr != null ? fArr[4] : 0.0f);
    }
}
