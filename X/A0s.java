package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: A0s.class */
public final class A0s implements MailboxCallback {
    public final /* synthetic */ C97b A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ AnonymousClass539 A02;
    public final /* synthetic */ C70m A03;
    public final /* synthetic */ C5fv A04;
    public final /* synthetic */ 0CL A05;
    public final /* synthetic */ boolean A06;

    public A0s(C97b c97b, ThreadKey threadKey, AnonymousClass539 anonymousClass539, C70m c70m, C5fv c5fv, 0CL r307, boolean z) {
        this.A04 = c5fv;
        this.A03 = c70m;
        this.A01 = threadKey;
        this.A06 = z;
        this.A02 = anonymousClass539;
        this.A05 = r307;
        this.A00 = c97b;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        9Lk r0 = (9Lk) obj;
        11T.A0F(r0, 0);
        C5fv c5fv = this.A04;
        String str = ((C5fu) c5fv).A0B;
        if (str != null) {
            int hashCode = str.hashCode();
            C70m c70m = this.A03;
            4kB r02 = c70m.A0F;
            if (r02 != null) {
                r02.A73(hashCode, "SEND_MESSAGE_API_END");
            }
            List list = r0.A00;
            if (list != null) {
                List A0V = 0QD.A0V(list);
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj2 : A0V) {
                    if ((obj2 instanceof String) && obj2 != null) {
                        A0s.add(obj2);
                    }
                }
                boolean z = false;
                if (A0s.isEmpty()) {
                    return;
                }
                C00i c00i = c70m.A0B.A00;
                c00i.get();
                c00i.get();
                C82f c82f = (C82f) c5fv.AxW(C5g6.A00);
                String str2 = c82f != null ? c82f.A02 : null;
                1Br.A0C(c70m.A09);
                7T5 AxW = c5fv.AxW(7T4.A00);
                if (AxW != null && AxW.A01) {
                    z = true;
                }
                ThreadKey threadKey = this.A01;
                boolean z2 = this.A06;
                AnonymousClass539 anonymousClass539 = this.A02;
                0CL r03 = this.A05;
                C97b c97b = this.A00;
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    C6o6 c6o6 = c70m.A0D;
                    if (c6o6 != null) {
                        c6o6.A04(threadKey, str3, str2, "image", anonymousClass539 != null ? anonymousClass539.name() : null, (String) r03.element, String.valueOf(c97b), z2, z);
                    }
                }
                c70m.A0E.CWT(str, A0s);
            }
        }
    }
}
