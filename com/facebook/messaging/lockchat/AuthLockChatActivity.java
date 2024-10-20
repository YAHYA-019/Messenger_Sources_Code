package com.facebook.messaging.lockchat;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Um;
import X.4YV;
import X.7zM;
import X.7zN;
import X.7zR;
import X.A0Z;
import X.AYU;
import X.AbE;
import X.AnonymousClass001;
import X.C5ic;
import X.DKE;
import X.DKH;
import X.DR6;
import X.GVX;
import X.Hx7;
import X.IGS;
import X.JCz;
import X.KTP;
import X.KTp;
import X.KlF;
import X.L8S;
import X.LC7;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.concurrent.Executor;

/* loaded from: AuthLockChatActivity.class */
public final class AuthLockChatActivity extends FbFragmentActivity implements JCz {
    public Hx7 A00;
    public Integer A01 = 7zN.A0h();
    public Long A02;
    public boolean A03;

    public static final void A12(AuthLockChatActivity authLockChatActivity) {
        int i = Build.VERSION.SDK_INT;
        Intent intent = authLockChatActivity.getIntent();
        Intent intent2 = (Intent) (i >= 33 ? intent.getParcelableExtra("new_intent", Intent.class) : intent.getParcelableExtra("new_intent"));
        if (intent2 != null) {
            DKE.A1C(authLockChatActivity, intent2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [int, com.facebook.msys.mca.MailboxFeature] */
    public static final void A15(AuthLockChatActivity authLockChatActivity, Integer num) {
        if (authLockChatActivity.A02 == null || num == null) {
            return;
        }
        DKH.A0H(authLockChatActivity);
        boolean z = authLockChatActivity.A03;
        Long l = authLockChatActivity.A02;
        AYU ayu = num.intValue().mMailboxApiHandleMetaProvider;
        AYU ayu2 = null;
        1BK.A0P(ayu2.AQV(0));
        if (2 != 0) {
            A0Z a0z = new A0Z(2, 2, (Object) 2, (Object) null, (Object) 2, (Object) 2);
            1Um.A02(a0z, a0z, a0z, false);
        } else {
            A0Z a0z2 = new A0Z(2, 2, (Object) 2, (Object) 2, (Object) null, (Object) 2);
            1Um.A02(a0z2, a0z2, a0z2, false);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = (Hx7) 1Bn.A0A(83478);
        int intExtra = getIntent().getIntExtra("locked_status", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        this.A01 = valueOf;
        Long l = null;
        if (valueOf != null && intExtra == -1) {
            valueOf = null;
        }
        this.A01 = valueOf;
        this.A03 = getIntent().getBooleanExtra(AbE.A00(558), false);
        long j = -1;
        long longExtra = getIntent().getLongExtra("thread_key", j);
        Long valueOf2 = Long.valueOf(longExtra);
        this.A02 = valueOf2;
        if (valueOf2 == null || longExtra != j) {
            l = valueOf2;
        }
        this.A02 = l;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 211) {
            if (i2 == -1) {
                A15(this, this.A01);
                A12(this);
                setResult(-1);
            } else if (i2 != 0) {
                return;
            }
            finish();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(1671390880);
        super.onPause();
        Hx7 hx7 = this.A00;
        if (hx7 == null) {
            11T.A0L("authenticator");
            throw 0Q8.createAndThrow();
        }
        L8S l8s = hx7.A00;
        if (l8s != null) {
            l8s.A01();
        }
        0FI.A07(-692444302, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int i;
        String A0u;
        String A0u2;
        int i2;
        int A00 = 0FI.A00(-662004830);
        super.onStart();
        if (this.A00 != null) {
            if (LC7.A03(7zM.A0B(this)).A04(255) != 0) {
                if (this.A00 != null) {
                    if (LC7.A03(7zM.A0B(this)).A04(255) != 12) {
                        1Bn.A0A(67527);
                        DR6 A01 = C5ic.A01(this, 7zR.A0c(this));
                        A01.A06(2131958775);
                        IGS.A01(A01, this, 2, 2131958776);
                        A01.A0B(IGS.A00(this, 3), 2131958774);
                        A01.A04().show();
                        i = -1856205777;
                        0FI.A07(i, A00);
                        return;
                    }
                }
            }
            if (this.A00 != null) {
                boolean z = !AnonymousClass001.A1O(LC7.A03(7zM.A0B(this)).A04(255));
                boolean z2 = false;
                Hx7 hx7 = this.A00;
                if (z) {
                    if (hx7 != null) {
                        Integer num = this.A01;
                        if (num != null && num.intValue() == 1) {
                            z2 = true;
                        }
                        Hx7.A00(this, z2);
                        i = -1000415255;
                        0FI.A07(i, A00);
                        return;
                    }
                } else if (hx7 != null) {
                    boolean A1W = 4YV.A1W(LC7.A03(7zM.A0B(this)).A04(255), 12);
                    Hx7 hx72 = this.A00;
                    if (A1W) {
                        if (hx72 != null) {
                            Integer num2 = this.A01;
                            if (num2 != null && num2.intValue() == 1) {
                                z2 = true;
                            }
                            GVX gvx = new GVX(this, hx72, 1);
                            Executor mainExecutor = getMainExecutor();
                            11T.A0A(mainExecutor);
                            hx72.A00 = new L8S((KTP) gvx, (FragmentActivity) this, mainExecutor);
                            if (z2) {
                                A0u = 1BK.A0u(this, 2131954121);
                                A0u2 = 1BK.A0u(this, 2131954118);
                                i2 = 2131954120;
                            } else {
                                A0u = 1BK.A0u(this, 2131954151);
                                A0u2 = 1BK.A0u(this, 2131954148);
                                i2 = 2131954150;
                            }
                            KlF A002 = KTp.A00(A0u2, 1BK.A0u(this, i2), (CharSequence) null, A0u, 0, false);
                            L8S l8s = hx72.A00;
                            if (l8s != null) {
                                l8s.A03(A002);
                            }
                            i = 1316854803;
                        }
                    } else if (hx72 != null) {
                        Integer num3 = this.A01;
                        if (num3 != null && num3.intValue() == 1) {
                            z2 = true;
                        }
                        Hx7.A00(this, z2);
                        i = 1316854803;
                    }
                    0FI.A07(i, A00);
                    return;
                }
            }
        }
        11T.A0L("authenticator");
        throw 0Q8.createAndThrow();
    }
}
