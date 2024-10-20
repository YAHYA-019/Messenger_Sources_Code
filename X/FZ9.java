package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

/* loaded from: FZ9.class */
public final class FZ9 implements Observer {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FZ9(LiveData liveData, Observer observer, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 19:
                this.A02 = observer;
                this.A01 = liveData;
                break;
            default:
                this.A01 = liveData;
                this.A02 = observer;
                break;
        }
    }

    public FZ9(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:
    
        if (X.FJC.A0C(r303) == false) goto L24;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v162, types: [androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v201, types: [androidx.lifecycle.LiveData] */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onChanged(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZ9.onChanged(java.lang.Object):void");
    }
}
