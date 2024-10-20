package X;

import android.content.Intent;
import com.google.common.collect.ImmutableList;
import java.lang.ref.Reference;

/* renamed from: X.4e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4e5.class */
public final /* synthetic */ class RunnableC05504e5 implements Runnable {
    public static final String __redex_internal_original_name = "UserInfoUpdatedBroadcaster$$ExternalSyntheticLambda0";
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ ImmutableList A01;

    public /* synthetic */ RunnableC05504e5(Intent intent, ImmutableList immutableList) {
        this.A01 = immutableList;
        this.A00 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImmutableList immutableList = this.A01;
        Intent intent = this.A00;
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            C2r2 c2r2 = (C2r2) ((Reference) it.next()).get();
            if (c2r2 != null) {
                2qN.A01(intent, c2r2.A00);
            }
        }
    }
}
