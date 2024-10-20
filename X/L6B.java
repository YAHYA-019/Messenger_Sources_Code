package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: L6B.class */
public abstract class L6B {
    public static final PuxTermsConditionItem A00(MQO mqo) {
        ArrayList arrayList;
        if (mqo == null) {
            return new PuxTermsConditionItem(null, null, null, null, KP0.A0l, null, null, null, null, false);
        }
        MPZ mpz = null;
        String AZg = mqo.AZg();
        MOv AfQ = mqo.AfQ();
        MPZ AAQ = AfQ != null ? AfQ.AAQ() : null;
        String BAR = mqo.BAR();
        ImmutableList BAQ = mqo.BAQ();
        MOw B2L = mqo.B2L();
        MPZ AAQ2 = B2L != null ? B2L.AAQ() : null;
        MOx B4v = mqo.B4v();
        MPZ AAQ3 = B4v != null ? B4v.AAQ() : null;
        ImmutableList BEg = mqo.BEg();
        11T.A0D(BEg);
        if (1BK.A1Y(BEg)) {
            arrayList = 1BL.A0z(BEg);
            Iterator it = BEg.iterator();
            while (it.hasNext()) {
                MPZ AAQ4 = ((MOy) it.next()).AAQ();
                11T.A0A(AAQ4);
                arrayList.add(AAQ4);
            }
        } else {
            arrayList = null;
        }
        MOu AZh = mqo.AZh();
        if (AZh != null) {
            mpz = AZh.AAQ();
        }
        return new PuxTermsConditionItem(AAQ, AAQ2, AAQ3, mpz, KP0.A0l, AZg, BAR, BAQ, arrayList, false);
    }

    public static final ShippingAddress A01(MQU mqu, boolean z) {
        if (mqu == null) {
            throw AnonymousClass001.A0N("Cannot convert null object to a valid shipping address");
        }
        String id = mqu.getId();
        String Asw = mqu.Asw();
        String Abw = mqu.Abw();
        String BCu = mqu.BCu();
        String BCv = mqu.BCv();
        String Acc = mqu.Acc();
        String BCF = mqu.BCF();
        String Aem = mqu.Aem();
        String B41 = mqu.B41();
        boolean BNk = mqu.BNk();
        boolean BJ8 = mqu.BJ8();
        boolean As1 = mqu.As1();
        MPj A9c = mqu.A9c();
        boolean As4 = A9c != null ? A9c.As4() : true;
        MPj A9c2 = mqu.A9c();
        return new ShippingAddress(id, Asw, Abw, BCu, BCv, Acc, BCF, Aem, B41, A9c2 != null ? A9c2.AlH() : null, BNk, BJ8, As1, z, As4);
    }

    public static final boolean A02(KOy kOy, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == kOy) {
                return true;
            }
        }
        return false;
    }
}
