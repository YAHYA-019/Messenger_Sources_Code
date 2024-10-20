package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.inject.FbInjector;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.749, reason: invalid class name */
/* loaded from: 749.class */
public final class AnonymousClass749 {
    public final FbUserSession A00;
    public final CallerContext A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 74N A06;
    public final ConcurrentHashMap A07;
    public final AtomicBoolean A08;
    public final 1BP A09;
    public final 1De A0A;

    /* JADX WARN: Type inference failed for: r0v32, types: [X.74N, java.lang.Object] */
    public AnonymousClass749(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0A = r303;
        this.A00 = fbUserSession;
        this.A09 = FbInjector.A00;
        java.util.Map map = 0BY.A03;
        this.A01 = CallerContext.A0B(C0Bx.A01(AnonymousClass749.class));
        1BY r0 = r303.A00;
        this.A03 = 1Bu.A03(r0, 68073);
        this.A02 = 1Lm.A03(fbUserSession, r0, 66451);
        this.A04 = 1Lm.A03(fbUserSession, r0, 66197);
        this.A05 = 1Bu.A03(r0, 49779);
        this.A08 = new AtomicBoolean(false);
        this.A07 = new ConcurrentHashMap();
        this.A06 = new Object();
        AvatarConfigRepository avatarConfigRepository = (AvatarConfigRepository) this.A04.A00.get();
        C74q c74q = new C74q() { // from class: X.74p
            @Override // X.C74q
            public void Bsx() {
                AnonymousClass749.this.A08.set(false);
            }

            @Override // X.C74q
            public void CSU() {
                AnonymousClass749.this.A08.set(true);
            }
        };
        List list = avatarConfigRepository.A02;
        synchronized (list) {
            list.add(c74q);
        }
        ((AvatarConfigRepository) this.A04.A00.get()).A02(new C74s() { // from class: X.74r
            @Override // X.C74s
            public void COu(boolean z) {
                AnonymousClass749.this.A08.set(z);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.0CL] */
    public final 6fM A00(AZh aZh, String str) {
        6fM r305;
        String str2;
        String str3 = str == null ? "��" : str;
        8O0 r0 = (8O0) this.A07.get(str3);
        if (r0 == null) {
            return null;
        }
        ?? obj = new Object();
        A3G a3g = new A3G(r0, aZh, str3, (0CL) obj);
        8O0 A01 = A01(str);
        if (A01 == null || (str2 = A01.id) == null) {
            r305 = null;
        } else {
            r305 = new 6fM(FbInjector.A03, a3g);
            r305.A04(this.A00, new C6qc(this.A01, null, null, this.A06, null, str2, null, 255, 0, true, false, true, false, false, false));
        }
        ((0CL) obj).element = r305;
        return r305;
    }

    public final 8O0 A01(String str) {
        if (!((C5yh) this.A02.A00.get()).A01()) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.A07;
        if (str == null) {
            str = "��";
        }
        return (8O0) concurrentHashMap.get(str);
    }

    public void A02(AZh aZh, String str) {
        if (((C5yh) this.A02.A00.get()).A01()) {
            if (str == null) {
                str = "��";
            }
            ((C9h2) this.A03.A00.get()).A01(this.A00, new A4l(this, aZh, str), str);
        }
    }
}
