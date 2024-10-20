package X;

/* renamed from: X.2jv, reason: invalid class name */
/* loaded from: 2jv.class */
public final class C2jv implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        return 1.0f;
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        return 1BL.A0D(this, obj).getScaleY();
    }

    @Override // X.C2jo
    public void ChS(Object obj) {
        1BL.A0D(this, obj).setScaleY(1.0f);
    }

    @Override // X.C2jo
    public void ClN(Object obj, float f) {
        11T.A0F(obj, 0);
        C2jm.A02(this, obj).setScaleY(f);
    }

    @Override // X.C2jo
    public String getName() {
        return "scale_y";
    }
}
