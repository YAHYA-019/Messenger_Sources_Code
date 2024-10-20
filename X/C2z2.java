package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.common.callercontext.CallerContext;
import java.util.ArrayList;

/* renamed from: X.2z2, reason: invalid class name */
/* loaded from: 2z2.class */
public final class C2z2 implements C08j {
    public final /* synthetic */ 2Rz A00;

    public C2z2(2Rz r302) {
        this.A00 = r302;
    }

    @Override // X.C08j
    public ArrayList Ara() {
        return C0s8.A10(new IntentFilter("com.facebook.orca.ACTION_JEWEL_PREFETCH"));
    }

    @Override // X.C08j
    public void CFb(Context context, Intent intent, C01q c01q) {
        11T.A0F(intent, 1);
        if (11T.A0O(intent.getAction(), "com.facebook.orca.ACTION_JEWEL_PREFETCH")) {
            2Rz r0 = this.A00;
            CallerContext callerContext = 2Rz.A1U;
            2SP r02 = r0.A0I;
            if (r02 == null) {
                11T.A0L("jewelDataProvider");
                throw 0Q8.createAndThrow();
            }
            r02.A0C();
        }
    }
}
