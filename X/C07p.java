package X;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* renamed from: X.07p, reason: invalid class name */
/* loaded from: 07p.class */
public final class C07p extends C07q {
    @Override // X.C07q
    public /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        Intent intent = (Intent) obj;
        11T.A0F(intent, 1);
        return intent;
    }

    @Override // X.C07q
    public /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        return new ActivityResult(i, intent);
    }
}
