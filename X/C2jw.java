package X;

/* renamed from: X.2jw, reason: invalid class name */
/* loaded from: 2jw.class */
public final class C2jw implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        11T.A0F(c29k, 0);
        29K r0 = c29k.A03;
        if (r0 == null || (r0.A0F & 2097152) == 0) {
            return 0.0f;
        }
        return r0.A01;
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        return 1BL.A0D(this, obj).getRotation();
    }

    @Override // X.C2jo
    public void ChS(Object obj) {
        1BL.A0D(this, obj).setRotation(0.0f);
    }

    @Override // X.C2jo
    public void ClN(Object obj, float f) {
        1BL.A0D(this, obj).setRotation(f);
    }

    @Override // X.C2jo
    public String getName() {
        return "rotation";
    }
}
