package X;

/* renamed from: X.727, reason: invalid class name */
/* loaded from: 727.class */
public final class AnonymousClass727 implements AnonymousClass726 {
    public final 1Br A00 = 1Bq.A00(66800);

    @Override // X.AnonymousClass726
    public long B32() {
        Number number = (Number) ((C1ux) this.A00.A00.get()).A00.get("AdvancedCrypto");
        if (number != null) {
            return number.longValue();
        }
        throw AnonymousClass001.A0N(0Pz.A0v("Contact Pk for ", "AdvancedCrypto", " was unexpectedly null bootstrap status: ", C1up.A00));
    }
}
