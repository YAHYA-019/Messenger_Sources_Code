package X;

/* renamed from: X.2p0, reason: invalid class name */
/* loaded from: 2p0.class */
public abstract class C2p0 implements C2ot {
    public abstract 1LI A00(1Iw r1, C2m6 c2m6, Object obj);

    @Override // X.C2ot
    public final 1LI CfM(1Iw r302, Object obj, Object obj2) {
        11T.A0F(r302, 0);
        if (obj2 instanceof C2m6) {
            return A00(r302, (C2m6) obj2, obj);
        }
        throw AnonymousClass002.A0C(obj2, "Expected ThreadRow auxiliary data, got: ", AnonymousClass001.A0k());
    }
}
