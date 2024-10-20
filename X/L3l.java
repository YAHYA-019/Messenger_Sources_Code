package X;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: L3l.class */
public final class L3l {
    public final KCQ A00;

    public L3l(KCQ kcq) {
        this.A00 = kcq;
    }

    public static L3l A00(L8N l8n) {
        KCs kCs = l8n.A01;
        KCQ kcq = (KCd) Lg5.A0B(kCs, 0S2.A0Y);
        if (!((KCd) kcq).A01.equals(kCs)) {
            KDF A00 = KCd.A00(kcq);
            JQy.A0e(A00).Be4(A00, kCs);
        }
        return new L3l(kcq);
    }

    public L8N A01() {
        L8N A01;
        synchronized (this) {
            A01 = L8N.A01(this.A00.A04());
        }
        return A01;
    }

    public void A02(int i) {
        GeneralSecurityException A0z;
        synchronized (this) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                KCQ kcq = this.A00;
                if (i3 >= ((KCd) kcq).A00.key_.size()) {
                    A0z = JQy.A0z("key not found: ", i);
                    break;
                }
                KDE kde = (KDE) ((KCd) kcq).A00.key_.get(i3);
                if (kde.keyId_ != i) {
                    i2 = i3 + 1;
                } else if (kde.A0I().equals(KPU.A03)) {
                    KCd.A00(kcq).primaryKeyId_ = i;
                } else {
                    A0z = JQy.A0z("cannot set key as primary because it's not enabled: ", i);
                }
            }
            throw A0z;
        }
    }

    public void A03(Kg5 kg5) {
        KDC A00;
        int i;
        KCQ kcq;
        synchronized (this) {
            KBR kbr = kg5.A00;
            KDD kdd = (kbr instanceof KBR ? kbr.A00 : (Lft) LCx.A01.A07(kbr)).A00;
            synchronized (L75.class) {
                try {
                    L8M l8m = L8M.A02;
                    Kq9 A002 = L8M.A00(l8m, kdd.typeUrl_);
                    if (!AnonymousClass001.A1V(l8m.A01.get(kdd.typeUrl_))) {
                        throw JQx.A10(0Pz.A0W("newKey-operation not permitted for key type ", kdd.typeUrl_));
                    }
                    A00 = A002.A00(kdd.value_);
                } catch (Throwable th) {
                    th = th;
                }
            }
            KPX A0I = kdd.A0I();
            try {
                int A003 = L9b.A00();
                loop0: while (true) {
                    i = A003;
                    kcq = this.A00;
                    Iterator it = Collections.unmodifiableList(((KCd) kcq).A00.key_).iterator();
                    while (it.hasNext()) {
                        if (((KDE) it.next()).keyId_ == i) {
                            break;
                        }
                    }
                    try {
                        break loop0;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                    A003 = L9b.A00();
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if (A0I == KPX.A05) {
                th = JQx.A10("unknown output prefix type");
                throw th;
            }
            KCR A0F = KDE.DEFAULT_INSTANCE.A0F();
            KDE A004 = KCd.A00(A0F);
            A00.getClass();
            A004.keyData_ = A00;
            A004.bitField0_ |= 1;
            KCd.A00(A0F).keyId_ = i;
            KCd.A00(A0F).status_ = KPU.A03.value;
            KCd.A00(A0F).outputPrefixType_ = A0I.A01();
            KDE A04 = A0F.A04();
            KCs A005 = KCd.A00(kcq);
            A04.getClass();
            MRQ mrq = A005.key_;
            if (!((LyA) mrq).A00) {
                int size = mrq.size();
                int i2 = size * 2;
                if (size == 0) {
                    i2 = 10;
                }
                mrq = mrq.Bek(i2);
                A005.key_ = mrq;
            }
            mrq.add(A04);
        }
    }
}
