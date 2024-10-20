package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.composer.quickreply.QuickReplyContainerView;
import com.facebook.messaging.composer.quickreply.logging.type.QuickReplyLoggingType;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6m8, reason: invalid class name */
/* loaded from: 6m8.class */
public final class C6m8 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public ValueAnimator A05;
    public RecyclerView A06;
    public FbUserSession A07;
    public LithoView A08;
    public 6Rw A09;
    public QuickReplyContainerView A0A;
    public 6Rz A0B;
    public ThreadKey A0C;
    public ThreadKey A0D;
    public ThreadSummary A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Context A0N;
    public final View.OnTouchListener A0O;
    public final 1Br A0P;
    public final 1Br A0Q;
    public final 1Br A0R;
    public final 1Br A0S;
    public final 1Br A0T;
    public final 1Br A0U;
    public final 1Br A0V;
    public final boolean A0W;
    public final 1CO A0X;

    public C6m8(Context context) {
        11T.A0F(context, 1);
        this.A0N = context;
        1CO r0 = (1CO) 1Bi.A03(16387);
        this.A0X = r0;
        this.A0K = r0.AZk(72340464879013613L);
        this.A0W = r0.AZk(72340464879144687L);
        this.A0R = 1Bu.A01(context, 68532);
        this.A0P = 1Bq.A00(68531);
        this.A0T = 1Bu.A01(context, 114785);
        this.A0Q = 1Bq.A00(84488);
        this.A0V = 1Bq.A00(16461);
        this.A0S = 1Bu.A01(context, 68533);
        this.A0U = 1Bu.A00(66918);
        this.A04 = -1;
        this.A0J = true;
        this.A0O = new View.OnTouchListener() { // from class: X.6m9
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                motionEvent.getActionMasked();
                return false;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (A03(r302, r302.A0B) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(android.view.View r301, X.C6m8 r302, java.lang.Runnable r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6m8.A00(android.view.View, X.6m8, java.lang.Runnable, boolean, boolean):void");
    }

    public static final void A01(C6m8 c6m8, Runnable runnable) {
        ((ScheduledExecutorService) 1Br.A0B(c6m8.A0V)).schedule(runnable, 400L, TimeUnit.MILLISECONDS);
    }

    public static final void A02(C6m8 c6m8, Runnable runnable, boolean z) {
        2OB r0;
        6Rz r02 = c6m8.A0B;
        boolean z2 = true;
        if (r02 == null || !r02.A00()) {
            z2 = false;
        }
        KeyEvent.Callback callback = null;
        if (z2) {
            c6m8.A0B = null;
            LithoView lithoView = c6m8.A08;
            if (lithoView == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A00(lithoView, c6m8, new AEc(c6m8, runnable), z, false);
            QuickReplyContainerView quickReplyContainerView = c6m8.A0A;
            if (quickReplyContainerView == null || (r0 = quickReplyContainerView.A03) == null) {
                return;
            }
            r0.setVisibility(8);
            return;
        }
        KeyEvent.Callback callback2 = c6m8.A06;
        if (callback2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        c6m8.A0B = null;
        AEd aEd = new AEd(c6m8, runnable);
        if (c6m8.A0K) {
            QuickReplyContainerView quickReplyContainerView2 = c6m8.A0A;
            if (quickReplyContainerView2 != null) {
                callback = quickReplyContainerView2.A02;
            }
        } else {
            callback = callback2;
        }
        A00((View) callback, c6m8, aEd, z, false);
    }

    public static final boolean A03(C6m8 c6m8, 6Rz r302) {
        ImmutableList immutableList;
        FbUserSession fbUserSession = c6m8.A07;
        boolean z = false;
        if (fbUserSession != null && ((7NU) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 68784)).A02 && r302 != null && (immutableList = r302.A00) != null) {
            Iterator it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (QuickReplyLoggingType.A07 == ((QuickReplyItem) it.next()).A01) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r0.A1x == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r0 = r0.A1C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r304 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r0.A00.get(com.facebook.acra.constants.ActionId.ACTION_BAR_COMPLETE) == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        if (r312 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        if (r307 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (r304 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r311 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r304 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r0 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A04(X.C6m8 r301, X.6Rz r302) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6m8.A04(X.6m8, X.6Rz):boolean");
    }
}
