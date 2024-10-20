package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.3kk, reason: invalid class name */
/* loaded from: 3kk.class */
public final class C3kk extends C00q implements Function1 {
    public final /* synthetic */ boolean $isLayoutState;
    public final /* synthetic */ String $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3kk(String str, boolean z) {
        super(1);
        this.$key = str;
        this.$isLayoutState = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1ru c1ru = (C1ru) obj;
        11T.A0F(c1ru, 0);
        c1ru.Cey(this.$key, this.$isLayoutState);
        return 04S.A00;
    }
}
