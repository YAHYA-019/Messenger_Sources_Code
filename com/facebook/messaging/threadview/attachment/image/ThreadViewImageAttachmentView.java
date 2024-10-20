package com.facebook.messaging.threadview.attachment.image;

import X.09K;
import X.0FI;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Hv;
import X.2IA;
import X.48A;
import X.5zA;
import X.66X;
import X.7Yb;
import X.7zL;
import X.AbF;
import X.C00i;
import X.C02353ux;
import X.C0A8;
import X.C12114ys;
import X.C1q7;
import X.C54a;
import X.C62j;
import X.C66g;
import X.C69s;
import X.DKC;
import X.DNA;
import X.GOo;
import X.GOp;
import X.Hno;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: ThreadViewImageAttachmentView.class */
public class ThreadViewImageAttachmentView extends 48A implements CallerContextable {
    public static final CallerContext A0S = CallerContext.A0A(ThreadViewImageAttachmentView.class, "photo_thread_view", "photo_thread_view");
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public LayoutInflater A09;
    public C69s A0A;
    public C00i A0B;
    public C66g A0C;
    public Message A0D;
    public Hno A0E;
    public C62j A0F;
    public DNA A0G;
    public ImmutableList A0H;
    public List A0I;
    public Executor A0J;
    public Point[] A0K;
    public final SparseArray A0L;
    public final C12114ys A0M;
    public final 66X A0N;
    public final C54a A0O;
    public final 7Yb A0P;
    public final 5zA A0Q;
    public final C1q7 A0R;

    public ThreadViewImageAttachmentView(Context context) {
        this(context, null);
    }

