package X;

import android.os.Parcelable;
import com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.GroupPaymentInfoProperties;
import com.facebook.messaging.model.messages.Message;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.currency.CurrencyAmount;
import com.google.common.collect.ImmutableList;

/* loaded from: F8p.class */
public final class F8p {
    public final F58 A01 = (F58) 1Bn.A0A(99321);
    public final F7K A00 = (F7K) 1Bi.A03(99138);

    public static RTM A00(5zD r301) {
        MigColorScheme Axg;
        if (r301 == null || (Axg = r301.Axg()) == null || !0AT.A02(Axg.BDl())) {
            return null;
        }
        return new RTM(r301.Axg().B4i(), r301.Axg().Abp(), r301.Axg().B4i(), r301.Axg().B4i(), r301.Axg().B9Q());
    }

    public EzZ A01(5zD r302, Message message) {
        RPP rpp;
        GenericAdminMessageExtensibleData genericAdminMessageExtensibleData;
        CurrencyAmount currencyAmount;
        GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
        if (genericAdminMessageInfo == null || (genericAdminMessageExtensibleData = genericAdminMessageInfo.A0E) == null) {
            rpp = new RPP();
        } else {
            GroupPaymentInfoProperties groupPaymentInfoProperties = (GroupPaymentInfoProperties) genericAdminMessageExtensibleData;
            rpp = new RPP();
            rpp.A0J = groupPaymentInfoProperties.A06;
            2JY r0 = groupPaymentInfoProperties.A02;
            if (r0 == null) {
                currencyAmount = null;
            } else {
                Parcelable.Creator creator = CurrencyAmount.CREATOR;
                currencyAmount = new CurrencyAmount(r0.A0n(), r0.getIntValue(-565489467));
            }
            rpp.A06 = currencyAmount;
            F58 f58 = this.A01;
            2JX r02 = groupPaymentInfoProperties.A01;
            rpp.A0C = r02 == null ? null : AbK.A0t((23F) f58.A01.get(), r02.A0k());
            rpp.A0L = groupPaymentInfoProperties.A07;
            ImmutableList A00 = F58.A00(groupPaymentInfoProperties.A03);
            rpp.A0G = A00;
            C1pq.A08("individualRequests", A00);
            rpp.A01 = groupPaymentInfoProperties.A00;
            rpp.A0I = Long.valueOf(message.A0V.A0r());
            rpp.A0M = message.A1g;
            rpp.A08 = A00(r302);
        }
        return new EzZ(rpp);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0401  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.EzZ A02(X.5zD r302, com.facebook.messaging.model.messages.Message r303) {
        /*
            Method dump skipped, instructions count: 1567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F8p.A02(X.5zD, com.facebook.messaging.model.messages.Message):X.EzZ");
    }
}
