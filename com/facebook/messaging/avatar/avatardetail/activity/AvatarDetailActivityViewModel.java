package com.facebook.messaging.avatar.avatardetail.activity;

import X.0DR;
import X.0Du;
import X.0KV;
import X.0KW;
import X.0N2;
import X.0Ro;
import X.0S2;
import X.0Xs;
import X.0oS;
import X.0zV;
import X.11T;
import X.16K;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1G1;
import X.1Lm;
import X.7zM;
import X.AJG;
import X.C0oe;
import X.C0ty;
import X.C15t;
import X.C9gH;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.messaging.avatar.avatardetail.repository.PoseRepository;
import com.facebook.user.model.UserKey;
import kotlin.jvm.functions.Function2;

/* loaded from: AvatarDetailActivityViewModel.class */
public final class AvatarDetailActivityViewModel extends AndroidViewModel {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final UserKey A0B;
    public final 0zV A0C;
    public final 16K A0D;
    public final 0Xs A0E;
    public final 0Xs A0F;
    public final C15t A0G;
    public final boolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarDetailActivityViewModel(Application application, FbUserSession fbUserSession, UserKey userKey) {
        super(application);
        C15t A00;
        C15t A002;
        1BL.A1F(application, fbUserSession);
        11T.A0F(userKey, 3);
        this.A00 = fbUserSession;
        this.A0B = userKey;
        0Ro A003 = 0Du.A00((Object) null);
        this.A0E = A003;
        this.A0G = A003;
        0zV A004 = 0Du.A00((Object) null);
        this.A0F = A004;
        0KW A005 = 0KV.A00(0S2.A00, 0, 0);
        this.A0D = A005;
        this.A0C = A005;
        this.A02 = 1Lm.A00(application, fbUserSession, 68715);
        this.A04 = 1Lm.A00(application, fbUserSession, 68713);
        this.A07 = 1Lm.A00(application, fbUserSession, 68714);
        this.A01 = 1Lm.A00(application, fbUserSession, 66197);
        this.A08 = 7zM.A0M();
        this.A05 = 1Bu.A01(application, 68852);
        this.A0A = 1Bu.A00(68854);
        this.A09 = 1Bu.A01(application, 68853);
        this.A03 = 1Bu.A00(68851);
        this.A06 = 1Bq.A00(68686);
        boolean A0O = 11T.A0O(((1G1) fbUserSession).A02, userKey.id);
        this.A0H = A0O;
        if (A0O) {
            A00 = ((PoseRepository) 1Br.A0B(this.A07)).A06;
            A002 = ((C9gH) 1Br.A0B(this.A04)).A07;
        } else {
            C0ty c0ty = C0ty.A00;
            A00 = 0Du.A00(c0ty);
            A002 = 0Du.A00(c0ty);
        }
        0N2.A03(ViewModelKt.getViewModelScope(this), new 0oS(new 0zV[]{A004, A00, A002, ((AvatarConfigRepository) 1Br.A0B(this.A01)).A04}, new 1(this, (0DR) null), 7));
        0N2.A03(ViewModelKt.getViewModelScope(this), new C0oe((Function2) new AJG(this, (0DR) null, 0), ((AvatarConfigRepository) 1Br.A0B(this.A01)).A06, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(X.8Jw r301, X.8Jw r302, com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel r303, X.0DR r304) {
        /*
            r0 = r303
            X.0Xs r0 = r0.A0E
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.getValue()
            X.8Ld r0 = (X.8Ld) r0
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lb8
            r0 = r306
            java.lang.Object r0 = r0.A03
            X.8Lu r0 = (X.8Lu) r0
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb8
            r0 = r303
            X.1Br r0 = r0.A0A
            r308 = r0
            r0 = r308
            X.1Br.A0C(r0)
            r0 = r301
            if (r0 != 0) goto La8
            r0 = r302
            if (r0 == 0) goto L59
            r0 = r307
            java.lang.Object r0 = r0.A01
            X.8Jw r0 = (X.8Jw) r0
            r301 = r0
        L42:
            r0 = r301
            r1 = r302
            X.11T.A0H(r0, r1)
            r0 = 9
            r309 = r0
            X.8Lu r0 = new X.8Lu
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = r302
            r3 = r309
            r0.<init>(r1, r2, r3)
        L59:
            r0 = r306
            boolean r0 = r0.A04
            r310 = r0
            r0 = r306
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            r311 = r0
            r0 = r306
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            r306 = r0
            r0 = r311
            r1 = r306
            X.7zR.A1O(r0, r1)
            X.8Ld r0 = new X.8Ld
            r308 = r0
            r0 = r308
            r1 = r307
            r2 = r311
            r3 = r306
            r4 = r310
            r0.<init>(r1, r2, r3, r4)
            r0 = r305
            r1 = r308
            r2 = r304
            java.lang.Object r0 = r0.emit(r1, r2)
            r306 = r0
            X.0Ds r0 = X.0Ds.A02
            r308 = r0
            r0 = r306
            r1 = r308
            if (r0 != r1) goto Lb8
            r0 = r306
            return r0
        La8:
            r0 = r302
            if (r0 != 0) goto L42
            r0 = r307
            java.lang.Object r0 = r0.A00
            X.8Jw r0 = (X.8Jw) r0
            r302 = r0
            goto L42
        Lb8:
            X.04S r0 = X.04S.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel.A00(X.8Jw, X.8Jw, com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel.A01(com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e8, code lost:
    
        if (r311 == null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A02(com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel.A02(com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel.A03(com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A04(com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel.A04(com.facebook.messaging.avatar.avatardetail.activity.AvatarDetailActivityViewModel, X.0DR):java.lang.Object");
    }
}
