package X;

/* renamed from: X.2jx, reason: invalid class name */
/* loaded from: 2jx.class */
public final class C2jx implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        11T.A0F(c29k, 0);
        29K r0 = c29k.A03;
        if (r0 == null || (r0.A0F & 67108864) == 0) {
            return 0.0f;
        }
        return r0.A03;
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        return 1BL.A0D(this, obj).getRotationY();
    }

    @Override // X.C2jo
    public void ChS(Object obj) {
        1BL.A0D(this, obj).setRotationY(0.0f);
    }

    @Override // X.C2jo
    public void ClN(Object obj, float f) {
        1BL.A0D(this, obj).setRotationY(f);
    }

    @Override // X.C2jo
    public String getName() {
        return "rotationY";
    }
}
