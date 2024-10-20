package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.facebook.base.activity.FbFragmentActivity;
import java.io.File;

/* renamed from: X.Dai, reason: case insensitive filesystem */
/* loaded from: Dai.class */
public final class C2057Dai extends AbstractC2060Dal {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C2057Dai(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public void Bhr(Activity activity, Intent intent, int i, int i2) {
        GHY ghy;
        File file;
        Integer num;
        if (this.A00 != 0) {
            if (i == 50 && (i2 == -1 || i2 == 0)) {
                FEK.A00((FHh) this.A02, DKc.A01, (GJj) this.A01);
            }
            FbFragmentActivity fbFragmentActivity = (FbFragmentActivity) this.A03;
            if (fbFragmentActivity != null) {
                fbFragmentActivity.Cdt(this);
                return;
            }
            return;
        }
        ((FbFragmentActivity) this.A01).Cdt(this);
        if (i == 1) {
            if (i2 == -1) {
                ((GHY) this.A03).COQ(Uri.fromFile((File) this.A02));
                return;
            } else if (i2 == 0) {
                ghy = (GHY) this.A03;
                file = (File) this.A02;
                num = 0S2.A0C;
                ghy.Bxk(num);
                file.delete();
            }
        }
        ghy = (GHY) this.A03;
        file = (File) this.A02;
        num = 0S2.A0N;
        ghy.Bxk(num);
        file.delete();
    }
}
