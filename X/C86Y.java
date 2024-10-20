package X;

/* renamed from: X.86Y, reason: invalid class name */
/* loaded from: 86Y.class */
public final class C86Y implements 1K9 {
    public final int A00;
    public final int A01;

    public C86Y(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public void onFailure(Throwable th) {
        int i = this.A00;
        11T.A0F(th, 0);
        String message = th.getMessage();
        Object[] objArr = new Object[1];
        objArr[0] = 0Pz.A0T(i != 0 ? "Failed to upsert QP trigger event " : "Failed to remove QP trigger event ", this.A01);
        0fH.A14("StaxThreadViewQpTriggerHandler", message, objArr);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        if (this.A00 != 0) {
            if (obj != null && !obj.equals(1BK.A0d())) {
                return;
            } else {
                str = "Failed to upsert QP trigger event ";
            }
        } else if (obj != null && !obj.equals(1BK.A0d())) {
            return;
        } else {
            str = "Failed to remove QP trigger event ";
        }
        0fH.A0j("StaxThreadViewQpTriggerHandler", 0Pz.A0T(str, this.A01));
    }
}
