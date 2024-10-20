package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.repository.RepositoryHelperKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.9ai, reason: invalid class name */
/* loaded from: 9ai.class */
public final class C9ai {
    public final LiveData A00;
    public final 9W0 A01;

    public C9ai(Context context, ThreadKey threadKey) {
        9W0 r0 = new 9W0(context, threadKey);
        this.A01 = r0;
        this.A00 = Transformations.map(r0.A05, ATJ.A00);
    }

    public final void A00() {
        9W0 r0 = this.A01;
        C8z3 c8z3 = r0.A01;
        if (c8z3 != null) {
            c8z3.D5r();
        }
        r0.A03 = false;
        r0.A02 = false;
        r0.A04 = false;
        r0.A00 = new 8Lb((String) null, (DefaultConstructorMarker) null, 3, 6, false);
    }

    public final void A01() {
        9W0 r0 = this.A01;
        if (r0.A03) {
            return;
        }
        r0.A03 = true;
        r0.A02 = true;
        8Lb r02 = new 8Lb((String) null, (DefaultConstructorMarker) null, 3, 6, false);
        r0.A00 = r02;
        RepositoryHelperKt.A05(r0.A0B, (5P5) 1Br.A0B(r0.A09), 83U.A01(r02, r0, 26));
    }
}
