package X;

import android.net.Uri;
import com.google.common.base.Function;

/* loaded from: Fve.class */
public final class Fve implements Function {
    public static final Fve A00 = new Fve();

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        2JY A0L;
        2JY A0Y;
        2JY A0J;
        2JY A0N;
        String A0l;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        11T.A0D(abstractC08294mh);
        Object obj2 = abstractC08294mh.A03;
        Uri uri = null;
        if (obj2 != null && (A0L = AbM.A0L((2JY) obj2, 2JX.class, 1179293550)) != null && (A0Y = A0L.A0Y(2JX.class, "Actor", 620220, -1619582830)) != null && (A0J = AbF.A0J(A0Y, 2JX.class, 1520140280)) != null && (A0N = 7zL.A0N(A0J, 2JX.class, 8287778, 2034180372)) != null && (A0l = A0N.A0l()) != null && A0l.length() != 0) {
            uri = C0A2.A03(A0l);
        }
        return uri;
    }
}
