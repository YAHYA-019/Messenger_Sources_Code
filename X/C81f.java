package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.81f, reason: invalid class name */
/* loaded from: 81f.class */
public final class C81f extends C2cb {
    public static final long serialVersionUID = 1;
    public KtU _roid;
    public List _unresolvedIds;

    /* JADX WARN: Multi-variable type inference failed */
    public void A09() {
        super/*java.lang.Throwable*/.fillInStackTrace();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    @Override // X.C2cb
    public String getMessage() {
        String A04 = C2cb.A04(this);
        List list = this._unresolvedIds;
        if (list != null) {
            StringBuilder sb = new StringBuilder(A04);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            A04 = AnonymousClass001.A0g(sb, '.');
        }
        return A04;
    }
}
