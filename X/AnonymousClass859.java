package X;

import com.facebook.messaging.model.messages.Message;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.859, reason: invalid class name */
/* loaded from: 859.class */
public final class AnonymousClass859 implements C00l, Function1 {
    public final int A00;

    public AnonymousClass859(int i) {
        this.A00 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        AnonymousClass622 anonymousClass622;
        Message message;
        6EO r0;
        if (1 - this.A00 != 0) {
            arrayList = null;
        } else {
            List list = (List) obj;
            if (list == null) {
                return C0ty.A00;
            }
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                AnonymousClass626 anonymousClass626 = null;
                if ((obj2 instanceof 6EO) && (r0 = (6EO) obj2) != null) {
                    anonymousClass626 = r0.A02;
                }
                if ((anonymousClass626 instanceof AnonymousClass622) && (anonymousClass622 = (AnonymousClass622) anonymousClass626) != null && (message = anonymousClass622.A03) != null) {
                    arrayList.add(message);
                }
            }
        }
        return arrayList;
    }
}
