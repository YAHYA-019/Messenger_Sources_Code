package X;

/* renamed from: X.Mao, reason: case insensitive filesystem */
/* loaded from: Mao.class */
public final class C3360Mao extends C23s implements MQR {
    public C3360Mao() {
        super(466891289);
    }

    public C3360Mao(int i) {
        super(i);
    }

    @Override // X.MQR
    public MOa Ahw() {
        return (MOa) A05(C3359Man.class, "discount_amount", 7);
    }

    @Override // X.MQR
    public String Al8() {
        return A0B(6, "expiration_date_text");
    }

    @Override // X.MQR
    public String AqQ() {
        return A0B(2, "incentive_credential_id");
    }

    @Override // X.MQR
    public String AqR() {
        return A0C("incentive_id");
    }

    @Override // X.MQR
    public KOg AqS() {
        return (KOg) A0A(KOg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, JQw.A00(298), 1);
    }

    @Override // X.MQR
    public boolean Arx() {
        return A0D(3, "is_best_offer");
    }

    @Override // X.MQR
    public String B5H() {
        return A0B(8, "promo_code");
    }

    @Override // X.MQR
    public String BDT() {
        return A0B(5, "subtitle");
    }

    @Override // X.MQR
    public String BG6() {
        return A0B(4, "title");
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(Rtc.A00), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRw.A00(), MRr.A02(mRt)});
    }
}