    public ThreadViewImageAttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadViewImageAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0L = DKC.A0E();
        this.A0M = (C12114ys) 1Bi.A03(49420);
        this.A0O = (C54a) 1Bi.A03(68080);
        this.A0R = (C1q7) 1Bi.A03(16822);
        this.A0P = (7Yb) 1Bi.A03(50226);
        this.A0N = (66X) 1Bi.A03(49958);
        this.A0Q = (5zA) 1Bi.A03(49880);
        this.A09 = (LayoutInflater) 1Hv.A02(context, 100193);
        this.A0A = (C69s) 1Bn.A0E(context, (1BY) null, 49976);
        this.A0J = (Executor) 1Bi.A03(16472);
        this.A0F = GOp.A0x();
        this.A0E = (Hno) 1Bn.A0A(115919);
        this.A0B = AbF.A0Q(context, 49959);
        this.A01 = C0A8.A00(context, 1.0f);
        C54a c54a = this.A0O;
        this.A08 = c54a.A05();
        this.A05 = c54a.A04();
        this.A02 = c54a.A01();
        this.A04 = c54a.A03();
        this.A03 = c54a.A02();
        DNA dna = new DNA();
        this.A0G = dna;
        Resources resources = getResources();
        float A01 = 7zL.A01(resources, 2132279351);
        Paint paint = dna.A00;
        if (A01 != paint.getStrokeWidth()) {
            paint.setStrokeWidth(A01);
            dna.invalidateSelf();
        }
        DNA dna2 = this.A0G;
        float A04 = DKC.A04(resources);
        dna2.A01(A04, A04, A04, A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Point A00(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ImageAttachmentData imageAttachmentData = (ImageAttachmentData) 1BK.A0r(this.A0H);
        int i7 = imageAttachmentData.A03;
        Integer num = (i7 <= 0 || (i6 = imageAttachmentData.A02) <= 0) ? 0S2.A0N : i7 == i6 ? 0S2.A0C : i7 < i6 ? 0S2.A01 : 0S2.A00;
        int i8 = this.A03;
        int min = Math.min(i8, i);
        if (num == 0S2.A01 || num == 0S2.A0C) {
            i3 = this.A04;
        } else {
            if (num != 0S2.A00) {
                i4 = Math.min(i8, i2);
                if (i7 > 0 || (i5 = imageAttachmentData.A02) <= 0) {
                    return new Point(min, i4);
                }
                float f = i5;
                float f2 = i4 / f;
                float f3 = min;
                float f4 = i7;
                float min2 = Math.min(f3 / f4, f2);
                if (imageAttachmentData.A0J) {
                    min2 = Math.min(min2, 1.0f);
                }
                int i9 = (int) (f4 * min2);
                int i10 = (int) (f * min2);
                int suggestedMinimumWidth = getSuggestedMinimumWidth();
                float f5 = suggestedMinimumWidth / i9;
                if (suggestedMinimumWidth > i9 && f5 < f2) {
                    i10 = (int) (i10 * f5);
                    i9 = suggestedMinimumWidth;
                }
                return new Point(i9, i10);
            }
            i3 = this.A02;
        }
        i4 = Math.min(i3, i2);
        if (i7 > 0) {
        }
        return new Point(min, i4);
    }

    private C02353ux A01(Point point) {
        int i;
        int i2 = point.x;
        if (i2 > 0 && (i = point.y) > 0) {
            return new C02353ux(i2, i);
        }
        0fH.A18("t8978355", "Attachment image height or image width is <= 0. Width=%d, Height=%d, NumOfAttachments=%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(point.y), 1BK.A0k(this.A0H)});
        return null;
    }

    private 2IA A02(Uri uri) {
        2IA A01 = 2IA.A01(uri);
        Message message = this.A0D;
        if (message != null && ThreadKey.A0q(message.A0V)) {
            A01.A00 |= 48;
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x04d8, code lost:
    
        if (r0.exists() != false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05e4 A[Catch: all -> 0x06c4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:56:0x0547, B:57:0x054c, B:61:0x0559, B:62:0x055e, B:65:0x0567, B:66:0x056c, B:67:0x0574, B:69:0x057c, B:70:0x0581, B:71:0x0587, B:73:0x058e, B:76:0x0598, B:78:0x05a3, B:79:0x05a8, B:81:0x05b7, B:83:0x05be, B:84:0x05c3, B:85:0x05c8, B:86:0x05ce, B:87:0x05d6, B:90:0x05e4, B:91:0x05ed, B:92:0x05f4, B:94:0x05fb, B:95:0x0600, B:96:0x0606, B:98:0x060f, B:100:0x0617, B:102:0x0625, B:104:0x062c, B:105:0x0631, B:106:0x0637, B:107:0x063e, B:109:0x0647, B:111:0x0650, B:113:0x0658, B:115:0x0664, B:117:0x066c, B:119:0x0674, B:121:0x0684, B:122:0x0689, B:122:0x0689, B:125:0x0691, B:127:0x0699), top: B:55:0x0547 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A03(int r302) {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadview.attachment.image.ThreadViewImageAttachmentView.A03(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A04(ThreadViewImageAttachmentView threadViewImageAttachmentView) {
        int i;
        int color;
        DNA dna = threadViewImageAttachmentView.A0G;
        if (dna != null) {
            Resources resources = threadViewImageAttachmentView.getResources();
            int i2 = 0;
            if (threadViewImageAttachmentView.A0H.size() == 1) {
                color = 0;
            } else {
                i2 = resources.getColor(2132213971);
                color = C1q7.A0D(threadViewImageAttachmentView.A0D) ? resources.getColor(2132214572) : -1;
            }
            Paint paint = dna.A00;
            if (i2 != paint.getColor()) {
                paint.setColor(i2);
                dna.invalidateSelf();
            }
            Paint paint2 = dna.A02;
            if (color != paint2.getColor()) {
                paint2.setColor(color);
                dna.invalidateSelf();
            }
        }
        threadViewImageAttachmentView.A0K = threadViewImageAttachmentView.A05();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i4;
            if (i >= threadViewImageAttachmentView.A0H.size()) {
                break;
            }
            View childAt = threadViewImageAttachmentView.getChildAt(i);
            if (childAt == null || !(childAt instanceof ThreadViewImageDraweeContainer)) {
                View inflate = threadViewImageAttachmentView.A09.inflate(2132542641, (ViewGroup) threadViewImageAttachmentView, false);
                inflate.setClickable(true);
                threadViewImageAttachmentView.addView(inflate, i);
            }
            i4 = i + 1;
        }
        threadViewImageAttachmentView.A00 = Math.max(i, threadViewImageAttachmentView.A00);
        while (i3 < threadViewImageAttachmentView.A00 && i3 < threadViewImageAttachmentView.A0H.size()) {
            threadViewImageAttachmentView.A03(i3);
            threadViewImageAttachmentView.getChildAt(i3).setVisibility(0);
            i3++;
        }
        while (i3 < threadViewImageAttachmentView.A00) {
            threadViewImageAttachmentView.getChildAt(i3).setVisibility(8);
            i3++;
        }
        threadViewImageAttachmentView.requestLayout();
    }

    private Point[] A05() {
        int i;
        Point point;
        int size = this.A0H.size();
        Point[] pointArr = new Point[size];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return pointArr;
            }
            if (size == 2 || size == 4) {
                i = this.A08;
            } else if (size >= 3) {
                i = this.A05;
            } else {
                int i4 = (-1) >>> 1;
                point = A00(i4, i4);
                pointArr[i3] = point;
                i2 = i3 + 1;
            }
            point = new Point(i, i);
            pointArr[i3] = point;
            i2 = i3 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1870905006);
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        if (!09K.A01(this.A0I)) {
            for (Future future : this.A0I) {
                if (future != null && !future.isDone()) {
                    future.cancel(false);
                }
            }
            this.A0I.clear();
        }
        0FI.A0C(-378083742, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int size = this.A0H.size();
        if (size == 1) {
            View childAt = getChildAt(0);
            ImageAttachmentData A0O = GOo.A0O(this, 0);
            int i8 = A0O.A03;
            Integer num = (i8 <= 0 || (i7 = A0O.A02) <= 0) ? 0S2.A0N : i8 == i7 ? 0S2.A0C : i8 < i7 ? 0S2.A01 : 0S2.A00;
            if (num == 0S2.A01 || num == 0S2.A0C || num == 0S2.A0N) {
                i5 = this.A07;
                i6 = this.A04;
            } else {
                if (num != 0S2.A00) {
                    return;
                }
                i5 = this.A07;
                i6 = this.A02;
            }
            childAt.layout(0, 0, i5, Math.min(i6, this.A06));
            return;
        }
        int i9 = i3 - i;
        int i10 = i9;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size && i10 >= this.A0K[i13].x; i13++) {
            View childAt2 = getChildAt(i13);
            Point point = this.A0K[i13];
            childAt2.layout(i11, i12, point.x + i11, i2 + i12 + point.y);
            Point[] pointArr = this.A0K;
            int i14 = pointArr[i13].x;
            int i15 = this.A01;
            int i16 = i14 + i15;
            i11 += i16;
            i10 -= i16;
            if (i10 < i14) {
                i12 += pointArr[i13].y + i15;
                i10 = i9;
                i11 = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x018a, code lost:
    
        if (r0 != 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0163, code lost:
    
        if (r0 == r0.y) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadview.attachment.image.ThreadViewImageAttachmentView.onMeasure(int, int):void");
    }
}
