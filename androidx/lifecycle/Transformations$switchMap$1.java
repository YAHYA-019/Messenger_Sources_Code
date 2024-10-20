package androidx.lifecycle;

import X.04S;
import X.0CL;
import X.C00q;
import X.M6m;
import kotlin.jvm.functions.Function1;

/* loaded from: Transformations$switchMap$1.class */
public final class Transformations$switchMap$1 extends C00q implements Function1 {
    public final /* synthetic */ 0CL $liveData;
    public final /* synthetic */ MediatorLiveData $result;
    public final /* synthetic */ Function1 $transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$1(Function1 function1, 0CL r303, MediatorLiveData mediatorLiveData) {
        super(1);
        this.$transform = function1;
        this.$liveData = r303;
        this.$result = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LiveData liveData = (LiveData) this.$transform.invoke(obj);
        Object obj2 = this.$liveData.element;
        if (obj2 != liveData) {
            if (obj2 != null) {
                this.$result.removeSource((LiveData) obj2);
            }
            this.$liveData.element = liveData;
            if (liveData != null) {
                MediatorLiveData mediatorLiveData = this.$result;
                mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new M6m(mediatorLiveData, 48)));
            }
        }
        return 04S.A00;
    }
}
