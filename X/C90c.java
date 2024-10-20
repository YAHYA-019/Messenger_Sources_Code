package X;

import com.facebook.oxygen.sdk.app.installapi.contract.common.ErrorType;
import java.util.Arrays;

/* renamed from: X.90c, reason: invalid class name */
/* loaded from: 90c.class */
public abstract class C90c extends A1n implements Ab7 {
    public final ErrorType A00;

    public C90c(ErrorType errorType, C9by c9by) {
        super(c9by);
        this.A00 = errorType;
    }

    @Override // X.Ab7
    public ErrorType Aka() {
        return this.A00;
    }

    @Override // X.A1n
    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C90c) || !super.equals(obj)) {
                return false;
            }
            if (this.A00 != ((C90c) obj).A00) {
                z = false;
            }
        }
        return z;
    }

    @Override // X.A1n
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.A00});
    }
}
