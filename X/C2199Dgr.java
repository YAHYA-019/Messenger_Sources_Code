package X;

import com.facebook.graphservice.interfaces.Summary;

/* renamed from: X.Dgr, reason: case insensitive filesystem */
/* loaded from: Dgr.class */
public final class C2199Dgr extends AbstractC04134a1 {
    public final C5op A00;

    public C2199Dgr(C5op c5op) {
        super(c5op.A00.getQuery());
        this.A00 = c5op;
    }

    @Override // X.AbstractC04134a1
    public void onError(Throwable th) {
        this.A00.onFailure(th);
    }

    @Override // X.AbstractC04134a1
    public void onModelUpdate(Object obj, Summary summary) {
        if (obj != null) {
            this.A00.onSuccess(obj);
        }
    }
}
