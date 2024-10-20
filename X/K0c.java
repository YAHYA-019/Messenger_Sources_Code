package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: K0c.class */
public abstract class K0c extends K0P implements 6WY {
    public AudioManager A00;
    public 6Yl A01;
    public 6Yl A02;
    public MCb A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public long A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final 6Vz A0B;
    public final 6Wx A0C;
    public final 6Wk A0D;

    public K0c(Context context, Handler handler, 6Vz r304, 6Vq r305, 6Wk r306, MFv mFv, 6W2 r308) {
        super(mFv, r308, 44100.0f, 1, 0, 0, false);
        5My.A01("MCAR3", "Instantiating MediaCodecAudioRenderer3");
        this.A0A = context.getApplicationContext();
        this.A0D = r306;
        this.A0B = r304;
        this.A0C = new 6Wx(handler, r305);
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r306;
        defaultAudioSink.A08 = new LaJ(this);
        if (5N4.A02(5N3.A0g)) {
            return;
        }
        defaultAudioSink.A0D = r304.A09;
    }

    public static ImmutableList A00(6Yl r301, 6Wk r302, 6W2 r303, boolean z) {
        C6b1 A01;
        String str = r301.A0W;
        if (str == null) {
            return ImmutableList.of();
        }
        if (((DefaultAudioSink) r302).AnG(r301) != 0 && (A01 = C6ay.A01("audio/raw")) != null) {
            return ImmutableList.of((Object) A01);
        }
        List Agl = r303.Agl(str, z, false);
        String A02 = C6ay.A02(r301);
        if (A02 == null) {
            return ImmutableList.copyOf((Collection) Agl);
        }
        List Agl2 = r303.Agl(A02, z, false);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(Agl);
        builder.addAll(Agl2);
        return builder.build();
    }

    private void A01() {
        long Afp = this.A0D.Afp(BSB());
        if (Afp != Long.MIN_VALUE) {
            if (!this.A04) {
                Afp = Math.max(this.A07, Afp);
            }
            this.A07 = Afp;
            this.A04 = false;
        }
    }

    public void A0L() {
        this.A0D.CXT();
    }

    public void A0M() {
        A01();
        this.A0D.pause();
    }

    @Override // X.K0P
    public void A0N() {
        try {
            super.A0N();
        } finally {
            if (this.A09) {
                this.A09 = false;
                this.A0D.reset();
            }
        }
    }

    @Override // X.K0P
    public void A0O() {
        this.A09 = true;
        this.A02 = null;
        try {
            this.A0D.flush();
            super.A0O();
        } catch (Throwable th) {
            super.A0O();
            throw th;
        } finally {
            this.A0C.A01(this.A0F);
        }
    }

    @Override // X.K0P
    public void A0P(long j, boolean z) {
        super.A0P(j, z);
        boolean z2 = this.A05;
        6Wk r0 = this.A0D;
        if (z2) {
            r0.ARb();
        } else {
            r0.flush();
        }
        this.A07 = j;
        this.A08 = true;
        this.A04 = true;
    }

    @Override // X.K0P
    public void A0Q(boolean z, boolean z2) {
        super.A0Q(z, z2);
        6Wx r0 = this.A0C;
        6VN r02 = this.A0F;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new 6bC(r0, r02));
        }
        6Y8 r03 = ((6W7) this).A03;
        r03.getClass();
        boolean z3 = r03.A00;
        6Wk r04 = this.A0D;
        if (z3) {
            r04.APY();
        } else {
            DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r04;
            if (defaultAudioSink.A0I) {
                defaultAudioSink.A0I = false;
                defaultAudioSink.flush();
            }
        }
        6YT r05 = ((6W7) this).A04;
        r05.getClass();
        ((DefaultAudioSink) r04).A07 = r05;
    }

    @Override // X.K0P
    public Krr A0T(6Yl r302, 6Yl r303, C6b1 c6b1) {
        Krr A05 = c6b1.A05(r302, r303);
        int i = A05.A00;
        if (r303.A0B > this.A06) {
            i |= 64;
        }
        return new Krr(r302, r303, c6b1.A03, i != 0 ? 0 : A05.A01, i);
    }

    @Override // X.K0P
    public Krr A0U(6WB r302) {
        6Yl r0 = r302.A00;
        r0.getClass();
        this.A02 = r0;
        Krr A0U = super.A0U(r302);
        this.A0C.A00(this.A02, A0U);
        return A0U;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        if ("audio/raw".equals(r303.A0W) != false) goto L15;
     */
    @Override // X.K0P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Kl8 A0V(android.media.MediaCrypto r302, X.6Yl r303, X.C6b1 r304, float r305) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0c.A0V(android.media.MediaCrypto, X.6Yl, X.6b1, float):X.Kl8");
    }

    @Override // X.K0P
    public void A0f(6WD r302) {
        if (this.A08) {
            int i = (-1) << (-1);
            if ((((6WE) r302).A00 & i) != i) {
                long j = r302.A01;
                if (Math.abs(j - this.A07) > 500000) {
                    this.A07 = j;
                }
                this.A08 = false;
            }
        }
    }

    @Override // X.K0P
    public void A0g(Kl8 kl8, String str, long j, long j2) {
        this.A0C.A02(str, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0115, code lost:
    
        if (r0 <= r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.media.MediaFormat A0k(X.6Yl r302, java.lang.String r303, float r304, int r305) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0c.A0k(X.6Yl, java.lang.String, float, int):android.media.MediaFormat");
    }

    public 6WY Aw2() {
        return this;
    }

    public 6Vm B3K() {
        return DefaultAudioSink.A02((DefaultAudioSink) this.A0D).A02;
    }

    public long B3y() {
        if (((6W7) this).A01 == 2) {
            A01();
        }
        return this.A07;
    }

    public void BME(int i, Object obj) {
        if (i == 2) {
            this.A0D.Cwb(7zM.A00(obj));
            return;
        }
        if (i == 3) {
            this.A0D.Clw((6Wt) obj);
            return;
        }
        if (i == 6) {
            this.A0D.Cm6((6Wu) obj);
            return;
        }
        switch (i) {
            case 9:
                6Wk r0 = this.A0D;
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r0;
                DefaultAudioSink.A08(DefaultAudioSink.A02(defaultAudioSink).A02, defaultAudioSink, AnonymousClass001.A1V(obj));
                return;
            case 10:
                this.A0D.Cm3(AnonymousClass001.A03(obj));
                return;
            case 11:
                this.A03 = (MCb) obj;
                return;
            case 12:
                this.A0D.Ct6((AudioDeviceInfo) obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r301.A0D.BSB() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BSB() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0a
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            r0 = r301
            X.6Wk r0 = r0.A0D
            r303 = r0
            r0 = r303
            boolean r0 = r0.BSB()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L1f
        L1b:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L1f:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0c.BSB():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (super.BVE() != false) goto L6;
     */
    @Override // X.K0P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVE() {
        /*
            r301 = this;
            r0 = r301
            X.6Wk r0 = r0.A0D
            r302 = r0
            r0 = r302
            boolean r0 = r0.BNI()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1d
            r0 = r301
            boolean r0 = super.BVE()
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L1f
        L1d:
            r0 = 1
            r303 = r0
        L1f:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0c.BVE():boolean");
    }

    public void Csk(6Vm r302) {
        this.A0D.Csk(r302);
    }

    public String getName() {
        return "MCAR3";
    }
}
