package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.bwpclientauthmanager.AuthenticationActivity;

/* loaded from: E7f.class */
public final class E7f extends 9Ai {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public E7f(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void A01() {
        if (this.A00 != 0) {
            ((C1921Awm) this.A02).A00.A0d(true);
        } else {
            Toast.makeText(((Context) this.A01).getApplicationContext(), 2131951731, 1).show();
        }
    }

    public void A02() {
        if (1 - this.A00 == 0 && ((FFo) 7zQ.A12((1Iw) this.A01, 67677)).A0C) {
            A03();
        }
    }

    public void A03() {
        if (this.A00 != 0) {
            ((C1921Awm) this.A02).A00.A0d(false);
            return;
        }
        Context context = (Context) this.A02;
        Intent A0D = C3o5.A0D(context, AuthenticationActivity.class);
        Bundle bundle = new Bundle(0);
        bundle.putString("entry_point", "universal_link");
        A0D.putExtra("iab_session_params", bundle);
        0LS.A0A(context, A0D);
    }

    public void A04(Throwable th) {
        if (this.A00 == 0) {
            Toast.makeText(((Context) this.A01).getApplicationContext(), 2131951732, 1).show();
        }
    }
}
