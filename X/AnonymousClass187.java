package X;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* renamed from: X.187, reason: invalid class name */
/* loaded from: 187.class */
public final class AnonymousClass187 implements Callable {
    public final /* synthetic */ AnonymousClass188 A00;
    public final /* synthetic */ String A01;

    public AnonymousClass187(AnonymousClass188 anonymousClass188, String str) {
        this.A00 = anonymousClass188;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        0fH.A0j("AddressResolver", "resolveAsync executed");
        String str = this.A01;
        AnonymousClass188 anonymousClass188 = this.A00;
        try {
            C18c c18c = new C18c(str, Arrays.asList(InetAddress.getAllByName(str)), 0, 0);
            synchronized (anonymousClass188) {
                C18b c18b = anonymousClass188.A00;
                TreeSet A01 = c18b.A01();
                int i = A01.isEmpty() ? 0 : ((C18c) A01.first()).A01 + 1;
                C18c A00 = c18b.A00(c18c);
                if (A00 == null) {
                    c18b.A03(new C18c(c18c.A02, c18c.A00(), i, 0));
                } else {
                    c18b.A04(A00, new C18c(c18c.A02, c18c.A00(), i, A00.A00));
                }
                c18b.A02();
            }
            return c18c;
        } catch (SecurityException unused) {
            throw new 17O(17N.A02);
        } catch (UnknownHostException unused2) {
            throw new 17O(17N.A05);
        }
    }
}
