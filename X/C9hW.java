package X;

import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data.AvatarAudioMessagePose;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9hW, reason: invalid class name */
/* loaded from: 9hW.class */
public final class C9hW {
    public int A00;
    public AvatarAudioMessagePose A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final ScaleAnimation A07;
    public final ScaleAnimation A08;
    public final 9Hq A09;
    public final Object A0A = new Object();
    public final java.util.Map A0B = 1BK.A1C();
    public final AtomicBoolean A0C = 7zO.A15();
    public final boolean A0D;
    public final ViewGroup A0E;
    public final 2Ff A0F;
    public final C6kf A0G;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.animation.Interpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.view.animation.Interpolator, java.lang.Object] */
    public C9hW(ViewGroup viewGroup, 2Ff r303, 9Hq r304, C6kf c6kf, AvatarAudioMessagePose avatarAudioMessagePose, boolean z) {
        this.A09 = r304;
        this.A0E = viewGroup;
        this.A0D = z;
        this.A0G = c6kf;
        this.A0F = r303;
        this.A01 = avatarAudioMessagePose;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 1.0f);
        this.A08 = scaleAnimation;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 1.0f);
        this.A07 = scaleAnimation2;
        scaleAnimation.setDuration(450L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new Object());
        scaleAnimation2.setDuration(450L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation2.setInterpolator(new Object());
    }

    public static final void A00(C9hW c9hW, JHM jhm, boolean z) {
        ImageView imageView;
        c9hW.A0C.set(z);
        Qq9 qq9 = Qq9.A02;
        AvatarAudioMessagePose avatarAudioMessagePose = c9hW.A01;
        03Y A1G = 1BK.A1G(qq9, avatarAudioMessagePose.A04);
        03Y A1G2 = 1BK.A1G(Qq9.A05, avatarAudioMessagePose.A03);
        Qq9 qq92 = Qq9.A03;
        LinkedHashMap A09 = 04R.A09(new 03Y[]{A1G, A1G2, 1BK.A1G(qq92, avatarAudioMessagePose.A06), 1BK.A1G(Qq9.A06, avatarAudioMessagePose.A02), 1BK.A1G(Qq9.A04, avatarAudioMessagePose.A05)});
        c9hW.A0E.setContentDescription(c9hW.A01.A01);
        AtomicInteger atomicInteger = new AtomicInteger(A09.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator A0x = AnonymousClass001.A0x(A09);
        while (A0x.hasNext()) {
            Map.Entry entry = (Map.Entry) A0x.next();
            if (entry.getValue() != null && (!z || entry.getKey() == qq92 || (entry.getKey() == qq9 && !c9hW.A01()))) {
                if (jhm != null) {
                    AnonymousClass001.A07().postDelayed(new SBA(jhm, atomicBoolean), 3000L);
                }
                synchronized (c9hW.A0A) {
                    9Nb r0 = (9Nb) c9hW.A0B.get(entry.getKey());
                    imageView = r0 != null ? r0.A01 : null;
                }
                if (imageView != null) {
                    5BO A02 = 5Bm.A02((String) entry.getValue(), (java.util.Map) null);
                    C07004ik A00 = C06984ii.A00();
                    A00.A0J = true;
                    C1iM.A01(imageView, new Q6S(c9hW, jhm, entry, atomicBoolean, atomicInteger), 7zL.A0L(A00), A02, 9F0.A00);
                }
            } else if (1Br.A07(c9hW.A0G.A00).AZk(36323552034835100L)) {
                c9hW.A0F.A0D(2Dp.A01((String) entry.getValue()), 9F0.A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r301.A01.A00 == 4) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01() {
        /*
            r301 = this;
            r0 = r301
            X.6kf r0 = r0.A0G
            X.1Br r0 = r0.A00
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1Br.A07(r0)
            r303 = r0
            r0 = 2342166561248463515(0x20810c1400034a9b, double:4.068597704411317E-152)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L37
            r0 = r301
            com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data.AvatarAudioMessagePose r0 = r0.A01
            int r0 = r0.A00
            r307 = r0
            r0 = 4
            r308 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r302 = r0
            r0 = r307
            r1 = r308
            if (r0 != r1) goto L3a
        L37:
            r0 = 1
            r306 = r0
        L3a:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9hW.A01():boolean");
    }
}
