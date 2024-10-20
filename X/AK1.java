package X;

/* loaded from: AK1.class */
public final /* synthetic */ class AK1 extends 01I implements C00m {
    public final /* synthetic */ 0CL $currentState;
    public final /* synthetic */ 0Je $isDispatching;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AK1(0Je r302, 0CL r303) {
        super(0, 11U.class, "getState", "createStore$getState(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Object;", 0);
        this.$isDispatching = r302;
        this.$currentState = r303;
    }

    @Override // X.C00m
    public final Object invoke() {
        0Je r0 = this.$isDispatching;
        0CL r02 = this.$currentState;
        if (!r0.element) {
            return r02.element;
        }
        throw AnonymousClass001.A0N("You may not call store.getState() while the reducer is executing.\nThe reducer has already received the state as an argument.\nPass it down from the top reducer instead of reading it from the \nstore.\nYou may be accessing getState while dispatching from another\nthread.  Try createThreadSafeStore().\nhttps://reduxkotlin.org/introduction/threading");
    }
}
