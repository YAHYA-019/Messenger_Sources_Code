package X;

import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.functions.Function2;

/* loaded from: M73.class */
public final class M73 extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ boolean $forceDarkMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M73(FbUserSession fbUserSession, Function2 function2, int i, int i2, boolean z) {
        super(2);
        this.$fbUserSession = fbUserSession;
        this.$forceDarkMode = z;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        L62.A01(JQz.A0N(obj, obj2), this.$fbUserSession, this.$content, Kv9.A00(this.$$changed), this.$$default, this.$forceDarkMode);
        return 04S.A00;
    }
}
