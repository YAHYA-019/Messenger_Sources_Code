package X;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* renamed from: X.1rw, reason: invalid class name */
/* loaded from: 1rw.class */
public final class C1rw extends C00q implements Function1 {
    public final /* synthetic */ String $databaseNamePrefix;
    public final /* synthetic */ C1re this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1rw(C1re c1re, String str) {
        super(1);
        this.this$0 = c1re;
        this.$databaseNamePrefix = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        11T.A0F(str, 0);
        return new File((File) this.this$0.A01.getValue(), 0Pz.A0W(this.$databaseNamePrefix, str));
    }
}
