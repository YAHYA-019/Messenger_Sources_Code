package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.rtcactivity.RtcActivity;
import com.facebook.rtcactivity.common.RtcActivityStartCallbackNative;
import com.facebook.rtcactivity.common.RtcRequestedActivitySession;
import com.facebook.rtcactivity.common.SessionWithMaster;
import com.facebook.rtcactivity.interfaces.RtcActivityType;
import com.facebook.rtcactivity.interfaces.Version;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: GzJ.class */
public final class GzJ extends RtcActivity {
    public 1BY A00;
    public EffectItem A01;
    public JDN A02;
    public SessionWithMaster A03;
    public boolean A04;
    public HashMap A05;
    public final RMP A06;
    public final HFV A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final String A0B;

    public GzJ(FbUserSession fbUserSession, 1BO r303, EffectItem effectItem, String str, String str2, String str3, String str4, String str5) {
        super(str, str3, new J7Q(str4, str5));
        this.A0A = AbH.A0I();
        this.A08 = 1BQ.A02(16449);
        this.A09 = 1BQ.A01();
        this.A04 = false;
        this.A07 = new GgB(this, 0);
        this.A00 = 7zL.A0Q(r303);
        IPz iPz = (IPz) 1Lo.A07(fbUserSession, 114831);
        this.A0B = str2;
        this.A05 = AnonymousClass001.A0u();
        this.A06 = new RMP();
        Preconditions.checkArgument(iPz.A0D(effectItem), "Effect should be downloaded and usable to create effect activity obj");
        this.A01 = effectItem;
    }

    public static void A00(FbUserSession fbUserSession, GzJ gzJ, RtcRequestedActivitySession rtcRequestedActivitySession) {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) rtcRequestedActivitySession.getAcceptedPeers());
        1BK.A1E(gzJ.A0A).execute(new Izq(gzJ, (HZt) 1Lo.A04((Context) null, fbUserSession, gzJ.A00, 115409), copyOf));
    }

    @Override // com.facebook.rtcactivity.RtcActivity
    public void finish() {
        1BY r0 = this.A00;
        ((IMH) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 114791)).A03(this.A07);
        JGV jgv = this.mListener;
        if (jgv != null) {
            jgv.Bhk();
        }
        RtcActivityStartCallbackNative rtcActivityStartCallbackNative = this.mNativeCallback;
        if (rtcActivityStartCallbackNative != null) {
            rtcActivityStartCallbackNative.onActivityFinished();
        }
        this.A04 = true;
    }

    @Override // com.facebook.rtcactivity.RtcActivity
    public Iterable getSupportedFeatures() {
        return new SingletonImmutableSet("SessionWithMaster");
    }

    @Override // com.facebook.rtcactivity.RtcActivity
    public RtcActivityType getType() {
        return RtcActivityType.EFFECT;
    }

    @Override // com.facebook.rtcactivity.RtcActivity
    public Version getVersion() {
        return new Version(1, 0);
    }

    @Override // com.facebook.rtcactivity.RtcActivity
    public void initParticipants(ImmutableMap immutableMap) {
        RMP rmp = this.A06;
        Set synchronizedSet = Collections.synchronizedSet(AnonymousClass001.A0v());
        rmp.A00 = synchronizedSet;
        if (immutableMap != null) {
            1Du it = ((ImmutableCollection) immutableMap.values()).iterator();
            while (it.hasNext()) {
                C3Oh c3Oh = (C3Oh) it.next();
                if (c3Oh.A00() == 2QW.A03) {
                    11T.A0D(synchronizedSet);
                    synchronizedSet.add(c3Oh);
                }
            }
        }
    }

    @Override // com.facebook.rtcactivity.RtcActivity
    public void onParticipantsChanged(ImmutableMap immutableMap) {
        RMP rmp = this.A06;
        Set set = rmp.A00;
        if (set != null) {
            synchronized (set) {
                Set set2 = rmp.A00;
                11T.A0D(set2);
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    C3Oh c3Oh = (C3Oh) immutableMap.get(((C3Oh) it.next()).A03);
                    if (c3Oh == null || c3Oh.A00() != 2QW.A03) {
                        it.remove();
                    }
                }
            }
        }
    }
}
