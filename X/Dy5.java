package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Dy5.class */
public final class Dy5 extends C1rj {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public FbUserSession A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;

    public Dy5() {
        super("PlatformMediaAttachmentRendererPlugin");
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new E2f(context);
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        C2ra.A02(c23p, this.A00, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0167, code lost:
    
        if (r337 == 0.0f) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00da  */
    /* JADX WARN: Type inference failed for: r0v294, types: [com.facebook.drawee.view.DraweeView, com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v93, types: [com.facebook.video.player.RichVideoPlayer, android.view.View] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K(X.1Iw r302, X.AnonymousClass274 r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dy5.A1K(X.1Iw, X.274, java.lang.Object):void");
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Dy5 dy5 = (Dy5) r302;
            String str = this.A05;
            String str2 = dy5.A05;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (this.A08 != dy5.A08) {
                return false;
            }
            FbUserSession fbUserSession = this.A04;
            FbUserSession fbUserSession2 = dy5.A04;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            if (this.A09 != dy5.A09 || Float.compare(this.A00, dy5.A00) != 0 || this.A01 != dy5.A01 || this.A02 != dy5.A02 || this.A03 != dy5.A03) {
                return false;
            }
            String str3 = this.A06;
            String str4 = dy5.A06;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.A07;
            String str6 = dy5.A07;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
        }
        return true;
    }
}
