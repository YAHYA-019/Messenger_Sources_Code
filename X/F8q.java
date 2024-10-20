package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;

/* loaded from: F8q.class */
public final class F8q {
    public final Context A00;
    public final C00i A01 = 1BQ.A02(98536);

    public F8q(Context context) {
        this.A00 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.BRG] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence] */
    public static BRG A00(FEd fEd, F8q f8q, boolean z) {
        Context context = f8q.A00;
        Activity A0I = DKE.A0I(context);
        if (A0I != null && (A0I.isFinishing() || A0I.isDestroyed())) {
            return null;
        }
        String str = fEd.A02;
        if (str == null) {
            Object[] objArr = fEd.A04;
            int i = fEd.A01;
            str = objArr != null ? context.getString(i, objArr) : context.getString(i);
        }
        boolean A1X = 4YV.A1X(str.length(), 60);
        if (Build.VERSION.SDK_INT < 30) {
            context = context.getApplicationContext();
        }
        Toast makeText = Toast.makeText(context, str, A1X ? 1 : 0);
        int i2 = fEd.A00;
        if (i2 != 0) {
            makeText.setGravity(i2, 0, 0);
        }
        makeText.show();
        if (z) {
            EsV esV = (EsV) f8q.A01.get();
            String str2 = fEd.A03;
            if (str2 == null) {
                str2 = new Throwable().getStackTrace()[2].getClassName();
            }
            esV.A00(str2, str);
        }
        ?? obj = new Object();
        ((BRG) obj).A00 = makeText;
        return obj;
    }

    public void A01(FEd fEd) {
        A00(fEd, this, false);
    }

    public void A02(FEd fEd) {
        A00(fEd, this, true);
    }
}
