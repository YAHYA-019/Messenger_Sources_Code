package X;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: AK8.class */
public final /* synthetic */ class AK8 extends 01I implements Function1 {
    public final /* synthetic */ 0CL $currentListeners;
    public final /* synthetic */ 0Je $isDispatching;
    public final /* synthetic */ 0CL $nextListeners;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AK8(0Je r302, 0CL r303, 0CL r304) {
        super(1, 11U.class, "subscribe", "createStore$subscribe(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", 0);
        this.$isDispatching = r302;
        this.$nextListeners = r303;
        this.$currentListeners = r304;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0Je, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        11T.A0F(obj, 0);
        0Je r0 = this.$isDispatching;
        0CL r02 = this.$nextListeners;
        0CL r03 = this.$currentListeners;
        if (!(!r0.element)) {
            throw AnonymousClass001.A0N("You may not call store.subscribe() while the reducer is executing.\nIf you would like to be notified after the store has been updated, \nsubscribe from a component and invoke store.getState() in the \ncallback to access the latest state. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.\nYou may be seeing this due accessing the store from multiplethreads.\nTry createThreadSafeStore()\nhttps://reduxkotlin.org/introduction/threading");
        }
        ?? obj2 = new Object();
        ((0Je) obj2).element = true;
        Object obj3 = r02.element;
        Object obj4 = r03.element;
        if (obj3 == obj4) {
            obj3 = 7zO.A10((Collection) obj4, 0);
            r02.element = obj3;
        }
        ((List) obj3).add(obj);
        return new AKs(36, r0, r03, obj2, obj, r02);
    }
}
