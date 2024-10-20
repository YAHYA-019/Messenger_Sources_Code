package X;

import android.content.Context;

/* loaded from: J9q.class */
public final class J9q extends C00q implements C00m {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ 0CL $supBottomSheetAttributes;
    public final /* synthetic */ JNL $supDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9q(Context context, JNL jnl, 0CL r304) {
        super(0);
        this.$supBottomSheetAttributes = r304;
        this.$supDelegate = jnl;
        this.$context = context;
    }

    private final void A00() {
        this.$supBottomSheetAttributes.element = new T04(false);
        this.$supDelegate.C8O(this.$context);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return 04S.A00;
    }
}
