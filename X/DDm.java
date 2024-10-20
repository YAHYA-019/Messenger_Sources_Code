package X;

import com.facebook.msys.mca.MailboxNullable;
import kotlin.jvm.functions.Function1;

/* loaded from: DDm.class */
public final class DDm extends C00q implements Function1 {
    public static final DDm A00 = new DDm();

    public DDm() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        1qX A14 = 7zM.A14((MailboxNullable) obj);
        if (A14 != null) {
            return Integer.valueOf(A14.mResultSet.getInteger(0, 0));
        }
        throw AnonymousClass001.A0N("No unseen missed calls count found");
    }
}
