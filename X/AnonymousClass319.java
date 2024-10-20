package X;

import com.facebook.litho.ComponentTree;
import kotlin.jvm.functions.Function1;

/* renamed from: X.319, reason: invalid class name */
/* loaded from: 319.class */
public final /* synthetic */ class AnonymousClass319 implements Function1 {
    public final /* synthetic */ ComponentTree A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass319(ComponentTree componentTree, String str, boolean z) {
        this.A00 = componentTree;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ComponentTree componentTree = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        java.util.Map map = (java.util.Map) obj;
        1LI r0 = componentTree.A03;
        map.put("root", r0 != null ? r0.A0a() : "");
        map.put("attribution", str);
        map.put("async", Boolean.valueOf(!z));
        map.put("stack", KyI.A00());
        return 04S.A00;
    }
}
