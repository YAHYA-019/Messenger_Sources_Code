package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6pa, reason: invalid class name */
/* loaded from: 6pa.class */
public class C6pa extends C6ax implements 6WY {
    public int A00;
    public AudioManager A01;
    public 6Yl A02;
    public 6Yl A03;
    public MCb A04;
    public boolean A05;
    public boolean A06;
    public long A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final 6Wx A0B;
    public final 6Wk A0C;

    public C6pa(Context context, Handler handler, 6W4 r304, 6Vz r305, 6Vq r306, 6Wk r307, MFv mFv, 6W2 r309, boolean z) {
        super(r304, r305, mFv, r309, null, 44100.0f, 1, 0, 0, false, z);
        this.A0A = context.getApplicationContext();
        this.A0C = r307;
        this.A0B = new 6Wx(handler, r306);
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r307;
        defaultAudioSink.A08 = new LaI(this);
        defaultAudioSink.A0D = r305.A09;
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
        long Afp = this.A0C.Afp(BSB());
        if (Afp != Long.MIN_VALUE) {
            if (!this.A05) {
                Afp = Math.max(this.A07, Afp);
            }
            this.A07 = Afp;
            this.A05 = false;
        }
    }

    public void A0M() {
        A01();
        this.A0C.pause();
    }

    @Override // X.C6ax
    public void A0N() {
        try {
            super.A0N();
        } finally {
            if (this.A09) {
                this.A09 = false;
                this.A0C.reset();
            }
        }
    }

    @Override // X.C6ax
    public void A0O() {
        this.A09 = true;
        this.A03 = null;
        try {
            this.A0C.flush();
            super.A0O();
        } catch (Throwable th) {
            super.A0O();
            throw th;
        } finally {
            this.A0B.A01(this.A0F);
        }
    }

    @Override // X.C6ax
    public void A0P(long j, boolean z) {
        super.A0P(j, z);
        boolean z2 = this.A06;
        6Wk r0 = this.A0C;
        if (z2) {
            r0.ARb();
        } else {
            r0.flush();
        }
        this.A07 = j;
        this.A08 = true;
        this.A05 = true;
    }

    @Override // X.C6ax
    public void A0Q(boolean z, boolean z2) {
        super.A0Q(z, z2);
        6Wx r0 = this.A0B;
        6VN r02 = this.A0F;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new 6bC(r0, r02));
        }
        6Y8 r03 = ((6W7) this).A03;
        r03.getClass();
        boolean z3 = r03.A00;
        6Wk r04 = this.A0C;
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

    @Override // X.C6ax
    public Krr A0V(6WB r302) {
        6Yl r0 = r302.A00;
        r0.getClass();
        this.A03 = r0;
        Krr A0V = super.A0V(r302);
        this.A0B.A00(this.A03, A0V);
        return A0V;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0199, code lost:
    
        if (r0 <= r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02cc, code lost:
    
        if ("audio/raw".equals(r303.A0W) != false) goto L56;
     */
    @Override // X.C6ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Kl8 A0W(android.media.MediaCrypto r302, X.6Yl r303, X.C6b1 r304, float r305) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6pa.A0W(android.media.MediaCrypto, X.6Yl, X.6b1, float):X.Kl8");
    }

    @Override // X.C6ax
    public void A0l(6WD r302) {
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

    public 6Vm B3K() {
        return DefaultAudioSink.A02((DefaultAudioSink) this.A0C).A02;
    }

    public long B3y() {
        if (((6W7) this).A01 == 2) {
            A01();
        }
        return this.A07;
    }

    public void BME(int i, Object obj) {
        if (i == 2) {
            this.A0C.Cwb(((Number) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.A0C.Clw((6Wt) obj);
            return;
        }
        if (i == 6) {
            this.A0C.Cm6((6Wu) obj);
            return;
        }
        switch (i) {
            case 9:
                6Wk r0 = this.A0C;
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r0;
                DefaultAudioSink.A08(DefaultAudioSink.A02(defaultAudioSink).A02, defaultAudioSink, ((Boolean) obj).booleanValue());
                return;
            case 10:
                this.A0C.Cm3(AnonymousClass001.A03(obj));
                return;
            case 11:
                this.A04 = (MCb) obj;
                return;
            case 12:
                this.A0C.Ct6((AudioDeviceInfo) obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r301.A0C.BSB() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BSB() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0b
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            r0 = r301
            X.6Wk r0 = r0.A0C
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
        throw new UnsupportedOperationException("Method not decompiled: X.C6pa.BSB():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (super.BVE() != false) goto L6;
     */
    @Override // X.C6ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVE() {
        /*
            r301 = this;
            r0 = r301
            X.6Wk r0 = r0.A0C
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
        throw new UnsupportedOperationException("Method not decompiled: X.C6pa.BVE():boolean");
    }

    public void Csk(6Vm r302) {
        this.A0C.Csk(r302);
    }

    public String getName() {
        return "MediaCodecAudioRenderer2";
    }
}
