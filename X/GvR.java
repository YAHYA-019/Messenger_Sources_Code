package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.messaging.rtc.incall.impl.widgets.audioparticipantview.ParticipantStatusView;
import com.facebook.messaging.ui.name.ThreadNameView;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.widget.FbImageView;
import com.facebook.widget.tiles.BlurThreadTileView;
import com.facebook.widget.tiles.ThreadTileView;

/* loaded from: GvR.class */
public final class GvR extends FbFrameLayout implements JFq {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public ParticipantStatusView A05;
    public ThreadNameView A06;
    public FbImageView A07;
    public 2Wo A08;
    public 2Wo A09;
    public BlurThreadTileView A0A;
    public ThreadTileView A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final C01i A0E;
    public final float A0F;
    public final Path A0G;
    public final RectF A0H;

    public GvR(Context context) {
        super(context);
        this.A0E = J9t.A00(this, C03i.A02, 27);
        Context A08 = 4YU.A08(this);
        this.A0C = 1Bu.A01(A08, 16980);
        this.A0D = 7zM.A0U();
        this.A0G = DKC.A0B();
        this.A0H = DKC.A0D();
        this.A0F = TypedValue.applyDimension(1, 4.0f, DKD.A09(this));
        View.inflate(A08, 2132541541, this);
        setClipChildren(false);
        BlurThreadTileView blurThreadTileView = (BlurThreadTileView) requireViewById(2131362338);
        blurThreadTileView.A0V(blurThreadTileView.getContext().getColor(2132213829));
        this.A0A = blurThreadTileView;
        this.A01 = requireViewById(2131366299);
        this.A03 = requireViewById(2131366304);
        this.A0B = (ThreadTileView) requireViewById(2131366300);
        this.A00 = requireViewById(2131366287);
        this.A02 = requireViewById(2131366301);
        this.A06 = (ThreadNameView) requireViewById(2131366293);
        this.A04 = DKF.A0F(this, 2131363503);
        View requireViewById = requireViewById(2131366284);
        11T.A0I(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        this.A08 = 2Wo.A00((ViewStub) requireViewById);
        2Wo A00 = 2Wo.A00((ViewStub) DKG.A0B(this, 2131366291));
        this.A09 = A00;
        IlT.A00(A00, this, 17);
        this.A05 = (ParticipantStatusView) requireViewById(2131366302);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0278 A[Catch: all -> 0x0477, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0477, blocks: (B:3:0x0019, B:4:0x001f, B:8:0x0033, B:10:0x0039, B:11:0x003e, B:14:0x004d, B:15:0x0054, B:17:0x005c, B:20:0x0068, B:23:0x0073, B:26:0x007d, B:27:0x0084, B:28:0x008c, B:29:0x0092, B:30:0x0098, B:32:0x009f, B:33:0x0447, B:35:0x0450, B:38:0x0453, B:40:0x045a, B:42:0x00a3, B:45:0x00ad, B:48:0x00b8, B:52:0x00cf, B:54:0x00d4, B:55:0x00d8, B:56:0x00df, B:57:0x00e7, B:59:0x00ed, B:61:0x00f1, B:62:0x00f6, B:66:0x0106, B:68:0x010d, B:71:0x0184, B:73:0x018b, B:75:0x0190, B:78:0x0198, B:82:0x01a5, B:84:0x01ab, B:86:0x01b4, B:88:0x01ba, B:92:0x01c6, B:93:0x01cc, B:94:0x01d1, B:94:0x01d1, B:96:0x01d5, B:97:0x01dc, B:98:0x01e4, B:100:0x01e9, B:103:0x01f3, B:107:0x0417, B:109:0x0476, B:112:0x0213, B:116:0x021e, B:118:0x0224, B:123:0x0233, B:124:0x023a, B:126:0x023f, B:128:0x0246, B:130:0x026e, B:133:0x0278, B:136:0x0281, B:138:0x0287, B:141:0x028f, B:144:0x029a, B:147:0x02a5, B:149:0x02ae, B:150:0x02b5, B:151:0x034a, B:153:0x0353, B:158:0x0356, B:160:0x035d, B:161:0x02bc, B:163:0x02c3, B:168:0x02e4, B:169:0x02e9, B:172:0x02f4, B:173:0x02fa, B:174:0x0301, B:176:0x030d, B:178:0x0316, B:182:0x035f, B:185:0x0369, B:188:0x0375, B:191:0x0381, B:192:0x0388, B:195:0x0394, B:197:0x039f, B:198:0x03a5, B:201:0x03ae, B:202:0x03b4, B:204:0x03bd, B:206:0x03c2, B:209:0x03cc, B:211:0x03d5, B:212:0x03dc, B:214:0x03e5, B:216:0x03e8, B:218:0x03ef, B:219:0x03f7, B:221:0x0400, B:223:0x0403, B:225:0x040a, B:226:0x02dc, B:228:0x040d, B:230:0x0414, B:231:0x024e, B:235:0x025b, B:236:0x0261, B:237:0x0268, B:239:0x0326, B:240:0x032d, B:243:0x0342, B:245:0x033b, B:246:0x046d, B:248:0x0203, B:249:0x041f, B:250:0x0429, B:251:0x011b, B:255:0x0128, B:257:0x012e, B:258:0x0133, B:259:0x0139, B:260:0x013f, B:261:0x0144, B:263:0x014e, B:265:0x0155, B:266:0x015c, B:267:0x0162, B:269:0x016a, B:270:0x0171, B:272:0x017b, B:273:0x0433, B:274:0x043d, B:276:0x045d, B:277:0x0465), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0429 A[Catch: all -> 0x0477, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0477, blocks: (B:3:0x0019, B:4:0x001f, B:8:0x0033, B:10:0x0039, B:11:0x003e, B:14:0x004d, B:15:0x0054, B:17:0x005c, B:20:0x0068, B:23:0x0073, B:26:0x007d, B:27:0x0084, B:28:0x008c, B:29:0x0092, B:30:0x0098, B:32:0x009f, B:33:0x0447, B:35:0x0450, B:38:0x0453, B:40:0x045a, B:42:0x00a3, B:45:0x00ad, B:48:0x00b8, B:52:0x00cf, B:54:0x00d4, B:55:0x00d8, B:56:0x00df, B:57:0x00e7, B:59:0x00ed, B:61:0x00f1, B:62:0x00f6, B:66:0x0106, B:68:0x010d, B:71:0x0184, B:73:0x018b, B:75:0x0190, B:78:0x0198, B:82:0x01a5, B:84:0x01ab, B:86:0x01b4, B:88:0x01ba, B:92:0x01c6, B:93:0x01cc, B:94:0x01d1, B:94:0x01d1, B:96:0x01d5, B:97:0x01dc, B:98:0x01e4, B:100:0x01e9, B:103:0x01f3, B:107:0x0417, B:109:0x0476, B:112:0x0213, B:116:0x021e, B:118:0x0224, B:123:0x0233, B:124:0x023a, B:126:0x023f, B:128:0x0246, B:130:0x026e, B:133:0x0278, B:136:0x0281, B:138:0x0287, B:141:0x028f, B:144:0x029a, B:147:0x02a5, B:149:0x02ae, B:150:0x02b5, B:151:0x034a, B:153:0x0353, B:158:0x0356, B:160:0x035d, B:161:0x02bc, B:163:0x02c3, B:168:0x02e4, B:169:0x02e9, B:172:0x02f4, B:173:0x02fa, B:174:0x0301, B:176:0x030d, B:178:0x0316, B:182:0x035f, B:185:0x0369, B:188:0x0375, B:191:0x0381, B:192:0x0388, B:195:0x0394, B:197:0x039f, B:198:0x03a5, B:201:0x03ae, B:202:0x03b4, B:204:0x03bd, B:206:0x03c2, B:209:0x03cc, B:211:0x03d5, B:212:0x03dc, B:214:0x03e5, B:216:0x03e8, B:218:0x03ef, B:219:0x03f7, B:221:0x0400, B:223:0x0403, B:225:0x040a, B:226:0x02dc, B:228:0x040d, B:230:0x0414, B:231:0x024e, B:235:0x025b, B:236:0x0261, B:237:0x0268, B:239:0x0326, B:240:0x032d, B:243:0x0342, B:245:0x033b, B:246:0x046d, B:248:0x0203, B:249:0x041f, B:250:0x0429, B:251:0x011b, B:255:0x0128, B:257:0x012e, B:258:0x0133, B:259:0x0139, B:260:0x013f, B:261:0x0144, B:263:0x014e, B:265:0x0155, B:266:0x015c, B:267:0x0162, B:269:0x016a, B:270:0x0171, B:272:0x017b, B:273:0x0433, B:274:0x043d, B:276:0x045d, B:277:0x0465), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198 A[Catch: all -> 0x0477, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0477, blocks: (B:3:0x0019, B:4:0x001f, B:8:0x0033, B:10:0x0039, B:11:0x003e, B:14:0x004d, B:15:0x0054, B:17:0x005c, B:20:0x0068, B:23:0x0073, B:26:0x007d, B:27:0x0084, B:28:0x008c, B:29:0x0092, B:30:0x0098, B:32:0x009f, B:33:0x0447, B:35:0x0450, B:38:0x0453, B:40:0x045a, B:42:0x00a3, B:45:0x00ad, B:48:0x00b8, B:52:0x00cf, B:54:0x00d4, B:55:0x00d8, B:56:0x00df, B:57:0x00e7, B:59:0x00ed, B:61:0x00f1, B:62:0x00f6, B:66:0x0106, B:68:0x010d, B:71:0x0184, B:73:0x018b, B:75:0x0190, B:78:0x0198, B:82:0x01a5, B:84:0x01ab, B:86:0x01b4, B:88:0x01ba, B:92:0x01c6, B:93:0x01cc, B:94:0x01d1, B:94:0x01d1, B:96:0x01d5, B:97:0x01dc, B:98:0x01e4, B:100:0x01e9, B:103:0x01f3, B:107:0x0417, B:109:0x0476, B:112:0x0213, B:116:0x021e, B:118:0x0224, B:123:0x0233, B:124:0x023a, B:126:0x023f, B:128:0x0246, B:130:0x026e, B:133:0x0278, B:136:0x0281, B:138:0x0287, B:141:0x028f, B:144:0x029a, B:147:0x02a5, B:149:0x02ae, B:150:0x02b5, B:151:0x034a, B:153:0x0353, B:158:0x0356, B:160:0x035d, B:161:0x02bc, B:163:0x02c3, B:168:0x02e4, B:169:0x02e9, B:172:0x02f4, B:173:0x02fa, B:174:0x0301, B:176:0x030d, B:178:0x0316, B:182:0x035f, B:185:0x0369, B:188:0x0375, B:191:0x0381, B:192:0x0388, B:195:0x0394, B:197:0x039f, B:198:0x03a5, B:201:0x03ae, B:202:0x03b4, B:204:0x03bd, B:206:0x03c2, B:209:0x03cc, B:211:0x03d5, B:212:0x03dc, B:214:0x03e5, B:216:0x03e8, B:218:0x03ef, B:219:0x03f7, B:221:0x0400, B:223:0x0403, B:225:0x040a, B:226:0x02dc, B:228:0x040d, B:230:0x0414, B:231:0x024e, B:235:0x025b, B:236:0x0261, B:237:0x0268, B:239:0x0326, B:240:0x032d, B:243:0x0342, B:245:0x033b, B:246:0x046d, B:248:0x0203, B:249:0x041f, B:250:0x0429, B:251:0x011b, B:255:0x0128, B:257:0x012e, B:258:0x0133, B:259:0x0139, B:260:0x013f, B:261:0x0144, B:263:0x014e, B:265:0x0155, B:266:0x015c, B:267:0x0162, B:269:0x016a, B:270:0x0171, B:272:0x017b, B:273:0x0433, B:274:0x043d, B:276:0x045d, B:277:0x0465), top: B:2:0x0019 }] */
    @Override // X.JFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GvR.CfQ(X.JDB):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        if (((GrP) this.A0E.getValue()).A02 == 3) {
            canvas.clipPath(this.A0G);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1801009254);
        C00j.A05("AudioParticipantView.onAttachedToWindow", -52913922);
        try {
            super.onAttachedToWindow();
            ((GrP) this.A0E.getValue()).A0Y(this);
            C00j.A01(1476460397);
            0FI.A0C(-383531764, A06);
        } catch (Throwable th) {
            C00j.A01(-1797541364);
            0FI.A0C(1072253622, A06);
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(936385221);
        C00j.A05("AudioParticipantView.onDetachedFromWindow", 521828054);
        try {
            ((GrP) this.A0E.getValue()).A0X();
            super.onDetachedFromWindow();
            C00j.A01(1342115678);
            0FI.A0C(-96715176, A06);
        } catch (Throwable th) {
            C00j.A01(-1686586587);
            0FI.A0C(1987850570, A06);
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        GrP grP = (GrP) this.A0E.getValue();
        int i5 = i3 - i;
        if (grP.A01 != i5) {
            grP.A01 = i5;
            GOp.A0O(grP.A0M).A01();
            GrP.A02(grP);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1065788113);
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.A0G;
        path.reset();
        RectF rectF = this.A0H;
        rectF.set(0.0f, 0.0f, i, i2);
        float f = this.A0F;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        path.close();
        0FI.A0C(-618137867, A06);
    }
}
