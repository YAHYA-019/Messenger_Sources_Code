package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.forker.Process;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.storyreply.sender.StoryReplyMessageSender;
import com.facebook.xapp.messaging.powerups.avatars.repository.datasource.AvatarPowerUpArtifactoSource;
import com.facebook.xapp.messaging.powerups.avatars.repository.datasource.AvatarPowerUpDownloader;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionCount;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionsCount;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: AQf.class */
public final class AQf extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQf(Object obj, Object obj2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static Object A00(C2k5 c2k5, Object obj, Object[] objArr, int i) {
        return 2rO.A00(c2k5, new AQf(c2k5, obj, i), objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v387, types: [X.78B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v396, types: [java.lang.Object, X.6yJ] */
    /* JADX WARN: Type inference failed for: r310v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r310v28 */
    /* JADX WARN: Type inference failed for: r310v30 */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        1Ql A0U;
        C2cp c2cp;
        int[] iArr;
        Context A00;
        int i;
        int i2;
        Object A15;
        switch (this.A00) {
            case 0:
                8WO r0 = (8WO) this.A02;
                C2k5 c2k5 = (C2k5) this.A01;
                List list = (List) r0.A00.A00;
                int size = list.size();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        if (((8L5) it.next()).A05) {
                            i3++;
                            if (i3 < 0) {
                                C0s8.A17();
                                throw 0Q8.createAndThrow();
                            }
                        }
                    }
                    if (i3 != 0) {
                        i2 = 2131820723;
                        if (i3 == size) {
                            i2 = 2131820727;
                        }
                        return 0Pz.A0W(4YV.A0o(4YU.A0E(c2k5.AeS()), size, i2), "  ∙");
                    }
                }
                i2 = 2131820726;
                return 0Pz.A0W(4YV.A0o(4YU.A0E(c2k5.AeS()), size, i2), "  ∙");
            case 1:
                C2lh c2lh = (C2lh) this.A01;
                if (((CharSequence) c2lh.A02).length() == 0) {
                    ((8gJ) this.A02).A00.A00 = new 9M5(c2lh);
                }
                return 7zL.A0T(new J9o(this.A02, 42));
            case 2:
                C9n0.A00((FbUserSession) this.A01, (C9n0) this.A02);
                return 04S.A00;
            case 3:
                1Bn.A0A(66971);
                C9n0 c9n0 = (C9n0) this.A02;
                Context context = c9n0.A07.A00;
                2qR r02 = 6tM.A01;
                return new 8Bs(new AQf(this.A01, c9n0, 2), new 6tM(7zR.A0c(context)).A00(0S2.A0a));
            case 4:
                C9n0 c9n02 = (C9n0) this.A02;
                6wV r03 = c9n02.A08;
                int i4 = r03.B9o().A01;
                int i5 = r03.B9o().A00;
                int spanStart = r03.getSpanStart(c9n02.A0A.getValue());
                float f = 0.0f / 0.0f;
                if (spanStart == -1) {
                    spanStart = 7zN.A04(r03);
                }
                if (i4 > spanStart || i5 > spanStart) {
                    C9n0.A00((FbUserSession) this.A01, c9n02);
                    break;
                }
                break;
            case 5:
                C11184vr c11184vr = ((8eI) this.A02).A04.A00;
                if (c11184vr != null) {
                    Context A0B = 7zL.A0B(this.A01);
                    1Bn.A0A(67788);
                    QuickPromotionDefinition A002 = 6JP.A00(A0B, c11184vr);
                    if (A002 != null) {
                        ((6JO) 1Bn.A0E(A0B, (1BY) null, 50062)).A00(7lQ.A00(A0B, c11184vr), A002.A02(), A002, "12057").A04((java.util.Map) null);
                    }
                }
                return C85q.A00();
            case 6:
                1Bn.A0A(147813);
                Context A0B2 = 7zL.A0B(this.A01);
                8iC r04 = (8iC) this.A02;
                ThreadKey threadKey = r04.A05;
                C9mD c9mD = new C9mD(A0B2, threadKey, r04.A0A, AnonymousClass001.A1W(r04.A07, 95Q.A02));
                c9mD.A06(threadKey);
                return c9mD;
            case 7:
                1Bn.A0A(147835);
                return new StoryReplyMessageSender((Context) this.A01, (FbUserSession) this.A02);
            case 8:
                ((C6wx) this.A01).A00((ThreadKey) this.A02, 0S2.A01);
                return 04S.A00;
            case 9:
                8eJ r05 = (8eJ) this.A02;
                float[] fArr = new float[8];
                int i6 = 0;
                do {
                    fArr[i6] = 2.1322793E9f;
                    i6++;
                } while (i6 < 8);
                ShapeDrawable A09 = 7zS.A09(fArr);
                A09.getPaint().setColor(r05.A05.A00(0S2.A0C));
                A09.mutate();
                return A09;
            case 10:
                C8ee c8ee = (C8ee) this.A02;
                float[] fArr2 = new float[8];
                int i7 = 0;
                do {
                    fArr2[i7] = 2.1322793E9f;
                    i7++;
                } while (i7 < 8);
                ShapeDrawable A092 = 7zS.A09(fArr2);
                A092.getPaint().setColor(c8ee.A09.A00(0S2.A0C));
                A092.mutate();
                return A092;
            case 11:
                return Integer.valueOf(((int) (C7W1.A01(3vP.A00(r0)) * ((8eT) this.A02).A00)) - 7zS.A01((C2k5) this.A01, 16.0d));
            case 12:
                1Bn.A0A(147830);
                Context A0B3 = 7zL.A0B(this.A01);
                C8hd c8hd = (C8hd) this.A02;
                LifecycleOwner viewLifecycleOwner = c8hd.A07.getViewLifecycleOwner();
                ThreadKey threadKey2 = c8hd.A08;
                C9n2 c9n2 = new C9n2(A0B3, viewLifecycleOwner, threadKey2, c8hd.A0F, c8hd.A0E, c8hd.A0M);
                11T.A0F(threadKey2, 0);
                C00i c00i = c9n2.A09.A00;
                if (((C9iE) c00i.get()).A05()) {
                    2aK.A03((Integer) null, 2Zo.A02(0S2.A0C), new AJX(threadKey2, c9n2, (0DR) null, 34), c9n2.A0K, 2);
                    return c9n2;
                }
                ((C9iE) c00i.get()).A03(c9n2.A0I, threadKey2);
                return c9n2;
            case 13:
                C96u c96u = (C96u) this.A02;
                if (c96u != null) {
                    boolean z = 7Tb.A00;
                    int ordinal = c96u.ordinal();
                    if (ordinal == 2 || ordinal == 3 || ordinal == 1) {
                        C00i c00i2 = 7Tb.A01.A00;
                        FbSharedPreferences A0S = 1BK.A0S(c00i2);
                        1G2 r06 = 7Tb.A02;
                        int A03 = 7zM.A03(A0S, r06);
                        A0U = 1BL.A0U(c00i2);
                        A0U.CaE(r06, A03 + 1);
                    } else if (ordinal == 0) {
                        A0U = 1Br.A08(7Tb.A01).putBoolean(7Tb.A03, true);
                    }
                    A0U.commit();
                }
                1Iw r07 = (1Iw) this.A01;
                if (r07.A02 != null) {
                    4YV.A1F(r07, false, (-1) << (-1));
                }
                if (r07.A02 != null) {
                    4YV.A1F(r07, false, Process.WAIT_RESULT_STOPPED);
                    break;
                }
                break;
            case 14:
                float A01 = 7zL.A01(4YU.A0E(((C2k5) this.A01).A05), 2132279314);
                8bK r08 = (8bK) this.A02;
                return C2cn.A00(A01, r08.A00, r08.A01);
            case 15:
                8cR r09 = (8cR) this.A02;
                C2k5 c2k52 = (C2k5) this.A01;
                int A032 = 7zO.A03(c2k52, 3yH.A06(c2k52, 2132279564));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(r09.A01);
                gradientDrawable.setSize(A032, A032);
                return gradientDrawable;
            case 16:
                C00m c00m = ((C8iq) this.A02).A05;
                if (c00m != null) {
                    c00m.invoke();
                }
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A01;
                lottieAnimationView.setImageResource(0);
                lottieAnimationView.A04();
                JVZ jvz = lottieAnimationView.A08;
                JUO juo = jvz.A0V;
                juo.removeAllUpdateListeners();
                juo.addUpdateListener(jvz.A0T);
                return 04S.A00;
            case 17:
                8bM r010 = (8bM) this.A02;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r010.A02);
                ((C22a) 1Br.A0B(r010.A01)).A7O(spannableStringBuilder, 7zP.A00(((C2k5) this.A01).A05, r010.A00));
                return spannableStringBuilder;
            case 18:
                7zR.A12((View) this.A02, (InputMethodManager) 7zR.A0o(((6RU) this.A01).A00, 100189));
                return 04S.A00;
            case 19:
                7DZ.A00((ViewGroup) this.A01, (7DZ) this.A02);
                return 04S.A00;
            case 20:
                ((C2lh) this.A01).A04(AV0.A00(this.A02, 3));
                return 04S.A00;
            case 21:
                return new AAv((7Im) 7zL.A11(this.A01), ((C6qu) this.A02).Ad4());
            case 22:
                C6z2 c6z2 = C6z2.A0C;
                C01i c01i = (C01i) this.A01;
                return C6qt.A00(c6z2, new 75D(c01i), new AQf(c01i, this.A02, 21));
            case 23:
                return new 94G((9OM) 7zL.A11(this.A01), ((C6qu) this.A02).BJ2());
            case 24:
                C01i c01i2 = (C01i) this.A01;
                9Tn r321 = c01i2 != null ? (9Tn) c01i2.getValue() : null;
                C6qu c6qu = (C6qu) this.A02;
                return new 94K(c6qu.AWp(), r321, c6qu.BJ2(), c6qu.Ad4(), 0S2.A00);
            case 25:
                return new 7MF(71Y.A00, (7Ig) 7zL.A11(this.A01), ((C6qu) this.A02).Ad4());
            case 26:
                return new AAw((9MS) 7zL.A11(this.A02), (C78k) this.A01);
            case 27:
                C6qu c6qu2 = (C6qu) this.A01;
                boolean A033 = 2yD.A03(((6rM) c6qu2.A06).Axw(), 36325252842672645L);
                Context AWp = c6qu2.AWp();
                if (A033) {
                    return new AnonymousClass770(AWp, c6qu2.Alj(), c6qu2.BF7(), c6qu2.AbO(), c6qu2.Ad4(), c6qu2.Aoc(), c6qu2.AwD(), AV5.A00(this.A02, c6qu2, 14));
                }
                return new A8C(AWp, c6qu2.BF7(), (C78n) this.A02, c6qu2.Aoc(), c6qu2.AwD());
            case 28:
                8eL r011 = (8eL) this.A02;
                int i8 = 7zQ.A0t().A04() ? 20 : 2132279320;
                int i9 = 0;
                float[] fArr3 = new float[8];
                do {
                    fArr3[i9] = i8;
                    i9++;
                } while (i9 < 8);
                ShapeDrawable A093 = 7zS.A09(fArr3);
                A093.getPaint().setColor(r011.A01.A00(0S2.A0C));
                A093.mutate();
                return A093;
            case 29:
                7zR.A1M((F8q) 7zR.A0o((Context) this.A01, 99435), 2131956926);
                return 04S.A00;
            case 30:
                2aH A012 = 2aG.A01();
                C8ft c8ft = (C8ft) this.A02;
                long j = C8ft.A03;
                84M r012 = c8ft.A01;
                long j2 = c8ft.A00;
                java.util.Map map = r012.A00;
                Long valueOf = Long.valueOf(j2);
                if (!map.containsKey(valueOf) || map.get(valueOf) == null) {
                    map.put(valueOf, 7zL.A1A(AnonymousClass968.A05));
                }
                0zV r013 = (0zV) map.get(valueOf);
                if (r013 != null) {
                    0N2.A03(A012, new C0oe((Function2) new AJX((C2lh) this.A01, (0DR) null), r013, 3));
                }
                return 7zL.A0T(new AQY(A012, 4));
            case 31:
                0fH.A0j("MailboxObserverKotlinFlow", "closing flow, unregistering the observer");
                MailboxObservable mailboxObservable = (MailboxObservable) this.A02;
                mailboxObservable.removeResultCallback((MailboxCallback) this.A01);
                mailboxObservable.addResultCallback(new A03(mailboxObservable, 29));
                return 04S.A00;
            case 32:
                return 5Bm.A01(((8fL) this.A02).A00, 1BK.A1D("globalKey", ((C2k5) this.A01).A05.A0C()));
            case 33:
                return new A8Z(this.A01, this.A02, 0);
            case 34:
                C6js c6js = (C6js) 1Bi.A03(66778);
                8YT r014 = (8YT) this.A02;
                String str = r014.A01;
                A8Y a8y = (A8Y) this.A01;
                c6js.A00(a8y, str);
                return 7zL.A0T(AQu.A00(a8y, r014, c6js, 30));
            case 35:
                8YT r015 = (8YT) this.A02;
                boolean A1V = 7zP.A1V((C2lh) this.A01);
                final 6Jq r016 = (6Jq) 1Bi.A03(67639);
                5aU r017 = r015.A00;
                MrF mrF = MrF.$redex_init_class;
                int ordinal2 = r017.ordinal();
                if (ordinal2 != 7) {
                    if (ordinal2 == 9) {
                        return new C92p(r016, 0.0f);
                    }
                    return null;
                }
                if (!A1V) {
                    return new C92o(r016, 0.0f);
                }
                final float f2 = 0.0f;
                return new DN9(r016, f2) { // from class: X.92r
                    public float A00;
                    public 6ON A01;
                    public boolean A02;
                    public final float A03;
                    public final Path A04;
                    public final RectF A05;

                    {
                        11T.A0F(r016, 1);
                        this.A03 = f2;
                        this.A02 = true;
                        this.A04 = new Path();
                        this.A05 = new RectF();
                        r016.A02(AVF.A01(this, 2), new 6Ju[]{6Ju.A03});
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public void draw(Canvas canvas) {
                        6ON r018;
                        11T.A0F(canvas, 0);
                        if (this.A02 && (r018 = this.A01) != null) {
                            int A02 = 7zO.A02(this);
                            int i10 = 600;
                            if (600 < A02) {
                                i10 = A02;
                            }
                            int intrinsicHeight = (r018.getIntrinsicHeight() * i10) / r018.getIntrinsicWidth();
                            this.A00 = 7zN.A02(this) - (i10 / 2);
                            r018.setBounds(0, 0, i10, intrinsicHeight);
                        }
                        this.A02 = false;
                        6ON r019 = this.A01;
                        if (r019 != null && !r019.isPlaying()) {
                            r019.CXT();
                        }
                        Path path = this.A04;
                        path.rewind();
                        RectF rectF = this.A05;
                        float f3 = this.A03;
                        path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                        int save = canvas.save();
                        canvas.clipPath(path);
                        try {
                            float A022 = 7zN.A02(this);
                            save = canvas.save();
                            canvas.scale(1.5f, 1.5f, A022, 0.0f);
                            float f4 = this.A00;
                            save = canvas.save();
                            canvas.translate(f4, 0.0f);
                            try {
                                6ON r020 = this.A01;
                                if (r020 != null) {
                                    r020.draw(canvas);
                                }
                                canvas.restoreToCount(save);
                                canvas.restoreToCount(save);
                            } finally {
                                canvas.restoreToCount(save);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                            canvas.restoreToCount(save);
                        }
                    }

                    public int getOpacity() {
                        return -3;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public void onBoundsChange(Rect rect) {
                        11T.A0F(rect, 0);
                        super/*android.graphics.drawable.Drawable*/.onBoundsChange(rect);
                        this.A02 = true;
                        7zT.A14(rect, this.A05);
                    }

                    public void setAlpha(int i10) {
                    }

                    public void setColorFilter(ColorFilter colorFilter) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public boolean setVisible(boolean z2, boolean z3) {
                        if (!z2) {
                            6ON r018 = this.A01;
                            if (r018 != null) {
                                r018.stop();
                            }
                            6ON r019 = this.A01;
                            if (r019 != null) {
                                r019.CkF(0.0f);
                            }
                        }
                        return super/*android.graphics.drawable.Drawable*/.setVisible(z2, z3);
                    }
                };
            case 36:
                8YT r018 = (8YT) this.A02;
                C2k5 c2k53 = (C2k5) this.A01;
                5aU r019 = r018.A00;
                MrF mrF2 = MrF.$redex_init_class;
                int ordinal3 = r019.ordinal();
                if (ordinal3 == 7) {
                    iArr = new int[]{3vP.A00(c2k53).getColor(2132214483)};
                    A00 = 3vP.A00(c2k53);
                    i = 2132214484;
                } else if (ordinal3 == 9) {
                    iArr = new int[]{3vP.A00(c2k53).getColor(2132214485)};
                    A00 = 3vP.A00(c2k53);
                    i = 2132214486;
                } else if (ordinal3 == 8) {
                    iArr = new int[]{3vP.A00(c2k53).getColor(2132214489)};
                    A00 = 3vP.A00(c2k53);
                    i = 2132214490;
                } else {
                    if (ordinal3 != 6) {
                        return null;
                    }
                    iArr = new int[]{3vP.A00(c2k53).getColor(2132214487)};
                    A00 = 3vP.A00(c2k53);
                    i = 2132214488;
                }
                iArr[1] = A00.getColor(i);
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
            case 37:
                1Bn.A0E((Context) null, ((9Zu) this.A02).A00.A00, 67804);
                return new AvatarPowerUpArtifactoSource((FbUserSession) this.A01);
            case 38:
                1Bn.A0E((Context) null, ((9Zu) this.A02).A00.A00, 67805);
                return new AvatarPowerUpDownloader((FbUserSession) this.A01);
            case 39:
                return new A8Z(this.A01, this.A02, 1);
            case 40:
                ((9bU) this.A02).A00(new 9ML() { // from class: X.93l
                });
                ((C2a2) this.A01).AE0(null);
                return 04S.A00;
            case 41:
                Context A0A = 7zU.A0A(this.A01);
                ?? obj = new Object();
                8bS r020 = (8bS) this.A02;
                return 9EV.A00(A0A, r020.A01, r020.A02, new AA1(GradientDrawable.Orientation.TOP_BOTTOM), (6yJ) obj);
            case 42:
                C8a8 c8a8 = (C8a8) this.A02;
                return 9EV.A00(7zU.A0A(this.A01), c8a8.A01, c8a8.A02, (78B) new Object(), new AA4(c8a8.A00));
            case 43:
                ((C2lh) this.A01).A02(((8AA) this.A02).A07);
                return C85q.A00();
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                A15 = 7zL.A15();
                Iterator it2 = abstractCollection.iterator();
                while (it2.hasNext()) {
                    A15.add(((MessageReactionCount) it2.next()).A02);
                }
                return A15;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                8eA r021 = (8eA) this.A02;
                if (!r021.A03) {
                    return null;
                }
                ((C2lh) this.A01).A04(AV0.A00(r021, 36));
                return null;
            case 46:
                8eA r022 = (8eA) this.A02;
                boolean z2 = r022.A03;
                MessageReactionsCount messageReactionsCount = r022.A00;
                if (!z2) {
                    ImmutableList immutableList = messageReactionsCount.A01;
                    11T.A0A(immutableList);
                    return AHX.A00(immutableList, 15);
                }
                C2lh c2lh2 = (C2lh) this.A01;
                ImmutableList immutableList2 = messageReactionsCount.A01;
                11T.A0A(immutableList2);
                ArrayList A17 = 1BK.A17(immutableList2);
                Iterable iterable = (Iterable) c2lh2.A02;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj2 : iterable) {
                    Iterator it3 = A17.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (11T.A0O(((MessageReactionCount) next).A02, obj2)) {
                                if (next != null) {
                                    A17.remove(next);
                                    A0s.add(next);
                                }
                            }
                        }
                    }
                }
                A0s.addAll(A17);
                return 1BL.A0a(A0s);
            case ActionId.ON_START_END /* 47 */:
                C2k5 c2k54 = (C2k5) this.A01;
                8eB r023 = (8eB) this.A02;
                C2sn A0K = 7zR.A0K(c2k54.A05);
                2lO A0L = 4YV.A0L((2lO) null, 0S2.A00, C1ro.CENTER, 0);
                int i10 = r023.A00;
                long A06 = 3yH.A06(A0K, 2132279337);
                Drawable drawable = r023.A03;
                String A0W = 0Pz.A0W(drawable == null ? "+" : "", r023.A06);
                Typeface typeface = Typeface.DEFAULT;
                long A08 = 7zP.A08();
                1Iw r024 = A0K.A00;
                3yF A0v = 7zM.A0v(r024, A0W, 0);
                7zS.A1Q(A0K, A0v, i10, A06);
                A0v.A33(0);
                7zT.A15(typeface, A0K, A0v, A08);
                7zP.A1F(A0v, 0);
                A0v.A2e();
                7zT.A1L(A0v, false);
                7zS.A1B((2K8) null, A0K, A0L, A0v);
                if (drawable != null) {
                    C2cq A0u = 7zM.A0u(drawable, r024, 0);
                    A0u.A1W(r023.A02);
                    A0u.A1M(r023.A01);
                    c2cp = A0u.A2W();
                } else {
                    c2cp = null;
                }
                return new C1rh(null, null, null, null, 7zL.A16(c2cp, A0K), false);
            case ActionId.QUEUED /* 48 */:
                C8dc c8dc = (C8dc) this.A02;
                ImmutableList immutableList3 = c8dc.A05;
                if (!immutableList3.isEmpty()) {
                    long j3 = c8dc.A00;
                    if (j3 >= 1000) {
                        return 0PJ.A00(4YU.A0E(((C2k5) this.A01).A05), Integer.valueOf((int) j3), 1000, true, true);
                    }
                }
                if (!1BK.A1Y(immutableList3)) {
                    return null;
                }
                long j4 = c8dc.A00;
                if (j4 > 1) {
                    return String.valueOf(j4);
                }
                return null;
            default:
                Resources A0J = 7zQ.A0J(((C2k5) this.A01).A05);
                long j5 = ((C8dc) this.A02).A00;
                if (j5 == 0) {
                    A15 = "";
                    return A15;
                }
                String quantityString = A0J.getQuantityString(2131820587, (int) j5, String.valueOf(j5));
                11T.A0A(quantityString);
                return quantityString;
        }
        return 04S.A00;
    }
}
