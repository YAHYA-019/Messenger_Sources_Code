package X;

import android.content.Context;
import androidx.credentials.CredentialManager;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.caa.shared.passkey.PasskeyService;
import kotlin.jvm.functions.Function1;

/* loaded from: AIj.class */
public final class AIj extends 0DO implements Function1 {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIj(Object obj, Object obj2, 0DR r304, int i) {
        super(1, r304);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public final 0DR create(0DR r302) {
        int i;
        int i2 = this.A01;
        Object obj = this.A03;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new AIj(obj, obj2, r302, i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((0DR) obj).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A01) {
            case 0:
                0Ds r0 = 0Ds.A02;
                if (this.A00 != 0) {
                    0Dt.A00(obj);
                } else {
                    0Dt.A00(obj);
                    PasskeyService passkeyService = (PasskeyService) this.A03;
                    Jt2 jt2 = PasskeyService.A08;
                    CredentialManager credentialManager = passkeyService.A01;
                    Context context = passkeyService.A00;
                    Kgc kgc = (Kgc) this.A02;
                    this.A00 = 1;
                    obj = credentialManager.getCredential(context, kgc, (0DR) this);
                    if (obj == r0) {
                        return r0;
                    }
                }
                return obj;
            case 1:
                0Ds r02 = 0Ds.A02;
                if (this.A00 != 0) {
                    0Dt.A00(obj);
                } else {
                    0Dt.A00(obj);
                    PasskeyService passkeyService2 = (PasskeyService) this.A03;
                    Jt2 jt22 = PasskeyService.A08;
                    CredentialManager credentialManager2 = passkeyService2.A01;
                    Context context2 = passkeyService2.A00;
                    Kjv kjv = (Kjv) this.A02;
                    this.A00 = 1;
                    obj = credentialManager2.createCredential(context2, kjv, this);
                    if (obj == r02) {
                        return r02;
                    }
                }
                11T.A0I(obj, "null cannot be cast to non-null type androidx.credentials.CreatePublicKeyCredentialResponse");
                return obj;
            default:
                0Ds r03 = 0Ds.A02;
                if (this.A00 != 0) {
                    0Dt.A00(obj);
                } else {
                    0Dt.A00(obj);
                    8Cv r04 = (8Cv) this.A03;
                    9Rx r05 = r04.A04;
                    Context A0B = 7zM.A0B(r04.A02);
                    String str = r04.A00;
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) this.A02;
                    11T.A0G(str, 1, lifecycleOwner);
                    0zV A00 = 0Pf.A00(new 0N0(new AJK(r05, A0B, str, (0DR) null, 0)), 2000L);
                    0Xr A01 = 0zL.A01(new C2633Gjl(null, 12, true, false), 7zO.A16(lifecycleOwner), A00, 0zF.A01);
                    AJV ajv = new AJV(r04, null, 40);
                    this.A00 = 1;
                    if (0N2.A00(this, ajv, A01) == r03) {
                        return r03;
                    }
                }
                return 04S.A00;
        }
    }
}
