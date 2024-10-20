package X;

import kotlin.jvm.functions.Function1;

/* loaded from: J9w.class */
public final class J9w extends C00q implements Function1 {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9w(String str, String str2) {
        super(1);
        this.$key = str;
        this.$value = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GOo.A0g(obj).CUO(this.$key, this.$value);
        return 04S.A00;
    }
}
