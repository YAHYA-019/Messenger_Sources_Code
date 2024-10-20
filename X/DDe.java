package X;

import com.facebook.msys.mca.MailboxNullable;
import kotlin.jvm.functions.Function1;

/* loaded from: DDe.class */
public final class DDe extends C00q implements Function1 {
    public static final DDe A00 = new DDe();

    public DDe() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MailboxNullable) obj).value;
    }
}
