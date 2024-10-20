package X;

import com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.dataload.BiimThreadActionSystemDataLoader;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: AF2.class */
public final class AF2 implements Runnable {
    public static final String __redex_internal_original_name = "BiimThreadActionSystemDataLoader$threadActionSystemStatusCallback$1$1";
    public final /* synthetic */ BiimThreadActionSystemDataLoader A00;
    public final /* synthetic */ MailboxNullable A01;

    public AF2(BiimThreadActionSystemDataLoader biimThreadActionSystemDataLoader, MailboxNullable mailboxNullable) {
        this.A01 = mailboxNullable;
        this.A00 = biimThreadActionSystemDataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C4Nk c4Nk;
        1qX r0 = (1qX) this.A01.value;
        if (r0 != null) {
            BiimThreadActionSystemDataLoader biimThreadActionSystemDataLoader = this.A00;
            if (1qX.A00(r0) > 0) {
                str = r0.mResultSet.getString(0, 0);
                11T.A0A(str);
            } else {
                str = "";
            }
            synchronized (biimThreadActionSystemDataLoader.A01) {
                if (!11T.A0O(biimThreadActionSystemDataLoader.A01, str)) {
                    biimThreadActionSystemDataLoader.A01 = str;
                    6iB r02 = biimThreadActionSystemDataLoader.A0A;
                    C4Nk[] values = C4Nk.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            c4Nk = null;
                            break;
                        }
                        c4Nk = values[i];
                        if (11T.A0O(c4Nk.key, str)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    r02.A01(C4Nk.class, c4Nk);
                }
            }
        }
    }
}
