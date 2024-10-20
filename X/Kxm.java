package X;

import java.nio.charset.Charset;

/* loaded from: Kxm.class */
public abstract class Kxm {
    public static final Charset A00 = Charset.forName("UTF-8");

    public static KCt A00(KCs kCs) {
        KCd A0F = KCt.DEFAULT_INSTANCE.A0F();
        KCd.A00(A0F).primaryKeyId_ = kCs.primaryKeyId_;
        for (KDE kde : kCs.key_) {
            KCd A0F2 = KDA.DEFAULT_INSTANCE.A0F();
            KDC kdc = kde.keyData_;
            if (kdc == null) {
                kdc = KDC.DEFAULT_INSTANCE;
            }
            String str = kdc.typeUrl_;
            KDA A002 = KCd.A00(A0F2);
            str.getClass();
            A002.typeUrl_ = str;
            KPU A0I = kde.A0I();
            KDA A003 = KCd.A00(A0F2);
            if (A0I == KPU.A05) {
                throw JQz.A0f();
            }
            A003.status_ = A0I.value;
            KPX A004 = KPX.A00(kde.outputPrefixType_);
            if (A004 == null) {
                A004 = KPX.A06;
            }
            KCd.A00(A0F2).outputPrefixType_ = A004.A01();
            KCd.A00(A0F2).keyId_ = kde.keyId_;
            KDF A04 = A0F2.A04();
            KCt A005 = KCd.A00(A0F);
            A04.getClass();
            MRQ mrq = A005.keyInfo_;
            if (!((LyA) mrq).A00) {
                mrq = mrq.Bek(JQy.A0J(mrq));
                A005.keyInfo_ = mrq;
            }
            mrq.add(A04);
        }
        return A0F.A04();
    }
}
