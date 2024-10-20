package X;

/* renamed from: X.0j8, reason: invalid class name */
/* loaded from: 0j8.class */
public final class C0j8 extends 09X {
    public final /* synthetic */ C0w6 A00;
    public final /* synthetic */ AnonymousClass183 A01;

    public C0j8(C0w6 c0w6, AnonymousClass183 anonymousClass183, Integer num) {
        this.A01 = anonymousClass183;
        this.A00 = c0w6;
        09Y r305 = 09X.A0O;
        synchronized (r305) {
            try {
                ((08Z) r305).A00 = num;
            } catch (Throwable th) {
                throw th;
            }
        }
        r305 = 09X.A0N;
        synchronized (r305) {
            r305.A00 = c0w6;
        }
    }

    public 0Ea A0D() {
        0Eb r0;
        synchronized (this) {
            02Q r02 = 0Ea.A00;
            r0 = new 0Eb(09X.A0O, 09X.A0N, this.A01.A00(), "FamilyIntentScope", true);
        }
        return r0;
    }

    public 0Ea A0E() {
        0Eb r0;
        synchronized (this) {
            02Q r02 = 0Ea.A00;
            r0 = new 0Eb(09X.A0O, 09X.A0N, this.A01.A00(), "FamilyIntentScope", false);
        }
        return r0;
    }

    public 0Ef A0F() {
        0Ef r0;
        synchronized (this) {
            r0 = new 0Ef(09X.A0O, 09X.A0N, this.A01.A01());
        }
        return r0;
    }
}
