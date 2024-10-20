package X;

/* renamed from: X.29f, reason: invalid class name */
/* loaded from: 29f.class */
public final class C29f {
    public static final C29e A00(Object obj) {
        if (obj == null) {
            throw AnonymousClass001.A0T("layout data must not be null.");
        }
        if (obj instanceof C29e) {
            return (C29e) obj;
        }
        throw AnonymousClass001.A0T(0Pz.A0j("RenderTreeNode layout data for Litho should be LithoLayoutData but was <cls>", AnonymousClass001.A0Y(obj), "</cls>"));
    }

    public final AnonymousClass274 A01(Object obj) {
        Object obj2 = A00(obj).A06;
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof AnonymousClass274) {
            return (AnonymousClass274) obj2;
        }
        throw AnonymousClass001.A0T(0Pz.A0j("Layout data was not InterStagePropsContainer but was <cls>", AnonymousClass001.A0Y(obj2), "</cls>"));
    }
}
