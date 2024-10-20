package com.instagram.common.ui.widget.reboundviewpager;

import X.0FI;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bu;
import X.1kJ;
import X.1sP;
import X.7zN;
import X.ACA;
import X.AnonymousClass001;
import X.C01i;
import X.C0ty;
import X.C1oo;
import X.C2959Jem;
import X.DKC;
import X.DKD;
import X.GAW;
import X.GOn;
import X.GVb;
import X.GjV;
import X.GrO;
import X.JQy;
import X.JV7;
import X.JYY;
import X.KNb;
import X.Keo;
import X.Ktb;
import X.Ktx;
import X.Kuo;
import X.Kzt;
import X.LBI;
import X.MIh;
import X.MKd;
import X.MMm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.facebook.forker.Process;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.messaging.rtc.incall.impl.mediasync.reels.MediaSyncReelsPlaybackView;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ReboundViewPager.class */
public class ReboundViewPager extends FrameLayout implements GestureDetector.OnGestureListener, MIh {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public View A0A;
    public Keo A0B;
    public MMm A0C;
    public Ktx A0D;
    public C2959Jem A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public int[] A0Q;
    public int[] A0R;
    public float A0S;
    public float A0T;
    public float A0U;
    public float A0V;
    public float A0W;
    public float A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public Boolean A0d;
    public Integer A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public final AccessibilityManager A0i;
    public final Map A0j;
    public final Map A0k;
    public final Map A0l;
    public final Set A0m;
    public final Set A0n;
    public final Set A0o;
    public final C01i A0p;
    public final float[] A0q;
    public final float[] A0r;
    public final GestureDetector A0s;
    public final Scroller A0t;
    public final JV7 A0u;
    public final List A0v;
    public final List A0w;
    public final List A0x;
    public final List A0y;
    public final List A0z;
    public final Map A10;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0q = new float[]{0.0f, 0.0f};
        this.A0r = new float[]{0.0f, 0.0f};
        this.A0U = -1.0f;
        this.A0z = AnonymousClass001.A0s();
        this.A0w = AnonymousClass001.A0s();
        this.A0y = AnonymousClass001.A0s();
        this.A10 = AnonymousClass001.A0u();
        this.A0l = AnonymousClass001.A0u();
        this.A0j = AnonymousClass001.A0u();
        this.A0v = AnonymousClass001.A0s();
        this.A0x = AnonymousClass001.A0s();
        this.A0m = new CopyOnWriteArraySet();
        this.A0o = new CopyOnWriteArraySet();
        this.A0n = new CopyOnWriteArraySet();
        this.A0u = new JV7(this);
        this.A0k = new EnumMap(KNb.class);
        this.A0Q = new int[0];
        this.A0R = new int[0];
        Integer num = 0S2.A0C;
        this.A0H = num;
        this.A0L = true;
        this.A0J = true;
        this.A0P = true;
        this.A07 = -1;
        this.A0e = 0S2.A01;
        this.A0V = 1.0f;
        this.A0N = true;
        this.A0M = true;
        this.A02 = 0.25f;
        Integer num2 = 0S2.A00;
        this.A0F = num2;
        this.A0G = num2;
        for (KNb kNb : KNb.values()) {
            this.A0k.put(kNb, kNb.DEFAULT_SPRING_CONFIG);
        }
        DisplayMetrics A09 = DKD.A09(this);
        float applyDimension = TypedValue.applyDimension(1, 2.0f, A09);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2F);
        11T.A0A(obtainStyledAttributes);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, applyDimension);
            obtainStyledAttributes.recycle();
            this.A00 = dimension;
            A0A(this, true, false);
            this.A0W = TypedValue.applyDimension(1, 8.0f, A09);
            this.A0c = 90;
            A0C(false, num);
            A03(0.0f, true, false);
            A09(this, 1);
            GestureDetector gestureDetector = new GestureDetector(context, this, AnonymousClass001.A07());
            this.A0s = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
            int scaledMinimumFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
            this.A0Z = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            this.A0a = scaledMinimumFlingVelocity;
            this.A0D = new Ktx();
            Context context2 = getContext();
            Scroller scroller = new Scroller(context2);
            this.A0t = scroller;
            scroller.setFriction(0.1f);
            this.A0p = GAW.A00(this, 39);
            Object systemService = context2.getSystemService("accessibility");
            11T.A0I(systemService, 1BJ.A00(19));
            this.A0i = (AccessibilityManager) systemService;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ ReboundViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final float A00() {
        return Math.max((this.A0C != null ? r0.getCount() : 0) - 1, 0);
    }

    private final View A01(Ktb ktb) {
        Map map = (Map) 7zN.A0r(this.A0j, ktb.A01);
        if (map == null) {
            return null;
        }
        MMm mMm = this.A0C;
        if (this.A0O && mMm != null && mMm.hasStableIds()) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                Ktb ktb2 = (Ktb) A0z.getKey();
                View view = (View) A0z.getValue();
                if (ktb2.A02 == ktb.A02) {
                    A0y.remove();
                    return view;
                }
            }
        } else {
            View view2 = (View) map.remove(ktb);
            if (view2 != null) {
                return view2;
            }
        }
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            Ktb ktb3 = (Ktb) A1B.next();
            if (ktb3.A00 != ((int) this.A0U)) {
                return (View) map.remove(ktb3);
            }
        }
        return null;
    }

    private final void A02(float f) {
        float f2;
        float f3 = f;
        int intValue = this.A0e.intValue();
        if (intValue == 1) {
            float A0G = this.A0Z / A0G();
            float A0G2 = this.A0a / A0G();
            A0G();
            Integer num = this.A0G;
            Integer num2 = 0S2.A01;
            boolean z = false;
            if ((num == num2 ? this.A0P : this.A0J) && this.A0C != null) {
                z = true;
            }
            boolean z2 = false;
            if (z && Math.abs(f3) > A0G2) {
                z2 = true;
            }
            boolean z3 = (this.A0f && num == 0S2.A00) || (this.A0g && num == num2);
            if (z2 && z3) {
                if (f > A0G2) {
                    if (f > A0G) {
                        f3 = A0G;
                    }
                    float f4 = this.A01;
                    float f5 = f4 % 1.0f;
                    if (f5 < 0.0f) {
                        f5 += 1.0f;
                    }
                    float f6 = -f5;
                    if (f5 == 0.0f) {
                        f6 = -1.0f;
                    }
                    f2 = (f4 + f6) - 0.0f;
                } else {
                    if (f >= (-A0G2)) {
                        return;
                    }
                    float f7 = -A0G;
                    if (f < f7) {
                        f3 = f7;
                    }
                    float f8 = this.A01;
                    float f9 = f8 % 1.0f;
                    if (f9 < 0.0f) {
                        f9 += 1.0f;
                    }
                    f2 = f8 + (1.0f - f9) + 0.0f;
                }
                A08(this, f3, f2, true);
            } else {
                if (!((Kuo) this.A0p.getValue()).A06()) {
                    return;
                }
                A08(this, 0.0d, this.A05, true);
                if (this.A0b == this.A05) {
                    return;
                }
            }
        } else {
            if (intValue != 2) {
                return;
            }
            this.A0t.fling(GOn.A03(this.A01, A0G()), 0, GOn.A03(-f, A0G()), 0, Process.WAIT_RESULT_STOPPED, (-1) >>> 1, 0, 0);
            A07((Kzt) this.A0k.get(KNb.A03), f, GOn.A04(r0.getFinalX(), A0G()), true);
        }
        Iterator it = this.A0m.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x052d A[EDGE_INSN: B:150:0x052d->B:186:0x052d BREAK  A[LOOP:0: B:117:0x048f->B:146:0x0526], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0642 A[Catch: all -> 0x0c62, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0706 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x09ef A[Catch: all -> 0x0c62, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a5d A[Catch: all -> 0x0c62, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0a90 A[Catch: all -> 0x0c62, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0b7a A[Catch: all -> 0x0c62, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0936 A[Catch: all -> 0x0c62, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cc A[Catch: all -> 0x0c62, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x01a9 A[Catch: all -> 0x0c62, TRY_ENTER, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ae A[Catch: all -> 0x0c62, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c62, blocks: (B:13:0x0065, B:15:0x006e, B:17:0x0075, B:18:0x007a, B:21:0x009f, B:24:0x00ab, B:26:0x00b5, B:28:0x00c2, B:30:0x00cb, B:31:0x00d2, B:32:0x00d7, B:35:0x014a, B:39:0x0162, B:42:0x017a, B:44:0x0185, B:46:0x018d, B:48:0x0196, B:50:0x01bb, B:51:0x01c0, B:54:0x01cc, B:57:0x01df, B:60:0x01eb, B:64:0x0200, B:65:0x0206, B:67:0x020d, B:70:0x0217, B:72:0x0221, B:74:0x0226, B:75:0x022b, B:78:0x0251, B:79:0x0254, B:79:0x0254, B:84:0x0262, B:86:0x026b, B:89:0x027e, B:91:0x0288, B:92:0x028d, B:94:0x0296, B:96:0x029b, B:99:0x02ae, B:102:0x02bc, B:106:0x043f, B:108:0x0448, B:111:0x0466, B:113:0x0470, B:115:0x047c, B:117:0x048f, B:118:0x0496, B:127:0x04ba, B:130:0x04cb, B:132:0x04d6, B:134:0x04db, B:137:0x04e5, B:139:0x04f0, B:143:0x0514, B:145:0x051f, B:159:0x03c1, B:161:0x03ca, B:165:0x03e2, B:167:0x03e8, B:170:0x03fd, B:171:0x0407, B:173:0x0c58, B:175:0x0c61, B:177:0x0413, B:179:0x041c, B:184:0x0459, B:185:0x045d, B:186:0x052d, B:188:0x0538, B:190:0x0541, B:191:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x055d, B:201:0x056e, B:203:0x057a, B:205:0x0592, B:208:0x059e, B:212:0x05af, B:215:0x05fd, B:217:0x0606, B:218:0x060b, B:220:0x0614, B:222:0x0621, B:227:0x0636, B:230:0x0642, B:234:0x0660, B:236:0x0666, B:237:0x066b, B:245:0x06d9, B:246:0x06e0, B:248:0x06e7, B:250:0x06ee, B:265:0x070b, B:272:0x05b9, B:274:0x05c2, B:276:0x05cd, B:278:0x05d9, B:279:0x0715, B:280:0x071c, B:282:0x0728, B:284:0x073b, B:285:0x0742, B:297:0x078e, B:298:0x0792, B:300:0x079b, B:305:0x07ba, B:306:0x07c1, B:308:0x07ca, B:309:0x07cf, B:311:0x07d8, B:312:0x09e1, B:315:0x09ef, B:321:0x0a11, B:322:0x0a18, B:323:0x0a22, B:324:0x0a29, B:326:0x0a3d, B:328:0x0a43, B:329:0x0a48, B:330:0x0a4f, B:333:0x0a5d, B:334:0x0a64, B:337:0x0a72, B:338:0x0a79, B:339:0x0a82, B:342:0x0a90, B:343:0x0a99, B:346:0x0aa5, B:348:0x0ab0, B:350:0x0ab9, B:351:0x0abe, B:353:0x0acb, B:357:0x0ad5, B:359:0x0ae0, B:360:0x0ae7, B:362:0x0af2, B:363:0x0af9, B:365:0x0b04, B:366:0x0b0b, B:368:0x0b16, B:369:0x0b1d, B:373:0x0b31, B:377:0x0b41, B:381:0x0b55, B:385:0x0b65, B:386:0x0b6c, B:389:0x0b7a, B:390:0x0b83, B:393:0x0b91, B:395:0x0b9e, B:396:0x0ba8, B:405:0x0bca, B:416:0x0bf3, B:428:0x0c1c, B:439:0x0c41, B:443:0x09b1, B:444:0x09b8, B:446:0x09c7, B:447:0x09cc, B:449:0x09dc, B:452:0x07ec, B:453:0x07f3, B:455:0x0802, B:456:0x0807, B:458:0x0810, B:459:0x0818, B:460:0x081f, B:462:0x0828, B:463:0x082d, B:465:0x0836, B:467:0x0843, B:470:0x0859, B:471:0x0860, B:473:0x086f, B:474:0x0874, B:476:0x0884, B:477:0x088c, B:478:0x0893, B:480:0x089c, B:481:0x08a1, B:483:0x08aa, B:484:0x08b2, B:485:0x08b9, B:487:0x08c2, B:488:0x08c7, B:490:0x08d0, B:493:0x08e4, B:494:0x08eb, B:496:0x08fa, B:497:0x08ff, B:499:0x0908, B:500:0x0910, B:501:0x0917, B:503:0x0920, B:504:0x0925, B:506:0x092e, B:507:0x0936, B:510:0x0942, B:513:0x094e, B:516:0x096d, B:518:0x097c, B:519:0x0981, B:521:0x098a, B:522:0x0992, B:524:0x099b, B:525:0x09a0, B:527:0x09a9, B:529:0x02d5, B:532:0x02e1, B:533:0x02e8, B:535:0x02f2, B:536:0x02f8, B:539:0x0304, B:543:0x0324, B:546:0x0337, B:549:0x0343, B:553:0x0358, B:554:0x035e, B:555:0x0366, B:556:0x036d, B:557:0x0374, B:559:0x038a, B:563:0x01a9, B:565:0x01b3, B:567:0x00e1, B:570:0x00f9, B:573:0x0111, B:575:0x011b, B:577:0x0128, B:579:0x0131, B:580:0x0138, B:581:0x013d), top: B:12:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03(float r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 3178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A03(float, boolean, boolean):void");
    }

    private final void A04(int i) {
        if (i >= 0) {
            MMm mMm = this.A0C;
            if (mMm == null) {
                throw AnonymousClass001.A0L("Required value was null.");
            }
            if (i < mMm.getCount()) {
                Iterator it = this.A0o.iterator();
                while (it.hasNext()) {
                    MediaSyncReelsPlaybackView mediaSyncReelsPlaybackView = ((ACA) it.next()).A00;
                    if (((GVb) mediaSyncReelsPlaybackView).A03.size() > i) {
                        GjV gjV = (GjV) ((GVb) mediaSyncReelsPlaybackView).A03.get(i);
                        GrO grO = (GrO) ((GVb) mediaSyncReelsPlaybackView).A09.getValue();
                        11T.A0F(gjV.A02, 0);
                        1Bu.A06(grO.A02, 115398);
                    }
                }
            }
        }
    }

    private final void A05(int i) {
        if (i >= 0) {
            MMm mMm = this.A0C;
            if (mMm == null) {
                throw AnonymousClass001.A0L("Required value was null.");
            }
            if (i < mMm.getCount()) {
                Iterator it = this.A0o.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    private final void A06(MotionEvent motionEvent) {
        if (this.A0g || this.A0f) {
            return;
        }
        float rawX = this.A0S - motionEvent.getRawX();
        boolean z = false;
        boolean A1P = AnonymousClass001.A1P((JQy.A01(this.A0T - motionEvent.getRawY(), rawX * rawX) > this.A0W ? 1 : (JQy.A01(this.A0T - motionEvent.getRawY(), rawX * rawX) == this.A0W ? 0 : -1)));
        double degrees = Math.toDegrees(Math.atan(Math.abs(r0 / rawX)));
        if (A1P) {
            if (this.A0H == 0S2.A0C) {
                if (degrees < this.A0c / 2) {
                    this.A0f = true;
                    return;
                } else {
                    this.A0g = true;
                    return;
                }
            }
            Integer num = this.A0G;
            this.A0f = AnonymousClass001.A1W(num, 0S2.A00);
            if (num == 0S2.A01) {
                z = true;
            }
            this.A0g = z;
        }
    }

    private final void A07(Kzt kzt, double d, float f, boolean z) {
        C01i c01i = this.A0p;
        ((Kuo) c01i.getValue()).A04(kzt);
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > A00()) {
            f = A00();
        }
        if (this.A01 != f) {
            A0C(false, 0S2.A01);
            Kuo kuo = (Kuo) c01i.getValue();
            if (z) {
                kuo.A01(this.A01);
                ((Kuo) c01i.getValue()).A03(-d);
                ((Kuo) c01i.getValue()).A02(f);
            } else {
                kuo.A01(f);
                kuo.A00();
            }
        }
        if (((Kuo) c01i.getValue()).A06()) {
            A0C(false, 0S2.A0C);
        }
    }

    public static final void A08(ReboundViewPager reboundViewPager, double d, float f, boolean z) {
        reboundViewPager.A07((Kzt) reboundViewPager.A0k.get(KNb.A02), d, f, z);
    }

    public static final void A09(ReboundViewPager reboundViewPager, int i) {
        reboundViewPager.A04 = i;
        int max = Math.max(1, i * 2) + 1;
        reboundViewPager.A0R = new int[max];
        reboundViewPager.A0Q = new int[max];
        A0A(reboundViewPager, false, true);
    }

    public static final void A0A(ReboundViewPager reboundViewPager, boolean z, boolean z2) {
        float f = reboundViewPager.A01;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > reboundViewPager.A00()) {
            f = reboundViewPager.A00();
        }
        reboundViewPager.A03(f, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0384, code lost:
    
        throw r318;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0B(java.util.List r302, java.util.List r303, java.util.List r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A0B(java.util.List, java.util.List, java.util.List, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0C(boolean r302, java.lang.Integer r303) {
        /*
            r301 = this;
            r0 = r301
            java.lang.Integer r0 = r0.A0H
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L91
            java.lang.Integer r0 = X.0S2.A0C
            r305 = r0
            r0 = -1
            r306 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L8b
            r0 = r301
            int r0 = r0.A06
            r307 = r0
            r0 = r301
            int r0 = r0.A08
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 == r1) goto L8b
            r0 = r301
            r1 = r307
            r0.A08 = r1
        L31:
            r0 = r301
            r1 = r303
            r0.A0H = r1
            r0 = r301
            java.util.Set r0 = r0.A0m
            r305 = r0
            r0 = r305
            java.util.Iterator r0 = r0.iterator()
            r309 = r0
        L45:
            r0 = r309
            boolean r0 = r0.hasNext()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L91
            r0 = r309
            java.lang.Object r0 = r0.next()
            X.MKd r0 = (X.MKd) r0
            r310 = r0
            r0 = r308
            r1 = r306
            if (r0 == r1) goto L78
            r0 = r301
            int r0 = r0.A06
            r307 = r0
            r0 = r310
            r1 = r307
            r2 = r308
            r3 = r302
            r0.CAg(r1, r2, r3)
        L78:
            r0 = r301
            java.lang.Integer r0 = r0.A0H
            r305 = r0
            r0 = r310
            r1 = r305
            r2 = r304
            r0.CJH(r1, r2)
            goto L45
        L8b:
            r0 = -1
            r308 = r0
            goto L31
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A0C(boolean, java.lang.Integer):void");
    }

    private final boolean A0D(float f, float f2) {
        boolean z = true;
        if (f < 0.0f) {
            if (f2 < 0.0f) {
                return false;
            }
        } else {
            if (f > 0.0f) {
                return f2 <= A00();
            }
            if (f2 < 0.0f) {
                return false;
            }
            z = true;
            if (f2 > A00()) {
                return false;
            }
        }
        return z;
    }

    public static final boolean A0E(View view, int i, int i2, int i3, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = viewGroup.getScrollX();
            int scrollY = viewGroup.getScrollY();
            int childCount = viewGroup.getChildCount();
            int i4 = i2 + scrollX;
            int i5 = i3 + scrollY;
            int i6 = childCount - 1;
            while (true) {
                int i7 = i6;
                float f = 0.0f / 0.0f;
                if (-1 >= i7) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    float f2 = i4;
                    if (f2 >= childAt.getX() && f2 < childAt.getX() + DKC.A02(childAt)) {
                        float f3 = i5;
                        if (f3 >= childAt.getY() && f3 < childAt.getY() + DKC.A03(childAt) && A0E(childAt, i, i4 - ((int) childAt.getX()), i5 - ((int) childAt.getY()), true)) {
                            return true;
                        }
                    }
                }
                i6 = i7 - 1;
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public final int A0F() {
        if (this.A0C == null) {
            return -1;
        }
        return (int) Math.min(Math.max(this.A05, 0.0d), r0.getCount() - 1);
    }

    public final int A0G() {
        int i = this.A07;
        if (i == -1) {
            if (this.A0G != 0S2.A01) {
                return getWidth();
            }
            i = getHeight();
        }
        return i;
    }

    public final View A0H(int i) {
        Map map = this.A10;
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            Ktb ktb = (Ktb) A1B.next();
            if (ktb != null && ktb.A00 == i) {
                return (View) map.get(ktb);
            }
        }
        return null;
    }

    public final void A0I() {
        JYY jyy = this.A0C;
        if (jyy != null) {
            JV7 jv7 = this.A0u;
            11T.A0F(jv7, 0);
            jyy.A00.remove(jv7);
        }
    }

    public final void A0J(float f, boolean z) {
        Integer num;
        if (z || ((f >= 0.0f && f <= A00()) || (num = this.A0H) == 0S2.A01 || num == 0S2.A00)) {
            A03(f, false, true);
        }
    }

    public final void A0K(MMm mMm) {
        11T.A0F(mMm, 0);
        A0L(mMm, this.A01);
    }

    public final void A0L(MMm mMm, float f) {
        11T.A0F(mMm, 0);
        this.A03 = f;
        this.A0Y = 0;
        JYY jyy = this.A0C;
        if (jyy != null) {
            JV7 jv7 = this.A0u;
            11T.A0F(jv7, 0);
            jyy.A00.remove(jv7);
        }
        if (this.A0C != mMm) {
            C0ty c0ty = C0ty.A00;
            A0B(c0ty, c0ty, c0ty, false);
        }
        JV7 jv72 = this.A0u;
        11T.A0F(jv72, 0);
        ((JYY) mMm).A00.addIfAbsent(jv72);
        this.A0C = mMm;
        A03(f, true, false);
        this.A08 = this.A06;
    }

    public final void A0M(MKd mKd) {
        11T.A0F(mKd, 0);
        this.A0m.add(mKd);
        if (mKd instanceof ACA) {
            this.A0o.add(mKd);
        }
    }

    public final void A0N(Integer num) {
        ((Kuo) this.A0p.getValue()).A04((Kzt) this.A0k.get(KNb.A03));
        this.A0e = num;
    }

    public final boolean A0O() {
        if (this.A0G != 0S2.A00) {
            return false;
        }
        Boolean bool = this.A0d;
        if (bool == null) {
            bool = (getContext().getApplicationInfo().flags & 4194304) != 0 ? Boolean.valueOf(AnonymousClass001.A1Q(getResources().getConfiguration().getLayoutDirection(), 1)) : false;
            this.A0d = bool;
        }
        return !1BK.A1X(bool, false);
    }

    @Override // X.MIh
    public void CMQ(Kuo kuo) {
        11T.A0F(kuo, 0);
        if (this.A0H == 0S2.A01) {
            A0J((float) kuo.A01, false);
            A0C(false, 0S2.A0C);
        }
    }

    @Override // X.MIh
    public void CMU(Kuo kuo) {
        Kuo kuo2;
        float A00;
        11T.A0F(kuo, 0);
        if (this.A0H == 0S2.A01) {
            A0J((float) kuo.A09.A00, false);
            float f = this.A01;
            if (f < 0.0f) {
                C01i c01i = this.A0p;
                ((Kuo) c01i.getValue()).A04((Kzt) this.A0k.get(KNb.A02));
                kuo2 = (Kuo) c01i.getValue();
                A00 = 0.0f;
            } else {
                if (f <= A00()) {
                    return;
                }
                C01i c01i2 = this.A0p;
                ((Kuo) c01i2.getValue()).A04((Kzt) this.A0k.get(KNb.A02));
                kuo2 = (Kuo) c01i2.getValue();
                A00 = A00();
            }
            kuo2.A02(A00);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        int i2 = 0;
        if (!this.A0J || this.A0G == 0S2.A01) {
            return false;
        }
        if (i != 0) {
            i2 = 1;
            if (i < 0) {
                i2 = -1;
                float f = 0.0f / 0.0f;
            }
        }
        if (A0O()) {
            i2 = -i2;
        }
        float f2 = i2;
        return A0D(f2, this.A01 + (f2 / A0G()));
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        int i2 = 0;
        if (!this.A0P || this.A0G == 0S2.A00) {
            return false;
        }
        if (i != 0) {
            i2 = 1;
            if (i < 0) {
                i2 = -1;
                float f = 0.0f / 0.0f;
            }
        }
        if (A0O()) {
            i2 = -i2;
        }
        float f2 = i2;
        return A0D(f2, this.A01 + (f2 / A0G()));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num = this.A0G;
        Integer num2 = 0S2.A01;
        boolean A0O = A0O();
        if (num == num2) {
            f = f2;
            if (A0O) {
                f = -f2;
            }
        } else if (A0O) {
            f = -f;
        }
        this.A0X = f / A0G();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0117, code lost:
    
        r315 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
    
        if (r315 == false) goto L43;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        if ((this.A0g && this.A0G == 0S2.A00) || (this.A0f && this.A0G == 0S2.A01)) {
            z = false;
        } else {
            z = true;
            if (!this.A0h) {
                this.A0h = true;
                return true;
            }
            Integer num = this.A0G;
            Integer num2 = 0S2.A01;
            boolean A0O = A0O();
            if (num == num2) {
                f = f2;
                if (A0O) {
                    f = -f2;
                }
            } else if (A0O) {
                f = -f;
            }
            Iterator it = this.A0m.iterator();
            while (it.hasNext()) {
                it.next();
            }
            float A0G = (f * this.A0V) / A0G();
            if ((this.A0G == num2 ? this.A0P : this.A0J) && this.A0C != null) {
                A0C(false, 0S2.A00);
                float f3 = this.A01 + A0G;
                if (f3 < 0.0f || f3 > A00()) {
                    A0G *= this.A02;
                }
                A0J(this.A01 + A0G, false);
                return true;
            }
        }
        return z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1619856179);
        super.onSizeChanged(i, i2, i3, i4);
        Keo keo = this.A0B;
        if (keo != null) {
            LBI lbi = keo.A00;
            1sP.A00();
            1kJ A00 = ComponentsSystrace.A00("LithoViewPagerAdapter.setDimensions");
            A00.A9E("widthPx", i);
            A00.A9E("heightPx", i2);
            A00.flush();
            lbi.A02 = i;
            lbi.A01 = i2;
            LBI.A00(lbi);
            ComponentsSystrace.A01();
        }
        A0A(this, true, false);
        0FI.A0C(-1746465939, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
