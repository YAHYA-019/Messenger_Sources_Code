package X;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;

/* renamed from: X.5iy, reason: invalid class name */
/* loaded from: 5iy.class */
public final class C5iy extends 1lP {
    public /* bridge */ /* synthetic */ AbstractC08224mE A03(AbstractC08224mE abstractC08224mE, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        4CR A02 = 1lJ.A01().A02(byteArrayOutputStream);
        if (!A02.A0A(this)) {
            throw AnonymousClass001.A0N("Couldn't lock newly created batch");
        }
        Iterator it = ((1lP) this).A09.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return new C5j0(A02, this, byteArrayOutputStream);
    }

    public /* bridge */ /* synthetic */ Object A04() {
        AbstractC08224mE abstractC08224mE = ((1lP) this).A02;
        if (abstractC08224mE == null) {
            return null;
        }
        return ((C5j0) abstractC08224mE).A00;
    }
}
