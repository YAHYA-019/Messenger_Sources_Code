package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;

/* renamed from: X.Dak, reason: case insensitive filesystem */
/* loaded from: Dak.class */
public final class C2059Dak extends AbstractC2060Dal {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C2059Dak(FHh fHh, GJj gJj, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = gJj;
            this.A01 = fHh;
        } else {
            this.A02 = fHh;
            this.A01 = gJj;
        }
    }

    public C2059Dak(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void AT0(Activity activity) {
        if (this.A00 != 0) {
            super.AT0(activity);
        } else {
            11T.A0F(activity, 0);
            ((FbFragmentActivity) activity).Cdt(this);
        }
    }

    public void Bhr(Activity activity, Intent intent, int i, int i2) {
        1FX r308;
        int i3;
        String stringExtra;
        switch (this.A00) {
            case 0:
                11T.A0F(activity, 0);
                if (i == 2885) {
                    Uri uri = null;
                    if (intent != null && (stringExtra = intent.getStringExtra("KEY_URL")) != null && !0CU.A0O(stringExtra)) {
                        try {
                            uri = C0A2.A03(stringExtra);
                        } catch (SecurityException unused) {
                        }
                    }
                    String obj = (i2 != -1 || uri == null) ? "" : uri.toString();
                    11T.A0D(obj);
                    DKM.A0F((FHh) this.A02, DKM.A00(), (GJj) this.A01, obj, 0);
                    ((FbFragmentActivity) activity).Cdt(this);
                    return;
                }
                return;
            case 1:
                if (i == 2022) {
                    AbF.A1W(this.A02, new RYs((String) null, (String) null, (String) null, false));
                    return;
                }
                return;
            case 2:
                r308 = (1FX) this.A02;
                i3 = 10001;
                break;
            case 3:
                ((Fmn) this.A01).A08.A01(intent, (FbUserSession) this.A02, i, i2);
                return;
            case 4:
                r308 = (1FX) this.A02;
                i3 = 10003;
                break;
            default:
                FEK.A01(DKM.A04(), (GJj) this.A02, this.A01);
                return;
        }
        AbG.A1W(r308, AnonymousClass001.A1Q(i, i3));
    }
}
