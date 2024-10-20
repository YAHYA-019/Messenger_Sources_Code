package X;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: G7d.class */
public final /* synthetic */ class G7d implements 0Jf, AnonymousClass553 {
    public final /* synthetic */ Function1 A00;

    public G7d(Function1 function1) {
        this.A00 = function1;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof AnonymousClass553) && (obj instanceof 0Jf)) {
            z = 11T.A0O(this.A00, ((0Jf) obj).getFunctionDelegate());
        }
        return z;
    }

    public final C00l getFunctionDelegate() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.AnonymousClass553
    public final /* synthetic */ void onClick(View view) {
        this.A00.invoke(view);
    }
}
