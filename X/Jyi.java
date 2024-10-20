package X;

/* loaded from: Jyi.class */
public abstract class Jyi extends C4Nr {
    public final 68U A00;
    public final MKA A01;

    public Jyi(68U r302, MKA mka) {
        this.A01 = mka;
        this.A00 = r302;
    }

    @Override // X.C4Nr
    public Kls A01(28Q r302, Kls kls) {
        Object obj = kls.A04;
        if (obj == null) {
            Object obj2 = kls.A03;
            Class cls = kls.A01;
            MKA mka = this.A01;
            obj = cls == null ? mka.BOS(obj2) : mka.BOT(cls, obj2);
            kls.A04 = obj;
        }
        C42h c42h = kls.A00;
        if (r302.A0U()) {
            kls.A06 = false;
            r302.A0R(obj);
        } else {
            String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            kls.A06 = true;
            Integer num = kls.A02;
            if (c42h != C42h.A06 && (num == 0S2.A0C || num == 0S2.A0N)) {
                num = 0S2.A00;
                kls.A02 = num;
            }
            int intValue = num.intValue();
            if (intValue != 4 && intValue != 3) {
                if (intValue == 2) {
                    r302.A0m(kls.A03);
                    r302.A0o(kls.A05);
                    r302.A0r(valueOf);
                    return kls;
                }
                if (intValue != 1) {
                    r302.A0a();
                    r302.A0r(valueOf);
                } else {
                    r302.A0b();
                    r302.A0o(valueOf);
                }
            }
        }
        if (c42h == C42h.A06) {
            r302.A0m(kls.A03);
        } else if (c42h == C42h.A05) {
            r302.A0a();
            return kls;
        }
        return kls;
    }

    @Override // X.C4Nr
    public Kls A02(28Q r302, Kls kls) {
        C42h c42h = kls.A00;
        if (c42h == C42h.A06) {
            r302.A0Y();
        } else if (c42h == C42h.A05) {
            r302.A0X();
        }
        if (kls.A06) {
            int intValue = kls.A02.intValue();
            if (intValue == 4) {
                Object obj = kls.A04;
                String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
                r302.A0o(kls.A05);
                r302.A0r(valueOf);
                return kls;
            }
            if (intValue != 3 && intValue != 2) {
                if (intValue == 0) {
                    r302.A0X();
                    return kls;
                }
                r302.A0Y();
            }
        }
        return kls;
    }

    @Override // X.C4Nr
    public String A05() {
        if (this instanceof Jyr) {
            return ((Jyr) this).A00;
        }
        if (this instanceof Jyv) {
            return ((Jyv) this).A00;
        }
        return null;
    }
}
