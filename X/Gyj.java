package X;

import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: Gyj.class */
public final class Gyj extends If6 {
    public PhoneStateListener A00;
    public Integer A01;
    public Future A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final I7g A07;
    public final HFd A08;
    public final JGN A09;
    public final C01i A0A;
    public final 0DE A0B;
    public volatile boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gyj(Context context, AudioManager audioManager, I5D i5d, I7g i7g, HFd hFd, JGN jgn, JKQ jkq, JLv jLv, HuN huN, HgZ hgZ, ExecutorService executorService, 0DE r313) {
        super(context, audioManager, i5d, hFd, jkq, jLv, huN, hgZ, executorService);
        7zT.A1W(context, hgZ, audioManager, i7g);
        11T.A0F(jLv, 6);
        11T.A0F(r313, 12);
        this.A07 = i7g;
        this.A09 = jgn;
        this.A08 = hFd;
        this.A0B = r313;
        this.A06 = AnonymousClass001.A07();
        this.A0A = C01g.A00(C03i.A02, new J9p(context, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyj.A00():void");
    }

    private final void A01(int i, boolean z) {
        ExecutorService A1G;
        J12 j12 = new J12(this, i, z);
        HFd hFd = this.A08;
        if (hFd instanceof Gyn) {
            Gyn gyn = (Gyn) hFd;
            if (1Br.A06(gyn.A04).AZk(36316688677087682L) && (A1G = GOp.A1G(gyn.A03)) != null) {
                A1G.execute(j12);
                return;
            }
        }
        j12.run();
    }

    public void A0N() {
        A00();
        IA9.A02(this.audioRecordMonitor, "recording_config_on_updating_audio_output", (List) null);
        this.A09.Cm2(this.aomCurrentAudioOutput);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        if (r0 != 3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AEW(X.HBP r302) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyj.AEW(X.HBP):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (X.I9J.A01(r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AEq(boolean r302) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyj.AEq(boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v0 int, still in use, count: 2, list:
          (r310v0 int) from 0x0078: PHI (r310v1 int) = (r310v0 int), (r310v2 int) binds: [B:18:0x00f7, B:15:0x0072] A[DONT_GENERATE, DONT_INLINE]
          (r310v0 int) from 0x00f7: IF  (r310v0 int) != (-2 int)  -> B:16:0x0078 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public void AF6(boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyj.AF6(boolean, boolean):void");
    }

    public BluetoothHeadset Adt() {
        return this.A07.A06.A01;
    }

    public HBP AfZ() {
        return this.aomCurrentAudioOutput;
    }

    public boolean BQy() {
        return AnonymousClass001.A1N(this.A07.A06.A05() ? 1 : 0);
    }

    public boolean BRR() {
        return AnonymousClass001.A1W(this.aomCurrentAudioOutput, HBP.A02);
    }

    public boolean BRS() {
        return AnonymousClass001.A1W(this.aomCurrentAudioOutput, HBP.A03);
    }

    public boolean BRT() {
        return AnonymousClass001.A1W(this.aomCurrentAudioOutput, HBP.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (r301.aomIsHeadsetAttached != false) goto L16;
     */
    @Override // X.If6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C1b() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyj.C1b():void");
    }

    public void CqI(boolean z) {
        boolean z2 = this.A05 ^ z;
        this.A05 = z;
        if (z2 && z) {
            HFd hFd = this.A08;
            if ((hFd instanceof Gyn) && 1Br.A06(((Gyn) hFd).A04).AZk(36326824799655766L)) {
                D5O();
            }
        }
    }

    public void D5O() {
        1Br r309;
        It7 it7 = new It7(this);
        HFd hFd = this.A08;
        if (hFd instanceof Gyn) {
            Gyn gyn = (Gyn) hFd;
            1Br r0 = gyn.A04;
            if (1Br.A06(r0).AZk(36325729582994352L)) {
                switch (2yD.A00(1Br.A06(r0), 36607204559888044L)) {
                    case 0:
                        r309 = gyn.A05;
                        break;
                    case 1:
                        r309 = gyn.A07;
                        break;
                    case 2:
                        r309 = gyn.A06;
                        break;
                    case 3:
                        r309 = gyn.A08;
                        break;
                    case 4:
                        r309 = gyn.A01;
                        break;
                    case 5:
                        r309 = gyn.A02;
                        break;
                    case 6:
                        r309 = gyn.A00;
                        break;
                }
                ExecutorService A1G = GOp.A1G(r309);
                if (A1G != null) {
                    GOo.A1R(this.A02);
                    this.A02 = null;
                    this.A02 = A1G.submit(it7);
                    return;
                }
            }
        }
        it7.run();
    }

    public void D6a(HA4 ha4) {
        11T.A0F(ha4, 0);
        this.aomAudioModeState = ha4;
        A01(A0I(), false);
        IA9 ia9 = this.audioRecordMonitor;
        if (ia9.A04.A00 == null || ha4 != HA4.A03) {
            return;
        }
        Handler handler = ia9.A03;
        Runnable runnable = ia9.A05;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000L);
    }

    @Override // X.If6
    public void reset() {
        HtL A01;
        HtL A012;
        I5D i5d = super.A03;
        if (i5d != null && (A012 = i5d.A01()) != null) {
            A012.A00("reset");
        }
        super.reset();
        this.A0C = false;
        if (i5d == null || (A01 = i5d.A01()) == null) {
            return;
        }
        A01.A00("finish_audio_route_self_healer");
    }
}
