package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: K0Q.class */
public final class K0Q extends C6pa {
    public float A00;
    public long A01;
    public long A02;
    public final HeroPlayerSetting A03;

    public K0Q(Context context, Handler handler, 6W4 r304, 6Vz r305, HeroPlayerSetting heroPlayerSetting, 6Vq r307, 6Wk r308, MFv mFv, 6W2 r310) {
        super(context, handler, r304, r305, r307, r308, mFv, r310, heroPlayerSetting.onlyCheckForDecoderSupport);
        this.A01 = -9223372036854775807L;
        this.A03 = heroPlayerSetting;
    }

    @Override // X.C6pa
    public void A0M() {
        super.A0M();
        this.A01 = -9223372036854775807L;
    }

    @Override // X.C6pa, X.C6ax
    public void A0P(long j, boolean z) {
        long j2;
        if (z) {
            long j3 = this.A03.audioLazyLoadSetting.allowJoiningTimeMs;
            j2 = JQy.A0K((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)), j3);
        } else {
            j2 = -9223372036854775807L;
        }
        this.A01 = j2;
        super.A0P(j, z);
    }

    @Override // X.C6pa, X.C6ax
    public void A0Q(boolean z, boolean z2) {
        long j;
        if (z) {
            long j2 = this.A03.audioLazyLoadSetting.allowJoiningTimeMs;
            j = JQy.A0K((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)), j2);
        } else {
            j = -9223372036854775807L;
        }
        this.A01 = j;
        super.A0Q(z, z2);
    }

    @Override // X.C6pa
    public void BME(int i, Object obj) {
        if (i == 2) {
            float A00 = 7zM.A00(obj);
            this.A00 = A00;
            if (A00 > 0.0f) {
                this.A02 = SystemClock.elapsedRealtime();
            }
            5Kj r0 = this.A03.audioLazyLoadSetting;
            if (r0.allowJoiningOnSetVolume) {
                long j = r0.allowJoiningTimeMs;
                this.A01 = JQy.A0K((j > 0L ? 1 : (j == 0L ? 0 : -1)), j);
            }
        }
        super.BME(i, obj);
    }

    @Override // X.C6pa
    public boolean BSB() {
        boolean z;
        HeroPlayerSetting heroPlayerSetting = this.A03;
        if (heroPlayerSetting.audioLazyLoadSetting.fixClockSwitchJump && BVE() && !heroPlayerSetting.audioLazyLoadSetting.fixClockSwitchJumpEnableFbEnded) {
            z = super.BSB();
        } else {
            if (this.A00 <= 0.0f || SystemClock.elapsedRealtime() - this.A02 < heroPlayerSetting.audioLazyLoadSetting.maxLoadTimeBeforeStallMs) {
                return true;
            }
            z = false;
            if (super.BSB()) {
                return true;
            }
        }
        return z;
    }

    @Override // X.C6pa, X.C6ax
    public boolean BVE() {
        long j = this.A01;
        if (j == -9223372036854775807L || SystemClock.elapsedRealtime() >= j) {
            return super.BVE();
        }
        return true;
    }
}
