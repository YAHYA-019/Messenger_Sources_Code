package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7d5, reason: invalid class name */
/* loaded from: 7d5.class */
public final class C7d5 extends 2V0 {
    public ImmutableList A00;
    public String A01;

    public Iterable A01() {
        return new 4nU(2Ri.A02(new Imb(this, 2), this.A00));
    }

    public String A02() {
        ImmutableList immutableList = this.A00;
        if (immutableList.isEmpty()) {
            return "";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(StringFormatUtil.formatStrLocaleSafe("%1$s = CASE ", this.A01));
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            A0k.append(((2V0) it.next()).A02());
            A0k.append(" ");
        }
        return AnonymousClass001.A0d("END", A0k);
    }

    public String[] A03() {
        return (String[]) 2Ri.A0I(A01());
    }
}
