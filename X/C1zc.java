package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import java.util.concurrent.Executor;

/* renamed from: X.1zc, reason: invalid class name */
/* loaded from: 1zc.class */
public final class C1zc {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C1qM A04;
    public final 1De A05;

    public C1zc(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 33165);
        this.A00 = 1Lm.A03(fbUserSession, r0, 33164);
        this.A02 = 1Lm.A03(fbUserSession, r0, 33166);
        this.A03 = 1Lm.A03(fbUserSession, r0, 33124);
        this.A04 = new C3aj(this, 15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.common.base.Optional] */
    public Optional A00() {
        Absent absent;
        Optional fromNullable = Optional.fromNullable(((AnonymousClass222) this.A01.A00.get()).A03.get("emoji_color_pref"));
        if (fromNullable.isPresent()) {
            if (AnonymousClass001.A05(fromNullable.get()) != ((int) r0)) {
                throw new ArithmeticException("userpref int value overflow");
            }
            absent = Optional.fromNullable(Integer.valueOf((int) AnonymousClass001.A05(fromNullable.get())));
        } else {
            absent = Absent.INSTANCE;
        }
        11T.A0D(absent);
        return absent;
    }

    public Optional A01(String str) {
        return Optional.fromNullable(((AnonymousClass225) this.A00.A00.get()).A02.get(str));
    }

    public Optional A02(String str) {
        return Optional.fromNullable(((AnonymousClass228) this.A02.A00.get()).A02.get(str));
    }

    public void A03(String str, String str2) {
        AnonymousClass228 anonymousClass228 = (AnonymousClass228) this.A02.A00.get();
        java.util.Map map = anonymousClass228.A02;
        11T.A09(map);
        map.put(str, str2);
        ((Executor) anonymousClass228.A00.A00.get()).execute(new 7Qu(anonymousClass228, str, str2));
    }

    public void A04(final String str, final boolean z) {
        final AnonymousClass225 anonymousClass225 = (AnonymousClass225) this.A00.A00.get();
        java.util.Map map = anonymousClass225.A02;
        11T.A09(map);
        map.put(str, Boolean.valueOf(z));
        ((Executor) anonymousClass225.A00.A00.get()).execute(new Runnable() { // from class: X.3hy
            public static final String __redex_internal_original_name = "MsysUserPrefsBoolRepository$writeBooleanPref$1";

            @Override // java.lang.Runnable
            public final void run() {
                MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(AnonymousClass225.this.A01);
                String str2 = str;
                boolean z2 = z;
                1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                1Um.A02(AQV, new Cy1(mailboxFeature, A0P, str2, 3, z2), A0P, false);
            }
        });
    }
}
