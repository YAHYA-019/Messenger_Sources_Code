package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.events.common.lifecycle.OnCreateSurface;
import com.facebook.xapp.messaging.events.common.lifecycle.OnCreateView;
import com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered;
import com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered;
import com.facebook.xapp.messaging.powerups.events.OnDoubleTapPowerUpInThread;
import com.facebook.xapp.messaging.powerups.events.OnTapPowerUpInThread;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.6t9, reason: invalid class name */
/* loaded from: 6t9.class */
public final class C6t9 implements 1Vf {
    public 6tB A00;
    public final Context A01;
    public final ThreadKey A04;
    public final 1Br A03 = 1Bq.A00(49412);
    public final 1Br A02 = 1Bq.A00(67765);

    public C6t9(Context context, ThreadKey threadKey) {
        this.A01 = context;
        this.A04 = threadKey;
    }

    private final boolean A00(C5fv c5fv) {
        5aU r0;
        boolean z = false;
        11T.A0F(c5fv, 0);
        5vF AxW = c5fv.AxW(C5gH.A00);
        if (AxW != null && (r0 = AxW.A01) != 5aU.A0D) {
            6tB r02 = this.A00;
            Uri uri = null;
            if (r02 == null) {
                11T.A0L("powerupsEffectsManager");
                throw 0Q8.createAndThrow();
            }
            C5fu c5fu = (C5fu) c5fv;
            String str = c5fu.A0B;
            if (str == null) {
                str = c5fu.A09;
            }
            82Z r03 = AxW.A00;
            if (r03 != null) {
                uri = (Uri) r03.A02;
            }
            AaP A00 = r02.A00(uri, r0, str);
            if (A00 != null) {
                ((1FP) 1Br.A0B(this.A02)).D3E(3Ds.A02, 0S2.A00, "playPowerUpsAnimation", new AHb(this, A00, 6));
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        switch (str.hashCode()) {
            case -1834325531:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered")) {
                    OnNewMessagesRendered onNewMessagesRendered = (OnNewMessagesRendered) r302;
                    11T.A0F(onNewMessagesRendered, 0);
                    Iterator it = onNewMessagesRendered.A00.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        z = A00((C5fv) it.next());
                    }
                    if (z) {
                        ((C12044yi) 1Br.A0B(this.A03)).A06("powerups_animation_played", this.A04.A0u());
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case -1227476852:
                if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreateSurface")) {
                    OnCreateSurface onCreateSurface = (OnCreateSurface) r302;
                    11T.A0F(onCreateSurface, 0);
                    this.A00 = (6tB) onCreateSurface.A00.A00(67760);
                    return;
                }
                throw 4YV.A0f(str);
            case -846344854:
                if (str.equals("com.facebook.xapp.messaging.powerups.events.OnDoubleTapPowerUpInThread")) {
                    OnDoubleTapPowerUpInThread onDoubleTapPowerUpInThread = (OnDoubleTapPowerUpInThread) r302;
                    11T.A0F(onDoubleTapPowerUpInThread, 0);
                    C75c c75c = onDoubleTapPowerUpInThread.A00;
                    if (c75c != null) {
                        c75c.A00(onDoubleTapPowerUpInThread.A01);
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case 160959865:
                if (str.equals("com.facebook.xapp.messaging.powerups.events.OnTapPowerUpInThread")) {
                    OnTapPowerUpInThread onTapPowerUpInThread = (OnTapPowerUpInThread) r302;
                    11T.A0F(onTapPowerUpInThread, 0);
                    5aU r0 = onTapPowerUpInThread.A00;
                    if (r0.isAvatarType) {
                        ((9lH) 1Bn.A0A(67797)).A03(this.A04, r0);
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case 763992870:
                if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreateView")) {
                    OnCreateView onCreateView = (OnCreateView) r302;
                    11T.A0F(onCreateView, 0);
                    View findViewById = onCreateView.A00.findViewById(2131365866);
                    6tB r02 = this.A00;
                    if (r02 == null) {
                        11T.A0L("powerupsEffectsManager");
                        throw 0Q8.createAndThrow();
                    }
                    11T.A0D(findViewById);
                    11T.A0F(findViewById, 0);
                    r02.A00 = new WeakReference(findViewById);
                    return;
                }
                throw 4YV.A0f(str);
            case 2054794633:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered")) {
                    OnInitialMessagesRendered onInitialMessagesRendered = (OnInitialMessagesRendered) r302;
                    11T.A0F(onInitialMessagesRendered, 0);
                    C00i c00i = this.A03.A00;
                    C12044yi c12044yi = (C12044yi) c00i.get();
                    ThreadKey threadKey = this.A04;
                    long A04 = c12044yi.A04("powerups_animation_played", threadKey.A0u());
                    for (C5fv c5fv : onInitialMessagesRendered.A00) {
                        C5fu c5fu = (C5fu) c5fv;
                        if (A04 < c5fu.A02 && !c5fu.A0H) {
                            A00(c5fv);
                            ((C12044yi) c00i.get()).A06("powerups_animation_played", threadKey.A0u());
                            return;
                        }
                    }
                    return;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
    }
}
