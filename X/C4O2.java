package X;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4O2, reason: invalid class name */
/* loaded from: 4O2.class */
public final class C4O2 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4O2(Object obj, Object obj2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                LiveData liveData = (LiveData) this.A02;
                Object value = liveData.getValue();
                0Je r0 = (0Je) this.A01;
                if (r0.element || (value != null ? !value.equals(obj) : obj != null)) {
                    r0.element = false;
                    liveData.setValue(obj);
                    break;
                }
                break;
            case 1:
                ((LiveData) this.A01).setValue(((Function1) this.A02).invoke(obj));
                break;
            default:
                ((C4G1) this.A02).A00.removeCallbacks((Runnable) this.A01);
                break;
        }
        return 04S.A00;
    }
}
