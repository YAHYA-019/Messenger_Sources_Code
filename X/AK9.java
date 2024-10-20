package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AK9.class */
public final /* synthetic */ class AK9 extends 01I implements Function1 {
    public final /* synthetic */ 0CL $currentListeners;
    public final /* synthetic */ 0CL $currentReducer;
    public final /* synthetic */ 0CL $currentState;
    public final /* synthetic */ 0Je $isDispatching;
    public final /* synthetic */ 0CL $nextListeners;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AK9(0Je r302, 0CL r303, 0CL r304, 0CL r305, 0CL r306) {
        super(1, 11U.class, "dispatch", "createStore$dispatch(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        this.$isDispatching = r302;
        this.$currentState = r303;
        this.$currentReducer = r304;
        this.$nextListeners = r305;
        this.$currentListeners = r306;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        11T.A0F(obj, 0);
        C9dr.A01(obj, this.$isDispatching, this.$currentState, this.$currentReducer, this.$nextListeners, this.$currentListeners);
        return obj;
    }
}
