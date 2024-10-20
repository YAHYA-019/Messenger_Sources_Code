package X;

import com.fbpay.w3c.Address;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: M6e.class */
public final class M6e extends C00q implements Function1 {
    public static final M6e A00 = new M6e();

    public M6e() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        RSh rSh = (RSh) obj;
        11T.A0F(rSh, 0);
        ImmutableList immutableList = rSh.A00;
        if (immutableList != null) {
            arrayList = 1BL.A0z(immutableList);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                MQN mqn = (MQN) it.next();
                arrayList.add(new Address(mqn.Abw(), mqn.Acc(), null, mqn.getId(), mqn.BCF(), mqn.BCu(), mqn.BCv(), mqn.B41()));
            }
        } else {
            arrayList = null;
        }
        11T.A0D(arrayList);
        return arrayList;
    }
}
