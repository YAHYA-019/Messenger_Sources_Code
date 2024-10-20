package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.acra.util.JavaProcFileReader;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.9n3, reason: invalid class name */
/* loaded from: 9n3.class */
public final class C9n3 {
    public int A00;
    public int A01;
    public 8Lu A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final FrameLayout A09;
    public final Set A0A;
    public final ConcurrentLinkedQueue A0B;
    public final QAV[] A0C;
    public final GU9[] A0D;
    public final long A0E;
    public final RHI A0F;

    public C9n3(Context context, long j) {
        this.A0E = j;
        this.A09 = new FrameLayout(context);
        int i = 0;
        View[] viewArr = {new GU9(context, 0), new GU9(context, 1)};
        this.A0D = viewArr;
        this.A0C = new QAV[]{new QAV(0, 0, 0.0f), new QAV(0, 0, 0.0f)};
        this.A0B = new ConcurrentLinkedQueue();
        this.A0F = new RHI(this);
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        11T.A0A(newSetFromMap);
        this.A0A = newSetFromMap;
        this.A01 = -1;
        do {
            View view = viewArr[i];
            ((GU9) view).A04 = this.A0F;
            view.setAlpha(0.0f);
            this.A09.addView(view);
            i++;
        } while (i < 2);
    }

    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "CONTINUE_CURRENT_AND_REMOVE_QUEUED_AND_APPEND_TO_BACK";
            case 2:
                return "STOP_CURRENT_AND_REMOVE_ALL_AND_APPEND_TO_BACK";
            default:
                return "APPEND_TO_BACK";
        }
    }

    public static final void A01(6VH r301, C9n3 c9n3, boolean z) {
        String str = r301.A0X.A0F;
        0fH.A0j("CompositeHeroPlayer", 0Pz.A0F((c9n3.A00 + 1) % 2, "prepareNextPlayer() - videoId: ", str, ", nextPlayerId: "));
        GU9 gu9 = c9n3.A0D[(c9n3.A00 + 1) % 2];
        c9n3.A03 = str;
        c9n3.A04 = null;
        gu9.A02();
        gu9.A03(r301, z);
        c9n3.A06 = true;
    }

    public static final void A02(C9n3 c9n3) {
        6VH r0;
        0fH.A0j("CompositeHeroPlayer", 0Pz.A1C("maybePrepareNextPlayer() - nextVideoSet: ", c9n3.A06));
        if (c9n3.A06) {
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = c9n3.A0B;
        if (concurrentLinkedQueue.isEmpty() || (r0 = (6VH) concurrentLinkedQueue.poll()) == null) {
            return;
        }
        A01(r0, c9n3, false);
    }

    public static final void A03(C9n3 c9n3, int i) {
        int height;
        int i2;
        float f;
        if (i == c9n3.A00 % 2) {
            QAV qav = c9n3.A0C[i];
            if (qav.A04) {
                FrameLayout frameLayout = c9n3.A09;
                if (frameLayout.getWidth() <= 0 || frameLayout.getHeight() <= 0 || frameLayout.getParent() == null) {
                    return;
                }
                Object parent = frameLayout.getParent();
                11T.A0I(parent, 1BJ.A00(4));
                View view = (View) parent;
                if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                    return;
                }
                float width = view.getWidth() / view.getHeight();
                float f2 = qav.A00;
                float f3 = 0.0f;
                if (f2 <= width) {
                    i2 = view.getWidth();
                    height = (int) (i2 / f2);
                    f = (view.getHeight() - height) * 0.0f;
                } else {
                    height = view.getHeight();
                    i2 = (int) (height * f2);
                    f3 = (view.getWidth() - i2) * 0.0f;
                    f = 0.0f;
                }
                frameLayout.getLayoutParams().width = i2;
                frameLayout.getLayoutParams().height = height;
                frameLayout.setX(f3);
                frameLayout.setY(f);
                frameLayout.requestLayout();
            }
        }
    }

    public static final void A04(C9n3 c9n3, String str, boolean z) {
        8Lh r0;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("transitionToNextPlayer sessionId: ");
        A0k.append(str);
        A0k.append(", ");
        int i = c9n3.A00;
        A0k.append(i % 2);
        A0k.append(JavaProcFileReader.LS_SYMLINK_ARROW);
        A0k.append((i + 1) % 2);
        0fH.A0j("CompositeHeroPlayer", A0k.toString());
        c9n3.A05 = true;
        if (c9n3.A03 != null) {
            Iterator it = c9n3.A0A.iterator();
            while (it.hasNext()) {
                C9lx c9lx = ((9Wl) it.next()).A00.A00;
                if (c9lx != null && (r0 = (8Lh) c9lx.A04.get(str)) != null) {
                    Iterator it2 = c9lx.A06.iterator();
                    while (it2.hasNext()) {
                        9W2 r02 = ((C9K0) it2.next()).A00;
                        C9ah c9ah = (C9ah) 1Br.A0B(r02.A09);
                        ThreadKey threadKey = r02.A01;
                        String valueOf = String.valueOf(threadKey != null ? 7zO.A0k(threadKey) : null);
                        11T.A0F(valueOf, 0);
                        1UG A08 = 1BK.A08(1Br.A02(c9ah.A00), 1BJ.A00(934));
                        if (A08.isSampled()) {
                            String A0b = AnonymousClass001.A0b(valueOf, c9ah.A01);
                            8LK r03 = (8LK) r0.A02;
                            8LK r04 = (8LK) r0.A01;
                            A08.A7R("transition_trigger", r04.A05);
                            A08.A7R("transition_llm_action_name", r04.A00);
                            A08.A7R("transition_llm_sentiment_name", r04.A02);
                            A08.A7R("transition_llm_intensity_name", r04.A01);
                            A08.A7R("transition_previous_state", r03.A03);
                            A08.A7R("transition_previous_action", r03.A00);
                            A08.A7R("transition_previous_sentiment", r03.A02);
                            A08.A7R("transition_previous_intensity", r03.A01);
                            A08.A7R("transition_policy", r04.A04);
                            A08.A7R("thread_session_id", A0b);
                            7zL.A1F(A08, valueOf);
                            A08.A7R(TraceFieldType.VideoId, r0.A05);
                            A08.BZL();
                        }
                    }
                }
            }
        }
        int i2 = (c9n3.A00 + 1) % 2;
        View[] viewArr = c9n3.A0D;
        View view = viewArr[i2];
        A03(c9n3, i2);
        view.A00();
        view.bringToFront();
        view.setAlpha(0.0f);
        View view2 = viewArr[c9n3.A00 % 2];
        view.clearAnimation();
        view2.clearAnimation();
        view.animate().setDuration(z ? c9n3.A0E : 0L).alpha(1.0f).withEndAction(new SC4(c9n3, view2)).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.equals(r301.A04) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A05(X.C9n3 r301) {
        /*
            r0 = r301
            java.lang.String r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            r0 = r301
            java.lang.String r0 = r0.A04
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L20
        L1b:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L20:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9n3.A05(X.9n3):boolean");
    }

    public final void A06() {
        0fH.A0j("CompositeHeroPlayer", "release()");
        this.A02 = null;
        GU9[] gu9Arr = this.A0D;
        int i = 0;
        do {
            GU9 gu9 = gu9Arr[i];
            0fH.A0j(GOm.A00(50), 0Pz.A0T("release() - playerId: ", gu9.A07));
            gu9.A03 = null;
            gu9.A06 = false;
            gu9.A04 = null;
            Surface surface = gu9.A01;
            if (surface != null) {
                surface.release();
            }
            gu9.A01 = null;
            SurfaceTexture surfaceTexture = gu9.getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            gu9.A08.A0I();
            i++;
        } while (i < 2);
    }

    public final void A07(ViewGroup viewGroup) {
        0fH.A0j("CompositeHeroPlayer", "attachPlayerView()");
        FrameLayout frameLayout = this.A09;
        if (11T.A0O(frameLayout.getParent(), viewGroup)) {
            return;
        }
        viewGroup.addView(frameLayout);
        A03(this, this.A00 % 2);
    }

    public final void A08(8Lu r302) {
        6VH r0 = (6VH) r302.A01;
        Integer num = (Integer) r302.A00;
        String str = r0.A0X.A0F;
        0fH.A0j("CompositeHeroPlayer", 0Pz.A0v("appendVideo() - ", str, " - ", A00(num)));
        if (this.A05) {
            0fH.A0j("CompositeHeroPlayer", 0Pz.A0z("appendVideo() - ", str, " - ", A00(num), " - ignored as in transition"));
            this.A02 = r302;
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            this.A0B.add(r0);
            A02(this);
        } else if (intValue == 1) {
            this.A0B.clear();
            A01(r0, this, false);
        } else if (intValue == 2) {
            this.A0B.clear();
            this.A01 = -1;
            A01(r0, this, true);
        }
    }
}
